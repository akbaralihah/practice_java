package base;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatesFormatter {
    public static void main(String[] args) {
        Date currentDate = new Date();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE");
        String dayOfWeek = simpleDateFormat.format(currentDate);
        System.out.println("Day: " + dayOfWeek);

        simpleDateFormat.applyPattern("dd MMMM");
        String dayOfMonth = simpleDateFormat.format(currentDate);
        System.out.println("Current month and date: " + dayOfMonth);
    }
}
