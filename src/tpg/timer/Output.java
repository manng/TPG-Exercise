package tpg.timer;

public class Output {
	
	private Object output;
	private long timeInMillis;
		
	public Output(Object output, long timeInMillis) {
		super();
		this.output = output;
		this.timeInMillis = timeInMillis;
	}
	
	public Object getOutput() {
		return output;
	}
	public void setOutput(Object output) {
		this.output = output;
	}
	public long getTimeInMillis() {
		return timeInMillis;
	}
	public void setTimeInMillis(long timeInMillis) {
		this.timeInMillis = timeInMillis;
	}

}
