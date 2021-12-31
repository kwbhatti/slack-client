package com.chimpcentral.slack2;

class WebhookValues extends Values<SlackWebhookClient, WebhookValues> {
	
	public WebhookValues(SlackClient<SlackWebhookClient, WebhookValues> slackClient) {
		super(slackClient);
	}

	public SlackClient<SlackWebhookClient, WebhookValues> header(String body) {
		return slackClient;
	}
	
}