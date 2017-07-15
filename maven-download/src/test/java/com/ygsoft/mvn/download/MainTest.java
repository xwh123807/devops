package com.ygsoft.mvn.download;

public class MainTest {
	public static void main(String[] args) {
		String[] params = new String[] { "-group=xwh", "-artifact=devops.petstore", "-version=1.0-SNAPSHOT" };
		try {
			Main.main(params);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
