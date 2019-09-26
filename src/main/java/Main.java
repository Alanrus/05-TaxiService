public class Main {
    public static void main(String[] args) {
        Order orderFirst = new Order();
        int sumOrderAll = orderFirst.sumOrder(10_456);
        int sumDiscountAll = orderFirst.sumDiscauntAll();
        sumOrderAll = sumOrderAll - sumDiscountAll;
        int sumOrderAllRub = sumOrderAll / 100;
        int sumOrderAllCop = sumOrderAll - sumOrderAllRub * 100;
        int sumDiscountAllRub = sumDiscountAll / 100;
        int sumDiscountAllCop = sumDiscountAll - sumDiscountAllRub * 100;
        System.out.println("Стоимость Вашей поездки: " + sumOrderAllRub + " руб. " + sumOrderAllCop + " коп.");
        System.out.println("Сумма скидки " + sumDiscountAllRub + " руб. " + sumDiscountAllCop + " коп.");
    }
}
