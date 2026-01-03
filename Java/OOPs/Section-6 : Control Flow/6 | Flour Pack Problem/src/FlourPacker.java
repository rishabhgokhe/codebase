public class FlourPacker {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println(canPack(1, 5, 10));
        System.out.println(canPack(0, 5,4));
        System.out.println(canPack(1, 0,4));
    }

    // The parameter bigCount represents the count of big flour bags (5 kilos each).
    // The parameter smallCount represents the count of small flour bags (1 kilo each).
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (goal < 0) {
            return false;
        }
        
        int maxBigBags = goal / 5;
        if (maxBigBags > bigCount) {
            maxBigBags = bigCount;
        }
        
        int remainingWeight = goal - (maxBigBags * 5);
        
        if (remainingWeight <= smallCount) {
            return true;
        } else {
            return false;
        }
    }
}
