package AULA6.ClassesUtilitarias.DatasJava;

import java.util.Calendar;
import java.util.Date;

public class CalendarHora {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
      if(c.getFirstDayOfWeek() == Calendar.SUNDAY){
          System.out.println("Primeiro dia da Semana");
      }
        Date date = c.getTime();
        System.out.println(date);
        System.out.println(Calendar.DAY_OF_WEEK);
        System.out.println(Calendar.DAY_OF_MONTH);
        System.out.println(Calendar.DAY_OF_YEAR);
        System.out.println(Calendar.DAY_OF_WEEK_IN_MONTH);

    }
}
