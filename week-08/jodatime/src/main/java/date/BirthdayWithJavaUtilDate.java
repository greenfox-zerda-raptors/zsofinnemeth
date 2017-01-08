package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class BirthdayWithJavaUtilDate implements BirthdayCalculator<Date> {

    @Override
    public Date parseDate(String str) {
        // TODO - return with the parsed date; format is: yyyy-MM-dd
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date= df.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    @Override
    public String printMonthAndDay(Date date) {
        // TODO - return the date formatted: month & day (MM. dd.)
        SimpleDateFormat df = new SimpleDateFormat("MM. dd.");
        return df.format(date);
    }

        @Override
        public boolean isAnniversaryToday(Date date) {
            // TODO - return with true if today is the same month+day as date
            SimpleDateFormat df = new SimpleDateFormat("MM. dd.");
            Date today = new Date();
            if ((df.format(date)) == (df.format(today))) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public int calculateAgeInYears(Date birthday) {
            // TODO - return how many years age the input date 'birthday' was
            Date today = Calendar.getInstance().getTime();
            int year1 = today.getYear();
            int year2 = birthday.getYear();
            int ageInYears = year1 - year2;
            int month1 = today.getMonth();
            int month2 = birthday.getMonth();
            if (month1 < month2) {
                ageInYears--;
            }
            if (month1 == month2) {
                Calendar cal = Calendar.getInstance();
                cal.setTime(today);
                int day1 = cal.get(Calendar.DAY_OF_MONTH);
                cal.setTime(birthday);
                int day2 = cal.get(Calendar.DAY_OF_MONTH);
                if (day1 < day2) {
                    ageInYears--;
                }
            }
            return ageInYears;
        }

        @Override
        public int calculateDaysToNextAnniversary(Date date) {
            // TODO - the number of days remaining to the next anniversary of 'date' (e.g. if tomorrow, return 1)
//            SimpleDateFormat df = new SimpleDateFormat("YYYY. MM. dd.");
//            Date today = Calendar.getInstance().getTime();
//            Date birthday = Calendar.getInstance().getTime();
//            int month1 = today.getMonth();
//            int month2 = birthday.getMonth();
//            int day1 = today.getDay();
//            int day2 = birthday.getDay();
//            int daysLeft = ((month2 - month1) +(day2 - day1));
//            if (month1 > month2) {
//                daysLeft = 0;
//            }
            return 4;
        }


    public static void main(String[] args) {
        new BirthdayWithJavaUtilDate().run();
    }

    private void run() {

        print("Birthday with java.util.Date.");
        String birthdayStr = readInput("What day were you born (yyyy-mm-dd)?");

        Date birthdayDate = parseDate(birthdayStr);
        print("Your birthday: " + printMonthAndDay(birthdayDate));

        if (isAnniversaryToday(birthdayDate)) {
            int ageInYears = calculateAgeInYears(birthdayDate);
            print("Congratulations! Today is your " + ageInYears + "th birthday!");
        } else {
            int daysLeft = calculateDaysToNextAnniversary(birthdayDate);
            print("You have to wait only " + daysLeft + " days for your next birthday.");
        }
    }

    private void print(String line) {
        System.out.println(line);
    }

    private String readInput(String message) {
        System.out.print(message + ": ");
        return input.nextLine();
    }

    private final Scanner input = new Scanner(System.in, "UTF-8");

}