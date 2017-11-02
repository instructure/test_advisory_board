#!/bin/bash
set -euxo pipefail

##
# JavaScript
yarn

##
# Ruby
bundle install
grpc_tools_ruby_protoc --ruby_out=ruby/ --grpc_out=ruby soseedy.proto

##
# Golang
go get google.golang.org/grpc
go get -u github.com/golang/protobuf/protoc-gen-go
protoc --go_out=plugins=grpc:go soseedy.proto

##
# Python
python -m pip install --upgrade pip
python -m pip install grpcio --ignore-installed
python -m pip install grpcio-tools

python -m grpc_tools.protoc --python_out=python/ --grpc_python_out=python/ -I . soseedy.proto

##
# Swift
protoc soseedy.proto \
  --swift_out="swift/ios_grpc/ios_grpc" \
  --swiftgrpc_out="swift/ios_grpc/ios_grpc"
