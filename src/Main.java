import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> symptoms1 = new ArrayList<>();
        symptoms1.add("Fever");
        symptoms1.add("Cough");
        Patient p =new Patient("XYZ", 12,symptoms1);
        Patient p1 = new Patient("XYZ1", 10, symptoms1);

        PatientRecord patientRecord = PatientRecord.getRecord();
        patientRecord.addPatient(p);
        patientRecord.addPatient(p1);

        Doctor1 doctor1 = new Doctor1();
        Doctor2 doctor2 = new Doctor2();

        p.accept(doctor2);
        p1.accept(doctor1);

//        Request req = new Request("ABC", "I need chocolate");
////        Request req = new Request("ABCD", "I need chocolate");
//        Handler1 a = new Handler1();
//        Handler2 b = new Handler2();
//
//        a.setNextHandler(b);
//        a.handleRequest(req);
    }
}