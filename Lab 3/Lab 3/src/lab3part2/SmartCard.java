package lab3part2;

public class SmartCard {
    String name;
    Boolean isStaff = false;

    public SmartCard(String name) {
        this.name = name;
    }
    public String getOwner() {
        return this.name;
    }
    public void setStaff(Boolean testStaff) {
        if (testStaff) {
            isStaff = true;
        } else {
            isStaff = false;
        }
    }

    public Boolean isStaff(){
        if (isStaff){
            return true;
        } else {
            return false;
        }
    }
}
