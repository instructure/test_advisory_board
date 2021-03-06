#!/usr/bin/env bash
set -ex

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

docker build ./ -t instructure/testcafe

docker run -v $DIR/instUI:/tests/instUI instructure/testcafe firefox /tests/instUI/tests/*.js
docker run -v $DIR/theInternet:/tests/theInternet instructure/testcafe firefox /tests/theInternet/tests/*.js
