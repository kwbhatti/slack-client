package com.chimpcentral.messageBuilder.blocks.sections;

import com.chimpcentral.jsons.JsonArray;
import com.chimpcentral.jsons.JsonObject;
import com.chimpcentral.messageBuilder.builder.MessageBuilder;

public class StaticSelectSection<T> extends AbstractSection<T> {

	public StaticSelectSection(MessageBuilder<T> messageBuilder) {
		super(messageBuilder);
	}
	
	@Override
	protected void addSection() {
		block.add("text", new JsonObject());
		block.add("text.type", "mrkdwn");
		block.add("text.text", "");
		block.add("accessory", new JsonObject());
		block.add("accessory.type", "static_select");
		block.add("accessory.placeholder", new JsonObject());
		block.add("accessory.placeholder.type", "plain_text");
		block.add("accessory.placeholder.text", "Select an Item");
		block.add("accessory.placeholder.emoji", true);
		block.add("accessory.options", new JsonArray());
		block.add("accessory.action_id", "static_select-action");
	}
	
	public StaticSelectSection<T> setText(String messageText, String optionsDefaultText) {
		block.add("text.text", messageText);
		block.add("accessory.placeholder.text", optionsDefaultText);
		return this;
	}
	
	public StaticSelectSection<T> addOption(String text) {
		JsonObject option = new JsonObject();
		option.add("text", new JsonObject());
		option.add("text.type", "plain_text");
		option.add("text.text", text);
		option.add("text.emoji", true);
		option.add("value", "value-" + block.getAsList("accessory.options").size());
		block.getAsList("accessory.options").add(option);
		return this;
	}
	
}
