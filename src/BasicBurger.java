public class BasicBurger extends Prices {
    private String breadRollType;
    private String meatType;
    private String name;
    private String prices;

    public BasicBurger() {
    }

    public BasicBurger(String breadRollType, String meatType, String name) {
        this.breadRollType = breadRollType;
        this.meatType = meatType;
        this.name = name;
        this.prices = getBasicBurgerPrice();
    }

    public String breadRoll(int numberOfType) {
        String msg = "";
            switch (numberOfType) {
                case 1:
                    msg = "Homemade Crescent Rolls";
                    breadRollType = msg;
                    break;
                case 2:
                    msg = "Potato Bread Rolls";
                    breadRollType = msg;
                    break;
                case 3:
                    msg = "Honey Wheat Rolls";
                    breadRollType = msg;
                    break;
                case 4:
                    msg = "Brown rye bread Rolls";
                    breadRollType = msg;
                    break;
                default:
                    msg = "Sorry, we don't have this number assign to anything on the menu";
                    breadRollType = msg;
            }
        return msg;
    }
    public String meat(int numberOfType) {
        String msg = "";
        switch (numberOfType) {
            case 1:
                msg = "Rare";
                meatType = msg;
                break;
            case 2:
                msg = "Medium-rare";
                meatType = msg;
                break;
            case 3:
                msg = "Well done";
                meatType = msg;
                break;
            default:
                msg = "Please check if you entered the right number";
                meatType = msg;
        }
        return msg;
    }
    public String additions(int numberOfAddition) {
        double priceForAddition = numberOfAddition * getBasicAdditions();
        return priceForAddition + getCurrencySign();
    }
    public String whichAdditions(int numberOfType) {
        String msg = "";
        switch (numberOfType) {
            case 1:
                msg = "Lettuce";
                break;
            case 2:
                msg = "Tomatos";
                break;
            case 3:
                msg = "Bacon Strips";
                break;
            case 4:
                msg = "Patato Chips";
            default:
                msg = "";
        }
        return msg;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeatType() {
        return meatType;
    }

    public String getName() {
        return name;
    }
}
