package org.example;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main2 {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        System.out.println(parser.parseExpression("'hello'.concat('world!')")
                .getValue());
        System.out.println(parser.parseExpression("'2 + 2 equals ='" +
                        ".concat('(2+2)')")
                .getValue());

    }

}
