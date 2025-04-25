public class stringmdthod {
    public static void main(String[] args){

        String name = "Password";

        //int length = name.length();
        //char letter = name.charAt(0);
        //int index = name.indexOf("o");
        //int lastIndex = name.lastIndexOf("o");

        //name = name.toUpperCase();
        //name = name.toLowerCase();
        //name = name.trim();
        //name = name.replace("o","a");



        //System.out.println(length);
        //System.out.println(letter);
        //System.out.println(index);
        //System.out.println(lastIndex);
        //System.out.println(name);
        //System.out.println(name.isEmpty());
        /*if(name.isEmpty()){
            System.out.println("Your name is empty");
        }
        else{

            System.out.printf("Hello %s",name);

        }

        if(name.contains(" ")){
            System.out.println("Your name contain a space");
        }
        else{
            System.out.println("Your name doesn't contain any spaces");
        }
        */

        if(name.equalsIgnoreCase("password")){
            System.out.println("Your name can't be password");
        }
        else{
            System.out.println("Hello " + name);
        }


    }
}
