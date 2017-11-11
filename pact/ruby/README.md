# Pact (Ruby)

This is an example of using the [Pact gem] for consumer-driven contract
testing.

If you're new to consumer-driven contract (CDC) testing, then we suggest the
following resources:

- [Official Pact documentation]
- [Martin Fowler's article on CDC]

Note this repo contains two separate projects with their own Gemfiles. In the
real world, of course, the API service and any clients would normally reside
in their own repos.

## Consumer: `Quiz Web`

`Quiz Web` consumes the `Quiz API` service. You can observe its functionality
in the files `consumer/quiz.rb` and `consumer/quiz_service_client.rb`.

## Provider: `Quiz API`

`Quiz API` is our service provider for this example. It's a simple Sinatra app.
It resides in the `provider/` directory.

## Setup

1. Clone the test_advisory_board repo to your computer
2. `cd pact/pact-poc/consumer/ && bundle`
3. `cd pact/pact-poc/provider/ && bundle`

## Steps to see Pact in action

After having completed the Setup instructions above, you're ready to generate
and verify pacts.

1. Generate your consumer's pact file:

```sh
cd ./consumer/ && bundle exec rspec
```

2. Observe the shiny new pact located inside `./consumer/spec/pacts/`
3. Also observe the useful logs located inside `./consumer/log/`
4. Verify the pact against the provider's API:

```sh
cd ./provider/ && bundle exec rake pact:verify
```

5. Now observe Pact's auto-generated logs for the provider: `./provider/log/`

This is useful too: `./provider/reports/pacts/help.md`.

## Learning Exercises

Open `./provider/quiz_api.rb`. See the two defined routes? Try adding an RSpec
specification to the consumer that will generate a pact against the `/` route.

## Additional Info

Pact has Javascript, Java, Go, Swift, and .NET libraries too, among others. See
the [Official Pact documentation] for details.

[Pact gem]: https://github.com/realestate-com-au/pact
[Official Pact documentation]: https://docs.pact.io/
[Martin Fowler's article on CDC]: http://martinfowler.com/articles/consumerDrivenContracts.html#Consumer-drivenContracts
