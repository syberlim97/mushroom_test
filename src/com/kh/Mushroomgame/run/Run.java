package com.kh.Mushroomgame.run;

import java.util.Scanner;

import com.kh.Mushroomgame.controller.PlayerManager;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PlayerManager pm = new PlayerManager();
		
		System.out.println("아이디를 입력하세요  : ");
		String name = sc.nextLine();
		
		pm.startPlayer(name);
	}
}