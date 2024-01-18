import java.util.Scanner;

public class Good_pair_array{
    public static int good_pair_in_array(int[] arr){
        int count = 0;
        for(int i =0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if (i <= j && arr[i] == arr[j]){
                    count++;
                }
            }
        }

        return count;
    }


    public static void main(String[] args){
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = s.nextInt();
                // System.out.println(arr[i]);
            }

            System.out.println(good_pair_in_array(arr));
        }
    }
}