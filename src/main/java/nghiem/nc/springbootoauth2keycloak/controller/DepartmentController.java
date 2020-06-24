package nghiem.nc.springbootoauth2keycloak.controller;

import nghiem.nc.springbootoauth2keycloak.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/departments")
public class DepartmentController {

  @Autowired
  private DepartmentService departmentService;

  @GetMapping(path = "{id}")
  @PreAuthorize("hasAnyAuthority('ROLE_READ_DEPARTMENT')")
  public String getDepartment(@PathVariable Long id) {
    return departmentService.getDepartmentOfUser(id);
  }
}
