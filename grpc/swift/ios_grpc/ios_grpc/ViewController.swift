//
//  ViewController.swift
//  ios_grpc
//

import UIKit

class ViewController: UIViewController {
  @IBOutlet weak var teacherIdLabel: UILabel!
  @IBOutlet weak var teacherLoginIdLabel: UILabel!
  @IBOutlet weak var teacherNameLabel: UILabel!
  @IBOutlet weak var createTeacherButton: UIButton!

  override func viewDidLoad() {
    super.viewDidLoad()
  }

  override func didReceiveMemoryWarning() {
    super.didReceiveMemoryWarning()
  }

  @IBAction func createTeacherButtonTapped(_ sender: Any) {
    let client = Soseedy_SoSeedyService.init(address: "localhost:50051")
    let user:Soseedy_Teacher = try! client.createteacher(Soseedy_CreateTeacherRequest())

    teacherIdLabel.text = "\(user.id)"
    teacherLoginIdLabel.text = user.username
    teacherNameLabel.text = user.name
  }
}
