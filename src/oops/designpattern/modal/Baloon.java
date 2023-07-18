package oops.designpattern.modal;

import opps.designpattern.ScoreAlgorithmBase;

public class Baloon extends ScoreAlgorithmBase {

	@Override
	public int calculateScore(int taps, int multiplier) {
		// TODO Auto-generated method stub
		return (taps*multiplier)-20;
	}

}
