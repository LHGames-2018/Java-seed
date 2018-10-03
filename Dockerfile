############################################
#          DO NOT TOUCH THIS FILE          #
############################################

FROM openjdk:8-alpine

RUN mkdir -p "/lhgames"
WORKDIR "/lhgames"
COPY . .

RUN apk add gradle

RUN gradle build

EXPOSE 3000

CMD ["gradle", "run"]
