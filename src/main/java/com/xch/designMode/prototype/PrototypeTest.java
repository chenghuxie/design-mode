package com.xch.designMode.prototype;

/**
 *
 * 原型模式（深克隆）
 * @author xiech
 * @create 2020-01-09 10:03
 */
public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Book book1=new Book();
        book1.setTitle("图书1");
        book1.addImg("图片1");
        book1.setAge(10);
        book1.showBook();

        Book book2= (Book) book1.clone();
        book2.setTitle("图书2");
        book2.addImg("图片2");
        book2.setAge(20);

        book2.showBook();
        book1.showBook();

    }
}
