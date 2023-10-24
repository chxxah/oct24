package team;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Race {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] playerlist = new String[] { "준식", "상민", "상화", "승현", "종휘", "수진", "화진", "지은", "지윤", "채아" }; // 플레이어 명단 10명

		int a = ((int) (Math.random() * 8) + 3); // 랜덤 몇명뽑을지 3~10

		String[] players = new String[a];

		for (int i = 0; i < a; i++) { // 중복제거 & 값

			int ran = (int) (Math.random() * 10);

			players[i] = playerlist[ran];

			for (int j = 0; j < i; j++) {

				if (players[i] == players[j]) {
					i--;
				}
			}
		}
		System.out.println("랜덤으로 뽑힌 플레이어 : " + Arrays.toString(players));
		
		
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for (int i = 0; i < players.length; i++) {
			map.put(players[i], i); // (A,0)(B,1) (C,2)... }
		}
		
		String[] callings = new String[5];
		
		for (int i = 0; i < callings.length; i++) {
			System.out.println("이름을 불러주세요 : ");

			callings[i] = sc.nextLine();
			int num = map.get(callings[i]);

			if (num > 0) {
				String temp = players[num - 1];
				players[num - 1] = players[num];
				players[num] = temp;

				map.put(players[num - 1], num - 1);
				map.put(players[num], num);
			}
			System.out.println(Arrays.toString(players));
		}
		
		
		

		for (int i = 0; i < players.length; i++) {
			System.out.print((i+1)+"등 : " + players[i]+ " || ");
		}
		
		sc.close();
	}

}
