
var grpc = require('grpc');
var soseedy_proto = grpc.load(__dirname + '/../soseedy.proto').soseedy

var client = new soseedy_proto.SoSeedy('localhost:50051', grpc.credentials.createInsecure());

function createTeacher(call, callback) {
  callback(null, {
     id: 1234,
     username: "randomUsername",
     password: "randomPassword",
     domain: "domain",
     token: "token",
     name: "name",
     short_name: "short_name",
     avatar_url: "avatar_url"
  });
}

function main() {
  var server = new grpc.Server();
  server.addService(soseedy_proto.SoSeedy.service, {createTeacher: createTeacher});
  server.bind('0.0.0.0:50051', grpc.ServerCredentials.createInsecure());
  server.start();
}

main();
