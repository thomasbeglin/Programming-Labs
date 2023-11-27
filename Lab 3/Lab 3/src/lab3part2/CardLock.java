package lab3part2;

public class CardLock {
    SmartCard lastCardSeen;
    Boolean studentsAllowed = false;
    public void swipeCard(SmartCard card) {
        lastCardSeen = card;
    }
    public SmartCard getLastCardSeen(){
        return lastCardSeen;
    }
    public Boolean isUnlocked(){
        if (studentsAllowed) {
            return true;
        } else if (lastCardSeen.isStaff){
            return true;
        } else {
            return false;
        }
    }
    public void toggleStudentAccess () {studentsAllowed = !studentsAllowed;}

}
