package com.ym.user.exception;

public class ServiceException extends RuntimeException {

	/** 返回码 */
	private String errorCode;
	/** 信息 */
	private String errorMessage;

	public ServiceException() {
		super();
	}

	public ServiceException(String errorCode) {
		super(errorCode);
	}

	public ServiceException(Throwable cause) {
		super(cause);
	}

	public ServiceException(String errorCode, Throwable cause) {
		super(cause);
		this.errorCode = errorCode;
	}

	public ServiceException(String errorCode, String message) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = message;
	}

	public ServiceException(String errorCode, String message, Throwable cause) {
		super(cause);
		this.errorCode = errorCode;
		this.errorMessage = message;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return "ServiceException [errorCode=" + errorCode + ", errorMessage=" + errorMessage + "]";
	}
}
