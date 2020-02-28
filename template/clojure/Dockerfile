FROM clojure:openjdk-14-lein-2.9.1-alpine

WORKDIR /root/

COPY function/src src
COPY function/project.clj project.clj

RUN lein uberjar && mv target/function.jar .
ADD https://github.com/openfaas-incubator/of-watchdog/releases/download/0.7.6/of-watchdog /usr/bin/fwatchdog
RUN chmod +x /usr/bin/fwatchdog


ENV upstream_url="http://127.0.0.1:3000"
ENV mode="http"
ENV fprocess="java -jar function.jar"

EXPOSE 8080

HEALTHCHECK --interval=2s CMD [ -e /tmp/.lock ] || exit 1
ENV suppress_lock=true

CMD ["fwatchdog"]
