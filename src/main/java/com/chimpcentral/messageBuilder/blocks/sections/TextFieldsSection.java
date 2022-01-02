package com.chimpcentral.messageBuilder.blocks.sections;

import com.chimpcentral.jsons.JsonArray;
import com.chimpcentral.jsons.JsonObject;
import com.chimpcentral.messageBuilder.builder.MessageBuilder;

public class TextFieldsSection<T> extends AbstractSection<T> {

	public TextFieldsSection(MessageBuilder<T> messageBuilder) {
		super(messageBuilder);
	}

	@Override
	protected void addSection() {
		block.add("fields", new JsonArray());
	}
	
	public TextFieldsSection<T> addTextField(String text) {
		JsonObject field = new JsonObject();
		field.add("type", "plain_text");
		field.add("text", text);
		field.add("emoji", true);
		block.getAsList("fields").add(field);
		return this;
	}

}
