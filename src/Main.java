public class Main {
    public static void main(String[] args) {
        ProxyInterface system = new ProxyHospitalManagementSystem();
        system.connectToSystem("ABC");
    }
}