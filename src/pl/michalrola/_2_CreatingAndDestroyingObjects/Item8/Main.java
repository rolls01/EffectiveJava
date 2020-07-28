package pl.michalrola._2_CreatingAndDestroyingObjects.Item8;

public class Main {

  public static void main(String[] args) {

    try (Room myRoom = new Room(7)) {
      System.out.println("Goodbye");
    } catch (Exception e) {
      e.printStackTrace();
    }

    //wont clear room, cleaning is ran by GC - not visible here
    new Room(99);
    System.out.println("Peace out");

    //sometimes will be cleaned by GC but not guarantee
    System.gc();
  }

}
