package org.example.bean;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean1 {
    @Value("${app.name}")
    private String appName;
    @Value("${urser.counts}")
    private int userAccounts;
    @Value("${JAVA_HOME}")
    private String javaHome;
    @Value("#{'${street.name}'.toUpperCase()}")
    public String streetName;
    @Value("#{7+5}")
    private  int sum;
    @Value("#{'Hello'.concat('World')}")
    private String greeting;
    @Value("#{springBean2.price}")
    private int price;

    public void printProperties() {
        System.out.println(appName);
        System.out.println(userAccounts);
        System.out.println(javaHome);
        System.out.println(streetName);
        System.out.println(sum);
        System.out.println(greeting);
        System.out.println(price);
    }
}
