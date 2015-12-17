package com.chinesedreamer.sso.api;

/**
 * 登陆、登出放回结果
 * @author Paris
 *
 */
public class ApiResult {
	private Boolean success = Boolean.FALSE;
	private String errorCode;
	private String errorMessage;
	private Object data;
	
	public Boolean getSuccess() {
		return success;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	
}
