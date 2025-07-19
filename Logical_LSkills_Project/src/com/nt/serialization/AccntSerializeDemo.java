package com.nt.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AccntSerializeDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

        Account a = new Account();
        System.out.println(a.userName+"........"+a.password);
        
        FileOutputStream fos = new FileOutputStream("acc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a);
        
        FileInputStream  fis = new FileInputStream("acc.ser");
        ObjectInputStream ois =new ObjectInputStream(fis);
        Account acc = (Account) ois.readObject();
        
        System.out.println(acc.userName+"........"+acc.password);

	}

}
