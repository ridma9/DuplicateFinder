import java.util.*;

public class DuplicateFinder {

    List<Student> student= new ArrayList<>();
    public DuplicateFinder(List<Student> student ){
        this.student=student;
    }
    public List<Student> getDuplicates() {

        List<Student> studentCopy= new ArrayList<>();
        for (Student stu:student) {
            studentCopy.add(stu);
        }

        List<Student> dupList= new ArrayList<>();

        for (int i = 0; i < studentCopy.size(); i++) {
            for (int j = i+1; j < studentCopy.size(); j++) {
                if (studentCopy.get(i).toString().equals(studentCopy.get(j).toString())){

                    dupList.add(studentCopy.get(j));
                    studentCopy.remove(j);
                }
            }
        }
        return dupList;
    }


    public List<Student> getDistintList(){

        List<Student> disList = new ArrayList<>();

        List<Student> studentCopy= new ArrayList<>();
        for (Student stu:student) {
            studentCopy.add(stu);
        }

        for (int i=0;i<studentCopy.size();i++){
            for (int j=i+1;j<studentCopy.size();j++){

                if (studentCopy.get(i).toString().equals(studentCopy.get(j).toString())){
                    studentCopy.remove(j);
                }
            }
        }
        return studentCopy;
    }

    public Student getStudentByName(String name) throws StudentNotFoundException {
        List<Student> findName = new ArrayList<>();
        boolean found = false;

        Student std = null;
        for (int i = 0; i < student.size(); i++) {

            if (student.get(i).getName() == name) {
                System.out.println("Found");
                std = student.get(i);
                found = true;
            }

        }
        if (found == false) {
            //System.out.println("Exception");
            throw new StudentNotFoundException("Student not found.");
        }

        return std;
    }

}
