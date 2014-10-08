package com.songli.sessionmanage.util;

import java.util.UUID;

public class UUIDGenerUtil {
	public static String create() {
		String uuid = UUID.randomUUID().toString();
		uuid.replace("-", "");
		return uuid;
	}
}
