public class Doctor2 implements Visitor{
    @Override
    public void visit(Patient p) {
        System.out.println("Name : " + p.getName());
        System.out.println("Diagnosis : " + p.getDiagnosis());
    }
}
