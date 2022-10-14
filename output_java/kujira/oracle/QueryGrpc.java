package kujira.oracle;

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
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: kujira/oracle/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "kujira.oracle.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<kujira.oracle.QueryOuterClass.QueryExchangeRateRequest,
      kujira.oracle.QueryOuterClass.QueryExchangeRateResponse> getExchangeRateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExchangeRate",
      requestType = kujira.oracle.QueryOuterClass.QueryExchangeRateRequest.class,
      responseType = kujira.oracle.QueryOuterClass.QueryExchangeRateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kujira.oracle.QueryOuterClass.QueryExchangeRateRequest,
      kujira.oracle.QueryOuterClass.QueryExchangeRateResponse> getExchangeRateMethod() {
    io.grpc.MethodDescriptor<kujira.oracle.QueryOuterClass.QueryExchangeRateRequest, kujira.oracle.QueryOuterClass.QueryExchangeRateResponse> getExchangeRateMethod;
    if ((getExchangeRateMethod = QueryGrpc.getExchangeRateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getExchangeRateMethod = QueryGrpc.getExchangeRateMethod) == null) {
          QueryGrpc.getExchangeRateMethod = getExchangeRateMethod =
              io.grpc.MethodDescriptor.<kujira.oracle.QueryOuterClass.QueryExchangeRateRequest, kujira.oracle.QueryOuterClass.QueryExchangeRateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExchangeRate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kujira.oracle.QueryOuterClass.QueryExchangeRateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kujira.oracle.QueryOuterClass.QueryExchangeRateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ExchangeRate"))
              .build();
        }
      }
    }
    return getExchangeRateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kujira.oracle.QueryOuterClass.QueryExchangeRatesRequest,
      kujira.oracle.QueryOuterClass.QueryExchangeRatesResponse> getExchangeRatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExchangeRates",
      requestType = kujira.oracle.QueryOuterClass.QueryExchangeRatesRequest.class,
      responseType = kujira.oracle.QueryOuterClass.QueryExchangeRatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kujira.oracle.QueryOuterClass.QueryExchangeRatesRequest,
      kujira.oracle.QueryOuterClass.QueryExchangeRatesResponse> getExchangeRatesMethod() {
    io.grpc.MethodDescriptor<kujira.oracle.QueryOuterClass.QueryExchangeRatesRequest, kujira.oracle.QueryOuterClass.QueryExchangeRatesResponse> getExchangeRatesMethod;
    if ((getExchangeRatesMethod = QueryGrpc.getExchangeRatesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getExchangeRatesMethod = QueryGrpc.getExchangeRatesMethod) == null) {
          QueryGrpc.getExchangeRatesMethod = getExchangeRatesMethod =
              io.grpc.MethodDescriptor.<kujira.oracle.QueryOuterClass.QueryExchangeRatesRequest, kujira.oracle.QueryOuterClass.QueryExchangeRatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExchangeRates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kujira.oracle.QueryOuterClass.QueryExchangeRatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kujira.oracle.QueryOuterClass.QueryExchangeRatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ExchangeRates"))
              .build();
        }
      }
    }
    return getExchangeRatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kujira.oracle.QueryOuterClass.QueryActivesRequest,
      kujira.oracle.QueryOuterClass.QueryActivesResponse> getActivesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Actives",
      requestType = kujira.oracle.QueryOuterClass.QueryActivesRequest.class,
      responseType = kujira.oracle.QueryOuterClass.QueryActivesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kujira.oracle.QueryOuterClass.QueryActivesRequest,
      kujira.oracle.QueryOuterClass.QueryActivesResponse> getActivesMethod() {
    io.grpc.MethodDescriptor<kujira.oracle.QueryOuterClass.QueryActivesRequest, kujira.oracle.QueryOuterClass.QueryActivesResponse> getActivesMethod;
    if ((getActivesMethod = QueryGrpc.getActivesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getActivesMethod = QueryGrpc.getActivesMethod) == null) {
          QueryGrpc.getActivesMethod = getActivesMethod =
              io.grpc.MethodDescriptor.<kujira.oracle.QueryOuterClass.QueryActivesRequest, kujira.oracle.QueryOuterClass.QueryActivesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Actives"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kujira.oracle.QueryOuterClass.QueryActivesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kujira.oracle.QueryOuterClass.QueryActivesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Actives"))
              .build();
        }
      }
    }
    return getActivesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kujira.oracle.QueryOuterClass.QueryFeederDelegationRequest,
      kujira.oracle.QueryOuterClass.QueryFeederDelegationResponse> getFeederDelegationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FeederDelegation",
      requestType = kujira.oracle.QueryOuterClass.QueryFeederDelegationRequest.class,
      responseType = kujira.oracle.QueryOuterClass.QueryFeederDelegationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kujira.oracle.QueryOuterClass.QueryFeederDelegationRequest,
      kujira.oracle.QueryOuterClass.QueryFeederDelegationResponse> getFeederDelegationMethod() {
    io.grpc.MethodDescriptor<kujira.oracle.QueryOuterClass.QueryFeederDelegationRequest, kujira.oracle.QueryOuterClass.QueryFeederDelegationResponse> getFeederDelegationMethod;
    if ((getFeederDelegationMethod = QueryGrpc.getFeederDelegationMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFeederDelegationMethod = QueryGrpc.getFeederDelegationMethod) == null) {
          QueryGrpc.getFeederDelegationMethod = getFeederDelegationMethod =
              io.grpc.MethodDescriptor.<kujira.oracle.QueryOuterClass.QueryFeederDelegationRequest, kujira.oracle.QueryOuterClass.QueryFeederDelegationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FeederDelegation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kujira.oracle.QueryOuterClass.QueryFeederDelegationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kujira.oracle.QueryOuterClass.QueryFeederDelegationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("FeederDelegation"))
              .build();
        }
      }
    }
    return getFeederDelegationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kujira.oracle.QueryOuterClass.QueryMissCounterRequest,
      kujira.oracle.QueryOuterClass.QueryMissCounterResponse> getMissCounterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MissCounter",
      requestType = kujira.oracle.QueryOuterClass.QueryMissCounterRequest.class,
      responseType = kujira.oracle.QueryOuterClass.QueryMissCounterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kujira.oracle.QueryOuterClass.QueryMissCounterRequest,
      kujira.oracle.QueryOuterClass.QueryMissCounterResponse> getMissCounterMethod() {
    io.grpc.MethodDescriptor<kujira.oracle.QueryOuterClass.QueryMissCounterRequest, kujira.oracle.QueryOuterClass.QueryMissCounterResponse> getMissCounterMethod;
    if ((getMissCounterMethod = QueryGrpc.getMissCounterMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMissCounterMethod = QueryGrpc.getMissCounterMethod) == null) {
          QueryGrpc.getMissCounterMethod = getMissCounterMethod =
              io.grpc.MethodDescriptor.<kujira.oracle.QueryOuterClass.QueryMissCounterRequest, kujira.oracle.QueryOuterClass.QueryMissCounterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MissCounter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kujira.oracle.QueryOuterClass.QueryMissCounterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kujira.oracle.QueryOuterClass.QueryMissCounterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("MissCounter"))
              .build();
        }
      }
    }
    return getMissCounterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kujira.oracle.QueryOuterClass.QueryAggregatePrevoteRequest,
      kujira.oracle.QueryOuterClass.QueryAggregatePrevoteResponse> getAggregatePrevoteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AggregatePrevote",
      requestType = kujira.oracle.QueryOuterClass.QueryAggregatePrevoteRequest.class,
      responseType = kujira.oracle.QueryOuterClass.QueryAggregatePrevoteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kujira.oracle.QueryOuterClass.QueryAggregatePrevoteRequest,
      kujira.oracle.QueryOuterClass.QueryAggregatePrevoteResponse> getAggregatePrevoteMethod() {
    io.grpc.MethodDescriptor<kujira.oracle.QueryOuterClass.QueryAggregatePrevoteRequest, kujira.oracle.QueryOuterClass.QueryAggregatePrevoteResponse> getAggregatePrevoteMethod;
    if ((getAggregatePrevoteMethod = QueryGrpc.getAggregatePrevoteMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAggregatePrevoteMethod = QueryGrpc.getAggregatePrevoteMethod) == null) {
          QueryGrpc.getAggregatePrevoteMethod = getAggregatePrevoteMethod =
              io.grpc.MethodDescriptor.<kujira.oracle.QueryOuterClass.QueryAggregatePrevoteRequest, kujira.oracle.QueryOuterClass.QueryAggregatePrevoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AggregatePrevote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kujira.oracle.QueryOuterClass.QueryAggregatePrevoteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kujira.oracle.QueryOuterClass.QueryAggregatePrevoteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AggregatePrevote"))
              .build();
        }
      }
    }
    return getAggregatePrevoteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kujira.oracle.QueryOuterClass.QueryAggregatePrevotesRequest,
      kujira.oracle.QueryOuterClass.QueryAggregatePrevotesResponse> getAggregatePrevotesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AggregatePrevotes",
      requestType = kujira.oracle.QueryOuterClass.QueryAggregatePrevotesRequest.class,
      responseType = kujira.oracle.QueryOuterClass.QueryAggregatePrevotesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kujira.oracle.QueryOuterClass.QueryAggregatePrevotesRequest,
      kujira.oracle.QueryOuterClass.QueryAggregatePrevotesResponse> getAggregatePrevotesMethod() {
    io.grpc.MethodDescriptor<kujira.oracle.QueryOuterClass.QueryAggregatePrevotesRequest, kujira.oracle.QueryOuterClass.QueryAggregatePrevotesResponse> getAggregatePrevotesMethod;
    if ((getAggregatePrevotesMethod = QueryGrpc.getAggregatePrevotesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAggregatePrevotesMethod = QueryGrpc.getAggregatePrevotesMethod) == null) {
          QueryGrpc.getAggregatePrevotesMethod = getAggregatePrevotesMethod =
              io.grpc.MethodDescriptor.<kujira.oracle.QueryOuterClass.QueryAggregatePrevotesRequest, kujira.oracle.QueryOuterClass.QueryAggregatePrevotesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AggregatePrevotes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kujira.oracle.QueryOuterClass.QueryAggregatePrevotesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kujira.oracle.QueryOuterClass.QueryAggregatePrevotesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AggregatePrevotes"))
              .build();
        }
      }
    }
    return getAggregatePrevotesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kujira.oracle.QueryOuterClass.QueryAggregateVoteRequest,
      kujira.oracle.QueryOuterClass.QueryAggregateVoteResponse> getAggregateVoteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AggregateVote",
      requestType = kujira.oracle.QueryOuterClass.QueryAggregateVoteRequest.class,
      responseType = kujira.oracle.QueryOuterClass.QueryAggregateVoteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kujira.oracle.QueryOuterClass.QueryAggregateVoteRequest,
      kujira.oracle.QueryOuterClass.QueryAggregateVoteResponse> getAggregateVoteMethod() {
    io.grpc.MethodDescriptor<kujira.oracle.QueryOuterClass.QueryAggregateVoteRequest, kujira.oracle.QueryOuterClass.QueryAggregateVoteResponse> getAggregateVoteMethod;
    if ((getAggregateVoteMethod = QueryGrpc.getAggregateVoteMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAggregateVoteMethod = QueryGrpc.getAggregateVoteMethod) == null) {
          QueryGrpc.getAggregateVoteMethod = getAggregateVoteMethod =
              io.grpc.MethodDescriptor.<kujira.oracle.QueryOuterClass.QueryAggregateVoteRequest, kujira.oracle.QueryOuterClass.QueryAggregateVoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AggregateVote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kujira.oracle.QueryOuterClass.QueryAggregateVoteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kujira.oracle.QueryOuterClass.QueryAggregateVoteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AggregateVote"))
              .build();
        }
      }
    }
    return getAggregateVoteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kujira.oracle.QueryOuterClass.QueryAggregateVotesRequest,
      kujira.oracle.QueryOuterClass.QueryAggregateVotesResponse> getAggregateVotesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AggregateVotes",
      requestType = kujira.oracle.QueryOuterClass.QueryAggregateVotesRequest.class,
      responseType = kujira.oracle.QueryOuterClass.QueryAggregateVotesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kujira.oracle.QueryOuterClass.QueryAggregateVotesRequest,
      kujira.oracle.QueryOuterClass.QueryAggregateVotesResponse> getAggregateVotesMethod() {
    io.grpc.MethodDescriptor<kujira.oracle.QueryOuterClass.QueryAggregateVotesRequest, kujira.oracle.QueryOuterClass.QueryAggregateVotesResponse> getAggregateVotesMethod;
    if ((getAggregateVotesMethod = QueryGrpc.getAggregateVotesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAggregateVotesMethod = QueryGrpc.getAggregateVotesMethod) == null) {
          QueryGrpc.getAggregateVotesMethod = getAggregateVotesMethod =
              io.grpc.MethodDescriptor.<kujira.oracle.QueryOuterClass.QueryAggregateVotesRequest, kujira.oracle.QueryOuterClass.QueryAggregateVotesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AggregateVotes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kujira.oracle.QueryOuterClass.QueryAggregateVotesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kujira.oracle.QueryOuterClass.QueryAggregateVotesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AggregateVotes"))
              .build();
        }
      }
    }
    return getAggregateVotesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kujira.oracle.QueryOuterClass.QueryParamsRequest,
      kujira.oracle.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = kujira.oracle.QueryOuterClass.QueryParamsRequest.class,
      responseType = kujira.oracle.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kujira.oracle.QueryOuterClass.QueryParamsRequest,
      kujira.oracle.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<kujira.oracle.QueryOuterClass.QueryParamsRequest, kujira.oracle.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<kujira.oracle.QueryOuterClass.QueryParamsRequest, kujira.oracle.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kujira.oracle.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kujira.oracle.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryStub>() {
        @java.lang.Override
        public QueryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryStub(channel, callOptions);
        }
      };
    return QueryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryBlockingStub>() {
        @java.lang.Override
        public QueryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryBlockingStub(channel, callOptions);
        }
      };
    return QueryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryFutureStub>() {
        @java.lang.Override
        public QueryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryFutureStub(channel, callOptions);
        }
      };
    return QueryFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static abstract class QueryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * ExchangeRate returns exchange rate of a denom
     * </pre>
     */
    public void exchangeRate(kujira.oracle.QueryOuterClass.QueryExchangeRateRequest request,
        io.grpc.stub.StreamObserver<kujira.oracle.QueryOuterClass.QueryExchangeRateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getExchangeRateMethod(), responseObserver);
    }

    /**
     * <pre>
     * ExchangeRates returns exchange rates of all denoms
     * </pre>
     */
    public void exchangeRates(kujira.oracle.QueryOuterClass.QueryExchangeRatesRequest request,
        io.grpc.stub.StreamObserver<kujira.oracle.QueryOuterClass.QueryExchangeRatesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getExchangeRatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Actives returns all active denoms
     * </pre>
     */
    public void actives(kujira.oracle.QueryOuterClass.QueryActivesRequest request,
        io.grpc.stub.StreamObserver<kujira.oracle.QueryOuterClass.QueryActivesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getActivesMethod(), responseObserver);
    }

    /**
     * <pre>
     * FeederDelegation returns feeder delegation of a validator
     * </pre>
     */
    public void feederDelegation(kujira.oracle.QueryOuterClass.QueryFeederDelegationRequest request,
        io.grpc.stub.StreamObserver<kujira.oracle.QueryOuterClass.QueryFeederDelegationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFeederDelegationMethod(), responseObserver);
    }

    /**
     * <pre>
     * MissCounter returns oracle miss counter of a validator
     * </pre>
     */
    public void missCounter(kujira.oracle.QueryOuterClass.QueryMissCounterRequest request,
        io.grpc.stub.StreamObserver<kujira.oracle.QueryOuterClass.QueryMissCounterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMissCounterMethod(), responseObserver);
    }

    /**
     * <pre>
     * AggregatePrevote returns an aggregate prevote of a validator
     * </pre>
     */
    public void aggregatePrevote(kujira.oracle.QueryOuterClass.QueryAggregatePrevoteRequest request,
        io.grpc.stub.StreamObserver<kujira.oracle.QueryOuterClass.QueryAggregatePrevoteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAggregatePrevoteMethod(), responseObserver);
    }

    /**
     * <pre>
     * AggregatePrevotes returns aggregate prevotes of all validators
     * </pre>
     */
    public void aggregatePrevotes(kujira.oracle.QueryOuterClass.QueryAggregatePrevotesRequest request,
        io.grpc.stub.StreamObserver<kujira.oracle.QueryOuterClass.QueryAggregatePrevotesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAggregatePrevotesMethod(), responseObserver);
    }

    /**
     * <pre>
     * AggregateVote returns an aggregate vote of a validator
     * </pre>
     */
    public void aggregateVote(kujira.oracle.QueryOuterClass.QueryAggregateVoteRequest request,
        io.grpc.stub.StreamObserver<kujira.oracle.QueryOuterClass.QueryAggregateVoteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAggregateVoteMethod(), responseObserver);
    }

    /**
     * <pre>
     * AggregateVotes returns aggregate votes of all validators
     * </pre>
     */
    public void aggregateVotes(kujira.oracle.QueryOuterClass.QueryAggregateVotesRequest request,
        io.grpc.stub.StreamObserver<kujira.oracle.QueryOuterClass.QueryAggregateVotesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAggregateVotesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params queries all parameters.
     * </pre>
     */
    public void params(kujira.oracle.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<kujira.oracle.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getExchangeRateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kujira.oracle.QueryOuterClass.QueryExchangeRateRequest,
                kujira.oracle.QueryOuterClass.QueryExchangeRateResponse>(
                  this, METHODID_EXCHANGE_RATE)))
          .addMethod(
            getExchangeRatesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kujira.oracle.QueryOuterClass.QueryExchangeRatesRequest,
                kujira.oracle.QueryOuterClass.QueryExchangeRatesResponse>(
                  this, METHODID_EXCHANGE_RATES)))
          .addMethod(
            getActivesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kujira.oracle.QueryOuterClass.QueryActivesRequest,
                kujira.oracle.QueryOuterClass.QueryActivesResponse>(
                  this, METHODID_ACTIVES)))
          .addMethod(
            getFeederDelegationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kujira.oracle.QueryOuterClass.QueryFeederDelegationRequest,
                kujira.oracle.QueryOuterClass.QueryFeederDelegationResponse>(
                  this, METHODID_FEEDER_DELEGATION)))
          .addMethod(
            getMissCounterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kujira.oracle.QueryOuterClass.QueryMissCounterRequest,
                kujira.oracle.QueryOuterClass.QueryMissCounterResponse>(
                  this, METHODID_MISS_COUNTER)))
          .addMethod(
            getAggregatePrevoteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kujira.oracle.QueryOuterClass.QueryAggregatePrevoteRequest,
                kujira.oracle.QueryOuterClass.QueryAggregatePrevoteResponse>(
                  this, METHODID_AGGREGATE_PREVOTE)))
          .addMethod(
            getAggregatePrevotesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kujira.oracle.QueryOuterClass.QueryAggregatePrevotesRequest,
                kujira.oracle.QueryOuterClass.QueryAggregatePrevotesResponse>(
                  this, METHODID_AGGREGATE_PREVOTES)))
          .addMethod(
            getAggregateVoteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kujira.oracle.QueryOuterClass.QueryAggregateVoteRequest,
                kujira.oracle.QueryOuterClass.QueryAggregateVoteResponse>(
                  this, METHODID_AGGREGATE_VOTE)))
          .addMethod(
            getAggregateVotesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kujira.oracle.QueryOuterClass.QueryAggregateVotesRequest,
                kujira.oracle.QueryOuterClass.QueryAggregateVotesResponse>(
                  this, METHODID_AGGREGATE_VOTES)))
          .addMethod(
            getParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kujira.oracle.QueryOuterClass.QueryParamsRequest,
                kujira.oracle.QueryOuterClass.QueryParamsResponse>(
                  this, METHODID_PARAMS)))
          .build();
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryStub extends io.grpc.stub.AbstractAsyncStub<QueryStub> {
    private QueryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryStub(channel, callOptions);
    }

    /**
     * <pre>
     * ExchangeRate returns exchange rate of a denom
     * </pre>
     */
    public void exchangeRate(kujira.oracle.QueryOuterClass.QueryExchangeRateRequest request,
        io.grpc.stub.StreamObserver<kujira.oracle.QueryOuterClass.QueryExchangeRateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExchangeRateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ExchangeRates returns exchange rates of all denoms
     * </pre>
     */
    public void exchangeRates(kujira.oracle.QueryOuterClass.QueryExchangeRatesRequest request,
        io.grpc.stub.StreamObserver<kujira.oracle.QueryOuterClass.QueryExchangeRatesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExchangeRatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Actives returns all active denoms
     * </pre>
     */
    public void actives(kujira.oracle.QueryOuterClass.QueryActivesRequest request,
        io.grpc.stub.StreamObserver<kujira.oracle.QueryOuterClass.QueryActivesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getActivesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FeederDelegation returns feeder delegation of a validator
     * </pre>
     */
    public void feederDelegation(kujira.oracle.QueryOuterClass.QueryFeederDelegationRequest request,
        io.grpc.stub.StreamObserver<kujira.oracle.QueryOuterClass.QueryFeederDelegationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFeederDelegationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MissCounter returns oracle miss counter of a validator
     * </pre>
     */
    public void missCounter(kujira.oracle.QueryOuterClass.QueryMissCounterRequest request,
        io.grpc.stub.StreamObserver<kujira.oracle.QueryOuterClass.QueryMissCounterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMissCounterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AggregatePrevote returns an aggregate prevote of a validator
     * </pre>
     */
    public void aggregatePrevote(kujira.oracle.QueryOuterClass.QueryAggregatePrevoteRequest request,
        io.grpc.stub.StreamObserver<kujira.oracle.QueryOuterClass.QueryAggregatePrevoteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAggregatePrevoteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AggregatePrevotes returns aggregate prevotes of all validators
     * </pre>
     */
    public void aggregatePrevotes(kujira.oracle.QueryOuterClass.QueryAggregatePrevotesRequest request,
        io.grpc.stub.StreamObserver<kujira.oracle.QueryOuterClass.QueryAggregatePrevotesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAggregatePrevotesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AggregateVote returns an aggregate vote of a validator
     * </pre>
     */
    public void aggregateVote(kujira.oracle.QueryOuterClass.QueryAggregateVoteRequest request,
        io.grpc.stub.StreamObserver<kujira.oracle.QueryOuterClass.QueryAggregateVoteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAggregateVoteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AggregateVotes returns aggregate votes of all validators
     * </pre>
     */
    public void aggregateVotes(kujira.oracle.QueryOuterClass.QueryAggregateVotesRequest request,
        io.grpc.stub.StreamObserver<kujira.oracle.QueryOuterClass.QueryAggregateVotesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAggregateVotesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params queries all parameters.
     * </pre>
     */
    public void params(kujira.oracle.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<kujira.oracle.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryBlockingStub extends io.grpc.stub.AbstractBlockingStub<QueryBlockingStub> {
    private QueryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * ExchangeRate returns exchange rate of a denom
     * </pre>
     */
    public kujira.oracle.QueryOuterClass.QueryExchangeRateResponse exchangeRate(kujira.oracle.QueryOuterClass.QueryExchangeRateRequest request) {
      return blockingUnaryCall(
          getChannel(), getExchangeRateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ExchangeRates returns exchange rates of all denoms
     * </pre>
     */
    public kujira.oracle.QueryOuterClass.QueryExchangeRatesResponse exchangeRates(kujira.oracle.QueryOuterClass.QueryExchangeRatesRequest request) {
      return blockingUnaryCall(
          getChannel(), getExchangeRatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Actives returns all active denoms
     * </pre>
     */
    public kujira.oracle.QueryOuterClass.QueryActivesResponse actives(kujira.oracle.QueryOuterClass.QueryActivesRequest request) {
      return blockingUnaryCall(
          getChannel(), getActivesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FeederDelegation returns feeder delegation of a validator
     * </pre>
     */
    public kujira.oracle.QueryOuterClass.QueryFeederDelegationResponse feederDelegation(kujira.oracle.QueryOuterClass.QueryFeederDelegationRequest request) {
      return blockingUnaryCall(
          getChannel(), getFeederDelegationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MissCounter returns oracle miss counter of a validator
     * </pre>
     */
    public kujira.oracle.QueryOuterClass.QueryMissCounterResponse missCounter(kujira.oracle.QueryOuterClass.QueryMissCounterRequest request) {
      return blockingUnaryCall(
          getChannel(), getMissCounterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AggregatePrevote returns an aggregate prevote of a validator
     * </pre>
     */
    public kujira.oracle.QueryOuterClass.QueryAggregatePrevoteResponse aggregatePrevote(kujira.oracle.QueryOuterClass.QueryAggregatePrevoteRequest request) {
      return blockingUnaryCall(
          getChannel(), getAggregatePrevoteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AggregatePrevotes returns aggregate prevotes of all validators
     * </pre>
     */
    public kujira.oracle.QueryOuterClass.QueryAggregatePrevotesResponse aggregatePrevotes(kujira.oracle.QueryOuterClass.QueryAggregatePrevotesRequest request) {
      return blockingUnaryCall(
          getChannel(), getAggregatePrevotesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AggregateVote returns an aggregate vote of a validator
     * </pre>
     */
    public kujira.oracle.QueryOuterClass.QueryAggregateVoteResponse aggregateVote(kujira.oracle.QueryOuterClass.QueryAggregateVoteRequest request) {
      return blockingUnaryCall(
          getChannel(), getAggregateVoteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AggregateVotes returns aggregate votes of all validators
     * </pre>
     */
    public kujira.oracle.QueryOuterClass.QueryAggregateVotesResponse aggregateVotes(kujira.oracle.QueryOuterClass.QueryAggregateVotesRequest request) {
      return blockingUnaryCall(
          getChannel(), getAggregateVotesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params queries all parameters.
     * </pre>
     */
    public kujira.oracle.QueryOuterClass.QueryParamsResponse params(kujira.oracle.QueryOuterClass.QueryParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryFutureStub extends io.grpc.stub.AbstractFutureStub<QueryFutureStub> {
    private QueryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * ExchangeRate returns exchange rate of a denom
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kujira.oracle.QueryOuterClass.QueryExchangeRateResponse> exchangeRate(
        kujira.oracle.QueryOuterClass.QueryExchangeRateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExchangeRateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ExchangeRates returns exchange rates of all denoms
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kujira.oracle.QueryOuterClass.QueryExchangeRatesResponse> exchangeRates(
        kujira.oracle.QueryOuterClass.QueryExchangeRatesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExchangeRatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Actives returns all active denoms
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kujira.oracle.QueryOuterClass.QueryActivesResponse> actives(
        kujira.oracle.QueryOuterClass.QueryActivesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getActivesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FeederDelegation returns feeder delegation of a validator
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kujira.oracle.QueryOuterClass.QueryFeederDelegationResponse> feederDelegation(
        kujira.oracle.QueryOuterClass.QueryFeederDelegationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFeederDelegationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MissCounter returns oracle miss counter of a validator
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kujira.oracle.QueryOuterClass.QueryMissCounterResponse> missCounter(
        kujira.oracle.QueryOuterClass.QueryMissCounterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMissCounterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AggregatePrevote returns an aggregate prevote of a validator
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kujira.oracle.QueryOuterClass.QueryAggregatePrevoteResponse> aggregatePrevote(
        kujira.oracle.QueryOuterClass.QueryAggregatePrevoteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAggregatePrevoteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AggregatePrevotes returns aggregate prevotes of all validators
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kujira.oracle.QueryOuterClass.QueryAggregatePrevotesResponse> aggregatePrevotes(
        kujira.oracle.QueryOuterClass.QueryAggregatePrevotesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAggregatePrevotesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AggregateVote returns an aggregate vote of a validator
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kujira.oracle.QueryOuterClass.QueryAggregateVoteResponse> aggregateVote(
        kujira.oracle.QueryOuterClass.QueryAggregateVoteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAggregateVoteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AggregateVotes returns aggregate votes of all validators
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kujira.oracle.QueryOuterClass.QueryAggregateVotesResponse> aggregateVotes(
        kujira.oracle.QueryOuterClass.QueryAggregateVotesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAggregateVotesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params queries all parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kujira.oracle.QueryOuterClass.QueryParamsResponse> params(
        kujira.oracle.QueryOuterClass.QueryParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EXCHANGE_RATE = 0;
  private static final int METHODID_EXCHANGE_RATES = 1;
  private static final int METHODID_ACTIVES = 2;
  private static final int METHODID_FEEDER_DELEGATION = 3;
  private static final int METHODID_MISS_COUNTER = 4;
  private static final int METHODID_AGGREGATE_PREVOTE = 5;
  private static final int METHODID_AGGREGATE_PREVOTES = 6;
  private static final int METHODID_AGGREGATE_VOTE = 7;
  private static final int METHODID_AGGREGATE_VOTES = 8;
  private static final int METHODID_PARAMS = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QueryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QueryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EXCHANGE_RATE:
          serviceImpl.exchangeRate((kujira.oracle.QueryOuterClass.QueryExchangeRateRequest) request,
              (io.grpc.stub.StreamObserver<kujira.oracle.QueryOuterClass.QueryExchangeRateResponse>) responseObserver);
          break;
        case METHODID_EXCHANGE_RATES:
          serviceImpl.exchangeRates((kujira.oracle.QueryOuterClass.QueryExchangeRatesRequest) request,
              (io.grpc.stub.StreamObserver<kujira.oracle.QueryOuterClass.QueryExchangeRatesResponse>) responseObserver);
          break;
        case METHODID_ACTIVES:
          serviceImpl.actives((kujira.oracle.QueryOuterClass.QueryActivesRequest) request,
              (io.grpc.stub.StreamObserver<kujira.oracle.QueryOuterClass.QueryActivesResponse>) responseObserver);
          break;
        case METHODID_FEEDER_DELEGATION:
          serviceImpl.feederDelegation((kujira.oracle.QueryOuterClass.QueryFeederDelegationRequest) request,
              (io.grpc.stub.StreamObserver<kujira.oracle.QueryOuterClass.QueryFeederDelegationResponse>) responseObserver);
          break;
        case METHODID_MISS_COUNTER:
          serviceImpl.missCounter((kujira.oracle.QueryOuterClass.QueryMissCounterRequest) request,
              (io.grpc.stub.StreamObserver<kujira.oracle.QueryOuterClass.QueryMissCounterResponse>) responseObserver);
          break;
        case METHODID_AGGREGATE_PREVOTE:
          serviceImpl.aggregatePrevote((kujira.oracle.QueryOuterClass.QueryAggregatePrevoteRequest) request,
              (io.grpc.stub.StreamObserver<kujira.oracle.QueryOuterClass.QueryAggregatePrevoteResponse>) responseObserver);
          break;
        case METHODID_AGGREGATE_PREVOTES:
          serviceImpl.aggregatePrevotes((kujira.oracle.QueryOuterClass.QueryAggregatePrevotesRequest) request,
              (io.grpc.stub.StreamObserver<kujira.oracle.QueryOuterClass.QueryAggregatePrevotesResponse>) responseObserver);
          break;
        case METHODID_AGGREGATE_VOTE:
          serviceImpl.aggregateVote((kujira.oracle.QueryOuterClass.QueryAggregateVoteRequest) request,
              (io.grpc.stub.StreamObserver<kujira.oracle.QueryOuterClass.QueryAggregateVoteResponse>) responseObserver);
          break;
        case METHODID_AGGREGATE_VOTES:
          serviceImpl.aggregateVotes((kujira.oracle.QueryOuterClass.QueryAggregateVotesRequest) request,
              (io.grpc.stub.StreamObserver<kujira.oracle.QueryOuterClass.QueryAggregateVotesResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((kujira.oracle.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<kujira.oracle.QueryOuterClass.QueryParamsResponse>) responseObserver);
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

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return kujira.oracle.QueryOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Query");
    }
  }

  private static final class QueryFileDescriptorSupplier
      extends QueryBaseDescriptorSupplier {
    QueryFileDescriptorSupplier() {}
  }

  private static final class QueryMethodDescriptorSupplier
      extends QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (QueryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryFileDescriptorSupplier())
              .addMethod(getExchangeRateMethod())
              .addMethod(getExchangeRatesMethod())
              .addMethod(getActivesMethod())
              .addMethod(getFeederDelegationMethod())
              .addMethod(getMissCounterMethod())
              .addMethod(getAggregatePrevoteMethod())
              .addMethod(getAggregatePrevotesMethod())
              .addMethod(getAggregateVoteMethod())
              .addMethod(getAggregateVotesMethod())
              .addMethod(getParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
