//
//  MockClient.swift
//  consumer
//
//  Created by Taylor Wilson on 11/17/17.
//  Copyright © 2017 Instructure. All rights reserved.
//

import Alamofire

class MockClient {
    private let _baseUrl: String

    init(baseUrl: String) {
        _baseUrl = baseUrl
    }

    func editAssignment(assignment: Assignment, _ editAssignmentResponse: @escaping ([String: Any]) -> Void) {
        let url: String = "\(_baseUrl)/courses/\(assignment.courseId)/assignments/\(assignment.id)"

        Alamofire.request(url, method: .put, parameters: assignment.data, encoding: JSONEncoding.default, headers: nil)
            .responseJSON { (response) in
                print(response)
                if let json = response.result.value as? [String: Any] {
                    editAssignmentResponse(json)
                }
        }
    }
}
