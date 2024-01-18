import java.util.Scanner;

public class Max_Achievable_num {
    
    public static int Max_Achievable_Number(int num, int t){
        int Final;
        
        Final = 2 * t + num;
        return Final;
    }

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int t = s.nextInt();


        System.out.println(Max_Achievable_Number(num, t));
    }
}
