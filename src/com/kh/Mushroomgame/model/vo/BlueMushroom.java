package com.kh.Mushroomgame.model.vo;

public class BlueMushroom extends Mushroom {

	public BlueMushroom(int hp, int exp, String kinds) {
		super(hp, exp, kinds);
	}
	
	@Override
	public void sing() {
		System.out.println("�Ķ������� �뷡�� �θ��ϴ�. �Ķ� �Ķ� ~~ ... �������� ����");
	}
	
	public void punch() {
		System.out.println("�Ķ������� �ָ��� �����ϴ�~ ���� ���� µ µ!");
	}
	
	public void hitBlueMushroom() {
		System.out.println("�Ķ������� ����� ������ hp�� 40��ŭ �����մϴ�.");
		super.setHp(super.getHp() - 40);
		
		if(super.getHp() <= 0) {
			System.out.println("�Ķ������� �������ϴ�. ����ġ�� " + super.getExp() + "��ŭ ����߽��ϴ�.");
		}
	}
}
