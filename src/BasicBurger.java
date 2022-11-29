public class BasicBurger {
    private String breadRollType;
    private String meatType;
    private String name;

    public BasicBurger(String breadRollType, String meatType) {
        this.breadRollType = breadRollType;
        this.meatType = meatType;
        this.name = "Basic Burger";
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

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeatType() {
        return meatType;
    }

    public String getName() {
        return name;
    }
    public String basicBurgerMaking() {
        String feedBack = "So you want a Basic Burger, well let's choose the ingredients: " + "\n"
                +  "What type of bread rolls do you want and how would you like the meat to be prepared: \n";
        String typesOfBreadRolls = "1.Homemade Crescent Rolls" + "\n" + "2.Potato Bread Rolls" + "\n"
                + "3.Honey Wheat Rolls" + "\n" + "4.Brown rye bread Rolls";
        String typesOfMeat = "1.Rare" + "\n" + "2.Medium-rare" + "\n" + "3.Well done";
        String answerForBasicBurger = "Write down first the number for the roll bread type and then for the meat preparation: \n " +
                "Example: 2 \n 2";
        return feedBack + typesOfBreadRolls + typesOfMeat + answerForBasicBurger;
    }
}
