package pl.michalrola._4_ClassesAndInterfaces.Item16;

/**
 * Public class with exposed immutable fields - questionable
 */
public final class Time {

  private static final int HOURS_PER_DAY = 24;
  private static final int MINUTES_PER_HOUR = 60;

  public final int hour;
  public final int minute;

  public Time(int hour, int minute) {
    if (hour < 0 || hour > HOURS_PER_DAY) {
      throw new IllegalArgumentException("Hour: " + hour);
    }
    if (minute < 0 || minute > MINUTES_PER_HOUR) {
      throw new IllegalArgumentException("Minute: " + minute);
    }
    this.hour = hour;
    this.minute = minute;
  }

  public Time newInstance(Time time) {
    return new Time(time.hour, time.minute);
  }

  public static Time newInstance(int hour, int minute) {
    return new Time(hour, minute);
  }

  @Override
  public String toString() {
    return "Time{" +
        "hour=" + hour +
        ", minute=" + minute +
        '}';
  }
}
