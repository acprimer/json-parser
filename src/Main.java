import com.yaodh.parser.JsonParser;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
//        Class<?> clz = Class.forName("Student");
        Class<?> clz = Student.class;
        Field[] fields = clz.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f.getName());
        }

        System.out.println("start parse");
        String json = "{\"name\":\"yaodh\",\"age\":18,\"gender\":true}";
        try {
            Student student = JsonParser.parse(json, Student.class);
            System.out.println(student);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}