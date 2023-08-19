package edu.example.employeems.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class EmployeeDTO {
    private int empID;
    private String empName;
    private String empAddress;
    private String empMNumber;
}
