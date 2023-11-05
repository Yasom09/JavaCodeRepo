import java.util.Random;

public class Lotto {

    public static void main(String[] args) {

       
        int n = Integer.parseInt(args[0]);        
        int m = Integer.parseInt(args[1]);
        
        Random random = new Random();
               
        int[] numbers = new int[n];        
        for (int i = 0; i < n; i++) {           
            int number = random.nextInt(m) + 1;
            numbers[i] = number;        
        }
                
        for (int i = 0; i < n; i++) {
            if (i >0){
                System.out.print(", ");
            }
            System.out.print(numbers[i]);         
        }
        System.out.println();
    }
}