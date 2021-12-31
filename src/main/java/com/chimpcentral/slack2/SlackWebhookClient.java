package com.chimpcentral.slack2;

class SlackWebhookClient extends SlackClient<SlackWebhookClient, WebhookValues> {
	
	public SlackWebhookClient(String webhookURL) {
		super(webhookURL);
	}

	@Override
	public WebhookValues set() {
		return new WebhookValues(this);
	}
}
