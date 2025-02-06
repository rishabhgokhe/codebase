//
//  CalculatorBrain.swift
//  BMI Calculator
//
//  Created by Rishabh Gokhe on 21/01/2025.
//  Copyright © 2025 Rishabh Gokhe. All rights reserved.
//

import UIKit

struct CalculatorBrain {
    
    var bmi: BMI?
    
    func getBMIValue() -> String {
        return String(format: "%.1f", bmi?.value ?? 0.0)
    }
    
    func getBMIAdvice() -> String {
        return bmi?.advice ?? "No Advice"
    }
    
    func getViewColor() -> UIColor {
        return bmi?.color ?? UIColor.black
    }
    
    mutating func calculateBMI(height: Float, weight: Float) {
        let bmiValue = (weight)/(height*height)
        if bmiValue < 18.5 {
            bmi = BMI(value: bmiValue, advice: "Eat more food!", color: #colorLiteral(red: 0.2588235438, green: 0.7568627596, blue: 0.9686274529, alpha: 1))
        } else if bmiValue < 24.9 {
            bmi = BMI(value: bmiValue, advice: "Your enjoy eating healthy", color: #colorLiteral(red: 0.9607843161, green: 0.7058823705, blue: 0.200000003, alpha: 1))
        } else {
            bmi = BMI(value: bmiValue, advice: "Control overeating", color: #colorLiteral(red: 0.3411764801, green: 0.6235294342, blue: 0.1686274558, alpha: 1))
        }
    }
    
    
}
