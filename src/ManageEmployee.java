
import com.study.practice.pojo.Address;
import com.study.practice.pojo.Employee;
import com.study.practice.pojo.Skill;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class ManageEmployee {
    public static void main (String[] args){
       /* ApplicationContext ctx = new ClassPathXmlApplicationContext("Mybeans.xml");
        Employee em1 =(Employee)ctx.getBean("employee1");
        //with constructor injection
        Employee greetConstructor =(Employee)ctx.getBean("employee2");
        // getter setter injection 
        Employee greetMeProperty =(Employee)ctx.getBean("employee3");
        System.out.println(greetMeProperty);
        */
       // xml only have one copy
       /* ApplicationContext ctx = new ClassPathXmlApplicationContext("Mybeans.xml");
        Employee em1 =(Employee)ctx.getBean("employee1");
       em1.set("llll");
        Employee em2 =(Employee)ctx.getBean("employee1");
        System.out.println(em1);
        System.out.println(em2);*/
        // scopes, define scopes, prototype 
        
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Mybeans.xml");
        Address address= (Address)ctx.getBean("address_1");
        System.out.println(address);
        Skill skill= (Skill)ctx.getBean("skill_1");
        System.out.println(skill);
        Employee employee =(Employee)ctx.getBean("Employee_1");
        System.out.println(employee);
    }
}
