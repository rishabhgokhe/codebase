import UIKit
import AVFoundation

class ViewController: UIViewController {

    @IBOutlet weak var progressBar: UIProgressView!
    @IBOutlet weak var titleLabel: UILabel!
    
    let eggTimers: [String: Int] = ["Soft": 30, "Medium": 4, "Hard": 7]
    var timer: Timer?
    var totalTime = 0
    var secondsPassed = 0
    var player: AVAudioPlayer!
    
    @IBAction func hardnessSelector(_ sender: UIButton) {
        
        print(sender.currentTitle!)
        
        // initialise the secondsPassed back to zero
        self.secondsPassed = 0
        
        // gets the total time based on button clicked
        let hardness = sender.currentTitle!
        totalTime = eggTimers[hardness]!
        
        // terminate old timer on button click if it exists
        timer?.invalidate()
        
        timer = Timer.scheduledTimer(withTimeInterval: 1.0, repeats: true) { timer in
            print("\(self.secondsPassed) seconds.")
            
            // replaces the label with the amount of time left
            self.secondsPassed += 1
            self.titleLabel.text = ("\(self.secondsPassed) seconds")
            
            // calculate the amount of progress from 0 to 1
            let percentageProgress = (Float(self.secondsPassed) / Float(self.totalTime))
            self.progressBar.progress = percentageProgress
            
            // checks if the secondPassed is greater than the time needed then execute this conditions else continue timer
            if self.secondsPassed >= self.totalTime {
                
                // terminates the timer
                    timer.invalidate()
                    self.titleLabel.text = "Done 👍"
                
                // plays sound
                let url = Bundle.main.url(forResource: "alarm_sound", withExtension: "mp3")
                self.player = try! AVAudioPlayer(contentsOf: url!)
                self.player.play()

                }
            }
    }
}