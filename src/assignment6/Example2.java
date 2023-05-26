/*
   2) Create objects of class book(ISBN number, name and price), perform different operations on below collection components :
      a. ArrayList
      b. LinkedList
      c. ArrayDeque
      d. PriorityQueue
      e. HashSet
      f. TreeSet
      g. HashMap
      h. LinkedHashMap
*/

package assignment6;

import java.util.*;

class Book implements Comparable<Book> {
      private int ISBN;
      private String name;
      private double price;

      public Book(int ISBN, String name, double price)
      {
            this.ISBN = ISBN;
            this.name = name;
            this.price = price;
      }

      public int getISBN()
      {
            return this.ISBN;
      }

      public String getName()
      {
            return this.name;
      }

      public double getPrice()
      {
            return this.price;
      }

      public String toString()
      {
            String s = "\nISBN : " + ISBN + "\nName : " + name + "\nPrice : " + price + "\n";
            return s;
      }

      public void display()
      {
            System.out.println(toString());
      }

      @Override
      public int compareTo(Book that)
      {
            if(this.getISBN() > that.getISBN())
            {
                  return 1;
            }
            else
            {
                  return -1;
            }
      }
}

class BookComparator implements Comparator<Book> {
      @Override
      public int compare(Book bk1, Book bk2)
      {
            if(bk1.getName().compareTo(bk2.getName()) > 0)
            {
                  return 1;
            }
            else
            {
                  return -1;
            }
      }
}


public class Example2 {

      public static void main(String[] args){

            Book bk1 = new Book(90001,"Wings Of Fire",400);
            Book bk2 = new Book(86759,"In Search of Lost Time",500);
            Book bk3 = new Book(46237,"War and Peace",600);

            // ArrayList
            System.out.println("\n*********  ArrayList :  ********* ");
            ArrayList<Book> arrayList = new ArrayList<Book>();
            arrayList.add(bk1);
            arrayList.add(bk2);
            arrayList.add(bk3);

            for(int i=0; i<arrayList.size() ; i++)
            {
                  arrayList.get(i).display();
            }

            System.out.println("Removing Book object present at index 1 in arrayList...\nRemoved : " + arrayList.remove(1));

            System.out.println("Does arrayList contain Book object bk2? : " + arrayList.contains(bk2));


            // LinkedList
            System.out.println("\n*********  LinkedList :  *********");
            LinkedList<Book> linkedList = new LinkedList<Book>();
            linkedList.add(bk1);
            linkedList.add(bk2);
            linkedList.add(bk3);

            for(Book bk : linkedList)
            {
                  bk.display();
            }

            System.out.println("Removing Book object present at index 1 in linkedList...\n Removed : " + linkedList.remove(1));

            System.out.println("Does linkedList contain Book object bk1? : " + linkedList.contains(bk1));


            // ArrayDeque
            System.out.println("\n*********  ArrayDeque :  *********");
            ArrayDeque<Book> arrayDeque = new ArrayDeque<Book>();
            arrayDeque.add(bk1);
            arrayDeque.add(bk2);
            arrayDeque.push(bk2);
            arrayDeque.push(bk3);

            for(Book bk : arrayDeque)
            {
                  bk.display();
            }

            System.out.println("Removing first occurrence of Book object bk2 from arrayDeque... \nRemoved : " + arrayDeque.remove(bk2));

            System.out.println("\nAfter removing, arrayDeque would be : ");
            Iterator<Book> it = arrayDeque.iterator();
            while(it.hasNext())
            {
                  it.next().display();
            }


            // PriorityQueue
            System.out.println("\n*********  PriorityQueue (According to BookComparator) :  *********");
            PriorityQueue<Book> priorityQueue = new PriorityQueue<Book>(new BookComparator());
            priorityQueue.add(bk1);
            priorityQueue.add(bk2);
            priorityQueue.add(bk3);

            System.out.println("Retrieving head of the priorityQueue using peek() : " + priorityQueue.peek());

            System.out.println("\n*** Book Objects in priorityQueue :  ***");
            Iterator<Book> priorityItr = priorityQueue.iterator();
            while(priorityItr.hasNext())
            {
                  priorityItr.next().display();
            }

            System.out.println("Removing Book object bk1 from priorityQueue ...\nRemoved : " + priorityQueue.remove(bk1));
            System.out.println("Retrieving head of the priorityQueue using peek() : " + priorityQueue.peek());
            System.out.println("After using peek(), priorityQueue would be : ");
            priorityItr = priorityQueue.iterator();
            while(priorityItr.hasNext())
            {
                  priorityItr.next().display();
            }

            System.out.println("Retrieving head of the priorityQueue using poll() : " + priorityQueue.poll());
            System.out.println("After using poll(), priorityQueue would be : ");
            priorityItr = priorityQueue.iterator();
            while(priorityItr.hasNext())
            {
                  priorityItr.next().display();
            }



            // HashSet
            System.out.println("\n*********  HashSet :  *********");
            HashSet<Book> hashSet = new HashSet<Book>();
            hashSet.add(bk1);
            hashSet.add(bk2);
            hashSet.add(bk3);

            for(Book bk : hashSet)
            {
                  bk.display();
            }

            System.out.println("Removing Book object bk1 from hashSet ...\nRemoved : " + hashSet.remove(bk1));


            // TreeSet
            System.out.println("\n*********  TreeSet (According to BookComparator) :  *********");
            TreeSet<Book> treeSet = new TreeSet<Book>(new BookComparator());
            treeSet.add(bk1);
            treeSet.add(bk2);
            treeSet.add(bk3);

            Iterator<Book> itr = treeSet.iterator();

            while(itr.hasNext())
            {
                  itr.next().display();
            }

            System.out.println("Removing all Book objects from treeSet ...");
            treeSet.clear();
            System.out.println("Is treeSet empty? : " + treeSet.isEmpty());


            // HashMap
            System.out.println("\n*********  HashMap :  *********");
            HashMap<Integer,Book> hashMap = new HashMap<Integer,Book>();
            hashMap.put(1,bk1);
            hashMap.put(2,bk2);
            hashMap.put(3,bk3);

            int hmSize = hashMap.size();
            System.out.println("hashMap size : " + hmSize );

            for(int i=1; i<=hmSize; i++)
            {
                  hashMap.get(i).display();
            }

            System.out.println("Keys in hashMap : " + hashMap.keySet());
            System.out.println("Values in hashMap : " + hashMap.values());


            // LinkedHashMap
            System.out.println("\n**********  LinkedHashMap :  **********");
            LinkedHashMap<Integer,Book> linkedHashMap = new LinkedHashMap<Integer,Book>();
            linkedHashMap.put(1,bk1);
            linkedHashMap.put(2,bk2);
            linkedHashMap.put(3,bk3);

            int lhmSize = linkedHashMap.size();
            System.out.println("linkedHashMap size : " + lhmSize);

            for(int i=1; i<=lhmSize; i++)
            {
                  linkedHashMap.get(i).display();
            }

            System.out.println("Does linkedHashMap contain key 4 ? : " + linkedHashMap.containsKey(4));

            System.out.println("Removing the value associated with key 1 in linkedHashMap ..." +
                              "\nRemoved value of key 1 : " + linkedHashMap.remove(1));

            System.out.println("Keys in linkedHashMap : " + linkedHashMap.keySet());
            System.out.println("Values in linkedHashMap : " + linkedHashMap.values());

      }

}
