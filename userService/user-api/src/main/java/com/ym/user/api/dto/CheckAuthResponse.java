package com.ym.user.api.dto;

import com.ym.user.api.abs.AbstractResponse;

public class CheckAuthResponse extends AbstractResponse {

	private String uid;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "CheckAuthResponse{" +
                "uid='" + uid + '\'' +
                "} " + super.toString();
    }
}
