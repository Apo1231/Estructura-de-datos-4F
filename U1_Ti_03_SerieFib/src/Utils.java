import java.util.ArrayList;
import java.util.List;

public class Utils {

    List<Student> students;
    List<Student> reveseList = new ArrayList<>();

    Utils(List<Student> students) {
        this.students = students;
    }

    public List<Student> reverse(int index) {
        if (students.size() <= index) {

            return reveseList;
        }
        reverse(index + 1);
        reveseList.add(students.get(index));
        return reveseList;
    }
}
