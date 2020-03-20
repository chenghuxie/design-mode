package com.xch.jvm;

import java.io.InputStream;

/**
 * @author xiech
 * @create 2020-01-15 14:19
 */
public class MyClassLoader extends ClassLoader {
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            String fileName=name.substring(name.lastIndexOf(".")+1)+".class";
            InputStream inputStream = this.getClass().getResourceAsStream(fileName);
            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes);
            return defineClass(name,bytes,0,bytes.length);
        }catch (Exception e){
            e.printStackTrace();
            throw new ClassNotFoundException();
        }
    }
}
