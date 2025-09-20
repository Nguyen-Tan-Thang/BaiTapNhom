import java.util.ArrayList;
import java.util.List;

public class Bai9 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        for (int x : list) {
            System.out.println(x);
        }
    }
}

