
--- 原来
1 idea 中开发
2 打jar包
3 部署jar包到linux服务器上 copy jar application.properties
4 如果用docker 编写dockerfile
5 build image
6 run container

https://github.com/spotify/docker-maven-plugin
mvn clean package docker:build