//Name: Lu Xie
//USC NetID: 2327394360
//CS 455 PA1
//Spring 2017

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
/**
This component draws three bar shapes and put results of the trials under the bar.
*/
public class CoinSimComponent extends JComponent{
		
		private CoinTossSimulator simulation;
	
	/**
	 * create a graph with the result of the simulation
	 * @param simulateCoin  Coins Toss for simulation
	 */
	public CoinSimComponent(CoinTossSimulator simulateCoin){
		simulation = simulateCoin;
	}
	/**
	 * This method can draw three bars of three different results.
	 */
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		/**
		 * define the length of width and height of the bar.
		 */
		final int BAR_WIDTH = (int) (getWidth()*0.1);
		final int BAR_HEIGHT = (int) (getHeight()*0.8);
		/**
		 * define the distance between the bars and the width of the margin according to the size of the screen.
		 */
		int w = (getWidth() - 3*BAR_WIDTH) / 4;
		int vb = (getHeight() - BAR_HEIGHT) / 2;
		int bottom = getHeight() - (int) (vb*1.25);
		/**
		 * calculate the location of each bar of three results.
		 */
		int leftTwoHeads = w;
		int leftHeadTails = 2*w + BAR_WIDTH;
		int leftTwoTails = 3*w + 2*BAR_WIDTH;
		/**
		 * calculate the percent of three results.
		 */
		double scaleTwoHeads = (double) simulation.getTwoHeads() / simulation.getNumTrials();
		double scaleTwoTails = (double) simulation.getTwoTails() / simulation.getNumTrials();
		double scaleHeadTails = (double) simulation.getHeadTails() / simulation.getNumTrials();
		/**
		 * calculate the height of three results.
		 */
		int heightTwoHeads = (int) (BAR_HEIGHT * scaleTwoHeads);
		int heightTwoTails = (int) (BAR_HEIGHT * scaleTwoTails);
		int heightHeadTails = (int) (BAR_HEIGHT * scaleHeadTails);
		/**
		 * define the color of three results.
		 */
		Color colorTwoHeads = Color.RED;
		Color colorTwoTails = Color.BLUE;
		Color colorHeadTails = Color.YELLOW;
		/**
		 * define the label of three results.
		 */
		String result1 = simulation.getTwoHeads() + "";
		String result2 = simulation.getTwoTails() + "";
		String result3 = simulation.getHeadTails() + "";
		
		String percent1 = (int) Math.rint((scaleTwoHeads*100)) + "";
		String percent2 = (int) Math.rint((scaleTwoTails*100)) + "";
		String percent3 = (int) Math.rint((scaleHeadTails*100)) + "";
				
		String labelTwoHeads = "Two Heads: " + result1 + " (" + percent1 + "%)";
		String labelTwoTails = "Two Tails: " + result2 + " (" + percent2 +"%)";
		String labelHeadTails = "A Head and a Tail: " + result3 + " (" + percent3 + "%)";
		/**
		 * create three bars to draw
		 */
		Bar barTwoHeads = new Bar(bottom, leftTwoHeads, BAR_WIDTH, heightTwoHeads, scaleTwoHeads, colorTwoHeads, labelTwoHeads);
		Bar barTwoTails = new Bar(bottom, leftTwoTails, BAR_WIDTH, heightTwoTails, scaleTwoTails, colorTwoTails, labelTwoTails);
		Bar barHeadTails = new Bar(bottom, leftHeadTails, BAR_WIDTH, heightHeadTails, scaleHeadTails, colorHeadTails, labelHeadTails);		 

		barTwoHeads.draw(g2);
		barHeadTails.draw(g2);
		barTwoTails.draw(g2);
		}
}
