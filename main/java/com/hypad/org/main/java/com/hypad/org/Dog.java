package com.hypad.org;

@Component
public class Dog implements Pet{
    @Override
    public void say(){
        System.out.println("Like bow-bow");
    }
}
