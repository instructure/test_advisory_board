# Pact

These are examples of using Pact for consumer-driven contract testing.

- [Pact (Ruby)](./ruby/README.md)

Pact has Javascript, Java, Go, Swift, and .NET libraries too, among others.

## Learning Pact

If you're new to consumer-driven contract (CDC) testing, then we suggest the
following resources:

- [Official Pact documentation]
- [Martin Fowler's article on CDC]
- [mikey's presentation on Testing Contracts with Pact]
- [mikey's other presentation on Testing Microservices with Pact]

## FAQ

### What's the ultimate vision for Pact at Instructure?

[Pact Nirvana!]

### How does Pact fit in with the development of new features?

The answer depends on the team, but remember: The needs of the consumer should
drive the functionality of the provider.

Where teams use feature flags (and most do at Instructure), the Canvas Pact Team
has devised an approach that should work well! More to come as the process is
built and ironed out.

Where teams use feature branches, this may be helpful: [Development Workflow with Pact]

### How can I use Pact to ensure backwards compatibility between API providers and consumers?

Pact's consumer-driven contract paradigm will help you answer this question. We
strongly recommend reading the following (in order):

- Principle: [Enter the Pact Matrix]
- How to do it: [Tagging Pacts] and [Using Tags]

[Official Pact documentation]: https://docs.pact.io/
[Martin Fowler's article on CDC]: http://martinfowler.com/articles/consumerDrivenContracts.html#Consumer-drivenContracts
[mikey's presentation on Testing Contracts with Pact]: https://app.slidebean.com/p/EeFf44ooau/Testing-Contracts-with-Pact
[mikey's other presentation on Testing Microservices with Pact]: https://app.slidebean.com/p/pvUQEmSsCo/Testing-Microservices-with-Pact
[Pact Nirvana!]: https://docs.google.com/document/d/e/2PACX-1vRf1kSDccImNipOOm1G-bjcSs-ifbZjf1v54K-dIcq8BLKeFPAAm_bf_p71UKqkRMIx30QWWL-kN8TI/pub
[Enter the Pact Matrix]: http://rea.tech/enter-the-pact-matrix-or-how-to-decouple-the-release-cycles-of-your-microservices/
[Development Workflow with Pact]: https://github.com/pact-foundation/pact-ruby/wiki/Development-workflow
[Tagging Pacts]: https://github.com/pact-foundation/pact_broker/wiki/How-to-ensure-backwards-compatibility-by-tagging-pacts
[Using Tags]: https://github.com/pact-foundation/pact_broker/wiki/Using-tags
