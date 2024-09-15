package com.springboot.webApp.todo;

import java.time.LocalDate;

public class Todo {

	public Todo(int id, String username, String desc, LocalDate targetDate, boolean done) {
		super();
		this.id = id;
		this.username = username;
		this.desc = desc;
		this.targetDate = targetDate;
		this.done = done;
	}
	
	private int id;
	private String username;
	private String desc;
	private LocalDate targetDate;
	private boolean done;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public LocalDate getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	 
	@Override
	public String toString() {
		return "Todo [id=" + id + ", username=" + username + ", desc=" + desc + ", targetDate=" + targetDate + ", done="
				+ done + "]";
	}
	
	
}
