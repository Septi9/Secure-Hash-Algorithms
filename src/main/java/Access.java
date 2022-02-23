import java.util.List;
import java.util.Scanner;

public class Access {

    Scanner scanner = new Scanner(System.in);

    public void registration(List<Account> users) throws Exception {

        System.out.println("Type login: ");
        String login = scanner.nextLine();

        System.out.println("Type password: ");
        String password = SHA1Process.sha1(scanner.nextLine());

        Account account = new Account(login, password);
        users.add(account);

    }

    public boolean login(List<Account> users) throws Exception {

        System.out.println("Enter your login: ");
        String potentialLogin = scanner.nextLine();

        System.out.println("Enter your password: ");
        String hashCode = SHA1Process.sha1(scanner.nextLine());

        Account account = new Account(potentialLogin, hashCode);

        for (Account user : users) {
            if (user.equals(account)) {
                System.out.println("Login successful");
                return true;
            }
        }

        System.out.println("Wrong input data");

        return false;
    }

}
