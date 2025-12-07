package homework.Task21;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("d MMMM yyyy",new Locale("ru"));
        String result=currentDateTime.format(dateTimeFormatter);
        System.out.println(result);

        LocalDateTime currentDateTime1 = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter1=DateTimeFormatter.ofPattern("d MMMM yyyy, hh:mm:ss a",new Locale("ru"));
        String result1=currentDateTime1.format(dateTimeFormatter1);
        System.out.println(result1);

        String input = "2023-03-19 : 10:12:24 AM";
        DateTimeFormatter dateTimeFormatter2=DateTimeFormatter.ofPattern("yyyy-MM-dd : hh:mm:ss a",new Locale("ru"));
        LocalDateTime result3=LocalDateTime.parse(input,dateTimeFormatter2);
        System.out.println(result3);

        String input1 ="пн 20.03.23 г. время: 15:07:28";
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        DateTimeFormatter formatter = builder
                .parseCaseInsensitive()
                .appendPattern("EEE dd.MM.yy")
                .appendLiteral(" г.")
                .appendLiteral(" время: ")
                .appendPattern("HH:mm:ss")
                .toFormatter(new Locale("ru", "RU"));
        LocalDateTime result4=LocalDateTime.parse(input1,formatter);
        System.out.println(result4);
    }
}
