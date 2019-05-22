/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.study.practice.pojo;

/**
 *
 * @author syntel
 */
public class Employee {
    private String employeeId;
    private String employeeName;
    private Address mailingAddress;
    private Skill empPrimarySkill;
    
     public Employee() {
        this.employeeId = "N/A";
        this.employeeName = "N/A";
    }

    public Employee(String employeeId, String employeeName, Address mailingAddress, Skill empPrimarySkill) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.mailingAddress = mailingAddress;
        this.empPrimarySkill = empPrimarySkill;
    }
   

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Address getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(Address mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public Skill getEmpPrimarySkill() {
        return empPrimarySkill;
    }

    public void setEmpPrimarySkill(Skill empPrimarySkill) {
        this.empPrimarySkill = empPrimarySkill;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeId=" + employeeId + ", employeeName=" + employeeName + ", mailingAddress=" + mailingAddress + ", empPrimarySkill=" + empPrimarySkill + '}';
    }

   
    
    
    
}
