
public class LeapYear {

    public boolean isLeapYear(int year) {

        // divisible by 4
        // cannot be divisible 100 unless it is divisible by 400

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

}