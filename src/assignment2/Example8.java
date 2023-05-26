/*
  8) Write a Java Program to demonstrate StringBuilder class methods.
*/

package assignment2;

public class Example8 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");

        System.out.println("\nInitial StringBuilder sb ---> " + sb);

        // append method
        sb.append(" World");
        System.out.println("\nAfter appending ' World' , StringBuilder sb ---> " + sb);

        // insert method
        sb.insert(5," Java");
        System.out.println("After inserting ' Java' at index 5 , StringBuilder sb ---> " + sb);

        // delete method
        sb.delete(5,9);
        System.out.println("After deleting characters from index 5 to index 9, StringBuilder sb ---> " + sb);

        // replace method
        sb.replace(5,11,"Sangli");
        System.out.println("After replacing characters from index 5 to index 11 with 'Sangli', StringBuilder sb ---> " + sb);

        // capacity method
        System.out.println("Capacity of StringBuilder sb --> " + sb.capacity());

        // length method
        System.out.println("Length of StringBuilder sb ---> " + sb.length());

        // charAt method
        System.out.println("Character at index 5 of StringBuilder sb ---> " + sb.charAt(5));

        // indexOf method
        System.out.println("Index of the first occurrence of 'l' in StringBuilder sb ---> " + sb.indexOf("l"));

        // lastIndexOf method
        System.out.println("Index of the last occurrence of 'l' in StringBuilder sb ---> " + sb.lastIndexOf("l"));

        // subSequence method
        System.out.println("Subsequence from index 5 to 11 : " + sb.subSequence(5,11));

        // toString method
        System.out.println("String representation of StringBuilder sb ---> " + sb.toString());

        // reverse method
        sb.reverse();
        System.out.println("After reversing, StringBuilder sb ---> " + sb);

        // setLength method
        sb.setLength(5);
        System.out.println("After setting length as 5, StringBuilder sb ---> " + sb);
    }
}
