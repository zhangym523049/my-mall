package com.ym.user.api.constants;

public enum ResponseCodeEnum {
	SUCCESS("000000", "成功"), USERORPASSWORD_ERRROR("000001", "用户名或密码不存在"), SYS_PARAM_NOT_RIGHT("000002", "请求参数错误"),
	TOKEN_EXPIRE("000003", "token过期"), SIGNATURE_ERROR("000004", "签名验证失败"), QUERY_DATA_NOT_EXIST("000005", "请求数据不存在"),
	SYSTEM_BUSY("000006", "系统繁忙，请稍候重试");

	private final String code;
	private final String msg;

	ResponseCodeEnum(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}
}
