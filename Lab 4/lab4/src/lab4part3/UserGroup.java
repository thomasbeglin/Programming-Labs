package lab4part3;

import java.util.Iterator;
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
        userList.add(new User("lkf3", "admin", "Peter"));
        userList.add(new User("mnby3", "editor", "Jimmy"));
        userList.add(new User("mbnb87", "user", "Pedro"));
        userList.add(new User("vksk12", "admin", "Pauline"));
    }

    public User getUser(int index) {
        return userList.get(index);
    }

    public void printUsernames(){
        for (User user : userList){
            System.out.println(user.getUsername() + " " + user.getUserType());
        }
    }

    public void removeFirstUser(){
        userList.remove(0);
    }
    public void removeLastUser(){
        userList.remove(userList.size()-1);
    }

    public void removeUser(String userInput){
        Iterator<User> iterator = userList.iterator();
        while (iterator.hasNext()){
            User userCheck = iterator.next();
            if (userCheck.getUsername() == userInput) {
                iterator.remove();
                System.out.println("Removed " + userCheck.getUsername());
            }
        }
    }

    public Iterator<User> getUserIterator(){
        return userList.iterator();
    }
}
