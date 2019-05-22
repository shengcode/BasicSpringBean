
package com.study.practice.pojo;

import org.springframework.stereotype.Component;

@Component
public class Greetings {
    private String message;
    private Employee e;
    public Greetings() {   
        //System.out.println("u called me");
        System.out.println("Hello, good morning!");
    }
     public Greetings(String message) {   
        this.message=message;
        System.out.println("Hello, good morning! "+message);
    }

    public Greetings(String message, Employee e) {
        this.message = message;
        this.e = e;
        System.out.println("Hello, good morning! "+message + " "+ e.getEmployeeName()+" "+ e.getEmployeeId());
    }
     
    public String getMessage() {
        return message;
    }

    // dependency when is need user defined parameters
    public void setMessage(String message) {
        this.message = message;
    }
     // IOC is inversion of control

    public Employee getE() {
        return e;
    }

    public void setE(Employee e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "Greetings{" + "message=" + message + ", e=" + e + '}';
    }
    
   
    
     
}
