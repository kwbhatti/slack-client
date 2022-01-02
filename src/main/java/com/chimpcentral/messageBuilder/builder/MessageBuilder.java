package com.chimpcentral.messageBuilder.builder;

import com.chimpcentral.messageBuilder.blocks.contexts.Context;
import com.chimpcentral.messageBuilder.blocks.sections.LinkButtonSection;
import com.chimpcentral.messageBuilder.blocks.sections.MarkdownSection;
import com.chimpcentral.messageBuilder.blocks.sections.PlainTextSection;
import com.chimpcentral.messageBuilder.blocks.sections.StaticSelectSection;
import com.chimpcentral.messageBuilder.blocks.sections.TextFieldsSection;
import com.chimpcentral.messageBuilder.blocks.sections.UsersSelectSection;
import com.chimpcentral.messageBuilder.message.Message;

public interface MessageBuilder<T> {

	public Message getMessage();
		
	public PlainTextSection<T> addPlainTextSection();
	
	public MarkdownSection<T> addMarkdownSection();
	
	public TextFieldsSection<T> addTextFieldsSection();
	
	public UsersSelectSection<T> addUsersSelectSection();
	
	public StaticSelectSection<T> addStaticSelectSection();
	
	public LinkButtonSection<T> addLinkButtonSection();
	
	
	public Context<T> addContext();
}
