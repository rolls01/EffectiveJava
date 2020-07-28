package pl.michalrola._2_CreatingAndDestroyingObjects.Item7;

public class Main {

  public static void main(String[] args) {

    StackMemoryLeak stackMemoryLeak = new StackMemoryLeak();

    System.out.println("Push objects");
    for (int i = 0; i < 17000; i++) {
      stackMemoryLeak.push(new Object());
    }

    System.out.println("Stack size: " + stackMemoryLeak.stackSize());
    System.out.println("Stack Object array size: " + stackMemoryLeak.stackElementLength());

    System.out.println("\nPop all objects");

    for (int i = 0; i < 17000; i++) {
      stackMemoryLeak.pop(); //we had to null out obsolete reference
    }

    System.out.println("Stack size: " + stackMemoryLeak.stackSize());
    System.out.println("Stack Object array size: " + stackMemoryLeak.stackElementLength());

  }

}
