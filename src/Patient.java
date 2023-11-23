import java.util.ArrayList;

public class Patient{
    private String name;
    private int age;
    private ArrayList<String> symptoms;
    private ArrayList<String> diagnosis;
    private Room room;
    private Request request;

    public Patient(String name, int age, ArrayList<String> symptoms) {
        this.name = name;
        this.age = age;
        this.symptoms = symptoms;
    }
    public void getPatientInfo(){
        System.out.println("Name : " + name);
        System.out.println("Age : "  +age);
        System.out.println("Symptoms : " + symptoms);
        System.out.println("Diagnosis : " + diagnosis);
        if(room!=null){
            System.out.println("Room : " + room.getRoomNumber());
        }
    }
    public void accept(Visitor v) {
        v.visit(this);
    }
    public String getName() {
        return name;
    }
    public void setDiagnosis(ArrayList<String> diagnosis) {
        this.diagnosis = diagnosis;
    }
    public ArrayList<String> getDiagnosis() {
        return diagnosis;
    }
    public void setRequest(Request request) {
        this.request = request;
    }
    public Request getRequest() {
        return request;
    }

    public void setRoom(Room room) {
        room.setAvailabilityStatus("Unavailable");
        this.room = room;
    }
}
