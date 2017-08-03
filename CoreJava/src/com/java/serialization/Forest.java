package com.java.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Forest implements Serializable {
	private Tree tree = new Tree();

	public static void main(String[] args) {
		Forest f = new Forest();
		try {
			FileOutputStream fs = new FileOutputStream("E:\\Test location\\Serialization\\Forest.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(f);
			os.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

// this will throw exception in runtime because Tree class not implemented serialization

class Tree {
}