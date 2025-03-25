package org.example;

import org.example.service.AmazingCurrencyService;
import org.example.service.CurrencyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();
        CurrencyService currencyService = context.getBean(CurrencyService.class);
        currencyService.changeCurrency("US");
        //AmazingCurrencyService amazingCurrencyService=
        //AmazingCurrencyService.calculate(currency:"Euro");

    }
}