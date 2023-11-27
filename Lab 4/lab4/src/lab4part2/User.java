package lab4part2;

public class User {
    String username;
    String userType;
    String name;
    public User (String username, String userType, String name) {
        this.username = username;
        this.userType = userType;
        this.name = name;
    }
    public String getUsername() {
        return this.username;
    }
    public String getUserType(){
        return this.userType;
    }
    public String getName(){
        return this.name;
    }
    public void setUserType(String userType){
        this.userType = userType;
    }
}
