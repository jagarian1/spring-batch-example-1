# Spring Boot with Spring Batch Example 1
## Load CSV to DB
- `http://localhost:8081/load` - Trigger point for Spring Batch
- `http://localhost:8081/h2-console` - H2 Console for querying the in-memory tables.

## H2 Config
- `test` - Database.
- `sa` - User
- `password` - Password.
- spring.datasource.url=jdbc:h2:mem:test
- spring.datasource.driverClassName=org.h2.Driver
 
 
# 1 .
# Spring Batch in Spring Boot | CSV to Database
- resources : 
- application.properties
- users.csv
  META-INF : additional-spring-configuration-metadata.json
- 
# 2 .

# 3 .

# 4 . RUN SpringBatchExample1Application
h2-console : 
http://localhost:8081/load
http://localhost:8081/h2-console

h2-console SQL : SELECT * FROM USER ;

SELECT * from BATCH_JOB_EXECUTION ;
SELECT * FROM BATCH_JOB_EXECUTION_CONTEXT ;

SELECT * FROM BATCH_STEP_EXECUTION ;
SELECT *  FROM BATCH_STEP_EXECUTION_CONTEXT ;