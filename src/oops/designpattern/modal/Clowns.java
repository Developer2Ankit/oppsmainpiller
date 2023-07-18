package oops.designpattern.modal;

import opps.designpattern.ScoreAlgorithmBase;

public class Clowns extends ScoreAlgorithmBase{

	@Override
	public int calculateScore(int taps,int multiplier) {
		return (taps*multiplier)-10;
	}
}
