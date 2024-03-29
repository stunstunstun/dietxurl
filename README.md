# Getting Started

## Install

### Build Image

```bash
$ docker build -t dietxurl-app .
```

### Load PostgreSQL as locally

```bash
$ docker-compose -f docker-compose-pg.yml up -d
...
Creating network "dietxurl_default" with the default driver
Creating volume "dietxurl_dietxurl_local_db" with default driver
Creating dietxurl_db_1 ... done
```

## Run

```bash
$ docker run --rm -p 8080:8080 dietxurl-app
```

### Integration Testing

```bash
$ curl -d '{"firstName":"sawol", "lastName":"jung"}' \
-H "Content-Type: application/json" \
-X POST http://localhost:8080/api/v1/customers
```

## Deploy

```bash
$ docker build --build-arg ENVIRONMENT=prod -t dietxurl-app-prod:0.0.1 .
$ docker run --rm -p 8080:8080 dietxurl-app-prod:0.0.1
```

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.1/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.1/gradle-plugin/reference/html/#build-image)
* [Coroutines section of the Spring Framework Documentation](https://docs.spring.io/spring/docs/5.3.13/spring-framework-reference/languages.html#coroutines)
* [Spring Data R2DBC](https://docs.spring.io/spring-boot/docs/2.6.1/reference/html/spring-boot-features.html#boot-features-r2dbc)

### Guides
The following guides illustrate how to use some features concretely:

* [Acessing data with R2DBC](https://spring.io/guides/gs/accessing-data-r2dbc/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)
* [R2DBC Homepage](https://r2dbc.io)

