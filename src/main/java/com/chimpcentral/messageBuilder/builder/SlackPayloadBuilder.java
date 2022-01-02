package com.chimpcentral.messageBuilder.builder;

import com.chimpcentral.messageBuilder.message.SlackPayload;

public class SlackPayloadBuilder extends AbstractSlackMessageBuilder<SlackPayload> implements MessageBuilder<SlackPayload> {

	private SlackPayload message = new SlackPayload();

	@Override
	public SlackPayload getMessage() {
		return this.message;
	}
}
