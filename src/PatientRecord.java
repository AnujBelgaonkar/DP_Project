import java.util.ArrayList;

public class PatientRecord {
    private static PatientRecord patientRecord;
    private ArrayList<Patient> patients;

    private PatientRecord(){
        patients = new ArrayList<Patient>();
    }

    public void addPatient(Patient p){
        patients.add(p);
    }

    public static synchronized PatientRecord getRecord(){
        if(patientRecord==null){
            patientRecord = new PatientRecord();
        }
        return patientRecord;
    }
}