package customds;
import java.util.*;

public class linearSearch {
    public void search() {

        Scanner sc=new Scanner(System.in);

        int[] arr={45,55,11,69,44,21};
        System.out.println("Enter the number to be searched: ");
        int a=sc.nextInt();
        int i;
        for(i=0; i<arr.length; i++){
            if(arr[i]==a)
            break;
        }

        if(i<arr.length)
        System.out.println("The position for "+a+" is "+i);

        else
        System.out.println(a+" doesnt exist in the array");
        sc.close();
    }
}
