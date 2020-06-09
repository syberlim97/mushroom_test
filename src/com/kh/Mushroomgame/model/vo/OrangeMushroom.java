package com.kh.Mushroomgame.model.vo;

public class OrangeMushroom extends Mushroom {

	public OrangeMushroom(int hp, int exp, String kinds) {
		super(hp, exp, kinds);
	}
	
	@Override
	public void sing() {
		System.out.println("������������ �뷡�� �θ��ϴ�. ������ ������ ������ ~~ �������� ��");
	}
	
	public void angry() {
		System.out.println("������������ ���ڱ� ȭ�� ���ϴ�.");
	}
	
	public void hitOrangeMushroom() {
		System.out.println("������������ hp�� 20 �����մϴ�.");
		super.setHp(super.getHp() -20);
		
		if(super.getHp() <= 0) {
			System.out.println("������������ �������ϴ�... ����ġ�� " + super.getExp() + "��ŭ ����߽��ϴ�.");
		}
	}
}
