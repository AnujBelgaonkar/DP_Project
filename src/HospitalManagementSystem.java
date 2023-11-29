import java.util.ArrayList;
import java.util.Scanner;

public class HospitalManagementSystem implements ProxyInterface{
    private final Database database = new Database();
    @Override
    public void connectToSystem(String name) {
        Scanner sc = new Scanner(System.in);
        int option;
        int age;
        int flag2 = 0;
        String choice, choice1, patient_name, department_name, doctor_name, req_name, req_type;
        String symptom;
        for(Patient p : database.patientRecord.getPatients()){
            if(p.getName().equalsIgnoreCase(name)){
                flag2 = 1;
                break;
            }
        }
        if(database.admins.contains(name)){
            do{
                boolean flag = false;
                boolean flag1 = false;
                System.out.println("--------- Welcome " + name + " ------------");
                System.out.println("1. Add a new Patient");
                System.out.println("2. See availability of rooms");
                System.out.println("3. Display Patient Info");
                System.out.println("4. Discharge a Patient.");

                System.out.print("Select an option : ");
                option = sc.nextInt();

                if(option==1) {
                    ArrayList<String> symptoms = new ArrayList<>();
                    System.out.print("Enter name of the patient : ");
                    patient_name = sc.next();
                    System.out.print("Enter age : ");
                    age = sc.nextInt();
                    do {
                        System.out.print("Enter the symptom : ");
                        symptom = sc.next();
                        symptoms.add(symptom);
                        System.out.print("Do you want to add more ? (Yes/No)");
                        choice = sc.next();
                    } while (!choice.equalsIgnoreCase("NO"));
                    System.out.print("Enter the name of the doctor : ");
                    doctor_name = sc.next();
                    for(Visitor v : database.doctors){
                        if(v.getName().equalsIgnoreCase(doctor_name)){
                            Patient p =  new Patient(patient_name, age, symptoms);
                            database.patientRecord.addPatient(p);
                            p.accept(v);
                            if(database.hospitalized.contains(p.getDiagnosis().get(0))){
                                for (Room room : database.rooms) {
                                    if (room.getAvailabilityStatus().equalsIgnoreCase("AVAILABLE")) {
                                        room.setPatient(p);
                                        p.setRoom(room);
                                        System.out.println("--------- Patient Info -------------");
                                        p.getPatientInfo();
                                        flag = true;
                                        break;
                                    }
                                }
                                if (!flag) {
                                    System.out.println("Sorry No Rooms Available");
                                    break;
                                }
                            }
                            else {
                                System.out.println("--------- Patient Info -------------");
                                p.getPatientInfo();
                            }
                        }
                    }
                }
                else if (option==2){
                    System.out.print("Enter the Department name : ");
                    department_name = sc.next();
                    for(Department department : database.departments){
                        if(department.name.equalsIgnoreCase(department_name)){
                            department.display();
                            flag1 = true;
                            break;
                        }
                    }
                    if (!flag1) {
                        System.out.println("Sorry No such department present.");
                    }
                }
                else if(option == 3){
                    System.out.print("Enter Patient name : ");
                    patient_name = sc.next();
                    for(Patient p : database.patientRecord.getPatients()){
                        if(p.getName().equalsIgnoreCase(patient_name)){
                            p.getPatientInfo();
                            flag1 = true;
                            break;
                        }
                    }
                    if (!flag1) {
                        System.out.println("Sorry No Patient is present in the Hospital.");
                    }
                }
                else if (option==4){
                    System.out.print("Enter name of the patient : ");
                    patient_name = sc.next();
                    for(Patient p : database.patientRecord.getPatients()){
                        if(p.getName().equalsIgnoreCase(patient_name)){
                            p.getRoom().setAvailabilityStatus("Available");
                            p.setRoom(null);
                            System.out.println("Patient " + p.getName() + " successfully discharged.");
                            flag1 = true;
                            break;
                        }
                    }
                    if (!flag1) {
                        System.out.println("Sorry No Patient is present in the Hospital.");
                    }
                }
                System.out.print("Do you want to do something more ? (Yes/No)");
                choice1 = sc.next();

            }while(!choice1.equalsIgnoreCase("NO"));
        }
        else if(flag2==1){
            do {
                System.out.println("--------- Welcome " + name + " ------------");
                System.out.println("1. Display Info");
                System.out.println("2. Make a request");

                System.out.print("Select an option : ");
                option = sc.nextInt();

                if(option==1){
                    for(Patient p : database.patientRecord.getPatients()){
                        if(p.getName().equalsIgnoreCase(name)){
                            p.getPatientInfo();
                        }
                    }
                }
                else if (option==2){
                    System.out.print("Give Request type : ");
                    req_type = sc.next();
                    System.out.print("Give Request : ");
                    req_name = sc.next();

                    for(Patient p : database.patientRecord.getPatients()){
                        if(p.getName().equalsIgnoreCase(name)){
                            p.setRequest(new Request(req_type, req_name));
                            database.handler.handleRequest(p.getRequest());
                            break;
                        }
                    }
                }
                System.out.print("Do you want to do something more ? (Yes/No)");
                choice1 = sc.next();
            }while(!choice1.equalsIgnoreCase("NO"));
        }
    }
}