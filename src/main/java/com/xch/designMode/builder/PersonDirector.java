package com.xch.designMode.builder;

/**
 *
 * 建造者模式
 * @author xiech
 * @create 2020-01-08 14:57
 */
public class PersonDirector {

    public Person constructPerson(PersonBuilder personBuilder){
        personBuilder.builderBody();
        personBuilder.builderHead();
        personBuilder.builderFoot();
        return personBuilder.createPerson();
    }

    public static void main(String[] args) {
        PersonDirector pb=new PersonDirector();
        Person person = pb.constructPerson(new ManBuilder());
        person.getBody();
        person.getHead();
        person.getFoot();
    }
}
