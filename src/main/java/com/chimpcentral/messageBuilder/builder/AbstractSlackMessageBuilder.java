package com.chimpcentral.messageBuilder.builder;

import com.chimpcentral.messageBuilder.blocks.contexts.Context;
import com.chimpcentral.messageBuilder.blocks.sections.LinkButtonSection;
import com.chimpcentral.messageBuilder.blocks.sections.MarkdownSection;
import com.chimpcentral.messageBuilder.blocks.sections.PlainTextSection;
import com.chimpcentral.messageBuilder.blocks.sections.StaticSelectSection;
import com.chimpcentral.messageBuilder.blocks.sections.TextFieldsSection;
import com.chimpcentral.messageBuilder.blocks.sections.UsersSelectSection;

abstract class AbstractSlackMessageBuilder<T> implements MessageBuilder<T> {
	
	@Override
	public PlainTextSection<T> addPlainTextSection() {
		return new PlainTextSection<T>(this);
	}

	@Override
	public MarkdownSection<T> addMarkdownSection() {
		return new MarkdownSection<T>(this);
	}
	
	@Override
	public TextFieldsSection<T> addTextFieldsSection() {
		return new TextFieldsSection<T>(this);
	}
	
	@Override
	public UsersSelectSection<T> addUsersSelectSection() {
		return new UsersSelectSection<T>(this);
	}
	
	@Override
	public StaticSelectSection<T> addStaticSelectSection() {
		return new StaticSelectSection<T>(this);
	}

	@Override
	public LinkButtonSection<T> addLinkButtonSection() {
		return new LinkButtonSection<T>(this);
	}

	@Override
	public Context<T> addContext() {
		return new Context<T>(this);
	}

	
}
