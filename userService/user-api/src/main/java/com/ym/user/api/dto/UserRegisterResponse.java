package com.ym.user.api.dto;

import java.io.Serializable;
import com.ym.user.api.abs.AbstractResponse;

public class UserRegisterResponse extends AbstractResponse implements Serializable{

	private static final long serialVersionUID = -3676933106762309260L;
	private Integer uid;


    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}
