package com.chimpcentral.slack2;

class APIValues extends Values<SlackAPIClient, APIValues> {

	public APIValues(SlackClient<SlackAPIClient, APIValues> slackAPIClient) {
		super(slackAPIClient);
	}
	
	public SlackClient<SlackAPIClient, APIValues> limit(String limit) {
		return slackClient;
	}
	
	public SlackClient<SlackAPIClient, APIValues> cursor(String cursor) {
		return slackClient;
	}
	
	public SlackClient<SlackAPIClient, APIValues> channel(String channel) {
		return slackClient;
	}
}
