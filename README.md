# OpenFeign Example #

This Project demonstrates basic usage of OpenFeign with Spring Boot.

## How it works
The application is a client to its own REST services via a CommandLineRunner. 
The application will start and use an OpenFeign client to list, create, update and delete items.
Information about the above will be logged to the console starting with '***'.
The application will then stop.

## Things to Note

1. You need the @EnableFeignClients annotation on a configuration class.
2. You need the name and URL on the Feign client.

## Other useful info

The application uses an Embedded H2 database. It is created when the db starts and is dropped when the application stops. 
[Spring boot and embedded databases] (https://docs.spring.io/spring-boot/docs/2.1.13.BUILD-SNAPSHOT/reference/html/boot-features-sql.html#boot-features-embedded-database-support)