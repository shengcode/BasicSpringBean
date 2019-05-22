
package com.study.practice.pojo;

import java.util.Map;
import java.util.Set;

public class Employee_version2 {
    private String employeeId;
    private String employeeName;
    private Map<Integer, Address> address;
    private Set<Object> primary_skills;
    
    public Employee_version2() {
        this.employeeId = "N/A";
        this.employeeName = "N/A";
        
    }

    public Employee_version2(String employeeId, String employeeName, Map<Integer, Address> address, Set<Object> primary_skills) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.address = address;
        this.primary_skills = primary_skills;
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

    public Map<Integer, Address> getAddress() {
        return address;
    }

    public void setAddress(Map<Integer, Address> address) {
        this.address = address;
    }

    public Set<Object> getPrimary_skills() {
        return primary_skills;
    }

    public void setPrimary_skills(Set<Object> primary_skills) {
        this.primary_skills = primary_skills;
    }

    

    @Override
    public String toString() {
        return "Employee_version2{" + "employeeId=" + employeeId + ", employeeName=" + employeeName + ", address=" + address + ", primary_skills=" + primary_skills + '}';
    }

   
    
    
}
