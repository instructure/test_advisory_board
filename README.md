
A collection of proofs of concept that demonstrate technology used throughout
Instructure.


## Proofs of concept

- [Pact](pact) - Contract testing approach used by various Instructure apps
- [TestCafe](testcafe) - A Node.js tool to automate end-to-end web testing

## Continuous Integration

We use [bitrise.io][bitrise] to run our continuous integration (CI) builds for
this repo. See [`bitrise.yml`](bitrise.yml) for details.

To run the same CI steps on your computer:

1. Install the [Bitrise CLI][cli] (`brew install bitrise` for you homebrewers)
2. Run this inside your terminal in this repo:

```sh
bitrise run --workflow ci
```

[bitrise]: https://app.bitrise.io/app/d528939eac6fe1db#/builds
[cli]: https://app.bitrise.io/cli
