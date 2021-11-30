# protobuf & gRPC for Cosmos based chains

## convert .proto files for other languages(java, swift, etc)
- cosmos default
- iris native & mode
- akash
- ...



## How to generate target files for each languages
### install protoc 
http://google.github.io/proto-lens/installing-protoc.html

### simple convert for Java
```shell
protoc --java_out=output_java  \
       --plugin=protoc-gen-grpc-java \
       --grpc-java_out=output_java  \
        -Iproto/ \
        $(find proto/* -iname "*.proto")
```


### simple convert for Swift
```shell
protoc --swift_out=output_swift  \
       --swift_opt=FileNaming=PathToUnderscores \
       --plugin=protoc-gen-grpc-swift \
       --grpc-swift_out=output_swift  \
       --grpc-swift_opt=FileNaming=PathToUnderscores \
        -Iproto/ \
        $(find proto/* -iname "*.proto")
```


## Notice
cosmos modified proto's default library file.
for just simple drag&drop for your project, you should modify your proto files import
```shell
import "google/protobuf/any.proto";
-->
import "google/protobuf2/any.proto";     
```
