import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable {

    public static void main(String[] args) {
        List<Laptop> laps=new ArrayList<>();
        laps.add(new Laptop("dell",45));
        laps.add(new Laptop("hp",60));

        Collections.sort(laps);

        for(Laptop l:laps){
            System.out.println(l);
        }

    }
}
