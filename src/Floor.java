import java.util.ArrayList;

public class Floor implements HospitalComponent{
    String floorNumber;
    ArrayList<HospitalComponent> list = new ArrayList<>();

    public Floor(String floorNumber) {
        this.floorNumber = floorNumber;
    }
    public void addComponent(HospitalComponent component){
        list.add(component);
    }
    @Override
    public void display() {
        System.out.println("Floor number : " + floorNumber);
        for(HospitalComponent c : list){
            c.display();
        }
    }
}
