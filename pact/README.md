# Pact

These are examples of using Pact for consumer-driven contract testing.

- [Pact (Ruby)](./ruby/README.md)

Pact has Javascript, Java, Go, Swift, and .NET libraries too, among others.

## Learning Pact

If you're new to consumer-driven contract (CDC) testing, then we suggest the
following resources:

- [Official Pact documentation]
- [Martin Fowler's article on CDC]
- [mikey's presentation on Testing Microservices with Pact]

## FAQ

### How does Pact fit in with the development of new features?

The answer depends on the team, but remember these two fundamentals:

1. You should not be committing functionality to the master branch of the
consumer before it can be supported by the provider.
2. The functionality of the provider should still be driven by the needs of the
consumer.

With those principles in mind, here are patterns others have followed with
success:

- [Development Workflow with Pact]

### How can I use Pact to ensure backwards compatibility between API providers and consumers?

Pact's consumer-driven contract paradigm will help you answer this question. We
strongly recommend reading the following (in order):

- Principle: [Enter the Pact Matrix]
- How to do it: [Tagging Pacts] and [Using Tags]

[Official Pact documentation]: https://docs.pact.io/
[Martin Fowler's article on CDC]: http://martinfowler.com/articles/consumerDrivenContracts.html#Consumer-drivenContracts
[mikey's presentation on Testing Microservices with Pact]: https://app.slidebean.com/p/pvUQEmSsCo/Testing-Microservices-with-Pact
[Enter the Pact Matrix]: http://rea.tech/enter-the-pact-matrix-or-how-to-decouple-the-release-cycles-of-your-microservices/
[Development Workflow with Pact]: https://github.com/pact-foundation/pact-ruby/wiki/Development-workflow
[Tagging Pacts]: https://github.com/pact-foundation/pact_broker/wiki/How-to-ensure-backwards-compatibility-by-tagging-pacts
[Using Tags]: https://github.com/pact-foundation/pact_broker/wiki/Using-tags
