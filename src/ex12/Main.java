package ex12;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Desconto> descontos = new ArrayList<>();

        descontos.add(new ClienteComum(500));
        descontos.add(new ClienteVIP(500));
        descontos.add(new ClienteComum(100));
        descontos.add(new ClienteVIP(100));

        for (Desconto item : descontos){
            item.aplicarDesconto();
        }
    }
}
