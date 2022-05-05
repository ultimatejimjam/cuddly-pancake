import java.util.LinkedList;

class Show {

	String title;
	double broadcastTime;
	double avgEpLength;
	boolean isSpecial;
	
	public Show(String title, double broadcastTime, double avgEpLength, boolean isSpecial)
	{
		this.title = title;
		this.broadcastTime = broadcastTime;
		this.avgEpLength = avgEpLength;
		this.isSpecial = isSpecial;
	}
	
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof Show)) {
			return false;
		}
		Show other_item = (Show) other;
        if (this.title == other_item.title) {
        	return (this.broadcastTime == other_item.broadcastTime);
        	}
        else {
        	return false;
        }
	}
	
}