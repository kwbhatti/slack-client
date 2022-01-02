package com.chimpcentral.messageBuilder.blocks.sections;

import com.chimpcentral.jsons.JsonObject;
import com.chimpcentral.messageBuilder.builder.MessageBuilder;

public class MarkdownSection<T> extends AbstractSection<T> {

	public MarkdownSection(MessageBuilder<T> messageBuilder) {
		super(messageBuilder);
	}

	@Override
	protected void addSection() {
		block.add("text", new JsonObject());
		block.add("text.type", "mrkdwn");
		block.add("text.text", "");
	}

	public MarkdownSection<T> setText(String text) {
		block.add("text.text", text);
		return this;
	}
}
