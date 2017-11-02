package com.instructure.dataseeding;

import com.instructure.soseedy.CreateTeacherRequest;
import com.instructure.soseedy.SoSeedyGrpc;
import com.instructure.soseedy.SoSeedyGrpc.SoSeedyBlockingStub;
import com.instructure.soseedy.Teacher;
import io.grpc.Channel;
import io.grpc.ManagedChannelBuilder;

public class Client {

    public static void main(String[] args) {
        String host = "localhost";
        int port = 50051;
        Channel channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext(true)
                .build();
        SoSeedyBlockingStub client = SoSeedyGrpc.newBlockingStub(channel);

        Teacher teacher = client.createTeacher(CreateTeacherRequest.getDefaultInstance());

        System.out.printf("Teacher user: %s\n", teacher.getUsername());
        System.out.printf("Teacher password: %s\n", teacher.getPassword());
    }
}
