public class ProxyHospitalManagementSystem implements ProxyInterface{
    private final ProxyInterface system = new HospitalManagementSystem();
    private final Database database = new Database();
    @Override
    public void connectToSystem(String name) {
        boolean flag2 = false;
        for(Patient p : database.patientRecord.getPatients()){
            if(p.getName().equalsIgnoreCase(name)){
                flag2 = true;
                break;
            }
        }
        if (database.admins.contains(name) || flag2){
            system.connectToSystem(name);
        }
        else System.out.println("Not allowed");
    }
}