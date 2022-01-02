package com.chimpcentral.messageBuilder.blocks.sections;

import com.chimpcentral.jsons.JsonObject;
import com.chimpcentral.messageBuilder.builder.MessageBuilder;

public class LinkButtonSection<T> extends AbstractSection<T> {

	public LinkButtonSection(MessageBuilder<T> messageBuilder) {
		super(messageBuilder);
	}

	@Override
	protected void addSection() {
		block.add("text", new JsonObject());
		block.add("text.type", "mrkdwn");
		block.add("text.text", "");
		block.add("accessory", new JsonObject());
		block.add("accessory.type", "buton");
		block.add("accessory.text", new JsonObject());
		block.add("accessory.text.type", "plain_text");
		block.add("accessory.text.text", "Click Me");
		block.add("accessory.text.emoji", true);
		block.add("accessory.value", "");
		block.add("accessory.url", "");
		block.add("accessory.action_id", "button-action");
	}
	
	public LinkButtonSection<T> setText(String messageText, String buttonText, String url) {
		block.add("text.text", messageText);
		block.add("accessory.text.text", buttonText);
		block.add("accessory.url", url);
		block.add("accessory.value", buttonText.toLowerCase().replace(" ", "_"));
		return this;
	}

}
