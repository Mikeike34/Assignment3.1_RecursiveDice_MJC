import java.util.Random;

public class RecDieRoller {
	
	Random rand = new Random();
	int numRolls = 0;
	int tempRolls;
	int totalRolls =0;
	
	RecDieRoller(int runs){
		for(int i = 0; i <runs; i++) {
			System.out.println("\n========== run #"+ (i+1) + " ==========");
			roll();
			totalRolls = totalRolls + tempRolls;
		}//end for
		System.out.println("\n===== DATA =====\n");
		System.out.println("Total rolls made: "+totalRolls);
		System.out.println("The average amount of rolls it took to roll a 2: "+ (totalRolls/runs));
		
	}//end constructor
	
	public void roll() {
		int result = 1 + rand.nextInt(6);
		numRolls++;
		
		if(result == 2) {
		System.out.println(result);
		System.out.println("number of rolls: "+ numRolls);
		tempRolls = numRolls;
		numRolls = 0;
		}
		else {
			System.out.println(result);
			roll();
		}
		
	}//end roll

}//end class
