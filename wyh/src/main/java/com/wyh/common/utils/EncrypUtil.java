package com.wyh.common.utils;

import java.security.Key;

import org.apache.shiro.codec.Base64;
import org.apache.shiro.crypto.AesCipherService;
import org.apache.shiro.crypto.hash.SimpleHash;

public class EncrypUtil {

	public static String salt = "hello";
	
	public static String encBase64(byte[] value) {
		return Base64.encodeToString(value);
	}
	
	public static String decBase64(byte[] value) {
		return Base64.decodeToString(value);
	}
	
	public static String md5(String pass, String salt, int count) {
		SimpleHash hash = new SimpleHash("md5", pass, salt, count);
		return hash.toString();
	}
	
	/**
	 * org.apache.shiro.crypto.hash.SimpleHash("md5",pass,salt='hello',128)
	 * @param pass
	 * @return
	 */
	public static String md5Pass(String pass) {
		SimpleHash hash = new SimpleHash("md5", pass, EncrypUtil.salt, 128);
		return hash.toString();
	}
	
	public static String md5Pass(String pass, String salt) {
		SimpleHash hash = new SimpleHash("md5", pass, salt, 128);
		return hash.toString();
	}
	
	public static Key getAesKey() {
		AesCipherService service = new AesCipherService();
		service.setKeySize(128);
		return service.generateNewKey();
	}
	
	public static String encAes(Key key, String value) {
		return new AesCipherService().encrypt(value.getBytes(), key.getEncoded()).toBase64();
	}
	
	public static String decAes(Key key, String value) {
		return new String(new AesCipherService().decrypt(Base64.decode(value), key.getEncoded()).getBytes());
	}
	
}
