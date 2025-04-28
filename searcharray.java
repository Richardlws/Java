public class searcharray {
    public static void main(String[] args){
        int[] numbers = {1,9,2,8,3,5,4};
        String[] fruits = {"apple","orange","banana"};
        String target = "orange";
        boolean isFound = false;

        for(int i = 0;i<fruits.length;i++){
            if(target == fruits[i]){
                System.out.printf("%s found at index: %d\n",fruits[i],i);
                isFound = true;
                break;
            }
        }
        if(!isFound){

            System.out.println("Fruit not found in the array");

        }
    }
}
