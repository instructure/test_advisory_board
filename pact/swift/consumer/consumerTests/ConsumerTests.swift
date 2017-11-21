//
//  consumerTests.swift
//  consumerTests
//
//  Created by Taylor Wilson on 11/17/17.
//  Copyright © 2017 Instructure. All rights reserved.
//

import PactConsumerSwift
import XCTest
@testable import consumer

class ConsumerTests: XCTestCase {

    var mockService: MockService?
    var mockClient: MockClient?

    override func setUp() {
        super.setUp()
        mockService = MockService(provider: "Canvas", consumer: "Teacher App")
        mockClient = MockClient(baseUrl: mockService!.baseUrl)
    }

    override func tearDown() {
        super.tearDown()
    }

    func testEditAssignmentGradingType() {
        // mock assignment initializer has "grading_type": "points"
        let assignment = Assignment()
        assignment.gradingType = "pass_fail"

        // define the contract with the provider
        mockService!
            .given("a course")
            .given("an assignment")
            .uponReceiving("grading type change")
            .withRequest(method: .PUT,
                         path: "/courses/\(assignment.courseId)/assignments/\(assignment.id)",
                         query: nil,
                         headers: nil,
                         body: assignment.data)
            .willRespondWith(status: 200,
                             headers: ["Content-Type": "application/json"],
                             body: [ "id": assignment.id,
                                     "course_id": assignment.courseId,
                                     "grading_type": assignment.gradingType ])

        // test that the consumer honors the contract
        mockService!.run(timeout: 5) { (testComplete) -> Void in
            self.mockClient!.editAssignment(assignment: assignment) { (response) in
                if let id: Int = response["id"] as? Int,
                   let courseId: Int = response["course_id"] as? Int,
                   let gradingType: String = response["grading_type"] as? String {
                    XCTAssertEqual(id, assignment.id)
                    XCTAssertEqual(courseId, assignment.courseId)
                    XCTAssertEqual(gradingType, assignment.gradingType)
                } else {
                    XCTFail("response is missing some fields")
                }
                testComplete()
            }
        }
    }
}
