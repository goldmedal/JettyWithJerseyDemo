package org.test.jetty;

public class Message {
	
	public String title;
	public String content;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString(){
		return "Message [title="+ title + ", content=" + content + "]";
	}
	
}
