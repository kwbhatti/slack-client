package com.chimpcentral.slack2;

class SlackRequest {

	public SlackWebhookClient viaWebhook(String webhookURL) {
		return new SlackWebhookClient(webhookURL);
	}
	
	public SlackAPIClient viaAPI(String token, Resource resource) {
		return new SlackAPIClient(token, resource);
	}
	
	public static void main(String[] args) {
		
		SlackAPIClient slackAPIClient1 = new SlackAPIClient("xoxo", Resource.chat_update);
		slackAPIClient1.set().body().set().cursor(null).set();
		SlackAPIClient slackAPIClient2 = new SlackRequest().viaAPI("xoxo", Resource.chat_update);
		slackAPIClient2.set().body().set().cursor(null).set();
		SlackClient<SlackAPIClient, APIValues> slackAPIClient3 = new SlackRequest().viaAPI("xoxo", Resource.chat_update);
		slackAPIClient3.set().body().set().cursor(null).set();
		
		SlackWebhookClient slackWebhookClient1 = new SlackRequest().viaWebhook("url");
		slackWebhookClient1.set().body().set().header(null);
		SlackWebhookClient slackWebhookClient2 = new SlackWebhookClient("url");
		slackWebhookClient2.set().body().set().header(null);
		SlackClient<SlackWebhookClient, WebhookValues> slackWebhookClient3 = new SlackWebhookClient("url");
		slackWebhookClient3.set().body().set().header(null);
		
	}	
}
