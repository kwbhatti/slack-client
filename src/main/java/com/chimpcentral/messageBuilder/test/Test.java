package com.chimpcentral.messageBuilder.test;

import com.chimpcentral.messageBuilder.builder.SlackBlocksBuilder;
import com.chimpcentral.messageBuilder.builder.SlackPayloadBuilder;
import com.chimpcentral.messageBuilder.message.Message;

public class Test {

	
	public static void main(String[] args) {
		
		Message slackpayload1 = new SlackPayloadBuilder()
				.addPlainTextSection().setText("dd").getBuilder()
				.addPlainTextSection().setText("dsfs").getBuilder()
				.getMessage();
		System.out.println(slackpayload1);

		Message slackBlocks1 = new SlackBlocksBuilder()
				.addPlainTextSection().setText("dd").getBuilder()
				.addPlainTextSection().setText("dsfs").getBuilder()
				.addMarkdownSection().setText("markdown text").getBuilder()
				.addUsersSelectSection().setText("my message", "select user").getBuilder()
				.getMessage();
		System.out.println(slackBlocks1);

		Message slackPayloadFieldsPayload = new SlackPayloadBuilder()
				.addPlainTextSection().getBuilder()
				.addTextFieldsSection().addTextField("some of my text").getBuilder()
				.getMessage();
		System.out.println(slackPayloadFieldsPayload);
		
		Message slackPayloadWithStaticSelect = new SlackPayloadBuilder()
				.addStaticSelectSection().setText("this is my message", "therse are the options")
						.addOption("this is my first option").addOption("second option")
				.getBuilder().getMessage();
		
		System.out.println(slackPayloadWithStaticSelect);
	}
}
