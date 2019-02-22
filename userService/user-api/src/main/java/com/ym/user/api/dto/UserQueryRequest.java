package com.ym.user.api.dto;

import java.io.Serializable;

import com.ym.user.api.abs.AbstractRequest;

public class UserQueryRequest extends AbstractRequest implements Serializable {
	
	private static final long serialVersionUID = -6476830357812193035L;
	private Integer uid;

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

}
