# Project:- SpringBoot_DockerizingApp (POC)
# written by 
Chandra

# Reference
https://www.docker.com/resources/what-container


What is Docker ?
Docker is a tool designed to make it easier to build, deploy and run applications by using containers.

Advatages:-
Containers allow a developer to package up an application w ith all of the parts it needs such as libra ries and other dependencies and ship it all ou	as one package.

# Docker install
https://docs.docker.com/docker-for-windows/install/

# Docker command for build docker image.

After instal docker in your local machine .

1. open docker server 

  cd /projectdirectory

2.create docer image

docker build -t nameof.jar .

3.To check doker image.

docker image ls

4.run docer image
docker run -p 9090:1001 nameofdockerimage



