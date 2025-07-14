package com.tka.IPLService;

import java.util.ArrayList;
import java.util.List;

import com.tka.IPL.Player;

public class IPLService {
	 playerList = new ArrayList<>();
     playerList.add(new Player(1, "Virat Kohli", "Batsman", "India", 6500));
     playerList.add(new Player(2, "Rohit Sharma", "Batsman", "India", 5600));
     playerList.add(new Player(3, "Hardik Pandya", "All-Rounder", "India", 1800));
     playerList.add(new Player(4, "Jasprit Bumrah", "Bowler", "India", 150));
 }

 public List<Player> getAllPlayers() {
     return playerList;
 }

 public Player getPlayerByName(String name) {
     return playerList.stream()
             .filter(p -> p.getName().equalsIgnoreCase(name))
             .findFirst()
             .orElse(null);
 }

 public List<Player> getPlayersByRole(String role) {
     List<Player> filtered = new ArrayList<>();
     for (Player p : playerList) {
         if (p.getRole().equalsIgnoreCase(role)) {
             filtered.add(p);
         }
     }
     return filtered;
 }
}

}
