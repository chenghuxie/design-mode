package com.xch.designMode.template;

/**
 * @author xiech
 * @create 2020-01-08 15:23
 */
public abstract class MsgTemplate {
    public void setHeadLog(){
        System.out.println("记录日志");
    }
    public void setEndLog(){
        System.out.println("记录结束日志");
    }
    abstract void httpReq();

    public void process(){
        setHeadLog();
        httpReq();
        setEndLog();
    }
}
