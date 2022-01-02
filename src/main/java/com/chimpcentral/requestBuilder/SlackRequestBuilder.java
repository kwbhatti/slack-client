package com.chimpcentral.requestBuilder;

public abstract class SlackRequestBuilder<T> {

	private String baseURL = null;
	
	public SlackRequestBuilder(String baseURL) {
		this.baseURL = baseURL;
	}
	
	public abstract T set();

	public SlackRequestBuilder<T> body() {
		return this;
	}
	
	public void get() {
		System.out.println(baseURL);
	}

}
