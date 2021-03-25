package hiding;

public class MyDateTest {

    public static void main(String[] args) {

        MyDate date = new MyDate();

        date.setYear(2021);
        date.setMonth(3);
        date.setDay(24);

        date.showDate();

        MyDate date2 = new MyDate();
        date2.setYear(2020);
    }

}
