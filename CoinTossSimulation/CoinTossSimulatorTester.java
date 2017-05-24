//Name: Lu Xie
//USC NetID: 2327394360
//CS 455 PA1
//Spring 2017

public class CoinTossSimulatorTester {

	public static void main(String[] args) {
		CoinTossSimulator simulation = new CoinTossSimulator();
		
		System.out.println("After construtor:");
		System.out.println("Number of trials [exp:0]: " + simulation.getNumTrials());
		System.out.println("Two-head tosses: " + simulation.getTwoHeads());
		System.out.println("Two-tail tosses: " + simulation.getTwoTails());
		System.out.println("One-head one-tail tosses: " + simulation.getHeadTails());
		boolean m = simulation.getNumTrials() == 0;
		System.out.println("Tosses add up correctly? " + m);
		System.out.println();
		
		System.out.println("After run(1):");
		simulation.run(1);
		System.out.println("Number of trials [exp:1]: " + simulation.getNumTrials());
		System.out.println("Two-head tosses: " + simulation.getTwoHeads());
		System.out.println("Two-tail tosses: " + simulation.getTwoTails());
		System.out.println("One-head one-tail tosses: " + simulation.getHeadTails());
		m = simulation.getNumTrials() == 1;
		System.out.println("Tosses add up correctly? " + m);
System.out.println();
		
		System.out.println("After run(10):");
		simulation.run(10);
		System.out.println("Number of trials [exp:11]: " + simulation.getNumTrials());
		System.out.println("Two-head tosses: " + simulation.getTwoHeads());
		System.out.println("Two-tail tosses: " + simulation.getTwoTails());
		System.out.println("One-head one-tail tosses: " + simulation.getHeadTails());
		m = simulation.getNumTrials() == 11;
		System.out.println("Tosses add up correctly? " + m);
		System.out.println();
		
		System.out.println("After run(100):");
		simulation.run(100);
		System.out.println("Number of trials [exp:111]: " + simulation.getNumTrials());
		System.out.println("Two-head tosses: " + simulation.getTwoHeads());
		System.out.println("Two-tail tosses: " + simulation.getTwoTails());
		System.out.println("One-head one-tail tosses: " + simulation.getHeadTails());
		m = simulation.getNumTrials() == 111;
		System.out.println("Tosses add up correctly? " + m);
		System.out.println();
		
		System.out.println("After reset:");
		simulation.reset();
		System.out.println("Number of trials [exp:0]: " + simulation.getNumTrials());
		System.out.println("Two-head tosses: " + simulation.getTwoHeads());
		System.out.println("Two-tail tosses: " + simulation.getTwoTails());
		System.out.println("One-head one-tail tosses: " + simulation.getHeadTails());
		m = simulation.getNumTrials() == 0;
		System.out.println("Tosses add up correctly? " + m);
		System.out.println();
		
		System.out.println("After run(1000):");
		simulation.run(1000);
		System.out.println("Number of trials [exp:1000]: " + simulation.getNumTrials());
		System.out.println("Two-head tosses: " + simulation.getTwoHeads());
		System.out.println("Two-tail tosses: " + simulation.getTwoTails());
		System.out.println("One-head one-tail tosses: " + simulation.getHeadTails());
		m = simulation.getNumTrials() == 1000;
		System.out.println("Tosses add up correctly? " + m);
		
	}

}
