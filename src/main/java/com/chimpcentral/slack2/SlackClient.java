package com.chimpcentral.slack2;

abstract class SlackClient<T, E extends Values<T, E>> {

	private String baseURL = null;
	
	public SlackClient(String baseURL) {
		this.baseURL = baseURL;
	}
	
	public abstract E set();

	public void get() {
		System.out.println(baseURL);
	}
}
