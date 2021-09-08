#! /bin/sh
set -x
docker stop $(docker ps -aq) || true
docker rm $(docker ps -aq --filter status=exited) || true
docker rmi $(docker image ls) || true
