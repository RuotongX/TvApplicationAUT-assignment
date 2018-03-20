package tva;

/**
 * this is the television object
 * 
 * @author RuotongXu ID:16935995
 */
public class Television {
	private int channel;
	private int volume;
	private boolean power;
	private final int maxChannel;

	/**
	 * this is a constructor for set up a new TV object
	 */
	public Television() {
		this.maxChannel = 10;
		this.power = false;
		this.channel = 1;
		this.volume = 0;
	}

	/**
	 * this is another constructor for set up a new TV object it take in a
	 * integer for the maxChannel but if it less then 2, it will set the
	 * maxChannel to 10
	 */
	public Television(int max) {
		if (max < 2) {
			this.maxChannel = 10;
		} else {
			this.maxChannel = max;
		}
	}

	/**
	 * setter to set the value to the private variable
	 * 
	 * @param volume
	 */
	public void setpower(boolean power) {
		this.power = power;
	}

	/**
	 * setter to set the value to the private variable
	 * 
	 * @param volume
	 */
	private void setvolume(int volume) {
		if (volume <= 100 && volume >= 0) {
			this.volume = volume;
		}
	}

	/**
	 * this will take in a integer for set up the current channel
	 * 
	 * @param channel
	 */
	public void setchannel(int channel) {
		if (channel <= maxChannel && channel >= 1) {
			this.channel = channel;
		} else {
			this.channel = 1;
		}
	}

	/**
	 * getter for get the value for private variable
	 * 
	 * @return
	 */
	public int getchannel() {
		return channel;
	}

	/**
	 * this will return the TV is on or off
	 * 
	 * @return
	 */
	public boolean getpower() {
		return power;
	}

	/**
	 * getter for get the value for private variable
	 * 
	 * @return
	 */
	public int getvolume() {
		return volume;
	}

	/**
	 * getter for get the value for private variable
	 * 
	 * @return
	 */
	public int getmaxChannel() {
		return maxChannel;
	}

	/**
	 * this will turn down the current volume by 1
	 */
	public void volumeDown() {
		this.setvolume(this.getvolume() - 1);
	}

	/**
	 * this will turn up the current volume by 1
	 */
	public void volumeUp() {
		this.setvolume(this.getvolume() + 1);
	}

	/**
	 * toString method to format the object toString output format : [Television
	 * is: on? NO. CHANNEL: channel/ maxChannal. VOLUME: volume %]
	 */
	public String toString() {
		if (getpower() == false) {
			if (getvolume() == 0) {
				return "[Television is: on? NO. CHANNEL: " + getchannel() + "/" + this.getmaxChannel() + ". VOLUME: "
						+ getvolume() + "%(muted)]";
			} else {
				return "[Television is: on? NO. CHANNEL: " + getchannel() + "/" + this.getmaxChannel() + ". VOLUME: "
						+ getvolume() + "%]";
			}
		} else {
			if (getvolume() == 0) {
				return "[Television is: on? YES. CHANNEL: " + getchannel() + "/" + this.getmaxChannel() + ". VOLUME: "
						+ getvolume() + "%(muted)]";
			} else {
				return "[Television is: on? YES. CHANNEL: " + getchannel() + "/" + this.getmaxChannel() + ". VOLUME: "
						+ getvolume() + "%]";
			}
		}

	}
}
