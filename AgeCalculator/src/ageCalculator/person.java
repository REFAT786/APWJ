package ageCalculator;

import java.util.ArrayList;

public class person {
    public static void findAge(int current_date, int current_month, int current_year, int birth_date, int birth_month, int birth_year){
        ArrayList<Integer> month=new ArrayList<Integer>();
        month.add(31);
        month.add(28);
        month.add(31);
        month.add(30);
        month.add(31);
        month.add(30);
        month.add(31);
        month.add(31);
        month.add(30);
        month.add(31);
        month.add(30);
        month.add(31);

        if(birth_month>current_month){
            current_year=current_year-1;
            current_month=current_month+12;

        }
        int calculated_date =current_date-birth_date;
        int calculated_month=current_month-birth_month;
        int calculated_year=current_year-birth_year;
        System.out.println("current date : "+current_date+"/"+current_month+"/"+current_year);
        System.out.println("Birth date : "+birth_date+"/"+birth_month+"/"+birth_year);
        System.out.print("present age -> ");
        System.out.println("years : "+calculated_year+" Months : "+calculated_month+" Days : "+calculated_date);

    }


}
