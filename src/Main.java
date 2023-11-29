import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Admins : {'Admin1', 'Admin2', 'Admin3'}
        // already present patients : {'Poushik', 'Anuj', 'Ashutosh'}
        // Doctors : {'Doctor1', 'Doctor2', 'Doctor3'}
        // Department : {'Neurological', 'Cardiovascular'}
        System.out.println("---------- Welcome to Hospital Management System ----------------");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Username : ");
        String username = sc.next();
        ProxyInterface system = new ProxyHospitalManagementSystem();
        system.connectToSystem(username);
    }
}