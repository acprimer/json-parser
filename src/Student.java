public class Student {
    public String name;
    public int age;
    private boolean gender;

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + ", gender=" + gender + '}';
    }
}