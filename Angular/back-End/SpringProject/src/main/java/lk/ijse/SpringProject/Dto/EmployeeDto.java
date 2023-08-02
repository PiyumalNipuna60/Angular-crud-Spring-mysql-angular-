package lk.ijse.SpringProject.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class EmployeeDto {

    private int employeeId;
    private String employeeName;
    private String employeeAddress;
    private int mobile;
}
