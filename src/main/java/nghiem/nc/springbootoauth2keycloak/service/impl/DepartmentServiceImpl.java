package nghiem.nc.springbootoauth2keycloak.service.impl;

import nghiem.nc.springbootoauth2keycloak.service.DepartmentService;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

  @Override
  public String getDepartmentOfUser(Long id) {
    return "User with id = " + id + " have department is a  Software Product Engineering";
  }
}
