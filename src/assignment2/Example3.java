/*
  3) Implement all StringBuffer functions in java.
*/

package assignment2;

public class Example3 {

    public static void main(String[] args) {

        // Initialize a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        System.out.println("\nInitial StringBuffer : " + sb);

        // append method
        sb.append(" World");
        System.out.println("\nAfter appending ' World' to StringBuffer sb ---> " + sb);

        // charAt method
        char c = sb.charAt(4);
        System.out.println("Character at index 4 of StringBuffer sb ---> " + c);

        // setCharAt method
        sb.setCharAt(1,'a');
        System.out.println("After setting character 'a' at index 1, StringBuffer sb ---> " + sb);

        // length method
        int length = sb.length();
        System.out.println("Length of the StringBuffer sb ---> " + length);

        // capacity method
        System.out.println("Capacity of the StringBuffer sb ---> " + sb.capacity());

        // substring method
        String sub = sb.substring(0,5);
        System.out.println("Substring from index 0  to index 5 of StringBuffer sb ---> " + sub);

        // insert method
        sb.insert(6," Java");
        System.out.println("After inserting ' Java' at index 6 , StringBuffer sb ---> " + sb);

        // replace method
        sb.replace(0,5,"Hi");
        System.out.println("After replacing characters from index 0 to index 5 with 'Hi', StringBuffer sb ---> " + sb);

        // delete method
        sb.delete(0,2);
        System.out.println("After deleting characters from index 0 to index 2, StringBuffer sb ---> " + sb);

        // setLength method
        sb.setLength(5);
        System.out.println("After setting length as 5, StringBuffer sb ---> " + sb);

        // reverse method
        sb.reverse();
        System.out.println("After reversing, the StringBuffer sb ---> " + sb);

    }
}
