import java.util.Locale;
import java.util.stream.Stream;

public class Question1 {


    public static void main(String[] args) {
        Stream<String> names = Stream.of("aBc","d","ef");

        names.map(name -> name.toUpperCase()).forEach(name -> System.out.println(name));

    }
}