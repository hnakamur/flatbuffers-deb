//Generated by flatc compiler (version 1.10.0)
//If you make any local changes, they will be lost
//source: monster_test.fbs

package MyGame.Example;

import com.google.flatbuffers.grpc.FlatbuffersUtils;

import java.nio.ByteBuffer;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: monster_test.fbs")
public final class MonsterStorageGrpc {

  private MonsterStorageGrpc() {}
  
  public static final String SERVICE_NAME = "MyGame.Example.MonsterStorage";
  
  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getStoreMethod()} instead. 
  public static final io.grpc.MethodDescriptor<MyGame.Example.Monster,
      MyGame.Example.Stat> METHOD_STORE = getStoreMethod();
  
  private static volatile io.grpc.MethodDescriptor<MyGame.Example.Monster,
      MyGame.Example.Stat> getStoreMethod;
  
  private static volatile FlatbuffersUtils.FBExtactor<MyGame.Example.Monster> extractorOfMonster;
  private static FlatbuffersUtils.FBExtactor<MyGame.Example.Monster> getExtractorOfMonster() {
      if (extractorOfMonster != null) return extractorOfMonster;
      synchronized (MonsterStorageGrpc.class) {
          if (extractorOfMonster != null) return extractorOfMonster;
          extractorOfMonster = new FlatbuffersUtils.FBExtactor<MyGame.Example.Monster>() {
              public MyGame.Example.Monster extract (ByteBuffer buffer) {
                  return MyGame.Example.Monster.getRootAsMonster(buffer);
              }
          };
          return extractorOfMonster;
      }
  }
  
  private static volatile FlatbuffersUtils.FBExtactor<MyGame.Example.Stat> extractorOfStat;
  private static FlatbuffersUtils.FBExtactor<MyGame.Example.Stat> getExtractorOfStat() {
      if (extractorOfStat != null) return extractorOfStat;
      synchronized (MonsterStorageGrpc.class) {
          if (extractorOfStat != null) return extractorOfStat;
          extractorOfStat = new FlatbuffersUtils.FBExtactor<MyGame.Example.Stat>() {
              public MyGame.Example.Stat extract (ByteBuffer buffer) {
                  return MyGame.Example.Stat.getRootAsStat(buffer);
              }
          };
          return extractorOfStat;
      }
  }
  
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<MyGame.Example.Monster,
      MyGame.Example.Stat> getStoreMethod() {
    io.grpc.MethodDescriptor<MyGame.Example.Monster, MyGame.Example.Stat> getStoreMethod;
    if ((getStoreMethod = MonsterStorageGrpc.getStoreMethod) == null) {
      synchronized (MonsterStorageGrpc.class) {
        if ((getStoreMethod = MonsterStorageGrpc.getStoreMethod) == null) {
          MonsterStorageGrpc.getStoreMethod = getStoreMethod = 
              io.grpc.MethodDescriptor.<MyGame.Example.Monster, MyGame.Example.Stat>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "MyGame.Example.MonsterStorage", "Store"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(FlatbuffersUtils.marshaller(
                  MyGame.Example.Monster.class, getExtractorOfMonster()))
              .setResponseMarshaller(FlatbuffersUtils.marshaller(
                  MyGame.Example.Stat.class, getExtractorOfStat()))
                  .setSchemaDescriptor(null)
                  .build();
          }
        }
     }
     return getStoreMethod;
  }
  
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getRetrieveMethod()} instead. 
  public static final io.grpc.MethodDescriptor<MyGame.Example.Stat,
      MyGame.Example.Monster> METHOD_RETRIEVE = getRetrieveMethod();
  
  private static volatile io.grpc.MethodDescriptor<MyGame.Example.Stat,
      MyGame.Example.Monster> getRetrieveMethod;
  
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<MyGame.Example.Stat,
      MyGame.Example.Monster> getRetrieveMethod() {
    io.grpc.MethodDescriptor<MyGame.Example.Stat, MyGame.Example.Monster> getRetrieveMethod;
    if ((getRetrieveMethod = MonsterStorageGrpc.getRetrieveMethod) == null) {
      synchronized (MonsterStorageGrpc.class) {
        if ((getRetrieveMethod = MonsterStorageGrpc.getRetrieveMethod) == null) {
          MonsterStorageGrpc.getRetrieveMethod = getRetrieveMethod = 
              io.grpc.MethodDescriptor.<MyGame.Example.Stat, MyGame.Example.Monster>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "MyGame.Example.MonsterStorage", "Retrieve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(FlatbuffersUtils.marshaller(
                  MyGame.Example.Stat.class, getExtractorOfStat()))
              .setResponseMarshaller(FlatbuffersUtils.marshaller(
                  MyGame.Example.Monster.class, getExtractorOfMonster()))
                  .setSchemaDescriptor(null)
                  .build();
          }
        }
     }
     return getRetrieveMethod;
  }
  
  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MonsterStorageStub newStub(io.grpc.Channel channel) {
    return new MonsterStorageStub(channel);
  }
  
  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MonsterStorageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MonsterStorageBlockingStub(channel);
  }
  
  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MonsterStorageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MonsterStorageFutureStub(channel);
  }
  
  /**
   */
  public static abstract class MonsterStorageImplBase implements io.grpc.BindableService {
    
    /**
     */
    public     void store(MyGame.Example.Monster request,
        io.grpc.stub.StreamObserver<MyGame.Example.Stat> responseObserver)     {
      asyncUnimplementedUnaryCall(getStoreMethod(), responseObserver);
    }
    
    /**
     */
    public     void retrieve(MyGame.Example.Stat request,
        io.grpc.stub.StreamObserver<MyGame.Example.Monster> responseObserver)     {
      asyncUnimplementedUnaryCall(getRetrieveMethod(), responseObserver);
    }
    
    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStoreMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                MyGame.Example.Monster,
                MyGame.Example.Stat>(
                  this, METHODID_STORE)))
          .addMethod(
            getRetrieveMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                MyGame.Example.Stat,
                MyGame.Example.Monster>(
                  this, METHODID_RETRIEVE)))
          .build();
    }
  }
  
  /**
   */
  public static final class MonsterStorageStub extends io.grpc.stub.AbstractStub<MonsterStorageStub> {
    private MonsterStorageStub(io.grpc.Channel channel) {
      super(channel);
    }
    
    private MonsterStorageStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }
    
    @java.lang.Override
    protected MonsterStorageStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MonsterStorageStub(channel, callOptions);
    }
    
    /**
     */
    public     void store(MyGame.Example.Monster request,
        io.grpc.stub.StreamObserver<MyGame.Example.Stat> responseObserver)     {
      asyncUnaryCall(
          getChannel().newCall(getStoreMethod(), getCallOptions()), request, responseObserver);
    }
    
    /**
     */
    public     void retrieve(MyGame.Example.Stat request,
        io.grpc.stub.StreamObserver<MyGame.Example.Monster> responseObserver)     {
      asyncServerStreamingCall(
          getChannel().newCall(getRetrieveMethod(), getCallOptions()), request, responseObserver);
    }
  }
  
  /**
   */
  public static final class MonsterStorageBlockingStub extends io.grpc.stub.AbstractStub<MonsterStorageBlockingStub> {
    private MonsterStorageBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }
    
    private MonsterStorageBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }
    
    @java.lang.Override
    protected MonsterStorageBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MonsterStorageBlockingStub(channel, callOptions);
    }
    
    /**
     */
    public     MyGame.Example.Stat store(MyGame.Example.Monster request)     {
      return blockingUnaryCall(
          getChannel(), getStoreMethod(), getCallOptions(), request);
    }
    
    /**
     */
    public     java.util.Iterator<MyGame.Example.Monster> retrieve(
        MyGame.Example.Stat request)     {
      return blockingServerStreamingCall(
          getChannel(), getRetrieveMethod(), getCallOptions(), request);
    }
  }
  
  /**
   */
  public static final class MonsterStorageFutureStub extends io.grpc.stub.AbstractStub<MonsterStorageFutureStub> {
    private MonsterStorageFutureStub(io.grpc.Channel channel) {
      super(channel);
    }
    
    private MonsterStorageFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }
    
    @java.lang.Override
    protected MonsterStorageFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MonsterStorageFutureStub(channel, callOptions);
    }
    
    /**
     */
    public     com.google.common.util.concurrent.ListenableFuture<MyGame.Example.Stat> store(
        MyGame.Example.Monster request)     {
      return futureUnaryCall(
          getChannel().newCall(getStoreMethod(), getCallOptions()), request);
    }
  }
  
  private static final int METHODID_STORE = 0;
  private static final int METHODID_RETRIEVE = 1;
  
  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MonsterStorageImplBase serviceImpl;
    private final int methodId;
  
    MethodHandlers(MonsterStorageImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }
  
    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STORE:
          serviceImpl.store((MyGame.Example.Monster) request,
              (io.grpc.stub.StreamObserver<MyGame.Example.Stat>) responseObserver);
          break;
        case METHODID_RETRIEVE:
          serviceImpl.retrieve((MyGame.Example.Stat) request,
              (io.grpc.stub.StreamObserver<MyGame.Example.Monster>) responseObserver);
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
      synchronized (MonsterStorageGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)              
              .setSchemaDescriptor(null)              
              .addMethod(getStoreMethod())              
              .addMethod(getRetrieveMethod())              
              .build();
        }
      }
    }
    return result;
  }
}
