package com.java.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class StaticSerialization implements Serializable{
    public static int k = 10;
    public int j=5;
public static void main(String[] args) {
    
    StaticSerialization tj1= new StaticSerialization();
    StaticSerialization tj2;
    
    
        try{ //serialization
            FileOutputStream fos = new FileOutputStream("E:\\Test location\\Serialization\\myclass.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(tj1);
            oos.close();
            fos.close();
            System.out.println("object serielized 1..."+tj1.j);
            System.out.println("object serielized 2..."+tj1.k);
            System.out.println("object serielized 3..."+k);
            k=++k; // 'k' value incrementd after serialization
          } catch(FileNotFoundException fnfe){
             fnfe.printStackTrace();
          } catch(IOException ioex){
             ioex.printStackTrace();
          }
    
      
          try{ //deserialization
              FileInputStream fis = new FileInputStream("E:\\Test location\\Serialization\\myclass.ser");
              ObjectInputStream ois = new ObjectInputStream(fis);
              tj2 = (StaticSerialization) ois.readObject();
              ois.close();
              fis.close();
              System.out.println("object DEEEEserielized 1..."+tj2.j);
              System.out.println("object DEEEEserielized 2..."+tj2.k); 
              System.out.println("object DEEEEserielized 3..."+k); 
            // in deserialization 'k' value is shown as incremented. 
            // That means Static varialbe 'K' is not serialized.
            // if 'K' value is serialized then, it has to show old value before incrementd the 'K' value.
            } catch(FileNotFoundException fnfe){
              fnfe.printStackTrace();
            } catch(IOException ioex){
              ioex.printStackTrace();
            } catch(ClassNotFoundException CNFE){
              CNFE.printStackTrace();                   
           }
      }
}