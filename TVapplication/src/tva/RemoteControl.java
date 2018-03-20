package tva;

/**
 * This class contains the methods which can controls tv.
 * 
 * @author RuotongXu ID:16935995
 */
public class RemoteControl {

	private Television tv;

	/**
	 * This is the constructor for the RemoteControl class. It will make a new
	 * Television object
	 */
	public RemoteControl() {
		this.tv = new Television();
	}

	/**
	 * this is the method for turning on/off the tv object
	 */
	public void powerButton() {
		if (tv.getpower() == false) {
			tv.setpower(true);
		} else {
			tv.setpower(false);
		}
	}

	/**
	 * this is the method for turning the tv object channel down
	 */
	public void channelDownButton() {
		if (tv.getpower() == true) {
			if (tv.getchannel() == 1) {
				tv.setchannel(tv.getmaxChannel());
			} else {
				tv.setchannel(tv.getchannel() - 1);
			}
		} else {
			tv.setchannel(tv.getchannel());
		}
	}

	/**
	 * this is the method for turning the tv object channel up
	 */
	public void channelUpButton() {
		if (tv.getpower() == true) {
			if (tv.getchannel() == tv.getmaxChannel()) {
				tv.setchannel(1);
			} else {
				tv.setchannel(tv.getchannel() + 1);
			}
		} else {
			tv.setchannel(tv.getchannel());
		}
	}

	/**
	 * this is the method for turning the tv object volume down by 50
	 */
	public void volumeDownByHalf() {
		if (tv.getpower() == true) {
			for (int a = 0; a < 50; a++)// the loop will reduce the volume by 1
										// for 50 times
			{
				tv.volumeDown();
			}
		}
	}

	/**
	 * this is the method for turning the tv object volume up by 50
	 */
	public void volumeUpByHalf() {
		if (tv.getpower() == true) {
			for (int a = 0; a < 50; a++) // the loop will reduce the volume by 1
											// for 50 times
			{
				tv.volumeUp();
			}
		}
	}

	/**
	 * toString method for return the toString method of tv object
	 */
	public String toString() {
		return this.tv.toString();
	}

}
