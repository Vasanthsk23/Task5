import java.util.Arrays;
import java.util.List;

public class Question3 {
    public static void main(String[] args) {
//        Create a List of String

        List<String> names = Arrays.asList("Abimanyu","ananthi","Kannan","Chola","Selva","Kuil","Vijay","Manivel","Scooby","Tiger");
//       Using lambda Function
        names.stream().filter(name -> name.toUpperCase().startsWith("A")).forEach(name -> System.out.println(name));


    }
}
