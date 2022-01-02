package com.chimpcentral.messageBuilder.builder;

import com.chimpcentral.messageBuilder.message.SlackBlocks;

public class SlackBlocksBuilder extends AbstractSlackMessageBuilder<SlackBlocks> implements MessageBuilder<SlackBlocks> {

	private SlackBlocks message = new SlackBlocks();

	@Override
	public SlackBlocks getMessage() {
		return this.message;
	}

}
