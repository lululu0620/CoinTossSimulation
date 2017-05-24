//Name: Lu Xie
//USC NetID: 2327394360
//CS 455 PA1
//Spring 2017

/**
* class CoinTossSimulator
* 
* Simulates trials of tossing two coins and allows the user to access the
* cumulative results.
* 
* NOTE: we have provided the public interface for this class.  Do not change
* the public interface.  You can add private instance variables, constants, 
* and private methods to the class.  You will also be completing the 
* implementation of the methods given. 
* 
* Invariant: getNumTrials() = getTwoHeads() + getTwoTails() + getHeadTails()
* 
*/
import java.util.Random;

public class CoinTossSimulator {
	private int theNum;
	private int twoHeads;
	private int twoTails;
	private int headtails;
	private Random generator;


/**
   Creates a coin toss simulator with no trials done yet.
*/
	public CoinTossSimulator() {
		theNum = 0;
		twoHeads = 0;
		twoTails = 0;
		headtails = 0;
		generator = new Random();
	}


/**
   Runs the simulation for numTrials more trials. Multiple calls to this
   without a reset() between them add these trials to the simulation
   already completed.
   @param numTrials  number of trials to for simulation; must be >= 1
 */
	public void run(int numTrials) {
		theNum += numTrials;
		for(int i=1; i <= numTrials; i++){
			int a = generator.nextInt(2);
		    int b = generator.nextInt(2);
			if (a == 1 && b == 1){
				twoHeads += 1;
			}
			else if (a == 0 && b == 0){
				twoTails += 1;
			}else{
				headtails += 1;
			}
		}
	}


/**
   Get number of trials performed since last reset.
*/
	public int getNumTrials() {
		return theNum; // DUMMY CODE TO GET IT TO COMPILE
	}


/**
   Get number of trials that came up two heads since last reset.
*/
	public int getTwoHeads() {
		return twoHeads; // DUMMY CODE TO GET IT TO COMPILE
	}


/**
  Get number of trials that came up two tails since last reset.
*/  
	public int getTwoTails() {
		return twoTails; // DUMMY CODE TO GET IT TO COMPILE
	}


/**
  Get number of trials that came up one head and one tail since last reset.
*/
	public int getHeadTails() {
		return headtails; // DUMMY CODE TO GET IT TO COMPILE
	}


/**
   Resets the simulation, so that subsequent runs start from 0 trials done.
 */
	public void reset() {
		theNum = 0;
		twoHeads = 0;
		twoTails = 0;
		headtails = 0;
	}

}