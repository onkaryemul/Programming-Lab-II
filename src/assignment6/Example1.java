/*
   1) Create objects of class student(roll number,name and gender), perform different operations on below collection components :
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

class Student implements Comparable<Student> {
    private int rollNo;
    private String name;
    private String gender;

    public Student()
    {
        rollNo = 0;
        name = new String("");
        gender = new String("");
    }

    public Student(int rollNo, String name, String gender)
    {
        this.rollNo = rollNo;
        this.name = name;
        this.gender = gender;
    }

    public int getRollNo()
    {
        return this.rollNo;
    }

    public String getName()
    {
        return this.name;
    }

    public String getGender()
    {
        return this.gender;
    }

    public String toString()
    {
        String s = "\nRoll No. : " + rollNo + "\nName : " + name + "\nGender : " + gender + "\n";
        return s;
    }

    public void display()
    {
        System.out.println(toString());
    }

    @Override
    public int compareTo(Student that)
    {
        if(this.getRollNo() > that.getRollNo())
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}

class StudentComparator implements Comparator<Student> {
     @Override
    public int compare(Student stu1,Student stu2)
     {
         if(stu1.getName().compareTo(stu2.getName()) > 0)
         {
             return 1;
         }
         else
         {
             return -1;
         }
     }
}


public class Example1 {

    public static void main(String[] args){

        Student stu1 = new Student(21510017,"Onkar Yemul","Male");
        Student stu2 = new Student(21510003,"Siddesh Mohite","Male");
        Student stu3 = new Student(21510001,"Shantanu Kantak","Male");

        // ArrayList
        System.out.println("\n*********  ArrayList :  *********");
        ArrayList<Student> arrayList = new ArrayList<Student>();

        arrayList.add(stu1);
        arrayList.add(stu2);
        arrayList.add(stu3);

        for(int i=0; i < arrayList.size() ; i++)
        {
            arrayList.get(i).display();
        }

        System.out.println("Removing Student object present at index 1 in arrayList i.e. " + arrayList.remove(1));

        System.out.println("Is Student object stu2 present in arrayList? : " + arrayList.contains(stu2));


        // LinkedList
        System.out.println("\n*********  LinkedList :  *********");
        LinkedList<Student> linkedList = new LinkedList<Student>();
        linkedList.add(stu1);
        linkedList.add(stu2);
        linkedList.add(1,stu3);

        for(Student stu : linkedList)
        {
            stu.display();
        }

        System.out.println("Removing Student object present at index 1 in linkedList i.e. " + linkedList.remove(1));

        System.out.println("Is Student object stu3 present in linkedList? : " + linkedList.contains(stu3));


        // ArrayDeque
        System.out.println("\n*********  ArrayDeque :  *********");
        ArrayDeque<Student> arrayDeque = new ArrayDeque<Student>();
        arrayDeque.add(stu1);
        arrayDeque.add(stu2);
        arrayDeque.push(stu2);
        arrayDeque.push(stu3);

        for(Student stu : arrayDeque)
        {
            stu.display();
        }

        System.out.println("Removing Student object stu2 from arrayDeque .... \n Removed : " + arrayDeque.remove(stu2));

        for(Student stu : arrayDeque)
        {
            stu.display();
        }


        // PriorityQueue
        System.out.println("\n*********  PriorityQueue (According to StudentComparator) :  *********");
        PriorityQueue<Student> priorityQueue = new PriorityQueue<Student>(new StudentComparator());
        priorityQueue.add(stu1);
        priorityQueue.add(stu2);
        priorityQueue.add(stu3);

        System.out.println("Retrieving head of priorityQueue using peek() :  " + priorityQueue.peek());

        System.out.println("\n*** Student Objects in priorityQueue :  ***");
        Iterator<Student> priorityItr = priorityQueue.iterator();
        while(priorityItr.hasNext())
        {
            priorityItr.next().display();
        }

        System.out.println("Removing Student object stu1 from priorityQueue... \n Removed : " + priorityQueue.remove(stu1));

        System.out.println("Retrieving head of priorityQueue using peek() :  " + priorityQueue.peek());
        System.out.println("After using peak(), priorityQueue would be : ");
        priorityItr = priorityQueue.iterator();
        while(priorityItr.hasNext())
        {
            priorityItr.next().display();
        }

        System.out.println("Retrieving head of priorityQueue using poll() : " + priorityQueue.poll());
        System.out.println("After using poll(), priorityQueue would be : ");
        priorityItr = priorityQueue.iterator();
        while(priorityItr.hasNext())
        {
            priorityItr.next().display();
        }


        // HashSet
        System.out.println("\n*********  HashSet :  ********* ");
        HashSet<Student> hashSet = new HashSet<Student>();
        hashSet.add(stu1);
        hashSet.add(stu2);
        hashSet.add(stu3);

        for(Student stu : hashSet)
        {
            stu.display();
        }

        System.out.println("Removing Student object stu1 from hashSet...\n Removed : " + hashSet.remove(stu1));


        // TreeSet
        System.out.println("\n*********  TreeSet (According to StudentComparator):  *********");
        TreeSet<Student> treeSet = new TreeSet<Student>(new StudentComparator());
        treeSet.add(stu1);
        treeSet.add(stu2);
        treeSet.add(stu3);

        Iterator<Student> it = treeSet.iterator();

        while(it.hasNext())
        {
            it.next().display();
        }

        System.out.println("Removing all Student objects from the treeSet...");
        treeSet.clear();
        System.out.println("Is treeSet empty? : " +treeSet.isEmpty());


        // HashMap
        System.out.println("\n*********  HashMap :  *********");
        HashMap<Integer,Student> hashMap = new HashMap<Integer,Student>();
        hashMap.put(1,stu1);
        hashMap.put(2,stu2);
        hashMap.put(3,stu3);

        int hmSize = hashMap.size();
        System.out.println("hashMap size : "  + hmSize);

        for(int i=1; i<=hmSize ; i++)
        {
            try
            {
                hashMap.get(i).display();
            }
            catch(Exception e){}

        }

        System.out.println("Keys in hashMap : " + hashMap.keySet());
        System.out.println("Values in hashMap : " + hashMap.values());


        // LinkedHashMap
        System.out.println("\n*********  LinkedHashMap :  *********");
        LinkedHashMap<Integer,Student> linkedHashMap = new LinkedHashMap<Integer,Student>();
        linkedHashMap.put(1,stu1);
        linkedHashMap.put(2,stu2);
        linkedHashMap.put(3,stu3);

        int lhmSize = linkedHashMap.size();
        System.out.println("linkedHashMap Size = " + lhmSize);

        for(int i=1; i<=lhmSize; i++)
        {
            try
            {
                linkedHashMap.get(i).display();
            }
            catch(Exception e){}

        }

        System.out.println("Does linkedHashMap contain key 4? : " + linkedHashMap.containsKey(4));

        System.out.println("Removing the value associated with the key 1 in linkedHashMap ...\n" +
                           "Removed value of key 1 :  " + linkedHashMap.remove(1));

        System.out.println("Keys in linkedHashMap : " + linkedHashMap.keySet());
        System.out.println("Values in linkedHashMap : " + linkedHashMap.values());

    }

}
