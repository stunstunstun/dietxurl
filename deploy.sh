#!/bin/bash

./gradlew clean bootJar
docker build --build-arg ENVIRONMENT=prod -t dietxurl-app-prod:0.0.1 .
docker run --rm -p 8080:8080 dietxurl-app-prod:0.0.1