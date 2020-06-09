package com.kh.Mushroomgame.model.vo;

public class BlueMushroom extends Mushroom {

	public BlueMushroom(int hp, int exp, String kinds) {
		super(hp, exp, kinds);
	}
	
	@Override
	public void sing() {
		System.out.println("파란버섯이 노래를 부릅니다. 파란 파란 ~~ ... 버섯버섯 ㅋㅋ");
	}
	
	public void punch() {
		System.out.println("파란버섯이 주먹을 날립니다~ 버섯 버섯 쨉 쨉!");
	}
	
	public void hitBlueMushroom() {
		System.out.println("파란버섯이 비명을 지르며 hp가 40만큼 감소합니다.");
		super.setHp(super.getHp() - 40);
		
		if(super.getHp() <= 0) {
			System.out.println("파란버섯이 쓰러집니다. 경험치가 " + super.getExp() + "만큼 상승했습니다.");
		}
	}
}
