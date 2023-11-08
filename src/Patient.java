import java.util.ArrayList;

public class Patient{

    private String name;
    private int age;
    private ArrayList<String> symptoms;
    private ArrayList<String> diagnosis;

    public Patient(String name, int age, ArrayList<String> symptoms) {
        this.name = name;
        this.age = age;
        this.symptoms = symptoms;
    }

    public String getName() {
        return name;
    }

    public void setDiagnosis(ArrayList<String> diagnosis) {
        this.diagnosis = diagnosis;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<String> getSymptoms() {
        return symptoms;
    }

    public ArrayList<String> getDiagnosis() {
        return diagnosis;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}
