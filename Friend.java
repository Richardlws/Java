public class Friend {
    String name;
    static int numofFriends;

    Friend(String name){
        this.name=name;
        numofFriends++;
    }

    static void showFriends(){
        System.out.println("You have " + numofFriends+" total friends!");


    }
}
