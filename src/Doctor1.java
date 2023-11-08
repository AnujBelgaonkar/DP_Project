public class Doctor1 implements Visitor{
    @Override
    public void visit(Patient p) {
        System.out.println("Name : " + p.getName());
        System.out.println("Age : "  +p.getAge());
        System.out.println("Symptoms : " + p.getSymptoms());
    }
}
