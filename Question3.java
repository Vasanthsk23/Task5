import java.util.Arrays;
import java.util.List;

public class Question3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Abimanyu","ananthi","Kannan","Chola","Selva","Kuil","Vijay","Manivel","Scooby","Tiger");
        names.stream().filter(name -> name.toUpperCase().startsWith("A")).forEach(name -> System.out.println(name));


    }
}
