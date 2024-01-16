import java.util.Scanner;

public class fibonacci {

    public static void fib(int num){
        int first = 0;
        int next = 1;
        System.out.println(first);
        System.out.println(next);
        for(int i = 2; i <= num; i++){
           
            int temp = first + next;
            System.out.println(temp);
            first = next;
            next = temp;

        }
    }

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();

        fib(n);
    }
    
}
