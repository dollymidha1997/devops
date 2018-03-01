FROM ubuntu:16.04
RUN apt-get update && \
    apt-get -y install python
COPY "hello.py" .
ENTRYPOINT [ "pyhton","hello.py" ]


