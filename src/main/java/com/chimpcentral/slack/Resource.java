package com.chimpcentral.slack;

public enum Resource {

	chat_delete ("chat.delete"),
	chat_update ("chat.update"),
	conversations_info ("conversations.info"),
	conversations_list ("conversation.list"),
	files_upload ("files.upload")
	;
	
	public String value = null;
	
	private Resource(String value) {
		this.value = value;
	}
}
