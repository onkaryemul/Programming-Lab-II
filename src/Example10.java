import java.util.ArrayList;
import java.util.Scanner;

class STUDENT{
    public int PRN;
    public String Name;
    public int age;

    public STUDENT(){}

    public STUDENT(int PRN,String Name,int age){
        this.PRN = PRN;
        this.Name = Name;
        this.age = age;
    }
}

class UGSTUDENT extends STUDENT{
    public int semester;
    public int fees;
    public int stipend;

    public UGSTUDENT(){}

    public UGSTUDENT(int PRN,String Name,int age,int semester,int fees,int stipend){
        super(PRN,Name,age);

        this.semester = semester;
        this.fees = fees;
        this.stipend = stipend;
    }
}

class PGSTUDENT extends STUDENT{
    public int semester;
    public int fees;
    public int stipend;

    public PGSTUDENT(){}

    public PGSTUDENT(int PRN,String Name,int age,int semester,int fees,int stipend){
        super(PRN,Name,age);

        this.semester = semester;
        this.fees = fees;
        this.stipend = stipend;
    }
}


public class Example10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<UGSTUDENT> ug = new ArrayList<>();
        ArrayList<PGSTUDENT> pg = new ArrayList<>();

        System.out.println("Enter the details of 5 UG Students : ");
        for(int i=0;i<5;i++){

            System.out.println("Enter details for student " + (i+1) + " : ");

            System.out.print("PRN : ");
            int PRN = sc.nextInt();

            sc.nextLine();

            System.out.print("Name : ");
            String Name = sc.nextLine();

            System.out.print("Age : ");
            int age = sc.nextInt();

            System.out.print("Semester : ");
            int semester = sc.nextInt();

            System.out.println("Fees : ");
            int fees = sc.nextInt();

            System.out.print("Stipend : ");
            int stipend = sc.nextInt();

            ug.add( new UGSTUDENT(PRN,Name,age,semester,fees,stipend) );
        }

        System.out.println("Enter the details of 5 PG Students : ");
        for(int i=0;i<5;i++) {

            System.out.println("Enter details for student " + (i + 1) + " : ");

            System.out.print("PRN : ");
            int PRN = sc.nextInt();

            sc.nextLine();

            System.out.print("Name : ");
            String Name = sc.nextLine();

            System.out.print("Age : ");
            int age = sc.nextInt();

            System.out.print("Semester : ");
            int semester = sc.nextInt();

            System.out.println("Fees : ");
            int fees = sc.nextInt();

            System.out.print("Stipend : ");
            int stipend = sc.nextInt();

            pg.add(new PGSTUDENT(PRN, Name, age, semester, fees, stipend));
        }

        int[] ugSemAge = new int[6];
        int[] ugSemCnt = new int[6];

        for(int i=0;i<5;i++){
            ugSemAge[ug.get(i).semester] += ug.get(i).age;
            ugSemCnt[ug.get(i).semester]++;
        }

        System.out.println("Semester wise Average age for UG Students : ");
        for(int i=0;i<5;i++){
            if( ugSemCnt[i] > 0 ){
                System.out.println( "Semester " + (i+1) + " : " + ( ugSemAge[i]/ugSemCnt[i] ) );
            }
        }

        int[] pgSemAge = new int[6];
        int[] pgSemCnt = new int[6];

        for(int i=0;i<5;i++){
            pgSemAge[pg.get(i).semester] += pg.get(i).age;
            pgSemCnt[pg.get(i).semester]++;
        }

        System.out.println("Semester wise Average age for PG Students : ");
        for(int i=0;i<5;i++){
            if( pgSemCnt[i] > 0 ){
                System.out.println( "Semester " + (i+1) + " : " + ( pgSemAge[i]/pgSemCnt[i] ) );
            }
        }

    }

}
