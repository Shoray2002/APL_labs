import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(1, 2, 3, 4));
        List<Character> list = List.of('a', 'b', 'c', 'd');
        Map<Integer, Character> map = Map.of(1, 'x', 2, 'y');
        Set<String> set = Set.of("hello", "world");

        new ObjInfo<>(arrayList).printInfo();
        new ObjInfo<>(list).printInfo();
        new ObjInfo<>(map).printInfo();
        new ObjInfo<>(set).printInfo();
    }
}