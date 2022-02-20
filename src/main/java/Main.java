import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Account account = new Account();
        Scanner scanner = new Scanner(System.in);
        List<Account> users = new ArrayList<>();

        boolean key = true;
        int menuValue = 0;

        while (key) {
            System.out.print("Menu \n 1. Register \n 2. Login \n 3. Exit \n");
            menuValue = scanner.nextInt();

            switch (menuValue) {
                case 1 -> account.registration(users);
                case 2 -> account.login(users);
                case 3 -> key = false;
                default -> System.out.println("Wrong number");
            }
        }

    }
}
