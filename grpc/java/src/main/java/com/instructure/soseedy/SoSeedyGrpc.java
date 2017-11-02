package com.instructure.soseedy;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.6.1)",
    comments = "Source: soseedy.proto")
public final class SoSeedyGrpc {

  private SoSeedyGrpc() {}

  public static final String SERVICE_NAME = "soseedy.SoSeedy";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.instructure.soseedy.CreateTeacherRequest,
      com.instructure.soseedy.Teacher> METHOD_CREATE_TEACHER =
      io.grpc.MethodDescriptor.<com.instructure.soseedy.CreateTeacherRequest, com.instructure.soseedy.Teacher>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "soseedy.SoSeedy", "CreateTeacher"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.instructure.soseedy.CreateTeacherRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.instructure.soseedy.Teacher.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SoSeedyStub newStub(io.grpc.Channel channel) {
    return new SoSeedyStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SoSeedyBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SoSeedyBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SoSeedyFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SoSeedyFutureStub(channel);
  }

  /**
   */
  public static abstract class SoSeedyImplBase implements io.grpc.BindableService {

    /**
     */
    public void createTeacher(com.instructure.soseedy.CreateTeacherRequest request,
        io.grpc.stub.StreamObserver<com.instructure.soseedy.Teacher> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_TEACHER, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_TEACHER,
            asyncUnaryCall(
              new MethodHandlers<
                com.instructure.soseedy.CreateTeacherRequest,
                com.instructure.soseedy.Teacher>(
                  this, METHODID_CREATE_TEACHER)))
          .build();
    }
  }

  /**
   */
  public static final class SoSeedyStub extends io.grpc.stub.AbstractStub<SoSeedyStub> {
    private SoSeedyStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SoSeedyStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SoSeedyStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SoSeedyStub(channel, callOptions);
    }

    /**
     */
    public void createTeacher(com.instructure.soseedy.CreateTeacherRequest request,
        io.grpc.stub.StreamObserver<com.instructure.soseedy.Teacher> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_TEACHER, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SoSeedyBlockingStub extends io.grpc.stub.AbstractStub<SoSeedyBlockingStub> {
    private SoSeedyBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SoSeedyBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SoSeedyBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SoSeedyBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.instructure.soseedy.Teacher createTeacher(com.instructure.soseedy.CreateTeacherRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_TEACHER, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SoSeedyFutureStub extends io.grpc.stub.AbstractStub<SoSeedyFutureStub> {
    private SoSeedyFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SoSeedyFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SoSeedyFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SoSeedyFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.instructure.soseedy.Teacher> createTeacher(
        com.instructure.soseedy.CreateTeacherRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_TEACHER, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TEACHER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SoSeedyImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SoSeedyImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_TEACHER:
          serviceImpl.createTeacher((com.instructure.soseedy.CreateTeacherRequest) request,
              (io.grpc.stub.StreamObserver<com.instructure.soseedy.Teacher>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SoSeedyGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(METHOD_CREATE_TEACHER)
              .build();
        }
      }
    }
    return result;
  }
}
