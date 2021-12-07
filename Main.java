public class Main {
    public static void main(String[] args) {
        // цена за билет
        int ticketprice = 665;
        // стоимость 1 бонусной мили
        int bonusprice = 20;
        // стоимость билета / стоимость 1 бонусной мили = бонусные мили
        int bonus = ticketprice / bonusprice;
        System.out.println(bonus);
    }
}