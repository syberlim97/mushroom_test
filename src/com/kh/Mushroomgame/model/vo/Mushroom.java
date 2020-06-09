package com.kh.Mushroomgame.model.vo;

public abstract class Mushroom {
	private int hp;
	private int exp;
	private String kinds;
	
	public Mushroom() {}
	
	public Mushroom(int hp, int exp, String kinds) {
		this.hp = hp;
		this.exp = exp;
		this.kinds = kinds;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String getKinds() {
		return kinds;
	}

	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
	
	public abstract void sing();
}
