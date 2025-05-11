package enums;

import java.sql.SQLOutput;

public class enums {
    public static void main(String[] args){

        Day day= Day.SUNDAY;
        //System.out.println(day);
        //System.out.println(day.getDayNumber());
        switch(day){
            case MONDAY,
                 TUESDAY,
                 WEDNESDAY,
                 THURSDAY,
                 FRIDAY -> System.out.println("It is a weekday");
            case SATURDAY,SUNDAY-> System.out.println("It is the weekend");

        }

    }
}

