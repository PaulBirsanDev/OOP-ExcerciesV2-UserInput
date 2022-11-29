public class Messages extends Prices {
    private String welcoming;
    private String menuOrder;
    private String readyToOrder;
    private String mealOption;
    private String additions;
    private String totalRaport;

    public String welcomingMsg() {
        welcoming = "Hello! and welcome to Bill's Burger! \n My name is Paul, and today I will be at your service. \n " +
                "Would like to see our menu? ";
        return welcoming;
    }

    public String getMenuOrder() {
        String headlines = " Burgers                              \n";
        String components = "1.Basic Burger " + getBasicBurgerPrice() + "\n" +
                "2.Healthy Burger " + getHealthyBurgerPrice() + "\n" +
                "3.Deluxe Burger " + getDeluxeBurgerPrice();
        menuOrder = headlines + components;
        return menuOrder;
    }

    public String getReadyToOrder() {
        readyToOrder = "If are you ready to order please write down the number of which burger you desire: ";
        return readyToOrder;
    }
    public String getAdditions() {
        additions = "Would you like to add something to your burger to make it spicy?";
        return additions;
    }

    public String getMealOption() {
        mealOption = "Would you like to make it a meal for only 4.50" + getCurrencySign() + "?";
        return mealOption;
    }

    public String getTotalRaport() {
        return totalRaport;
    }

}
