example spring boot and oauth2:

Require : keycloak tag lastet, spring oath2 dependency, postman, intellij

Follow by article:
https://medium.com/@bcarunmail/securing-rest-api-using-keycloak-and-spring-oauth2-6ddf3a1efcc2

1, Install keycloak with docker

Keycloak on Docker

https://www.keycloak.org/getting-started/getting-started-docker

B1. Pull image mới nhất của keycloak về.
B2. Run image để tạo container.

2, Build project springboot with oauth2
Example: department-service and employee-servic

version will working by spring boot parent: 
<!-- Spring OAuth 2.0 Dependency Added Manually -->
    `<dependency>
           <groupId>org.springframework.security.oauth.boot</groupId>
           <artifactId>spring-security-oauth2-autoconfigure</artifactId>
           <version>2.1.3.RELEASE</version>
         </dependency>
    `
    
3, Test: 2 way to get token from keycloak by postman
   
Solution 1 : get token by request of oauth2, follow 

![img](https://github.com/Nguyen-Cong-Nghiem/employee-service-use-keycloak/blob/master/image/Screen%20Shot%202020-06-24%20at%203.22.22%20PM.png)
   
![img](https://github.com/Nguyen-Cong-Nghiem/employee-service-use-keycloak/blob/master/image/Screen%20Shot%202020-06-24%20at%203.25.46%20PM.png)
    
    
Solution 2: get token by content-type(x-www-form-urlencoded)
    
![img](https://github.com/Nguyen-Cong-Nghiem/employee-service-use-keycloak/blob/master/image/Screen%20Shot%202020-06-24%20at%203.28.49%20PM.png)