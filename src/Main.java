import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Username : ");
        String username = sc.next();
        ProxyInterface system = new ProxyHospitalManagementSystem();
        system.connectToSystem(username);
    }
}