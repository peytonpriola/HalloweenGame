package gameFeed;

import java.util.Random;

public class Friend {
	
	String[] costume = {"a firefighter","Bob the Builder", "Cinderella", "Superman", "a fairy", "an artist", "a teacher", "an astronaut", "a robot", "an alien", "a basketball player"};
	String[] name = {"Jane", "Bob", "Joe", "Anna", "Steve", "Jerry", "Andrew"};

	
	public Friend () {
		
	}
	

	public String getCostume() {
		Random num = new Random();
	    int randomNumber = num.nextInt(costume.length);
	    return costume[randomNumber];
		}
	public String getName() {
		Random num = new Random();
	    int randomNumber = num.nextInt(name.length);
	    return name[randomNumber];
		
	}

	
	

}
