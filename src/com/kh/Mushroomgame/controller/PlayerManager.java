package com.kh.Mushroomgame.controller;

import com.kh.Mushroomgame.model.vo.BlueMushroom;
import com.kh.Mushroomgame.model.vo.Mushroom;
import com.kh.Mushroomgame.model.vo.OrangeMushroom;
import com.kh.Mushroomgame.model.vo.Player;

public class PlayerManager {
	public void startPlayer(String name) {
		Player p = new Player(name);
		
		System.out.println(p.getName() + "님께서 등장하셨습니다.");
		
		//오렌지버섯 등장
		OrangeMushroom o1 = new OrangeMushroom(300, 100, "오렌지독버섯");
		
		o1.sing();
		
		//오렌지 버섯 공격
		if(o1 instanceof OrangeMushroom) {
			((OrangeMushroom) o1).hitOrangeMushroom();
		}
		
		for(int i = o1.getHp(); i > 0; i -= 10) {
			if(o1 instanceof OrangeMushroom) {
				((OrangeMushroom) o1).hitOrangeMushroom();
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		//플레이어 경험치 증가
		p.setExp(p.getExp() + o1.getExp());
		
		//플레이어 정보 확인
		System.out.println(p);
		
		Mushroom A1 = new BlueMushroom(1000, 1000, "파란독버섯");
		
		A1.sing();
		
		for(int i = A1.getHp(); i > 0; i -= 50) {
			if(A1 instanceof BlueMushroom) {
				((BlueMushroom) A1).hitBlueMushroom();
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		p.setExp(p.getExp() + A1.getExp());
		
		System.out.println(p);
	}
}