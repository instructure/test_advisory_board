# Pact (Swift)

This is an example of using the [Pact gem] and [PactConsumerSwift pod] for consumer-driven contract
testing.

If you're new to consumer-driven contract (CDC) testing, then we suggest the
following resources:

- [Official Pact documentation]
- [Martin Fowler's article on CDC]

## Consumer: `Mobile`

There is an example of how an API may be consumed in the file:
`MockClient.swift`

## Provider: `Canvas API`

This uses a mock service provided by the [PactConsumerSwift pod].
Details for how the mock service is used are in the file:
`ConsumerTests.swift`

## Setup

1. Clone the `test_advisory_board` repo to your computer
2. `gem install pact-mock_service`
3. `gem install cocoapods`
4. `pod repo update`
5. `cd pact/swift/consumer`
6. `pod install`
7. `open consumer.xcworkspace`
8. edit the pre action test script with:

```sh
Provide build settings from "consumer"
```
```sh
exec > ${PROJECT_DIR}/prebuild.log 2>&1
PATH=${HOME}/.rbenv/shims:$PATH
${PROJECT_DIR}/Pods/PactConsumerSwift/scripts/start_server.sh
```
9. edit the post action test script with:

```sh
Provide build settings from "consumer"
```
```sh
exec > ${PROJECT_DIR}/prebuild.log 2>&1
PATH=${HOME}/.rbenv/shims:$PATH
${PROJECT_DIR}/Pods/PactConsumerSwift/scripts/stop_server.sh
```
For more info on editing the pre/post action scripts, please review
the [PactConsumerSwift installation] documentation.

Note: This setup is specific to a system using [rbenv]. To make this work
on your system, make sure the `PATH` variable is set to the proper Ruby.

## Steps to see Pact in action

After having completed the Setup instructions above, you're ready to generate.

1. Run the `consumerTests` tests from Xcode. Pact files will be saved in the `tmp/pacts` directory.

## Additional Info

Pact has Javascript, Java, Go, Swift, and .NET libraries too, among others. See
the [Official Pact documentation] for details.

[Pact gem]: https://github.com/realestate-com-au/pact
[Official Pact documentation]: https://docs.pact.io/
[Martin Fowler's article on CDC]: http://martinfowler.com/articles/consumerDrivenContracts.html#Consumer-drivenContracts
[PactConsumerSwift pod]: https://cocoapods.org/pods/PactConsumerSwift
[rbenv]: https://github.com/rbenv/rbenv
[PactConsumerSwift installation]: https://github.com/DiUS/pact-consumer-swift#installation
