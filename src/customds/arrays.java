package customds;

import java.util.Scanner;

public class arrays {
    public int[] array(){
        Scanner sc= new Scanner(System.in);
        // datatype[] var_name = new datatype[size];
        // datatype homogenous
        System.out.println("Enter the size of array: ");
        int s=sc.nextInt();
        int arr1[]=new int[s];
        for(int i=0;i<s;i++){
            System.out.println("Enter number "+ i);
            arr1[i]=sc.nextInt();
        }
        System.out.println("");

        // for(int i=0;i<s;i++)
        // System.out.println(arr1[i]);
        
        
        return arr1;

    }

    public void matrix(){

        Scanner sc= new Scanner(System.in);

        int[][] matrix = new int[3][3];
        //only number of rows is mandatory

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("The Matrix is :");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        sc.close();

    }

    public void linearSearch() {

        //O(1) : Best case Time Complexity
        //O(n) : Worst case time complexity

        Scanner sc=new Scanner(System.in);

        int[] arr=array();
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

