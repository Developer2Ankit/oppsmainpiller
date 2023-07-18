package oops.designpattern.modal;

import opps.designpattern.ScoreAlgorithmBase;

public class SquareBaloon extends ScoreAlgorithmBase {

	@Override
	public int calculateScore(int taps,int multiplier) {
		return (taps*multiplier);
	}
}
