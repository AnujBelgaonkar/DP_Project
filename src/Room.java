public class Room implements HospitalComponent{
    private String roomNumber;
    private String availabilityStatus;
    private Patient patient;
    public Room(String roomNumber, String availabilityStatus) {
        this.roomNumber = roomNumber;
        this.availabilityStatus = availabilityStatus;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    @Override
    public void display() {
        if(availabilityStatus.equalsIgnoreCase("AVAILABLE")){
            System.out.println("Room " + roomNumber + " : " + availabilityStatus);
        }
        else{
            System.out.println("Room " + roomNumber + " : " + availabilityStatus);
            System.out.println("Reserved by : " + patient.getName());
        }
    }
}
