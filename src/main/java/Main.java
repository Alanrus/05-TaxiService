public class Main {
    public static void main(String[] args) {
        Order orderFirst = new Order();
        int totalPrice = orderFirst.calculatePrice(50_456);
        System.out.println("Стоимость Вашей поездки: " + totalPrice / 100 + " руб. " + (totalPrice - (totalPrice / 100 * 100)) + " коп.");


    }
}
