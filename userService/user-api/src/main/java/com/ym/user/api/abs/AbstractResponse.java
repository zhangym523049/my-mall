package com.ym.user.api.abs;

import java.io.Serializable;

public abstract class AbstractResponse implements Serializable {

	private static final long serialVersionUID = 5930528067171458546L;
	private String code;
	private String msg;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
