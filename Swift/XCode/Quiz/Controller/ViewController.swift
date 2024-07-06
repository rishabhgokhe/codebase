import UIKit

class ViewController: UIViewController {
    
    @IBOutlet weak var scoreLabel: UILabel!
    @IBOutlet weak var questionLabel: UILabel!
    @IBOutlet weak var progressBar: UIProgressView!
    @IBOutlet weak var option1: UIButton!
    @IBOutlet weak var option2: UIButton!
    @IBOutlet weak var option3: UIButton!
    @IBOutlet weak var restartButton: UIButton!
    @IBOutlet weak var doneLabel: UILabel!
    
    var timer: Timer?
    var quizBrain = QuizBrain()
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        updateUI()
        scoreLabel.text = "Show your Brain Muscles"
    }
    
    @IBAction func answerButtonPressed(_ sender: UIButton) {
        if sender.currentTitle == "Restart"  {
            quizBrain.restartQuiz()
            updateUI()
            return
        }
        
        let userAnswer = sender.currentTitle!
        let userGotItRight = quizBrain.checkAnswers(userAnswer)
        
        if userGotItRight {
            sender.backgroundColor = UIColor.green
        } else {
            sender.backgroundColor = UIColor.red
        }
        
        quizBrain.nextQuestion()
        
        timer = Timer.scheduledTimer(timeInterval: 0.3, target: self, selector: #selector(updateUI), userInfo: nil, repeats: false)
    }
    
    @objc func updateUI() {
        if quizBrain.isQuizEnded() {
            showRestartUI()
        } else {
            questionLabel.text = quizBrain.getQuestionText()
            progressBar.progress = quizBrain.getProgress()
            scoreLabel.text = quizBrain.getScore()
            option1.setTitle(quizBrain.getChoices(option: 0), for: .normal)
            option2.setTitle(quizBrain.getChoices(option: 1), for: .normal)
            option3.setTitle(quizBrain.getChoices(option: 2), for: .normal)
            
            option1.backgroundColor = UIColor.clear
            option2.backgroundColor = UIColor.clear
            option3.backgroundColor = UIColor.clear
            
            option1.isHidden = false
            option2.isHidden = false
            option3.isHidden = false
            questionLabel.isHidden = false
            progressBar.isHidden = false
            
            restartButton.isHidden = true
            doneLabel.isHidden = true
        }
    }
    
    func showRestartUI() {
        option1.isHidden = true
        option2.isHidden = true
        option3.isHidden = true
        questionLabel.isHidden = true
        progressBar.isHidden = true
        
        doneLabel.isHidden = false
        restartButton.isHidden = false
        scoreLabel.isHidden = false
    }
}