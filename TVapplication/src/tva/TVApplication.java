package tva;

import java.util.Scanner;

/**
 * The main class for the Tv application, this will ID user's input and make
 * selection for the methods
 * 
 * @author RuotongXu ID:16935995
 */
public class TVApplication {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int invalue;

		RemoteControl rctl = new RemoteControl();
		do {// looping until user input "6"
			System.out.println(rctl);
			System.out.println("" + "\r\nPress a Button on the Remote Control"
					+ "\r\n1. Power 2. Volume Up by 50% 3. Volume Down by 50% 4. Channel Up 5. Channel Down 6. Go outside");
			invalue = sc.nextInt();
			if (invalue == 1) {
				rctl.powerButton();
				;
				System.out.println("Power Button Pressed");
			}
			if (invalue == 2) {
				rctl.volumeUpByHalf();
				System.out.println("Volume Up by 50% Button Pressed");
			}
			if (invalue == 3) {
				rctl.volumeDownByHalf();
				System.out.println("Volume Down by 50% Button Pressed");
			}
			if (invalue == 4) {
				rctl.channelUpButton();
				System.out.println("Channel Up Button Pressed");
			}
			if (invalue == 5) {
				rctl.channelDownButton();
				System.out.println("Channel down Button Pressed");
			}
			if (invalue == 6) {
				rctl.powerButton();
				sc.close(); // before program stop, close the scanner
				return;// user inputed "6", program stop
			}
		} while (true);
	}
}
