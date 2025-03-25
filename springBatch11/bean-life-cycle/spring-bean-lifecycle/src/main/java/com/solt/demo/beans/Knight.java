package com.solt.demo.beans;

public class Knight {
	
	private Quest quest;
	public void setQuest(Quest quest) {
		this.quest = quest;
		
	}
	
	public void goQuest() {
		quest.embark();
	}

}
