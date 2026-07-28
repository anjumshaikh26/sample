import org.w3c.dom.ls.LSOutput;

public class LoginTest {
    public static void main(String[] args) {
        String username = "admin";
        String password = "password123";

        if (username.equals("admin") && password.equals("password123")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}
