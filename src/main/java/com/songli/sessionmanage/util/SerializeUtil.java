package com.songli.sessionmanage.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeUtil {

	private SerializeUtil() {

	}

	public byte[] serialize(Object source) {
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		ObjectOutputStream objectOutputStream = null;
		try {
			objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
			objectOutputStream.writeObject(source);
			objectOutputStream.close();
		}
		catch (Exception e) {
			
		}
		return byteArrayOutputStream.toByteArray();
	}

	public Object deserialize(byte[] source) {
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(source);
		ObjectInputStream objectInputStream = null;
		Object object = null;
		try {
			objectInputStream = new ObjectInputStream(byteArrayInputStream);
			object = objectInputStream.readObject();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return object;
	}

}
