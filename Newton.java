public class Newton {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("ERROR: keine Argumente übergeben");
            return;
        }

        double c = Integer.parseInt(args[0]); 
        if (c <= 0) {
            System.out.println("ERROR: kann keine Wurzel aus negativen Zahlen ziehen");
        }
       
        double t = c;
        while (Math.abs(t * t - c) < 0.0001) {
            
            t = t + (c / t) / 2;
        }

        System.out.println(t);
    }
    
}
