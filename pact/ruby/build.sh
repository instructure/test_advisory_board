#!/usr/bin/env bash
set -ex

ruby -v
bundle --version

cd consumer
bundle install
bundle exec rspec
cd ..

cd provider
bundle install
bundle exec rake pact:verify
