package org.example.patterns.jdk.proxy;

public class FormalGreeting implements IGreeting{
    public String greet(
            String name
    ){
        return "Hello, " + name + "!";
    }

}
