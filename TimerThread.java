package quiz;
// Thread handles countdown timer
public class TimerThread extends Thread {
    private int seconds; // countdown timer in seconds
    public volatile boolean stop = false; // signals to stop timer
    public volatile boolean outOfTime = false; // signals when timer runs out
// set initial seconds
    public TimerThread(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public void run() {
        try {
            // loop runs until time is up
            while (seconds > 0 && !stop) {
                Thread.sleep(1000); //
                seconds--;
            }
// checks when timer is up
            if (!stop) {
                outOfTime = true;
                System.out.println("\n⏳ Time's up!");
            }
        } catch (InterruptedException e) {
            // handles thread errors
            e.printStackTrace();
        }
    }
}
