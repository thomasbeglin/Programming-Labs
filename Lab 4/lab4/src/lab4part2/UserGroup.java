package lab4part2;
import java.util.ArrayList;

public class UserGroup {

    ArrayList<User> userList;

    public UserGroup(){
        userList = new ArrayList<>();
    }

    public ArrayList<User> getUsers() {
        return userList;
    }

    public void addSampleData(){
        userList.add(new User("Jumbo2", "editor", "Jeff"));
        userList.add(new User("James1", "user", "James"));
        userList.add(new User("dwha", "user", "bart"));
        userList.add(new User("grgrd", "admin", "Tom"));
        userList.add(new User("grda", "editor", "Joe"));
        userList.add(new User("kj", "user", "Paul"));
        userList.add(new User("lkf3", "user", "Peter"));
        userList.add(new User("mnby3", "editor", "Jimmy"));
        userList.add(new User("mbnb87", "user", "Pedro"));
        userList.add(new User("vksk12", "editor", "Pauline"));
    }

    public User getUser(int index) {
        return userList.get(index);
    }

    public void printUsernames(){
        for (User user : userList){
            System.out.println(user.getUsername() + " " + user.getUserType());
        }
    }
}
