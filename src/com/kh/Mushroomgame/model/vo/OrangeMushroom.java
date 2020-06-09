package com.kh.Mushroomgame.model.vo;

public class OrangeMushroom extends Mushroom {

	public OrangeMushroom(int hp, int exp, String kinds) {
		super(hp, exp, kinds);
	}
	
	@Override
	public void sing() {
		System.out.println("오렌지버섯이 노래를 부릅니다. 오렌지 오렌지 오렌지 ~~ 버섯버섯 ㅎ");
	}
	
	public void angry() {
		System.out.println("오렌지버섯이 갑자기 화를 냅니다.");
	}
	
	public void hitOrangeMushroom() {
		System.out.println("오렌지버섯의 hp가 20 감소합니다.");
		super.setHp(super.getHp() -20);
		
		if(super.getHp() <= 0) {
			System.out.println("오렌지버섯은 떠났습니다... 경험치가 " + super.getExp() + "만큼 상승했습니다.");
		}
	}
}
