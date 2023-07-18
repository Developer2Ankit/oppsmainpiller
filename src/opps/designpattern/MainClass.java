package opps.designpattern;

import oops.designpattern.modal.Baloon;
import oops.designpattern.modal.Clowns;
import oops.designpattern.modal.SquareBaloon;

public class MainClass {

	public static void main(String args[]) {
	
System.out.println("Hello");
ScoreBoard scoreBoard=new ScoreBoard();
System.out.println("Ballon Score :");
scoreBoard.scoreAlgorithmBase=new Baloon();
scoreBoard.showScore(10, 20);
System.out.print("Clowns Score :");
scoreBoard.scoreAlgorithmBase=new Clowns();
scoreBoard.showScore(10, 20);
System.out.print("Square Score :");
scoreBoard.scoreAlgorithmBase=new SquareBaloon();
scoreBoard.showScore(10, 20);
	}

}
