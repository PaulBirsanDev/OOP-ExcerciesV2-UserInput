import java.util.Scanner;

public class UserInput extends BasicBurger {
    private Messages messages;
    private Prices prices;
//    private AdditionalItems additionalItems;
//    private MealOption mealOption;
    private BasicBurger burger;

    private UserInput(String breadRollType, String meatType, Messages messages, Prices prices, // AdditionalItems additionalItems, // MealOption mealOption,
                       BasicBurger burger) {
        super(breadRollType, meatType);
        this.messages = messages;
        this.prices = prices;
//        this.additionalItems = additionalItems;
//        this.mealOption = mealOption;
        this.burger = burger;
    }

    public UserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(messages.welcomingMsg());
        String answerAboutMenu = scanner.nextLine();
        if (answerAboutMenu.equals("Yes") || answerAboutMenu.equals("yes") || answerAboutMenu.equals("yes pleas")) {
            System.out.println(messages.getMenuOrder());
            scanner.nextLine();
        } else {
            System.out.println("Than if you know so well the menu you can order");
        }
        boolean checkAnswer = scanner.hasNextInt();
        int burgerType = scanner.nextInt();
        if (checkAnswer) {
            switch (burgerType) {
                case 1:
                    burger.basicBurgerMaking();
                    int breadRoll = scanner.nextInt();

                    scanner.nextInt();
            }
        }

        scanner.close();
    }


}
