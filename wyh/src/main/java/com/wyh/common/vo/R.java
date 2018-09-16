package com.wyh.common.vo;

public class R {

	private Integer code;
	private String msg;
	private Object data;
	
	public R(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	public R(Integer code, String msg, Object data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}
	
	public static R createR(Integer code, String msg) {
		return new R(code, msg);
	}
	
	public static R createR(Integer code, String msg, Object data) {
		return new R(code, msg, data);
	}
	
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	
}
