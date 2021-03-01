#### Basic Info
The contracts are written in .yaml file. Kept in `contracts` folder.  
In realtime scenario should be mentioned in separate GIT repo and both client and server implementation should pull contract from here .
#### Building the project(s)

__Producer__ 
1. Read the contract + To genarte the stubs in maven locally + run the testcases `mvn clean install`

__Consumer__ 

1.  Genrate the stubs from contract without relying on the producer `mvn clean install -DskipTests -P gen-stubs`
1.  Run the mocks + run the integration tests `mvn clean install`




#### Useful Links
1. https://cloud.spring.io/spring-cloud-contract/reference/htmlsingle/#getting-started-cdc
2. https://cloud.spring.io/spring-cloud-contract/reference/html/using.html#flows-provider-non-jvm-consumer
3. https://cloud.spring.io/spring-cloud-contract/reference/html/getting-started.html#getting-started-introducing-spring-cloud-contract
4. https://blog.testproject.io/2020/05/20/consumer-driven-contract-testing-using-spring-cloud-contract/
