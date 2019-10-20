import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Java8StramFilter {

    public static void main(String[] args) {
        List<Integer> values= Arrays.asList(10,12,20,34,40,56,50);

          /*System.out.println(values.stream()
                .filter(i->(i%5==0)).map(i->i*2)
                .reduce(0,(c,e)->c+e));*/
        System.out.println(values.stream()
                .filter(i->(i%5==0)).map(i->i*2).findFirst());
        /*Predicate<Integer> p=new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer%5==0;
            }
        };

        System.out.println(values.stream()
              .filter(p)
              .reduce(0,(c,e)->c+e));*/


    }
}
