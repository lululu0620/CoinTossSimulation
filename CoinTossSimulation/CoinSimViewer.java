//Name: Lu Xie
//USC NetID: 2327394360
//CS 455 PA1
//Spring 2017

import java.util.Scanner;
import javax.swing.JFrame;

public class CoinSimViewer {
	/**
	 * create a CoinTossSimulator and run it to get the results.
	 * the user can input the number of trials and the program will judge whether it is legal or not.
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of trials: ");
		int n = in.nextInt();
		
		while(n <= 0){
			System.out.println("ERROR: Number entered must be greater than 0.");
			System.out.print("Enter number of trials: ");
			n = in.nextInt();
		}
		
		CoinTossSimulator simulation = new CoinTossSimulator();
		simulation.run(n);
		
		JFrame frame = new JFrame();
		frame.setSize(800,500);
		frame.setTitle("CoinSim"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CoinSimComponent component = new CoinSimComponent(simulation); 
		frame.add(component);
		frame.setVisible(true); 

	}
	
}


