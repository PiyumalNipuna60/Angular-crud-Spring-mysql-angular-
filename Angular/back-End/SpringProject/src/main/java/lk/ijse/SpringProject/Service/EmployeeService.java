package lk.ijse.SpringProject.Service;

import lk.ijse.SpringProject.Dto.EmployeeSaveDto;
import org.springframework.web.bind.annotation.RequestBody;

public interface EmployeeService {


     String save(EmployeeSaveDto dto);
}
