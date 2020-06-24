package nghiem.nc.springbootoauth2keycloak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class,
    UserDetailsServiceAutoConfiguration.class})
public class DepartmentSpringBootKeycloakApplication {

  public static void main(String[] args) {
    SpringApplication.run(DepartmentSpringBootKeycloakApplication.class, args);
  }

}
