public class Order {
    int boardingFee = 60_00;
    int pricePerMeter = 2;
    int distanceInMeters;
    int discount = 5;
    int amountDiscount = 1_000_00;
    int maxSumDiscaunt = 100_00;

    int calculatePrice(int distanceInMeters) {
        int sumOrder = boardingFee + pricePerMeter * distanceInMeters;
        int sumDiscauntAll = (discount * sumOrder + 100) / 100;
        if (sumDiscauntAll > maxSumDiscaunt)
            sumDiscauntAll = maxSumDiscaunt;
        if (sumOrder < amountDiscount)
            sumDiscauntAll = 0;
        return sumOrder = sumOrder - sumDiscauntAll;
    }
}
