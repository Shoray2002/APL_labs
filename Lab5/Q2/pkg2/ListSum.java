package Lab5.Q2.pkg2;
import java.util.List;
public class ListSum {
    public int sum(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
