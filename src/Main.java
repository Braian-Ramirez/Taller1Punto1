public class Main {
    public static void main(String[] args) {
        int factorial;
        factorial = 1;
        try{
            for( int i = 1 ; i <= 10 ; i++){
                factorial = factorial * i;
                System.out.println("El factorial del número " + i + " es: " + factorial);
            }
        }catch (Exception e){
            System.out.println("Error: " + e);
        }

    }
}