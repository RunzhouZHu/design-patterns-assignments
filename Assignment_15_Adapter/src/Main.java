public class Main {
    public static void main(String[] args) {

        CalendarToNewDateAdapter c = new CalendarToNewDateAdapter();

        c.setDay(200);

        System.out.println( "The date is set at: "+ c.getDay());

        c.advanceDays(50);
        System.out.println( "The date is advanced at: "+ c.getDay());

    }
}
