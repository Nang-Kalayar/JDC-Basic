package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.expression.BeanFactoryResolver;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class Main3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();
        StandardEvaluationContext sc =
                new StandardEvaluationContext();
        sc.setBeanResolver(new BeanFactoryResolver(context));
        ExpressionParser parser = new SpelExpressionParser();

        System.out.println(parser.parseExpression("@springBean1.streetName")
                .getValue(sc));

    }
}
