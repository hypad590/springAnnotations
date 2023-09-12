package com.hypad.org;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class configWAnnot {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("appContext.xml");

        Cat cat = context.getBean("cat",Cat.class);

        cat.say();

        context.close();
    }
}
