package com.qac.coreJava.arrays;

public class MultiDimArray {

	public static void main(String[] args) {
int matrix [][]=new int[3][3];
        
        matrix[0][0]=2;
        matrix[0][1]=4;
        matrix[0][2]=6;
        matrix[1][0]=4;
        matrix[1][1]=8;
        matrix[1][2]=10;
        matrix[2][0]=6;
        matrix[2][1]=10;
        matrix[2][2]=12;
        
        for (int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                
                System.out.print(matrix[i][j]+"    ");
                
            }
            
            System.out.println();
        }


	}

}
