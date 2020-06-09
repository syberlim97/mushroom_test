package com.kh.Mushroomgame.model.vo;

public class Player {
	private String name;
	private int exp = 0;
	
	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
	@Override
	public String toString() {
		return name + "���� ���� ����ġ��" + exp +"�Դϴ�.";
	}
}