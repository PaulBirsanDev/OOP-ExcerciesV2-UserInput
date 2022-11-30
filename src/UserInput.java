import java.util.Scanner;

public class UserInput {
    private String welcomingMsg;
    private String menu;
    private String order;
    private String totalRecap;
    private Prices prices;
    public void input() {
        Scanner scanner = new Scanner(System.in);
        welcomingMsg = "Hello! Welcome to Bill's Burger, would you like to see the menu? \n YES / NO";
        System.out.println(welcomingMsg);
        boolean checkWelcomingMSg = scanner.hasNextLine();
        String answer1 = scanner.nextLine();
        answer1.toUpperCase();
        if (checkWelcomingMSg) {
            if (answer1.equals("YES")) {
                menu = "Our Menu is this: " + "\n" + "1.Burger Basic " + prices.getBasicBurgerPrice() + "\n" + "2.Healthy Burger " + prices.getHealthyBurgerPrice()
                        + "\n" + "3.Deluxe Burger" + prices.getDeluxeBurgerPrice();
                System.out.println(menu);
            } else {
                menu = "Sorry that we couldn't help";
                System.out.println(menu);
            }
        } else {
            System.out.println(welcomingMsg);
        }

        scanner.close();
    }
}
