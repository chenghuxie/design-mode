package com.xch.designMode.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiech
 * @create 2020-01-09 9:54
 */
public class Book implements Cloneable{
    private String title;
    private ArrayList<String> listimg=new ArrayList<>();

    private Integer age;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getListimg() {
        return listimg;
    }

    public void setListimg(ArrayList<String> listimg) {
        this.listimg = listimg;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void addImg(String imgName){
        listimg.add(imgName);
    }


    public void showBook(){
        System.out.println(".....start.....");
        System.out.println("title:"+title);
        for (String s : listimg) {
            System.out.println("listimg:"+s);
        }
        System.out.println("age:"+age);
        System.out.println(".....end.....");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //浅克隆
        Book book= (Book) super.clone();

        //深克隆
        book.listimg= (ArrayList<String>) this.listimg.clone();
        return book;
    }
}
