package com.chimpcentral.messageBuilder.blocks.contexts;

import com.chimpcentral.jsons.JsonArray;
import com.chimpcentral.jsons.JsonObject;
import com.chimpcentral.messageBuilder.builder.MessageBuilder;

public class Context<T> extends AbstractContext<T> {

	public Context(MessageBuilder<T> messageBuilder) {
		super(messageBuilder);
	}
	
	@Override
	protected void addContext() {
		block.add("elements", new JsonArray());
	}
	
	public Context<T> addPlainText(String text) {
		JsonObject element = new JsonObject();
		element.add("type", "plain_text");
		element.add("text", text);
		element.add("emoji", true);
		block.getAsList("elements").add(element);
		return this;
	}
	
	public Context<T> addMarkdown(String text) {
		JsonObject element = new JsonObject();
		element.add("type", "mrkdwn");
		element.add("text", text);
		block.getAsList("elements").add(element);		
		return this;
	}
	
	public Context<T> addImage(String imageURL, String altText) {
		JsonObject element = new JsonObject();
		element.add("type", "image");
		element.add("image_url", imageURL);
		element.add("alt_text", altText);
		block.getAsList("elements").add(element);		
		return this;
	}
}
