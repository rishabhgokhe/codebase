import Foundation

struct Question {
    let text: String
    let chioces: [String]
    let answer: String
    
    init(q: String, a: [String], correctAnswer: String) {
        text = q
        chioces = a
        answer = correctAnswer
    }
}