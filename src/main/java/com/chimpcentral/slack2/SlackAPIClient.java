package com.chimpcentral.slack2;

class SlackAPIClient extends SlackClient<SlackAPIClient, APIValues> {

	private static final String baseURI = "https://slack.com/api/";
	String token = null;
	
	public SlackAPIClient(String token, Resource resource) {
		super(baseURI + resource.value);
		this.token = token;
	}
	
	@Override
	public APIValues set() {
		return new APIValues(this);
	}
	
	public class something {
		
	}	
}
