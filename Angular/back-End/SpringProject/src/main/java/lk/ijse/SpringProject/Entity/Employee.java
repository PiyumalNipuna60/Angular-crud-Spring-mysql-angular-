package lk.ijse.SpringProject.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeId;
    private String employeeName;
    private String employeeAddress;
    private int mobile;

    public Employee(String employeeName, String employeeAddress, int mobile) {
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.mobile = mobile;
    }
}
