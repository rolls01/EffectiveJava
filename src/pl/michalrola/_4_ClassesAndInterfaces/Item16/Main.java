package pl.michalrola._4_ClassesAndInterfaces.Item16;

public class Main {

  public static void main(String[] args) {
    Time time = new Time(1, 34);
    System.out.println(time);

    Time copyTime = time.newInstance(time);
    System.out.println(copyTime);

    Time newTime = Time.newInstance(13, 59);
    System.out.println(newTime);

    //exposed fields directly by class - not recommended, questionable
    System.out.println("hour: " + newTime.hour + "; minute: " + newTime.minute);

  }

}
