package liondemo;

import java.util.UUID;

import com.fasterxml.jackson.databind.deser.std.UUIDDeserializer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String uuId = UUID.randomUUID().toString();
		System.out.println(uuId);
		System.out.println(uuId.length());
	}

}
