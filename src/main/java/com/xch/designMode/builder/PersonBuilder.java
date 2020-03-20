package com.xch.designMode.builder;

/**
 * @author xiech
 * @create 2020-01-08 14:53
 */
public interface PersonBuilder {
    void builderHead();
    void builderBody();
    void builderFoot();

    Person createPerson();
}
