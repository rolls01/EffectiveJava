package pl.michalrola._2_CreatingAndDestroyingObjects.Item3;

public class Elvis {

  public static final Elvis INSTANCE = new Elvis();

  private Elvis() {
  }

  public static Elvis getInstance() {
    return INSTANCE;
  }

  public void leaveTheBuilding() {
  }

  private Object readResolve(){
    return INSTANCE;
  }

}
