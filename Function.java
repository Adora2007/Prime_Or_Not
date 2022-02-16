import java.util.Scanner;

public class Function{
    public static void primeOrNot(int n) {
       //loop 
       if(n == 0 || n == 1){
           System.out.println("not Prime");
       }
       for(int i=2; i<n; i++){
        // if the number is divisible by i, then n is not a prime number.
            if(n%i == 0){
                System.out.println("Not prime");
            }else{
                System.out.println("Prime");
            }
  
    } return;
}
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
      primeOrNot(n);
     
   }
}
