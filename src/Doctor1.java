import java.util.ArrayList;

public class Doctor1 extends Visitor {
    public Doctor1(String name) {
        this.setName(name);
    }

    @Override
    public void visit(Patient p) {
        ArrayList<String> diagnosis = new ArrayList<>();
        System.out.println("-------- Diagnosis ------------");
        diagnosis.add("Dengue");
        diagnosis.add("Diagnosis 1");
        diagnosis.add("Diagnosis 2");
        diagnosis.add("Diagnosis 3");
        p.setDiagnosis(diagnosis);
        System.out.println("Name : " + p.getName());
        System.out.println("Diagnosed by " + getName());
        System.out.println("Diagnosis : " + p.getDiagnosis());
    }
}