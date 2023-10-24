package team;

import java.util.Arrays;
import java.util.HashMap;

public class Race01 {
   

   public static void main(String[] args) {
      
      String[] players = new String[] { "A", "B", "C", "D"};
      String[] callings = new String[] { "B","D","D","C" };
 
      HashMap<String, Integer> map = new HashMap<>();

      for (int i = 0; i < players.length; i++) {
         map.put(players[i], i);   // (A,0) (B,1) (C,2)...
      }

      for (int i = 0; i < callings.length; i++) {
          int num = map.get(callings[i]);
          
          if (num > 0) {
              String temp = players[num - 1];
              players[num - 1] = players[num];
              players[num] = temp;

              map.put(players[num - 1], num - 1);
              map.put(players[num], num);
          }
      }
      

      System.out.println(Arrays.toString(players));
   }

}

