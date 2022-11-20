package AULA6.ClassesUtilitarias.DatasJava;

import java.util.Date;

public class DateHora {

    public static void main(String[] args) {
        Date date = new Date(1662377332564L);
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
    }
}
