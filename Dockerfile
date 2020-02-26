FROM clojure:lein-2.7.1-alpine
RUN apk add --no-cache curl \
    && curl -sL https://github.com/openfaas/faas/releases/download/0.6.15/fwatchdog > /usr/bin/fwatchdog \
    && chmod +x /usr/bin/fwatchdog \
    && apk del curl

WORKDIR /root/

COPY function/ src/
COPY main/ src/main/
COPY function/project.clj project.clj
RUN lein uberjar && mv target/function.jar .

ENV fprocess="java -jar function.jar"

HEALTHCHECK --interval=1s CMD [ -e /tmp/.lock ] || exit 1

CMD ["fwatchdog"]

