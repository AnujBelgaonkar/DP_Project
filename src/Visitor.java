public abstract class Visitor {
    private String name;
    public abstract void visit(Patient p);
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
