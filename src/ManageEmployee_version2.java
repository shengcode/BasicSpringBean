
import com.study.practice.pojo.Address;
import com.study.practice.pojo.Employee_version2;
import com.study.practice.pojo.Skill;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ManageEmployee_version2 {
    public static void main (String[]args){
       ApplicationContext ctx = new ClassPathXmlApplicationContext("Employee_version2.xml");
        Address mailaddress= (Address)ctx.getBean("mailaddress_1");
        System.out.println(mailaddress);
        Address homeaddress= (Address)ctx.getBean("homeaddress_1");
        System.out.println(homeaddress);
        
        Skill skill= (Skill)ctx.getBean("skill_1");
        System.out.println(skill);
        
       ApplicationContext ctx2 = new ClassPathXmlApplicationContext("Employee_version2.xml");
        Employee_version2 employee =(Employee_version2)ctx2.getBean("employee_1");
        System.out.println(employee);
    }
}
