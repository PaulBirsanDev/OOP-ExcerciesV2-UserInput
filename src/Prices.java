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

    public String getBasicAdditions() {
        return basicAdditions + currencySign;
    }

    public String getHealthyAddition() {
        return healthyAddition + currencySign;
    }

    public String getDeluxeAddition() {
        return deluxeAddition + currencySign;
    }

    public String getCurrencySign() {
        return currencySign;
    }
}
