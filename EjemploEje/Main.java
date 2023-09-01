package EjemploEje;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        List<Integer> miLista = new ArrayList<Integer>();
        miLista.add(42);
        miLista.addAll(Arrays.asList(1, 2, 3));
        int segundoElemento = miLista.get(1);
        for (int i=0; i<miLista.size(); i++){
            System.out.println(miLista.get(i));
        }
    }
    
}
