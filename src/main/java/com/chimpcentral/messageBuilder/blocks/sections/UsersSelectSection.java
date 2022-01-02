package com.chimpcentral.messageBuilder.blocks.sections;

import com.chimpcentral.jsons.JsonObject;
import com.chimpcentral.messageBuilder.builder.MessageBuilder;

public class UsersSelectSection<T> extends AbstractSection<T> {

	public UsersSelectSection(MessageBuilder<T> messageBuilder) {
		super(messageBuilder);
	}
	
	@Override
	protected void addSection() {
		block.add("text", new JsonObject());
		block.add("text.type", "mrkdwn");
		block.add("text.text", "");
		block.add("accessory", new JsonObject());
		block.add("accessory.type", "users_select");
		block.add("accessory.placeholder", new JsonObject());
		block.add("accessory.placeholder.type", "plain_text");
		block.add("accessory.placeholder.text", "Select a User");
		block.add("accessory.placeholder.emoji", true);
		block.add("accessory.action_id", "users_select-action");
	}
	
	public UsersSelectSection<T> setText(String messageText, String optionsDefaultText) {
		block.add("text.text", messageText);
		block.add("accessory.placeholder.text", optionsDefaultText);
		return this;
	}

}
