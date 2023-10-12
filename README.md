# dapr-springbootframework



## How to run
```
dapr run --app-id my_app --app-port 6001 --dapr-http-port 3601 --dapr-grpc-port 60001 -- java -jar statetest-0.0.1-SNAPSHOT.jar
```
## Server will start
Output:
![image](https://github.com/tongsean9807/springboot/assets/105337968/d7adb2e7-917a-420f-9bb0-a7d3c205b873)

## Curl Test for state management
DAPR has a state management and other capabilities. It will store the state in redis.

### How to store state
```
curl -X POST -H "Content-Type: application/json" -d '[{ "key": "order_sean", "value": "250"}]' http://localhost:3601/v1.0/state/statestore
```
### How to check state
```
 curl http://localhost:3601/v1.0/state/statestore/order_sean
```
![image](https://github.com/tongsean9807/springboot/assets/105337968/e5e8ea19-a6fd-4b08-9a84-87a72fed4837)


## Install
Link to installation command:
[https://docs.dapr.io/getting-started/install-dapr-cli/](https://docs.dapr.io/getting-started/install-dapr-cli/)
```
  wget -q https://raw.githubusercontent.com/dapr/cli/master/install/install.sh -O - | /bin/bash
```

### Dependencies
  1. docker - without docker dapr will not work. It needs to start other container such as Redis. 
  2. Java for SpringBoot Framework - the jar files provided are compile using java version "18.0.1.1". You will need java 18 or higher to run

### Start dapr
```
 dapr init
```
### Make Sure DAPR is installed properly
```
dapr -h
```
![image](https://github.com/intel-sandbox/dapr-springbootframework/assets/105337968/ae93dd99-7478-438f-904e-a7f24c9a0bd0)


## SpringBoot
The jar file statetest-0.0.1-SNAPSHOT.jar is build using eclipse IDE.
### Dependencies
Add to include dapr.
```
	    <dependency>
	      <groupId>io.dapr</groupId>
	      <artifactId>dapr-sdk</artifactId>
	      <version>1.9.0</version>
	    </dependency>
	    <!-- Dapr's SDK for Actors (optional). -->
	    <dependency>
	      <groupId>io.dapr</groupId>
	      <artifactId>dapr-sdk-actors</artifactId>
	      <version>1.9.0</version>
	    </dependency>
	    <!-- Dapr's SDK integration with SpringBoot (optional). -->
	    <dependency>
	      <groupId>io.dapr</groupId>
	      <artifactId>dapr-sdk-springboot</artifactId>
	      <version>1.9.0</version>
	    </dependency>
```
### Add Proxy
Add proxy to this file:
C:\Users\<user>\.m2\settings.xml
```
  <proxies>
   <proxy>
        <host>proxy---.---.com</host>
        <port>912</port>
    </proxy>
  </proxies>
```




