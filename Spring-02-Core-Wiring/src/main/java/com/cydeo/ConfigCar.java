package com.cydeo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCar {

    @Bean(name = "c1")
    Car car(){
        Car c = new Car();
        c.setMake("Mercedes");
        return c;
    }


    /*@Bean(name = "c2")
    Car car1(){
        Car c = new Car();
        c.setMake("Honda");
        return c;
    }
   // Direct wiring
  @Bean(name = "p1")
  Person person1(){
    Person p = new Person();
      p.setName("Mike");
      p.setCar(car1());
      return p;
  }*/

   //Autowiring
    @Bean
    Person person(Car car){
        Person p = new Person();
        p.setName("Math");
        p.setCar(car);
        return p;
    }
}
