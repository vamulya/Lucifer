import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<LaptopComparator> laps=new ArrayList<>();
        laps.add(new LaptopComparator("hp",100));
        laps.add(new LaptopComparator("dell",80));

        Comparator<LaptopComparator> lap=new Comparator<LaptopComparator>(){

            @Override
            public int compare(LaptopComparator o1, LaptopComparator o2) {
                if(o1.getRam()>o1.getRam()){
                    return -1;
                }
                else{
                    return 1;
                }
            }
        };
        Collections.sort(laps,lap);

for(LaptopComparator lc:laps){
    System.out.println(lc);
}
    }
}
