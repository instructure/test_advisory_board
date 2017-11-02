
var grpc = require('grpc');
var soseedy_proto = grpc.load(__dirname + '/../soseedy.proto').soseedy

var client = new soseedy_proto.SoSeedy('localhost:50051', grpc.credentials.createInsecure());

client.createTeacher({}, function(err, teacher) {
  console.log("Teacher id:", teacher.id);
  console.log("Teacher loginId:", teacher.username);
  console.log("Teacher name:", teacher.name);
});
