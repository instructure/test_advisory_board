from __future__ import print_function

import grpc

import soseedy_pb2
import soseedy_pb2_grpc

def run():
  channel = grpc.insecure_channel('localhost:50051')
  stub = soseedy_pb2_grpc.SoSeedyStub(channel)
  teacher = stub.CreateTeacher(soseedy_pb2.CreateTeacherRequest())
  print("Teacher id: %s" % teacher.id)
  print("Teacher loginId: " + teacher.username)
  print("Teacher name: " + teacher.name)

if __name__ == '__main__':
  run()
