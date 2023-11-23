import java.util.ArrayList;
public class Department implements HospitalComponent{
    String name;
    ArrayList<HospitalComponent> list = new ArrayList<>();
    public Department(String name) {
        this.name = name;
    }
    public void addComponent(HospitalComponent component){
        list.add(component);
    }
    @Override
    public void display() {
        System.out.println("Department name : " + name);
        for(HospitalComponent c : list){
            c.display();
        }
    }
}