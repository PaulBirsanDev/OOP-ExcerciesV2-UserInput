public class Prices {
    private double basicBurgerPrice = 4.99;
    private double healthyBurgerPrice = 6.99;
    private double deluxeBurgerPrice = 5.70;
    private double basicAdditions = 2.50;
    private double healthyAddition = 3.50;
    private double deluxeAddition = 3.00;
    private String currencySign = "$ ";

    public String getBasicBurgerPrice() {
        return basicBurgerPrice + currencySign;
    }

    public String getHealthyBurgerPrice() {
        return healthyBurgerPrice + currencySign;
    }

    public String getDeluxeBurgerPrice() {
        return deluxeBurgerPrice + currencySign;
    }

    public double getBasicAdditions() {
        return basicAdditions;
    }

    public double getHealthyAddition() {
        return healthyAddition;
    }

    public double getDeluxeAddition() {
        return deluxeAddition;
    }

    public String getCurrencySign() {
        return currencySign;
    }
}
