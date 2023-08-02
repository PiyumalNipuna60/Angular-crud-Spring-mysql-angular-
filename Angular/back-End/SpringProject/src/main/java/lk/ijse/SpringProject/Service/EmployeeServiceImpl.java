package lk.ijse.SpringProject.Service;

import lk.ijse.SpringProject.Dto.EmployeeSaveDto;
import lk.ijse.SpringProject.Entity.Employee;
import lk.ijse.SpringProject.Repo.EmployeeRepo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepo employeeRepo;

    public String save(@RequestBody EmployeeSaveDto dto) {

        Employee employee = new Employee(
                dto.getEmployeeName(),
                dto.getEmployeeAddress(),
                dto.getMobile()
        );

        Employee save = employeeRepo.save(employee);
        return save.getEmployeeName();
    }
}
