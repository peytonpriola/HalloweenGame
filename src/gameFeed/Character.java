package gameFeed;

public class Character {

	String name;
	String rules;
	String costume;
	
	public Character (String name) {
		System.out.println(name + ", do you need me to explain the rules of the game? (yes/no)");
	}
	
	public void getRules(String answer) {
		if (answer.equals("yes") || answer.equals("Yes")) {
			System.out.println("****************************************************************************************************");
			System.out.println("This is an adventure game! You are trying to reach the end of the story alive.");
			System.out.println("There is more than one way to win the game. Follow the on-screen prompts to advance. Let's start!");
			System.out.println("****************************************************************************************************");
		} 
	}
	
	public void beginning() {
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.println("Your group walks down the street and sees a dimly lit house. It is painted black with gold rusty address numbers");
		System.out.println("nailed to house: 3974. The trees in front are wilted and an arrowhead fence wraps around the house. Do you want to");
		System.out.println("go ask for candy? (yes/no)");
		System.out.println("--------------------------------------------------------------------------------------------------------");
		
	}
	
	public void fog() {
		System.out.println("You notice a thick fog slowly starting to fill the area. You can't see very well.");
		System.out.println("You keep walking and walking only to end up BACK in front of the dim house. Wasn't that behind you....?");
		System.out.println("At this point your friends are begging to get out of the fog, so you start to head towards the house.");
		System.out.println("--------------------------------------------------------------------------------------------------------");
	}
	
	public void walkToDoor() {
		System.out.println("You walk up the pathway and creaky steps to the front door. You work up the courage to use the rusty knocker on the door.");
		System.out.println("KNOCK KNOCK.... after a few moments of silence... the door creaks open. You really want candy and you think there may be some");
		System.out.println("right inside the door. Your friends say they think they heard someone in the backyard. Do you want to go inside, go around");
		System.out.println("back, or leave? (a/b/c)");
		System.out.println("--------------------------------------------------------------------------------------------------------");
		
	}
	
	public void leaveDoor() {
		System.out.println("Your friends agree to head out. You walk down the steps and walkway, back to the sidewalk. Well... you try to.");
	}
	
	public void openDoor() {
		System.out.println("You push open the door and walk into the foyer. You see some interesting looking treats within reach. But then you");
		System.out.println("smell something AMAZING coming from the kitchen. You can see the lights are on in the kitchen, but you don't hear");
		System.out.println("anyone. Do you eat one of the treats or head to the kitchen? (a/b)");
		System.out.println("--------------------------------------------------------------------------------------------------------");
		
	}
	
	public void eatTreats() {
		System.out.println("You and your friends grab one of the treats and take a bite. Tasty!! But it has an awful after taste... you start");
		System.out.println("to feel a little odd. You start to say that you aren't feeling well, when everything goes fuzzy and you hit the floor.");
		System.out.println("--------------------------------------------------------------------------------------------------------");
	}
	
	public void toKitchen() {
		System.out.println("You walk towards the light from the kitchen. You walk into the door frame to see a ghost cooking! They look friendly?");
		System.out.println("Maybe. The ghost sees you and looks delighted. 'Hey you!', he says, 'can you help me with this recipe? It's missing something'.");
		System.out.println("You taste the batter and look around the room. You see sugar, paprika, and chocolate chips. What do you suggest? (a/b/c)");
		System.out.println("--------------------------------------------------------------------------------------------------------");
	}
	
	public void chooseSugar() {
		System.out.println("You say sugar. The ghost pours some sugar into the batter and tastes it. 'This is AWFUL', he says. 'You ruined");
		System.out.println("my recipe!!' Before you can run, he grabs a rolling pin and knocks you out.");
		System.out.println("--------------------------------------------------------------------------------------------------------");
	}
	
	public void chooseChoc() {
		System.out.println("You say chocolate chips. The ghost sprinkles some chocolate chips into the batter and tastes it. 'This is AWFUL', he says.");
		System.out.println("'You ruined my recipe!!' Before you can run, he grabs a rolling pin and knocks you out.");
		System.out.println("--------------------------------------------------------------------------------------------------------");
	}
	
	public void choosePaprika() {
		System.out.println("You say paprika. The ghost pours some paprika into the batter and tastes it. 'This is.. not bad', he says. 'You fixed");
		System.out.println("my recipe! It needed some spice.' He offers you and your friends some of the tasty treats and sends you out. The fog ");
		System.out.println("has cleared and you walk home. This was the best Halloween yet! Congrats, you survived!");
		System.out.println("                  ___\r\n" + 
				"               ___)__|_\r\n" + 
				"          .-*'          '*-,\r\n" + 
				"         /      /|   |\\     \\\r\n" + 
				"        ;      /_|   |_\\     ;\r\n" + 
				"        ;   |\\           /|  ;\r\n" + 
				"        ;   | ''--...--'' |  ;\r\n" + 
				"         \\  ''---.....--''  /\r\n" + 
				"          ''*-.,_______,.-*'");
		System.exit(0);
	}
	
	public void wakeUp() {
		System.out.println("You and your friends wake up in a plain room. There's no furniture. Your friend tries jiggling the doornob and finds it");
		System.out.println("to be locked. Upon closer inspection, you see it needs a 4 digit code to unlock. Do you know what it could be?");
		System.out.println("--------------------------------------------------------------------------------------------------------");
	}
	
	public void goAroundBack(String name) {
		System.out.println("You walk off the porch and around to the back of the house. You hear some faint voices, but don't see anyone. You");
		System.out.println("can't see very well, but you can make out some tombstones. You get close to one to read the inscription: ");
		System.out.println("'Here lies " + name + "'. You stop in your tracks. Before you have time to run, the ground underneath you crumbles ");
		System.out.println("and you are covered in dirt.");
		System.out.println("--------------------------------------------------------------------------------------------------------");
	}
	
	public void failUnlock() {
		System.out.println("You type in the code and twist the knob. The code doesn't work.. You're still stuck.");
	}
	
	public void unlockDoor() {
		System.out.println("You type in the code and twist the knob. It works!! You're free! You get out of the house and run all the way home. What a");
		System.out.println("great Halloween!");
		System.out.println("                  ___\r\n" + 
				"               ___)__|_\r\n" + 
				"          .-*'          '*-,\r\n" + 
				"         /      /|   |\\     \\\r\n" + 
				"        ;      /_|   |_\\     ;\r\n" + 
				"        ;   |\\           /|  ;\r\n" + 
				"        ;   | ''--...--'' |  ;\r\n" + 
				"         \\  ''---.....--''  /\r\n" + 
				"          ''*-.,_______,.-*'");
		System.exit(0);
	}
	
}
