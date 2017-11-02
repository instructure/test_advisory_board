# [gRPC Official Languages](https://grpc.io/docs/quickstart/)

[Intro to gRPC](https://docs.google.com/presentation/d/1dgI09a-_4dwBMLyqfwchvS6iXtbcISQPLAXL6gSYOcc/edit#slide=id.g1c2bc22a4a_0_0)

Start the server:
- `node nodejs/server.js`

Now run any of the clients:

- [x] Java
  - `gradle -p java fatJar && java -jar java/build/libs/java-all.jar`
- [x] Python
  - `python python/main.py`
- [x] Go
  - `go run go/main.go`
- [x] Ruby
  - `ruby ruby/client.rb`
- [x] Node.js
  - `node nodejs/client.js`
- [x] Swift
  - Open `ios_grpc.xcworkspace` in Xcode

## Use case

Share same data seeding API across Android / iOS.
