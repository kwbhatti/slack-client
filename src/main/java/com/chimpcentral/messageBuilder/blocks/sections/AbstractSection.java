package com.chimpcentral.messageBuilder.blocks.sections;

import com.chimpcentral.messageBuilder.blocks.AbstractBlock;
import com.chimpcentral.messageBuilder.builder.MessageBuilder;

public abstract class AbstractSection<T> extends AbstractBlock<T> {

	public AbstractSection(MessageBuilder<T> messageBuilder) {
		super(messageBuilder);
		addSection();
	}

	protected void setType() {
		block.add("type", "section");		
	}
	
	protected abstract void addSection();

}
