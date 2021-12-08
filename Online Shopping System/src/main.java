
import Payments.Payments;
import Products.Computer;
import Products.Television;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Are you :\n \t1.Admin\n\t2.Customer ");
        int n1 = input.nextInt();

        String adminUserName = "Tanmoy";
        String adminPass = "Tanmoy123";

        switch (n1) {
            case 1:
                System.out.println("Enter your Username:");
                String UserName = input.nextLine();
                System.out.println("Enter your Password:");
                String UserPass = input.nextLine();

                if (UserName.equals(adminUserName) && UserPass.equals(adminPass)) {

                    System.out.println("Your Product:\n1.Computer \n 2.Television");
                    int choice = input.nextInt();

                    switch (choice) {

                        //Computer
                        case 1:
                            System.out.println("Your Computer Brand Name:");
                            String BrName1 = input.nextLine();
                            System.out.println("Your Computer Processor Name:");
                            String PrName = input.nextLine();
                            Computer Cm = new Computer(BrName1, PrName);
                            System.out.println("Product Total Price :");
                            int price1 = input.nextInt();
                            Payments cmPrice = new Payments(price1);
                            break;

                        //television
                        case 2:
                            System.out.println("Your Televison Brand Name:");
                            String BrName2 = input.nextLine();
                            System.out.println("Your Televison type:");
                            String tvTyp = input.nextLine();
                            Television Tv = new Television(BrName2, tvTyp);
                            System.out.println("Product Total Price :");
                            int price2 = input.nextInt();
                            Payments tvPrice = new Payments(price2);
                            break;

                        default:
                            System.out.println("Sorry, You should select valid selection.\n");
                    }

                } else {
                    System.out.println("Your UserName or Password is incorrect.");
                }

            case 2:
                //customer

                System.out.println("Which type of product you Search: \n1.Computer \n2.Televison");
                int choice1 = input.nextInt();

                switch (choice1) {
                    case 1:
                        break;
                    case 2:
                       
                        break;
                    default:
                        System.out.println("Sorry, You should select valid selection.\n");
                }

            default:
                System.out.println("Sorry, You should select valid selection.\n");

        }

    }
}
