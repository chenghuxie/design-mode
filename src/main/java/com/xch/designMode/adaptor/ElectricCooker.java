package com.xch.designMode.adaptor;

/**
 * @author xiech
 * @create 2020-01-08 15:44
 */
public class ElectricCooker {
    private Jp110VInterface jp110VInterface;

    public ElectricCooker(Jp110VInterface jp110VInterface){
        this.jp110VInterface=jp110VInterface;
    }

    public void cook(){
        jp110VInterface.connect();
        System.out.println("做饭");
    }
}
