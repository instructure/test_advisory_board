#!/usr/bin/env bash
set -ex

cd provider
./gradlew clean build
java -jar build/libs/gs-actuator-service-0.1.0.jar &> /dev/null &
sleep 20
cd ..

cd consumer
./gradlew test
cd ..

cd provider
./gradlew pactVerify
