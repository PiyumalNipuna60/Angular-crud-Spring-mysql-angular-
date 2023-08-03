package lk.ijse.SpringProject.Controller;


import lk.ijse.SpringProject.Dto.EmployeeDto;
import lk.ijse.SpringProject.Dto.EmployeeSaveDto;
import lk.ijse.SpringProject.Service.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping(path = "/save")
    public String saveEmployee(@RequestBody EmployeeSaveDto dto){
        String id=employeeService.add(dto);
        return id;
    }

    @GetMapping(path = "/get")
    public List<EmployeeDto> getAllEmployee(){
        List<EmployeeDto> AllEmployee=employeeService.getAll();
        return AllEmployee;
    }

    @PutMapping("/update")
    public String updateEmployee(@RequestBody EmployeeDto employeeDto){
        String id=employeeService.update(employeeDto);
        return id;
    }
}
