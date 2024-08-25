import java.util.Arrays;
import java.util.List;

public class Question2 {

    public static void main(String[] args) {
//      Create a List of String
        List<String> names = Arrays.asList("abc","","bc","efg","abcd","","jkl");
        names.stream().filter(name -> !name.isEmpty())
                .forEach(name -> System.out.println(name));

    }

}
