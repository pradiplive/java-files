package com.collections;
import java.util.*;
class Player{
	String playerName;
	int strikeRate;
	float average;
	int jersyNo;
	public Player(String playerName, int strikeRate, float average, int jersyNo) {
		super();
		this.playerName = playerName;
		this.strikeRate = strikeRate;
		this.average = average;
		this.jersyNo = jersyNo;
	}
	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", strikeRate=" + strikeRate + ", average=" + average + ", jersyNo="
				+ jersyNo + "]";
	}
	
}
class IplTeam{
	
	String teamName;
	String teamCaptain;
	int trophies;
	LinkedList<Player> players;
	
	public IplTeam(String teamName, String teamCaptain, int trophies, LinkedList<Player> players) {
		super();
		this.teamName = teamName;
		this.teamCaptain = teamCaptain;
		this.trophies = trophies;
		this.players = players;
	}
	
	
}

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Team Name");
		String teamName = sc.next();
		System.out.println("Enter Team Caption Name");
		String teamCaption = sc.next();
		System.out.println("Enter Trofies");
		int trophies = sc.nextInt();
		System.out.println("Enter No of Players:");
		int no = sc.nextInt();
		
		LinkedList<Player> players = new LinkedList<>();
		
		for(int i=0; i<no; i++) {
			System.out.print("Enter PlayerName:");
			String playerName  = sc.next();
			System.out.print("Enter Strike Rate:");
			int playerStrikeRate  = sc.nextInt();
			System.out.print("Enter Average:");
			float playerAverage  = sc.nextFloat();
			System.out.print("Enter JersyNumber:");
			int playerJersyNumber  = sc.nextInt();
			
			Player pl = new Player(playerName, playerStrikeRate, playerAverage, playerJersyNumber);
			players.add(pl);
		}
		
		IplTeam team  = new IplTeam(teamName, teamCaption, trophies, players);
		System.out.println("Team Name: "+ team.teamName);
		System.out.println("Team caption: "+ team.teamCaptain);
		System.out.println("Team Trophies: "+ team.trophies);

		System.out.println("Team Players are:");
		
		for(Player player : team.players) {
			System.out.println(player);
		}

	}

}
