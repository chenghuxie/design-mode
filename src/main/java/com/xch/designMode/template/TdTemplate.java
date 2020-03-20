package com.xch.designMode.template;

/**
 * @author xiech
 * @create 2020-01-08 15:33
 */
public class TdTemplate extends MsgTemplate {
    @Override
    void httpReq() {
        System.out.println("移动发送信息");
    }

    public static void main(String[] args) {
        MsgTemplate msgTemplate=new TdTemplate();
        msgTemplate.process();
    }
}
