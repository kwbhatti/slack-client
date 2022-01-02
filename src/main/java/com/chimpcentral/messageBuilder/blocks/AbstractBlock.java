package com.chimpcentral.messageBuilder.blocks;

import com.chimpcentral.jsons.JsonObject;
import com.chimpcentral.messageBuilder.builder.MessageBuilder;
import com.chimpcentral.messageBuilder.message.Message;
import com.chimpcentral.messageBuilder.message.SlackBlocks;
import com.chimpcentral.messageBuilder.message.SlackPayload;

public abstract class AbstractBlock<T> {

	protected MessageBuilder<T> messageBuilder = null;
	protected Message message = null;
	protected JsonObject block = new JsonObject();
	
	public AbstractBlock(MessageBuilder<T> messageBuilder) {
		this.messageBuilder = messageBuilder;
		message = messageBuilder.getMessage();
		setType();
	}
	
	protected abstract void setType();
		
	public MessageBuilder<T> getBuilder() {
		if (message instanceof SlackBlocks) {
			((SlackBlocks) message).add(block);
		} else if (message instanceof SlackPayload) {			
			((SlackPayload) message).getAsList("blocks").add(block);
		}
		return messageBuilder;
	}
	
}
