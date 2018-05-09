package com.haomins.www.switcherswitch;

class Levels {
	private int level_number;
	private String level_introduction;


	//===================================
	//The level class is just consist of the level # and its description
	public Levels(int level_number, String intro){
		level_introduction = intro;
		this.level_number = level_number;
		//everytime a new level created, the level number increase
	}
	//===================================

	public String getLevel_introduction() {
		return level_introduction;
	}

	public int getLevel_number() {
		return this.level_number;
	}

	public void setLevel_introduction(String level_introduction) {
		this.level_introduction = level_introduction;
	}
}
