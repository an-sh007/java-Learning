package cons;

 public class Student {
    int sid;
    String name;

    Student(int id, String n) {
        sid = id;
        name = n;
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student s = new Student(1, "John");
        System.out.println(s.sid);
        System.out.println(s.name);
    }
}
