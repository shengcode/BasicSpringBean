
import com.study.practice.pojo.ConfigureGreetings;
import com.study.practice.pojo.Greetings;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ManageGreetings {
    public static void main (String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Mybeans.xml");
       /* Greetings greetMe =(Greetings)ctx.getBean("greet1");
        //with constructor injection
        Greetings greetConstructor =(Greetings)ctx.getBean("greet2");
        // getter setter injection 
        Greetings greetMeProperty =(Greetings)ctx.getBean("greet3");
        //System.out.println(greetMeProperty.getMessage());
        System.out.println(greetMeProperty);*/
        
        
       /* Greetings greetEmployee =(Greetings)ctx.getBean("greet4");
        System.out.println(greetEmployee);*/
       
       ApplicationContext ct=new AnnotationConfigApplicationContext(ConfigureGreetings.class);

       /* Greetings g=ct.getBean("h",Greetings.class);
        System.out.println(g);*/
       
       Greetings g_in=ct.getBean(Greetings.class);
       System.out.println(g_in);
       g_in.setMessage("lalalal");
       System.out.println(g_in);
 };
}
