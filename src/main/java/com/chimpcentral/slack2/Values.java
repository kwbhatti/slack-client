package com.chimpcentral.slack2;

class Values<T, E extends Values<T, E>> {
		
	SlackClient<T, E> slackClient = null;
	
	public Values(SlackClient<T, E> slackClient) {
		this.slackClient = slackClient;
	}
	
	public SlackClient<T, E> body() {
		return slackClient;
	}
}