import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Java8Demo {

    public static void main(String[] args) {
List<Integer> values= Arrays.asList(1,2,3,4,5,6);

Consumer<Integer> consumer=new Consumer<Integer>(){

    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }
};

values.forEach(consumer);

    }
}
