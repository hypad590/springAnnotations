package com.hypad.org;

import org.springframework.stereotype.Component;

@Component ("cat")
public class Cat implements Pet{
    public Cat(){
        System.out.println("Cat bean is created;")
        ;
    }

    @Override
    public void say(){
        System.out.println("Am i supposed to do smth?");
}

}
