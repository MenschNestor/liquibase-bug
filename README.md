Build and run successfully with `liquibase-core` 3.8.0:
 
    ./mvnw clean package exec:exec

Build and crash with an exception with `liquibase-core` 3.8.1:
 
    ./mvnw clean package exec:exec -Dliquibase.version=3.8.1
