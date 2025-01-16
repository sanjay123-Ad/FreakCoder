/*The program must accept two integer matrices M1, M2 and an integer T as the input. The size of the matrix M1 is M*N and the size of the matrix M2 is R*C. The program must print the T*T submatrix which occurs in both matrices. If two or more such submatrices occur in both matrices, then the program must print the first occurring submatrix in M1 as the output. If there is no such submatrix, then the program must print -1 as the output. 
Boundary Condition(s): 
2 <= M, N, R, C, T <= 50 
1 <= Matrix element value <= 1000 
Input Format: 
The first line contains M and N separated by a space. The next M lines, each contains N integer values separated by a space. The (M+2)nd line contains R and C separated by a space. The next R lines, each contains C integer values separated by a space. The (M+R+3)rd line contains T. 
Output Format: 
The first T lines, each contains T integer values separated by a space. 
Example Input/Output 1:
 Input: 
6 6 
18 55 27 90 29 16 
90 31 60 48 64 65 
89 57 43 23 81 90 
36 11 86 70 33 76 
70 81 71 23 33 51 
37 53 80 13 33 60 
7 8 
53 23 54 47 37 28 12 10 
23 32 32 21 57 43 23 27 
32 31 77 88 11 86 70 27 
69 86 10 90 81 71 23 44 
62 38 15 39 17 20 42 69 
19 57 34 83 90 21 12 89 
11 81 23 82 21 56 25 86 
3 
Output: 
57 43 23 
11 86 70 
81 71 23
*/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Input matrix dimensions
        int m = in.nextInt();
        int n = in.nextInt();
        
        int[][] mat1 = new int[m][n];

        // Input matrix M1
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter mat1[" + i + "][" + j + "]:");
                mat1[i][j] = in.nextInt();
            }
        }

        // Print matrix M1
        System.out.println("Matrix M1:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }

        // Input matrix dimensions
        int k = in.nextInt();
        int l = in.nextInt();
        
        int[][] mat2 = new int[k][l];

        // Input matrix M2
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < l; j++) {
                System.out.println("Enter mat2[" + i + "][" + j + "]:");
                mat2[i][j] = in.nextInt();
            }
        }

        // Print matrix M2
        System.out.println("Matrix M2:");
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        }

        // Read the size of submatrix to find
        int t = in.nextInt();
        
        int[][] temp = new int[t][t];

        // Find the first occurring submatrix in M1 that is also in M2
        boolean found = false;
        int startRow = -1, startCol = -1;

        for (int i = 0; i <= m - t; i++) {
            for (int j = 0; j <= n - t; j++) {
                if (searchSubmatrix(mat1, mat2, i, j, t, k, l)) {
                    found = true;
                    startRow = i;
                    startCol = j;
                    break;
                }
            }
            if (found) break;
        }

        if (found) {
            // Print the matching submatrix
            System.out.println("Matching submatrix found:");
            for (int i = startRow; i < startRow + t; i++) {
                for (int j = startCol; j < startCol + t; j++) {
                    System.out.print(mat1[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("-1");
        }

        in.close();
    }

    // Function to search for a submatrix in M2
    public static boolean searchSubmatrix(int[][] mat1, int[][] mat2, int row, int col, int t, int k, int l) {
        for (int i = 0; i <= k - t; i++) {
            for (int j = 0; j <= l - t; j++) {
                if (compareMatrices(mat1, mat2, row, col, i, j, t)) {
                    return true;
                }
            }
        }
        return false;
    }

    // Function to compare two matrices
    public static boolean compareMatrices(int[][] mat1, int[][] mat2, int r1, int c1, int r2, int c2, int t) {
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                if (mat1[r1 + i][c1 + j] != mat2[r2 + i][c2 + j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
