package lk.ijse.SpringProject.Service;

import lk.ijse.SpringProject.Dto.EmployeeDto;
import lk.ijse.SpringProject.Dto.EmployeeSaveDto;
import lk.ijse.SpringProject.Entity.Employee;
import lk.ijse.SpringProject.Repo.EmployeeRepo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public String add(@RequestBody EmployeeSaveDto dto) {

        Employee employee = new Employee(
                dto.getEmployeeName(),
                dto.getEmployeeAddress(),
                dto.getMobile()
        );

        Employee save = employeeRepo.save(employee);
        return save.getEmployeeName();
    }

    @Override
    public List<EmployeeDto> getAll() {

        List<Employee> getAllEmp =  employeeRepo.findAll();
        List<EmployeeDto> EmployeeList=new ArrayList<>();

        for (Employee e1 : getAllEmp) {
            EmployeeDto employeeDto=new EmployeeDto(
                e1.getEmployeeId(),
                e1.getEmployeeName(),
                e1.getEmployeeAddress(),
                e1.getMobile()
            );
            EmployeeList.add(employeeDto);
        }

        return EmployeeList;
    }
}
