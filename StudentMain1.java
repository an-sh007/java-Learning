

class Student1 {
    int sid;
    String name;

    Student1(int id, String n) {
        sid = id;
        name = n;
    }
}

public class StudentMain1 {
    public static void main(String[] args) {
        Student s = new Student(1, "John");
        System.out.println(s.sid);
        System.out.println(s.name);
    }
}
