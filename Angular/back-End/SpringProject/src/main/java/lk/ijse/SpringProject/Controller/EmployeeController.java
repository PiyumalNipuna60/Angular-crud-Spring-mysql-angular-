package lk.ijse.SpringProject.Controller;


import lk.ijse.SpringProject.Dto.EmployeeSaveDto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")
public class EmployeeController {

    public String saveEmployee(@RequestBody EmployeeSaveDto dto){
        String id=employeeService.save(dto);
        return id;
    }
}
