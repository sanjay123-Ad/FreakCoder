/*Binary Representation Generator
Problem Statement
Write a Java program that accepts two integer inputs:

N: Represents the number of integers to generate, where the numbers range from 0 to (2^N) - 1.
B: Represents the number of bits to display for each binary representation.
The program should print the binary representations of the numbers from 0 to (2^N) - 1, where each binary number is formatted to exactly B bits. Each bit in the binary number should be separated by a space.

Boundary Conditions
1
≤
𝑁
≤
12
1≤N≤12
1
≤
𝐵
≤
12
1≤B≤12
Input Format
The first line contains an integer N.
The second line contains an integer B.
Output Format
Print 2^N lines, where each line contains the binary representation of the corresponding integer formatted to B bits. Each bit should be separated by a space.
Examples
Example 1
Input
mathematica
Copy code
Enter N (range exponent): 3  
Enter B (number of bits): 5  
Explanation
N = 3: The numbers to generate are 0 to 7 (since 
2
3
−
1
=
7
2 
3
 −1=7).
B = 5: Each binary number should be represented with 5 bits.
Output
Copy code
0 0 0 0 0  
0 0 0 0 1  
0 0 0 1 0  
0 0 0 1 1  
0 0 1 0 0  
0 0 1 0 1  
0 0 1 1 0  
0 0 1 1 1  
Example 2
Input
mathematica
Copy code
Enter N (range exponent): 2  
Enter B (number of bits): 4  
Explanation
N = 2: The numbers to generate are 0 to 3 (since 
2
2
−
1
=
3
2 
2
 −1=3).
B = 4: Each binary number should be represented with 4 bits.
Output
Copy code
0 0 0 0  
0 0 0 1  
0 0 1 0  
0 0 1 1  */

import java.util.Scanner;

public class BinaryRepresentation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number N (determines the range: 0 to (2^N) - 1)
        System.out.print("Enter N (range exponent): ");
        int N = scanner.nextInt();

        // Read the number B (number of bits to display)
        System.out.print("Enter B (number of bits): ");
        int B = scanner.nextInt();

        // Loop from 0 to (2^N) - 1
        int totalNumbers = (int) Math.pow(2, N);
        for (int i = 0; i < totalNumbers; i++) {
            // Convert the number to binary with B bits
            String binaryString = String.format("%" + B + "s", Integer.toBinaryString(i)).replace(' ', '0');

            // Print each bit separated by a space
            for (int j = 0; j < B; j++) {
                System.out.print(binaryString.charAt(j) + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
