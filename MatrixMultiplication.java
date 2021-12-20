import java.util.Scanner;
public class MatrixMultiplication {
        public static void main(String[] args) {
    
            
          Scanner sc=new Scanner(System.in);
          int r1,c1,r2,c2;
          System.out.println("Enter row and column size for matrix 1 - ");
          r1=sc.nextInt();
          c1=sc.nextInt();
          System.out.println("Enter row and column size for matrix 2 - ");
          r2=sc.nextInt();
          c2=sc.nextInt();
          int array1[][] = new int[r1][c1];
          int array2[][] = new int[r2][c2];
          int result[][] = new int[r1][c2];
            if(c1!=r2)
                System.out.println("Check if number of columns of first matrix is equal to rows of second matrix=");
            else
            {
                
                //c1=r2
                System.out.println("Enter Matrix 1 elements=");
                for(int i=0;i<r1;i++)
                {
                  for(int j=0;j<c1;j++)
                  {
                    array1[i][j]=sc.nextInt();
                  }
                }
                System.out.println("Enter Matrix 2 elements=");
                for(int i=0;i<r2;i++)
                {
                  for(int j=0;j<c2;j++)
                  {
                    array2[i][j]=sc.nextInt();
                  }
                }  
                System.out.println("Matrix multiplication is =");
                for(int i=0;i<r1;i++)
                {
                    for(int j=0;j<c1;j++)
                    {
                        for(int k=0;k<c1;k++)
                            result[i][j]+=array1[i][k]*array2[k][j];
                    }
                }
                for(int i=0;i<r1;i++)
                {
                    for(int j=0;j<c2;j++)
                    {
                        System.out.print(result[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }


