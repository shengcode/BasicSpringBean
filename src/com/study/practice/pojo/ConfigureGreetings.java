/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.study.practice.pojo;

import com.study.practice.pojo.Greetings;
import com.study.practice.pojo.Greetings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.atos.syntel.pojo")
public class ConfigureGreetings {
   

/*
    @Bean(name="h")
    public Greetings getGreeting(){
        Greetings h= new Greetings();
        h.setMessage("set message");
        return h;
    }
*/
    @Bean
    public Greetings getGreeting(){  
        //System.out.println("called bean");
        return new Greetings();
    }

   


}
