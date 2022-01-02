package com.chimpcentral.messageBuilder.blocks.sections;

import com.chimpcentral.jsons.JsonObject;
import com.chimpcentral.messageBuilder.builder.MessageBuilder;

public class PlainTextSection<T> extends AbstractSection<T> {

	public PlainTextSection(MessageBuilder<T> messageBuilder) {
		super(messageBuilder);
	}
	
	@Override
	protected void addSection() {
		block.add("text", new JsonObject());
		block.add("text.type", "plain_text");
		block.add("text.text", "");
		block.add("text.emoji", true);
	}
	
	public PlainTextSection<T> setText(String text) {
		block.add("text.text", text);
		return this;
	}
}
