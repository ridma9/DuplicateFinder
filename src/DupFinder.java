import java.util.ArrayList;
import java.util.List;

public class DupFinder extends  Object{
    List<Student> student = new ArrayList<>();

    public DupFinder(List<Student> student){
        this.student=student;
    }

    public List<Student> getDups(){
        List<Student> duplicates = new ArrayList<>();

        //A B C D D E A C F G A D
        for (int i = 0; i < student.size(); i++) {
            for (int j=i+1;j<student.size();j++){
                if (student.get(i).equals(student.get(j))){
                    duplicates.add(student.get(i));
                    System.out.println(student.get(i));
                    break;
                }
            }
        }

        return duplicates;
    }
    public List<Student> getDuplicatesList() {
        List<Student> duplicate = new ArrayList<Student>();

        for (int i = 0; i < student.size(); i++) {

            for (int j = i + 1; j < student.size(); j++) {

                if (student.get(i).equals(student.get(j)) ) {
                    duplicate.add(student.get(i));
                    int index=student.indexOf(student.get(i));
                    System.out.println(index);
                    break;

                }

            }
        }
        return duplicate;

    }





}
