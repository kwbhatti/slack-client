package com.chimpcentral.messageBuilder.message;

import com.chimpcentral.jsons.JsonArray;
import com.chimpcentral.jsons.JsonObject;

public class SlackPayload extends JsonObject implements Message {

	private static final long serialVersionUID = -2936161945980227268L;
	
	public SlackPayload() {
		this.add("blocks", new JsonArray());
	}

}
