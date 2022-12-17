package customds;

import java.util.Scanner;

public class arrays {
    public void array(){
        Scanner sc= new Scanner(System.in);
        // datatype[] var_name = new datatype[size];
        // datatype homogenous
        int arr1[]=new int[4];
        for(int i=0;i<arr1.length;i++){
            System.out.println("Enter number "+ i);
            arr1[i]=sc.nextInt();
        }
        System.out.println("");

        for(int i=0;i<4;i++)
        System.out.println(arr1[i]);

        sc.close();
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
}
