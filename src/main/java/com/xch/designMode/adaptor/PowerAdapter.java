package com.xch.designMode.adaptor;

/**
 *
 * 适配器模式
 * @author xiech
 * @create 2020-01-08 15:56
 */
public class PowerAdapter implements Jp110VInterface {
    private China220VInterface china220VInterface;

    public PowerAdapter(China220VInterface china220VInterface){
        this.china220VInterface = china220VInterface;
    }

    @Override
    public void connect() {
       china220VInterface.connect();
    }

    public static void main(String[] args) {
        China220VInterface china220VInterface=new China220VInterfaceImpl();
        PowerAdapter powerAdapter=new PowerAdapter(china220VInterface);
        ElectricCooker electricCooker=new ElectricCooker(powerAdapter);
        electricCooker.cook();
    }
}
