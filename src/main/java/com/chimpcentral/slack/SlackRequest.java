package com.chimpcentral.slack;

public class SlackRequest {

	public SlackWebhookRequestBuilder viaWebhook(String webhookURL) {
		return new SlackWebhookRequestBuilder(webhookURL);
	}
	
	public SlackAPIRequestBuilder viaAPI(String token, Resource resource) {
		return new SlackAPIRequestBuilder(token, resource);
	}
	
	public static void main(String[] args) {
		
		SlackAPIRequestBuilder slackAPIClient1 = new SlackAPIRequestBuilder("xoxo", Resource.chat_update);
		slackAPIClient1.set().body().set().cursor(null).set();
		SlackAPIRequestBuilder slackAPIClient2 = new SlackRequest().viaAPI("xoxo", Resource.chat_update);
		slackAPIClient2.set().body().set().cursor(null).set();
		SlackRequestBuilder<SlackAPIRequestBuilder> slackAPIClient3 = new SlackRequest().viaAPI("xoxo", Resource.chat_update);
		slackAPIClient3.set().body().set().cursor(null).set();
		
		SlackWebhookRequestBuilder slackWebhookClient1 = new SlackRequest().viaWebhook("url");
		slackWebhookClient1.set().body().set().header(null);
		SlackWebhookRequestBuilder slackWebhookClient2 = new SlackWebhookRequestBuilder("url");
		slackWebhookClient2.set().body().set().header(null);
		SlackRequestBuilder<SlackWebhookRequestBuilder> slackWebhookClient3 = new SlackWebhookRequestBuilder("url");
		slackWebhookClient3.set().body().set().header(null);
		
	}
}
