package com.chimpcentral.messageBuilder.blocks.contexts;

import com.chimpcentral.messageBuilder.blocks.AbstractBlock;
import com.chimpcentral.messageBuilder.builder.MessageBuilder;

public abstract class AbstractContext<T> extends AbstractBlock<T> {

	public AbstractContext(MessageBuilder<T> messageBuilder) {
		super(messageBuilder);
		addContext();
	}

	protected void setType() {
		block.add("type", "context");
	}
	
	protected abstract void addContext();

}
