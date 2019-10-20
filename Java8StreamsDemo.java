import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class Java8StreamsDemo {
    public static void main(String[] args) {
        List<Integer> values= Arrays.asList(1,2,3,4,5,6);




        Integer s2=values.stream().map(i->i*2).reduce(0,(i,j)-> i+j);

        System.out.println(s2);
    }
}
