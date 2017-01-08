package date;

public interface BirthdayCalculator<T> {

    T parseDate(String str);

    String printMonthAndDay(T date);

    void isAnniversaryToday(T date);

    int calculateAgeInYears(T birthday);

    int calculateDaysToNextAnniversary(T date);

}
