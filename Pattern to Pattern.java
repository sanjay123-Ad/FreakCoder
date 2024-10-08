/*The program must accept a list of patterns separated by a colon (:) as the input. Each pattern contains a list of integers separated by a hyphen (-). The program must print the output based on the following conditions. - If a-b is a pattern, then the program must print the integers from a to b in a line. - If a-b-c is a pattern, then the program must print the integers from a to b in a line and then the program must print the integers from b to c in the next line. Similarly, the integers are printed based on the number of integers in the pattern. Note: The integers in each pattern are always sorted in ascending order.
 Boundary Condition(s): 
1 <= Total number of patterns <= 20 
2 <= Total number of integers in each pattern <= 10 
1 <= Each integer value <= 1000 
Input Format: 
The first line contains a list of patterns separated by a colon, where each pattern contains a list of integers separated by a hyphen. Output Format: The lines containing the integers separated by a space based on the given conditions. 
Example Input/Output 1: 
Input: 
2-5-9-11:3-9 
Output: 
2 3 4 5 
5 6 7 8 9 
9 10 11 
3 4 5 6 7 8 9 
Explanation: There are two patterns separated by a colon. The first pattern is 2-5-9-11. The integers from 2 to 5 are printed in the first line. The integers from 5 to 9 are printed in the second line. The integers from 9 to 11 are printed in the third line. The second pattern is 3-9. The integers from 3 to 9 are printed in the fourth line. Hence the output is 
2 3 4 5 
5 6 7 8 9 
9 10 11 
3 4 5 6 7 8 9 
Example Input/Output 2: 
Input: 

5-7:4-9:3-4-8-13 
Output: 
5 6 7 
4 5 6 7 8 9 
3 4 
4 5 6 7 8 
8 9 10 11 12 13

*/
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept input patterns
        System.out.println("Enter the patterns separated by a colon (:):");
        String input = sc.nextLine();

        // Split the input by colon to get individual patterns
        String[] patterns = input.split(":");
        for(int i=0;i<patterns.length;i++)
        {
            System.out.println(patterns[i]+" ");
        }

        // Process each pattern
        for (String pattern : patterns) {
            // Split the pattern by hyphen to get individual numbers
            String[] numbers = pattern.split("-");

            // Print each sequence of numbers based on the pattern
            for (int i = 0; i < numbers.length - 1; i++) {
                int start = Integer.parseInt(numbers[i]);
                int end = Integer.parseInt(numbers[i + 1]);
                System.out.println(start+" "+end);
                // Print integers from start to end
                for (int j = start; j <= end; j++) {
                    System.out.print(j + " ");
                }
                System.out.println(); // Move to the next line after printing a sequence
            }
        }
    }
}