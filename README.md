# Jenkins CI in Docker

## Build
`docker build -t jenkins-in-docker .`

## Run
```
docker run -it --rm \
  -p 8080:8080 \
  -p 50000:50000 \
  jenkins-in-docker
```

## Build and run
`docker-compose -f docker-compose.build.yml up --build`

## Run with nginx-proxy
- Build docker image
- Run `docker-compose up`
