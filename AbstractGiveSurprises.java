package P2;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public abstract class AbstractGiveSurprises {
    // TO DO: define fields here
    private IBag bag;
    int waitTime;

    public AbstractGiveSurprises(String type, int waitTime) {
        // TO DO:
        this.bag = BagFactory.getInstance().makeBag(type);
        this.waitTime = waitTime;
    }

    public void put(ISurprise newSurprise) {
        // TO DO:
        this.bag.put(newSurprise);

    }

    public void put(IBag surprises) {
        // TO DO:
        this.bag.put(surprises);
    }

    public void give() {
        // TO DO:
        if (!isEmpty()) {
            ISurprise surprise = bag.takeOut();
            surprise.enjoy();
            giveWithPassion();
        }

    }

    public void giveAll() {
        // TO DO:
        while (!isEmpty()) {
            // Sleep for X seconds - code snippet
            try {
                give();
                TimeUnit.SECONDS.sleep(waitTime); // number of seconds to sleep
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }

    public boolean isEmpty() {
        // TO DO:
        return this.bag.isEmpty();
    }

    abstract void giveWithPassion();
}
