package pl.michalrola._2_CreatingAndDestroyingObjects.Item8;

import java.lang.ref.Cleaner;
import java.lang.ref.Cleaner.Cleanable;

public class Room implements AutoCloseable {

  private static final Cleaner cleaner = Cleaner.create();

  private static class State implements Runnable {

    int numJunkPiles;

    State(int numJunkPiles) {
      this.numJunkPiles = numJunkPiles;
    }

    @Override
    public void run() {
      System.out.println("Cleaning room");
      numJunkPiles = 0;
    }

  }

  private final State state;

  private final Cleaner.Cleanable cleanable;

  public Room(int numJunkPiles) {
    this.state = new State(numJunkPiles);
    this.cleanable = cleaner.register(this, state);
  }

  @Override
  public void close() throws Exception {
    cleanable.clean();
  }
}
