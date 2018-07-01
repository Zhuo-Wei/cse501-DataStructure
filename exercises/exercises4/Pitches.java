package exercises4;

import cse131.ArgsProcessor;

public class Pitches {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		// encoding has 0 as concert A
		//    1 would be Bb, just above A
		//   -1 would be Ab, just below A
		int pitch= ap.nextInt("What picth?");
		double frequency= 440.0* Math.pow(2, pitch/12.0);
	}

}
