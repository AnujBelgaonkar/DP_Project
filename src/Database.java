import java.util.ArrayList;

public class Database {
    ArrayList<Room> rooms = new ArrayList<>();
    ArrayList<Department> departments = new ArrayList<>();
    ArrayList<Visitor> doctors = new ArrayList<>();
    PatientRecord patientRecord = PatientRecord.getRecord();
    Handler handler;
    ArrayList<String> hospitalized = new ArrayList<>();
    ArrayList<String> admins = new ArrayList<>();

    public Database() {
        // Infrastructure
        Room room1 = new Room("101", "Available");
        Room room2 = new Room("102", "Available");
        Room room3 = new Room("103", "Available");
        Room room4 = new Room("201", "Available");
        Room room5 = new Room("202", "Available");
        Room room6 = new Room("203", "Available");

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);
        rooms.add(room5);
        rooms.add(room6);

        Floor floor1 = new Floor("1");
        floor1.addComponent(room1);
        floor1.addComponent(room2);
        floor1.addComponent(room3);
        Floor floor2 = new Floor("2");
        floor2.addComponent(room4);
        floor2.addComponent(room5);
        floor2.addComponent(room6);

        Department department1 = new Department("Neurological");
        department1.addComponent(floor1);
        department1.addComponent(floor2);

        departments.add(department1);

        // Request Handlers
        Handler1 a = new Handler1();
        Handler2 b = new Handler2();
        a.setNextHandler(b);
        handler = a;

        // Doctors
        Doctor1 doctor1 = new Doctor1("Doctor1");
        Doctor2 doctor2 = new Doctor2("Doctor2");
        doctors.add(doctor1);
        doctors.add(doctor2);

        // Patients already hospitalized in the Hospital
        // Patient - Anuj
        ArrayList<String> symptoms1 = new ArrayList<>();
        symptoms1.add("Fever");
        symptoms1.add("Cough");
        Patient p = new Patient("Anuj", 12,symptoms1);
        room1.setPatient(p);
        p.setRoom(room1);
        patientRecord.addPatient(p);

        symptoms1.clear();
        // Patient - "Poushik"
        symptoms1.add("Headache");
        symptoms1.add("Cough");
        Patient p1 = new Patient("Poushik", 12,symptoms1);
        room2.setPatient(p1);
        p1.setRoom(room2);
        patientRecord.addPatient(p1);

        symptoms1.clear();
        // Patient - "Ashutosh"
        symptoms1.add("Fever");
        symptoms1.add("Dengue");
        Patient p2 = new Patient("Ashutosh", 12,symptoms1);
        room3.setPatient(p2);
        p2.setRoom(room3);
        patientRecord.addPatient(p2);


        // Severe diseases
        hospitalized.add("Cancer");
        hospitalized.add("Cholera");
        hospitalized.add("Typhoid");
        hospitalized.add("HeartAttack");

        //Admins
        admins.add("Admin1");
        admins.add("Admin2");
        admins.add("Admin3");
    }
}