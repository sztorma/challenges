package challenges.codingbat.warmup1;

public class SleepIn {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || weekday && vacation) {
            return true;
        }
        return false;
    }
}
