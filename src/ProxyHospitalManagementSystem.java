public class ProxyHospitalManagementSystem implements ProxyInterface{
    private final ProxyInterface system = new HospitalManagementSystem();
    @Override
    public void connectToSystem(String name) {
        if (name.equalsIgnoreCase("ABC") || name.equalsIgnoreCase("XYZ")){
            system.connectToSystem(name);
        }
        else System.out.println("Not allowed");
    }
}
