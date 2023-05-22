package seiprotocol.seichain.oracle;

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
    comments = "Source: sei/oracle/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "seiprotocol.seichain.oracle.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateResponse> getExchangeRateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExchangeRate",
      requestType = seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateRequest.class,
      responseType = seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateResponse> getExchangeRateMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateRequest, seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateResponse> getExchangeRateMethod;
    if ((getExchangeRateMethod = QueryGrpc.getExchangeRateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getExchangeRateMethod = QueryGrpc.getExchangeRateMethod) == null) {
          QueryGrpc.getExchangeRateMethod = getExchangeRateMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateRequest, seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExchangeRate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ExchangeRate"))
              .build();
        }
      }
    }
    return getExchangeRateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesResponse> getExchangeRatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExchangeRates",
      requestType = seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesRequest.class,
      responseType = seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesResponse> getExchangeRatesMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesRequest, seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesResponse> getExchangeRatesMethod;
    if ((getExchangeRatesMethod = QueryGrpc.getExchangeRatesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getExchangeRatesMethod = QueryGrpc.getExchangeRatesMethod) == null) {
          QueryGrpc.getExchangeRatesMethod = getExchangeRatesMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesRequest, seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExchangeRates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ExchangeRates"))
              .build();
        }
      }
    }
    return getExchangeRatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesResponse> getActivesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Actives",
      requestType = seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesRequest.class,
      responseType = seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesResponse> getActivesMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesRequest, seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesResponse> getActivesMethod;
    if ((getActivesMethod = QueryGrpc.getActivesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getActivesMethod = QueryGrpc.getActivesMethod) == null) {
          QueryGrpc.getActivesMethod = getActivesMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesRequest, seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Actives"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Actives"))
              .build();
        }
      }
    }
    return getActivesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsResponse> getVoteTargetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VoteTargets",
      requestType = seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsRequest.class,
      responseType = seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsResponse> getVoteTargetsMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsRequest, seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsResponse> getVoteTargetsMethod;
    if ((getVoteTargetsMethod = QueryGrpc.getVoteTargetsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getVoteTargetsMethod = QueryGrpc.getVoteTargetsMethod) == null) {
          QueryGrpc.getVoteTargetsMethod = getVoteTargetsMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsRequest, seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VoteTargets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("VoteTargets"))
              .build();
        }
      }
    }
    return getVoteTargetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryResponse> getPriceSnapshotHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PriceSnapshotHistory",
      requestType = seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryRequest.class,
      responseType = seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryResponse> getPriceSnapshotHistoryMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryRequest, seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryResponse> getPriceSnapshotHistoryMethod;
    if ((getPriceSnapshotHistoryMethod = QueryGrpc.getPriceSnapshotHistoryMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPriceSnapshotHistoryMethod = QueryGrpc.getPriceSnapshotHistoryMethod) == null) {
          QueryGrpc.getPriceSnapshotHistoryMethod = getPriceSnapshotHistoryMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryRequest, seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PriceSnapshotHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PriceSnapshotHistory"))
              .build();
        }
      }
    }
    return getPriceSnapshotHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsResponse> getTwapsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Twaps",
      requestType = seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsRequest.class,
      responseType = seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsResponse> getTwapsMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsRequest, seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsResponse> getTwapsMethod;
    if ((getTwapsMethod = QueryGrpc.getTwapsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTwapsMethod = QueryGrpc.getTwapsMethod) == null) {
          QueryGrpc.getTwapsMethod = getTwapsMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsRequest, seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Twaps"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Twaps"))
              .build();
        }
      }
    }
    return getTwapsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationResponse> getFeederDelegationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FeederDelegation",
      requestType = seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationRequest.class,
      responseType = seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationResponse> getFeederDelegationMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationRequest, seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationResponse> getFeederDelegationMethod;
    if ((getFeederDelegationMethod = QueryGrpc.getFeederDelegationMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFeederDelegationMethod = QueryGrpc.getFeederDelegationMethod) == null) {
          QueryGrpc.getFeederDelegationMethod = getFeederDelegationMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationRequest, seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FeederDelegation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("FeederDelegation"))
              .build();
        }
      }
    }
    return getFeederDelegationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterResponse> getVotePenaltyCounterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VotePenaltyCounter",
      requestType = seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterRequest.class,
      responseType = seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterResponse> getVotePenaltyCounterMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterRequest, seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterResponse> getVotePenaltyCounterMethod;
    if ((getVotePenaltyCounterMethod = QueryGrpc.getVotePenaltyCounterMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getVotePenaltyCounterMethod = QueryGrpc.getVotePenaltyCounterMethod) == null) {
          QueryGrpc.getVotePenaltyCounterMethod = getVotePenaltyCounterMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterRequest, seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VotePenaltyCounter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("VotePenaltyCounter"))
              .build();
        }
      }
    }
    return getVotePenaltyCounterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowResponse> getSlashWindowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SlashWindow",
      requestType = seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowRequest.class,
      responseType = seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowResponse> getSlashWindowMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowRequest, seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowResponse> getSlashWindowMethod;
    if ((getSlashWindowMethod = QueryGrpc.getSlashWindowMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSlashWindowMethod = QueryGrpc.getSlashWindowMethod) == null) {
          QueryGrpc.getSlashWindowMethod = getSlashWindowMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowRequest, seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SlashWindow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SlashWindow"))
              .build();
        }
      }
    }
    return getSlashWindowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsRequest.class,
      responseType = seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsRequest,
      seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsRequest, seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsRequest, seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
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
    public void exchangeRate(seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getExchangeRateMethod(), responseObserver);
    }

    /**
     * <pre>
     * ExchangeRates returns exchange rates of all denoms
     * </pre>
     */
    public void exchangeRates(seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getExchangeRatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Actives returns all active denoms
     * </pre>
     */
    public void actives(seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getActivesMethod(), responseObserver);
    }

    /**
     * <pre>
     * VoteTargets returns all vote target denoms
     * </pre>
     */
    public void voteTargets(seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getVoteTargetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * PriceSnapshotHistory returns the history of price snapshots for all assets
     * </pre>
     */
    public void priceSnapshotHistory(seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPriceSnapshotHistoryMethod(), responseObserver);
    }

    /**
     */
    public void twaps(seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTwapsMethod(), responseObserver);
    }

    /**
     * <pre>
     * FeederDelegation returns feeder delegation of a validator
     * </pre>
     */
    public void feederDelegation(seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFeederDelegationMethod(), responseObserver);
    }

    /**
     * <pre>
     * MissCounter returns oracle miss counter of a validator
     * </pre>
     */
    public void votePenaltyCounter(seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getVotePenaltyCounterMethod(), responseObserver);
    }

    /**
     * <pre>
     * SlashWindow returns slash window information
     * </pre>
     */
    public void slashWindow(seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSlashWindowMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params queries all parameters.
     * </pre>
     */
    public void params(seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getExchangeRateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateRequest,
                seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateResponse>(
                  this, METHODID_EXCHANGE_RATE)))
          .addMethod(
            getExchangeRatesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesRequest,
                seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesResponse>(
                  this, METHODID_EXCHANGE_RATES)))
          .addMethod(
            getActivesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesRequest,
                seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesResponse>(
                  this, METHODID_ACTIVES)))
          .addMethod(
            getVoteTargetsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsRequest,
                seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsResponse>(
                  this, METHODID_VOTE_TARGETS)))
          .addMethod(
            getPriceSnapshotHistoryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryRequest,
                seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryResponse>(
                  this, METHODID_PRICE_SNAPSHOT_HISTORY)))
          .addMethod(
            getTwapsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsRequest,
                seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsResponse>(
                  this, METHODID_TWAPS)))
          .addMethod(
            getFeederDelegationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationRequest,
                seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationResponse>(
                  this, METHODID_FEEDER_DELEGATION)))
          .addMethod(
            getVotePenaltyCounterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterRequest,
                seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterResponse>(
                  this, METHODID_VOTE_PENALTY_COUNTER)))
          .addMethod(
            getSlashWindowMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowRequest,
                seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowResponse>(
                  this, METHODID_SLASH_WINDOW)))
          .addMethod(
            getParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsRequest,
                seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsResponse>(
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
    public void exchangeRate(seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExchangeRateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ExchangeRates returns exchange rates of all denoms
     * </pre>
     */
    public void exchangeRates(seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExchangeRatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Actives returns all active denoms
     * </pre>
     */
    public void actives(seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getActivesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * VoteTargets returns all vote target denoms
     * </pre>
     */
    public void voteTargets(seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVoteTargetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PriceSnapshotHistory returns the history of price snapshots for all assets
     * </pre>
     */
    public void priceSnapshotHistory(seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPriceSnapshotHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void twaps(seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTwapsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FeederDelegation returns feeder delegation of a validator
     * </pre>
     */
    public void feederDelegation(seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFeederDelegationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MissCounter returns oracle miss counter of a validator
     * </pre>
     */
    public void votePenaltyCounter(seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVotePenaltyCounterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SlashWindow returns slash window information
     * </pre>
     */
    public void slashWindow(seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSlashWindowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params queries all parameters.
     * </pre>
     */
    public void params(seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsResponse> responseObserver) {
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
    public seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateResponse exchangeRate(seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateRequest request) {
      return blockingUnaryCall(
          getChannel(), getExchangeRateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ExchangeRates returns exchange rates of all denoms
     * </pre>
     */
    public seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesResponse exchangeRates(seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesRequest request) {
      return blockingUnaryCall(
          getChannel(), getExchangeRatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Actives returns all active denoms
     * </pre>
     */
    public seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesResponse actives(seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesRequest request) {
      return blockingUnaryCall(
          getChannel(), getActivesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * VoteTargets returns all vote target denoms
     * </pre>
     */
    public seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsResponse voteTargets(seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsRequest request) {
      return blockingUnaryCall(
          getChannel(), getVoteTargetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PriceSnapshotHistory returns the history of price snapshots for all assets
     * </pre>
     */
    public seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryResponse priceSnapshotHistory(seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryRequest request) {
      return blockingUnaryCall(
          getChannel(), getPriceSnapshotHistoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsResponse twaps(seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsRequest request) {
      return blockingUnaryCall(
          getChannel(), getTwapsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FeederDelegation returns feeder delegation of a validator
     * </pre>
     */
    public seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationResponse feederDelegation(seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationRequest request) {
      return blockingUnaryCall(
          getChannel(), getFeederDelegationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MissCounter returns oracle miss counter of a validator
     * </pre>
     */
    public seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterResponse votePenaltyCounter(seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterRequest request) {
      return blockingUnaryCall(
          getChannel(), getVotePenaltyCounterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SlashWindow returns slash window information
     * </pre>
     */
    public seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowResponse slashWindow(seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowRequest request) {
      return blockingUnaryCall(
          getChannel(), getSlashWindowMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params queries all parameters.
     * </pre>
     */
    public seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsResponse params(seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateResponse> exchangeRate(
        seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExchangeRateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ExchangeRates returns exchange rates of all denoms
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesResponse> exchangeRates(
        seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExchangeRatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Actives returns all active denoms
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesResponse> actives(
        seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getActivesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * VoteTargets returns all vote target denoms
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsResponse> voteTargets(
        seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getVoteTargetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PriceSnapshotHistory returns the history of price snapshots for all assets
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryResponse> priceSnapshotHistory(
        seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPriceSnapshotHistoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsResponse> twaps(
        seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTwapsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FeederDelegation returns feeder delegation of a validator
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationResponse> feederDelegation(
        seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFeederDelegationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MissCounter returns oracle miss counter of a validator
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterResponse> votePenaltyCounter(
        seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getVotePenaltyCounterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SlashWindow returns slash window information
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowResponse> slashWindow(
        seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSlashWindowMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params queries all parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsResponse> params(
        seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EXCHANGE_RATE = 0;
  private static final int METHODID_EXCHANGE_RATES = 1;
  private static final int METHODID_ACTIVES = 2;
  private static final int METHODID_VOTE_TARGETS = 3;
  private static final int METHODID_PRICE_SNAPSHOT_HISTORY = 4;
  private static final int METHODID_TWAPS = 5;
  private static final int METHODID_FEEDER_DELEGATION = 6;
  private static final int METHODID_VOTE_PENALTY_COUNTER = 7;
  private static final int METHODID_SLASH_WINDOW = 8;
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
          serviceImpl.exchangeRate((seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRateResponse>) responseObserver);
          break;
        case METHODID_EXCHANGE_RATES:
          serviceImpl.exchangeRates((seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryExchangeRatesResponse>) responseObserver);
          break;
        case METHODID_ACTIVES:
          serviceImpl.actives((seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryActivesResponse>) responseObserver);
          break;
        case METHODID_VOTE_TARGETS:
          serviceImpl.voteTargets((seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryVoteTargetsResponse>) responseObserver);
          break;
        case METHODID_PRICE_SNAPSHOT_HISTORY:
          serviceImpl.priceSnapshotHistory((seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryPriceSnapshotHistoryResponse>) responseObserver);
          break;
        case METHODID_TWAPS:
          serviceImpl.twaps((seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryTwapsResponse>) responseObserver);
          break;
        case METHODID_FEEDER_DELEGATION:
          serviceImpl.feederDelegation((seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryFeederDelegationResponse>) responseObserver);
          break;
        case METHODID_VOTE_PENALTY_COUNTER:
          serviceImpl.votePenaltyCounter((seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryVotePenaltyCounterResponse>) responseObserver);
          break;
        case METHODID_SLASH_WINDOW:
          serviceImpl.slashWindow((seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QuerySlashWindowResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.QueryOuterClass.QueryParamsResponse>) responseObserver);
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
      return seiprotocol.seichain.oracle.QueryOuterClass.getDescriptor();
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
              .addMethod(getVoteTargetsMethod())
              .addMethod(getPriceSnapshotHistoryMethod())
              .addMethod(getTwapsMethod())
              .addMethod(getFeederDelegationMethod())
              .addMethod(getVotePenaltyCounterMethod())
              .addMethod(getSlashWindowMethod())
              .addMethod(getParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
