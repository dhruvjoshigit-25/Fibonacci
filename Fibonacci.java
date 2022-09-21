
public class Fibonacci {  

    pubic static int fibonacci(int num){
       if(num==0) return 0;
       if(num==1 || num==2) return 1;
       return fibonacci(num-1) + fibonacci(num-2);
    }
    
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fib = fibonacci(n);
        System.out.println(fib);
     } 

} 