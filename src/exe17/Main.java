package exe17;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Midia> midias = new ArrayList<>();

        midias.add(new Midia("Matrix", 1990));
        midias.add(new Serie("Teen Wolf", 2004, 6));

        for (Midia item : midias){
            System.out.println(item);
        }
    }
}
