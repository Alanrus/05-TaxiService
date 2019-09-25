public class Order {
    int boardingFee = 60_00;
    int pricePerMeter = 2;
    int distanceInMeters;
    int discount = 5;
    int amountDiscount = 1_000_00;
    int maxSumDiscaunt = 100_00;

    int sumOrder() {
        int sumOrder = boardingFee + pricePerMeter * distanceInMeters;
        return sumOrder;
    }

    int sumDiscauntAll() {
        int sumDiscauntAll = (discount * sumOrder() + 100) / 100;
        if (sumDiscauntAll > maxSumDiscaunt) {
            sumDiscauntAll = maxSumDiscaunt;
        } else sumDiscauntAll = sumDiscauntAll;
        if (sumOrder() > amountDiscount) {
            sumDiscauntAll = sumDiscauntAll;
        } else sumDiscauntAll = 0;
        return sumDiscauntAll;
    }
}
