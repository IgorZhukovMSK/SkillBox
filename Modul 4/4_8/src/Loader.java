import com.sun.source.tree.ContinueTree;

import java.text.BreakIterator;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static java.awt.Frame.NORMAL;

public class Loader {
    private static int counter;

    public static long daysBetween(Date startDate, Date endDate) {
        return 0;
    }

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        Calendar cal_obj1 = Calendar.getInstance(); // текущая дата
        Calendar cal_obj2 = Calendar.getInstance(); // дата рождения


        cal_obj2.set(1978, 06, 28);

        DateFormat df = new SimpleDateFormat("dd MM yyy - EEEE");

        System.out.println("Дата рожения: " + df.format(cal_obj2.getTime()));

        System.out.println("Дата сегодня: " + df.format(new Date()));

        System.out.println("Result : " + cal_obj1.after(cal_obj2));

        // прибавляем один год к году рождения

        long daysBetween = 0;
        while (cal_obj1.after(cal_obj2)) {
            cal_obj2.add(Calendar.YEAR, 1);
            daysBetween++;
            System.out.println(df.format(cal_obj2.getTime()));
        }
        return;
    }
}


