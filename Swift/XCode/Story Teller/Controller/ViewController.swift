import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var storyLabel: UILabel!
    @IBOutlet weak var choice1Button: UIButton!
    @IBOutlet weak var choice2Button: UIButton!
    @IBOutlet weak var restartButton: UIButton!
    @IBOutlet weak var restartLabel: UILabel!
    
    var storyBrain = StoryBrain()
    var destination = 0

    
    override func viewDidLoad() {
        super.viewDidLoad()
        updateUI()
    }

    @IBAction func choiceButtonPressed(_ sender: UIButton) {
        
        if sender.currentTitle == "The" || sender.currentTitle == "End" {
            restartUI()
            return
        } else if sender.currentTitle == "Restart" {
            destination = 0
            updateUI()
            return
        }
        
        let userChoice = sender.currentTitle!
        if userChoice == storyBrain.story[destination].choice1 {
            destination = storyBrain.story[destination].choice1Destination
        } else if userChoice == storyBrain.story[destination].choice2 {
            destination = storyBrain.story[destination].choice2Destination
        }
        updateUI()
    }
    
    func updateUI() {
        storyLabel.text = storyBrain.story[destination].title
        choice1Button.setTitle(storyBrain.story[destination].choice1, for: .normal)
        choice2Button.setTitle(storyBrain.story[destination].choice2, for: .normal)
        
        restartLabel.isHidden = true
        restartButton.isHidden = true
        storyLabel.isHidden = false
        choice1Button.isHidden = false
        choice2Button.isHidden = false
    }
    
    func restartUI() {
        storyLabel.isHidden = true
        choice1Button.isHidden = true
        choice2Button.isHidden = true
        
        restartLabel.isHidden = false
        restartButton.isHidden = false
    }
}
