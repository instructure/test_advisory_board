$LOAD_PATH.unshift __dir__
require 'soseedy_services_pb'

stub = Soseedy::SoSeedy::Stub.new('localhost:50051', :this_channel_is_insecure)
teacher = stub.create_teacher(Soseedy::CreateTeacherRequest.new)

puts "Teacher id: #{teacher.id}"
puts "Teacher loginId: #{teacher.username}"
puts "Teacher name: #{teacher.name}"
