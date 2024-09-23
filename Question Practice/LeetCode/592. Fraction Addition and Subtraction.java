class Solution {
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public String fractionAddition(String expression) {
        int numerator = 0;
        int denominator = 1;
        
        int index = 0;
        while (index < expression.length()) {
            int sign = 1;
            if (expression.charAt(index) == '-' || expression.charAt(index) == '+') {
                sign = expression.charAt(index) == '-' ? -1 : 1;
                index++;
            }
            
            int num = 0;
            while (index < expression.length() && Character.isDigit(expression.charAt(index))) {
                num = num * 10 + (expression.charAt(index) - '0');
                index++;
            }
            
            index++; 
            
            int denom = 0;
            while (index < expression.length() && Character.isDigit(expression.charAt(index))) {
                denom = denom * 10 + (expression.charAt(index) - '0');
                index++;
            }
            
            num *= sign;
            
            numerator = numerator * denom + num * denominator;
            denominator *= denom;
            
            int g = gcd(Math.abs(numerator), Math.abs(denominator));
            numerator /= g;
            denominator /= g;
        }
        
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        
        return numerator + "/" + denominator;
    }
}

// view question description - https://leetcode.com/problems/fraction-addition-and-subtraction/