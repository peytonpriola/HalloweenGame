package gameFeed;

import java.util.Scanner;


public class Timeline {

	public static void main(String[] args){
		
	String name;
	String rules;
	String costume;
	Friend one = new Friend();
	Friend two = new Friend();
	String answer;
	Scanner input = new Scanner(System.in);
	
	
	System.out.println("Welcome to The Halloween Adventure Game! Please enter your character name.");
	
	name = input.nextLine();
	Character player = new Character(name);
	
	rules = input.nextLine();
	player.getRules(rules);
	
	System.out.println("It's Halloween night so it's time to go trick-or-treating! What are you dressed up as?");
	costume = input.nextLine();
	
	System.out.println("Nice. You make a great "+ costume + "! Your friends " + one.getName() + " and " + two.getName() + " are dressed as " + one.getCostume() + " and " + two.getCostume() + ".");
	
	player.beginning();
	
	answer = input.nextLine();
	
	if (answer.equals("no") || answer.equals("No")) {
		System.out.println("You decide it's best to pass and continue to walk down the street.");
		player.fog();
	}
	
	
	player.walkToDoor();
	
	
	boolean door = true;
	
	while (door) {
		
	answer = input.nextLine();
	switch (answer) {
	case "a": 
		door = false;
		player.openDoor();
		answer = input.nextLine();
		switch(answer) {
			case "a":
				player.eatTreats();
				break;
			case "b":
				player.toKitchen();
				answer = input.nextLine();
				switch(answer) {
					case "a":
						player.chooseSugar();
						break;
					case "b":
						player.choosePaprika();
						break;
					case "c":
						player.chooseChoc();
						break;
				}
		}
		break;
	case "b":
		door = false;
		player.goAroundBack(name);
		break;
	case "c":
		player.leaveDoor();
		player.fog();
		player.walkToDoor();
		break;
	}
	}
	player.wakeUp();
	answer = input.nextLine();
	
	while (!answer.equals("3974")) {
		player.failUnlock();
		answer = input.nextLine();
	}
	
	player.unlockDoor();
	
	}
}

