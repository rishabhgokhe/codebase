import Foundation


struct QuizBrain {
    
    let quiz = [
            Question(q: "What is the capital of France?", a: ["Berlin", "Madrid", "Paris"], correctAnswer: "Paris"),
            Question(q: "Which planet is known as the Red Planet?", a: ["Earth", "Mars", "Jupiter"], correctAnswer: "Mars"),
            Question(q: "What is the largest ocean on Earth?", a: ["Atlantic Ocean", "Indian Ocean", "Pacific Ocean"], correctAnswer: "Pacific Ocean"),
            Question(q: "Who wrote 'To Kill a Mockingbird'?", a: ["Harper Lee", "J.K. Rowling", "Ernest Hemingway"], correctAnswer: "Harper Lee"),
            Question(q: "What is the smallest prime number?", a: ["1", "2", "3"], correctAnswer: "2"),
            Question(q: "What is the powerhouse of the cell?", a: ["Nucleus", "Mitochondria", "Ribosome"], correctAnswer: "Mitochondria"),
            Question(q: "Which element has the chemical symbol 'O'?", a: ["Osmium", "Oxygen", "Gold"], correctAnswer: "Oxygen"),
            Question(q: "Who painted the Mona Lisa?", a: ["Vincent van Gogh", "Pablo Picasso", "Leonardo da Vinci"], correctAnswer: "Leonardo da Vinci"),
            Question(q: "What is the hardest natural substance on Earth?", a: ["Gold", "Iron", "Diamond"], correctAnswer: "Diamond"),
            Question(q: "What is the main ingredient in sushi?", a: ["Chicken", "Rice", "Beef"], correctAnswer: "Rice")
        ]

    var questionNumber = 0
    var score = 0
    
    mutating func checkAnswers(_ userAnswer: String) -> Bool {
        if userAnswer == quiz[questionNumber].answer {
            score += 1
            return true
        } else {
            return false
        }
    }
    
    func getQuestionText() -> String {
        return quiz[questionNumber].text
    }
    
    func getChoices(option: Int) -> String {
        return quiz[questionNumber].chioces[option]
    }
    
    func getProgress() -> Float {
        return Float(questionNumber)/Float(quiz.count)
    }
    
    mutating func nextQuestion() {
        if questionNumber + 1 < quiz.count {
            questionNumber += 1
        } else {
            questionNumber = quiz.count
        }
    }
    
    func getScore() -> String {
        return "Score: \(score)"
    }
    
    func isQuizEnded() -> Bool {
        return questionNumber >= quiz.count
    }
    
    mutating func restartQuiz() {
        questionNumber = 0
        score = 0
    }
    
}