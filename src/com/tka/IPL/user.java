package com.tka.IPL;

import java.util.List;
import java.util.Scanner;

import com.tka.IPLService.IPLService;

public class user {


		public static void main(String[] args) {
	        IPLService service = new IPLService();
	        Scanner sc = new Scanner(System.in);

	        System.out.println("=== IPL Indian Team Stats ===");
	        System.out.println("1. Show All Players");
	        System.out.println("2. Search Player by Name");
	        System.out.println("3. Filter by Role");
	        System.out.print("Choose option: ");
	        int opt = sc.nextInt();
	        sc.nextLine(); // consume newline

	        switch (opt) {
	            case 1:
	                List<Player> all = service.getAllPlayers();
	                all.forEach(System.out::println);
	                break;

	            case 2:
	                System.out.print("Enter player name: ");
	                String name = sc.nextLine();
	                Player player = service.getPlayerByName(name);
	                System.out.println(player != null ? player : "Player not found.");
	                break;

	            case 3:
	                System.out.print("Enter role (Batsman/Bowler/All-Rounder): ");
	                String role = sc.nextLine();
	                List<Player> list = service.getPlayersByRole(role);
	                list.forEach(System.out::println);
	                break;

	            default:
	                System.out.println("Invalid option.");
	        }

	        sc.close();
	    }
	

	}


