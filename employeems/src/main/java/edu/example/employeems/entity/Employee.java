package edu.example.employeems.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private int empID;
    private String empName;
    private String empAddress;
    private String empMNumber;

}
