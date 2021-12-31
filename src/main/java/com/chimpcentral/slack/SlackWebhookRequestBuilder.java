package com.chimpcentral.slack;

public class SlackWebhookRequestBuilder extends SlackRequestBuilder<SlackWebhookRequestBuilder> {
	
	public SlackWebhookRequestBuilder(String webhookURL) {
		super(webhookURL);
	}

	@Override
	public SlackWebhookRequestBuilder set() {
		return this;
	}
	
	public SlackRequestBuilder<SlackWebhookRequestBuilder> header(String body) {
		return this;
	}
}
