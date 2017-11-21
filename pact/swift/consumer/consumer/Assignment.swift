//
//  Assignment.swift
//  consumer
//
//  Created by Taylor Wilson on 11/18/17.
//  Copyright © 2017 Instructure. All rights reserved.
//

class Assignment {
    var id: Int
    var courseId: Int
    var gradingType: String
    var data: [String: Any] {
        return [ "id": id, "course_id": courseId, "grading_type": gradingType ]
    }

    init() {
        self.id = 1
        self.courseId = 1
        self.gradingType = "points"
    }
}
