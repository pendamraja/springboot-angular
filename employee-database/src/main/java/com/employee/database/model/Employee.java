package com.employee.database.model;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name ="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int code;

    @Column(name = "name")
    private String  name;

    @Column(name = "gender")
    private String gender;

    @Column(name = "annualSalary")
    private int annualSalary;

    @Column(name = "dateOfBirth")
    private Date dateOfBirth;

    public Employee() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Employee(int code, String name, String gender, int annualSalary, Date dateOfBirth) {
        this.code = code;
        this.name = name;
        this.gender = gender;
        this.annualSalary = annualSalary;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", annualSalary=" + annualSalary +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
