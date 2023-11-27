package lab4part3;


import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        UserGroup userGroup = new UserGroup();
        userGroup.addSampleData();
        userGroup.printUsernames();
        userGroup.removeUser("Jumbo2");

        UserGroup administrators = new UserGroup();

        Iterator<User> iterator = userGroup.getUserIterator();
        while (iterator.hasNext()){
            User userCheck = iterator.next();
            if (userCheck.getUserType() == "admin") {
                administrators.userList.add(userCheck);
                System.out.println("Added " + userCheck.getUsername() + " to admin group");
            }
        }

        administrators.printUsernames();

        administrators.userList.get(administrators.userList.size() - 1).setUserType("user");
        administrators.printUsernames();
        userGroup.printUsernames();
        //I now have users in the administrators group, could do some kind of usertype check

    }
}
