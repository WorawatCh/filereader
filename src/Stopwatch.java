
public class Stopwatch {
	private long start;
	private long stop;
	private boolean isRunning = false;
	private static final double NANOSECONDS = 1.0E-9;

	public void start() {
			start = System.nanoTime();
			isRunning = true;
	
	}

	public void stop() {
		if (isRunning = true) {
			stop = System.nanoTime();
			isRunning = false;
		}
	}

	public boolean isRunning() {
		return isRunning;
	}

	public double getElapsed() {
		if (isRunning = true) {
			return (System.nanoTime() - this.start)*NANOSECONDS;
		} else
			return (this.stop - this.start)*NANOSECONDS;
	}
}
