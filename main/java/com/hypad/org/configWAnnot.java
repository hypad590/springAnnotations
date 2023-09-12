package com.hypad.org;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class configWAnnot {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("appContext.xml");

      overall over = context.getBean("overall",overall.class);

      over.say();

        context.close();
    }
}
