package lk.ijse.SpringProject.Service;

import lk.ijse.SpringProject.Dto.EmployeeDto;
import lk.ijse.SpringProject.Dto.EmployeeSaveDto;

import java.util.List;

public interface EmployeeService {

    String add(EmployeeSaveDto dto);

    List<EmployeeDto> getAll();

    String update(EmployeeDto dt);

    String delete(int employeeId);
}
