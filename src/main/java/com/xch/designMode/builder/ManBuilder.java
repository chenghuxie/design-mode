package com.xch.designMode.builder;

/**
 * @author xiech
 * @create 2020-01-08 14:55
 */
public class ManBuilder implements PersonBuilder {
    private Person person;

    public ManBuilder(){
        person=new Person();
    }

    @Override
    public void builderHead() {
        System.out.println("头部");
    }

    @Override
    public void builderBody() {
        System.out.println("身体部位");
    }

    @Override
    public void builderFoot() {
        System.out.println("四肢部位");
    }

    @Override
    public Person createPerson() {
        return person;
    }
}
