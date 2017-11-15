# Pact (Java)

This is an example of using the [Pact] for consumer-driven contract
testing.

If you're new to consumer-driven contract (CDC) testing, then we suggest the
following resources:

- [Official Pact documentation]
- [Martin Fowler's article on CDC]

Note this repo contains two separate projects with their own Gradle files. In the
real world, of course, the API service and any clients would normally reside
in their own repos.

## Consumer: `Perform` 

`Perform` consumes the `Bridge` service. You can observe its functionality
in the files `consumer/quiz.rb` and `consumer/quiz_service_client.rb`.

## Provider: `Bridge`

`Quiz API` is our service provider for this example. It's a simple Sinatra app.
It resides in the `provider/` directory.

## Setup

1. Clone the test_advisory_board repo to your computer
2. `cd pact/java/consumer/`
3. `cd pact/java/provider/ `

## Steps to see Pact in action

After having completed the Setup instructions above, you're ready to generate
and verify pacts.

1. Generate your consumer's pact file: [ Make sure you remove build directory otherwise it will not generate file ]

```
./gradlew test
```

2. Observe the shiny new pact located inside `./consumer/pacts_generated/`

3. Run SpringBoot app
```
./gradlew clean build && java -jar build/libs/gs-actuator-service-0.1.0.jar
```
3. Verify the pact against the provider's API:
 
```
./gradlew pactVerify
```

## Additional Info

Pact has Javascript, Java, Go, Swift, and .NET libraries too, among others. See
the [Official Pact documentation] for details.

[Pact gem]: https://github.com/realestate-com-au/pact
[Official Pact documentation]: https://docs.pact.io/
[Martin Fowler's article on CDC]: http://martinfowler.com/articles/consumerDrivenContracts.html#Consumer-drivenContracts