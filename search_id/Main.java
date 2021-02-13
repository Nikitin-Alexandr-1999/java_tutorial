import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] authntificated_stud_id =  new int[n - 2];
        int[] array = new int[2];
        for (int i = 0; i < n - 2; i++){
            authntificated_stud_id[i] = in.nextInt();
        }
        int k = 0;
        for (int i = 1; i <= n; i++){
            boolean find = false;
            for (int j = 0; j < authntificated_stud_id.length; j++){
                if(i == authntificated_stud_id[j]){
                    find = true;
                    break;
                }
                else if(j == authntificated_stud_id.length - 1){
                    array[k] = i;
                    k++;
                }
            }
        }
        for (int i = 0; i < array.length; i++) System.out.println(array[i]);
        in.close();
    }
}
