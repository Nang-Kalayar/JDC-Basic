package org.example;

import org.example.action.ComplexAction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            AnnotationConfigApplicationContext context =
                    new AnnotationConfigApplicationContext(AppConfig.class);
            context.registerShutdownHook();
        ComplexAction complexAction=
                context.getBean(ComplexAction.class);
        ComplexAction.complexAction();
        }
    }
