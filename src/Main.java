import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student std1 = new Student("Vimukthi",20,"HillWood");
        Student std2 = new Student("Kasun",21,"HighSchool");        //1
        Student std3 = new Student("Danushka",20,"HighSchool");
        Student std4 = new Student("Ruwan",20,"HillWood");          //  3
        Student std5 = new Student("Chamara",20,"HighSchool");      //      4
        Student std6 = new Student("Kasun",21,"HighSchool");        //5
        Student std7 = new Student("Ruwan",20,"HillWood");          //  6
        Student std8 = new Student("Amara",20,"HighSchool");
        Student std9 = new Student("Kasun",21,"HighSchool");        //8
        Student std10 = new Student("Chamara",20,"HighSchool");     //      9
        Student std11 = new Student("Kasun",21,"HighSchool");       //10

        List<Student> list =  List.of(std1,std2,std3,std4,std5,std6,std7,std8,std9,std10,std11);


        List<Student> dupList = new ArrayList<>();
        List<Student> disList = new ArrayList<>();

        System.out.println(list);
        System.out.println();

        DuplicateFinder finder = new DuplicateFinder(list);

        //DUPLICATE FINDER
        System.out.println("*********DUPLICATE FINDER*********");
        dupList= finder.getDuplicates();
        System.out.println(dupList);
        System.out.println("No of duplicate items : "+dupList.size());
        System.out.println();


        //DISTINCT FINDER
        System.out.println("*********DISTINCT FINDER*********");
        disList= finder.getDistintList();
        System.out.println(disList);
        System.out.println("No of distinct items : "+disList.size());
        System.out.println();


        //NAME FINDER
        System.out.println("*********NAME FINDER*********");
        try {
            Student find=finder.getStudentByName("Kasn");
            System.out.println(find);
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}