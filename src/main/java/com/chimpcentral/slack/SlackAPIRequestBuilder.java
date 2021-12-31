package com.chimpcentral.slack;

public class SlackAPIRequestBuilder extends SlackRequestBuilder<SlackAPIRequestBuilder> {

	private static final String baseURI = "https://slack.com/api/";
	String token = null;
	
	public SlackAPIRequestBuilder(String token, Resource resource) {
		super(baseURI + resource.value);
		this.token = token;
	}
	
	@Override
	public SlackAPIRequestBuilder set() {
		return this;
	}
	
	public SlackRequestBuilder<SlackAPIRequestBuilder> limit(String limit) {
		return this;
	}
	
	public SlackRequestBuilder<SlackAPIRequestBuilder> cursor(String cursor) {
		return this;
	}
	
	public SlackRequestBuilder<SlackAPIRequestBuilder> channel(String channel) {
		return this;
	}
}
