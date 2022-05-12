package set;

import java.util.*;

public class set {
    public static void main(String[] args) {
    //uso hashset
    Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5,9.3,5d, 7d, 0d, 3.6));
        System.out.println(notas);
        System.out.println("confira se a nota 5 esta no conjunto:" +notas.contains(5d));
        System.out.println("exiba a menor nota " + Collections.min(notas));
        System.out.println("exiba a maior nota " + Collections.max(notas));
        //exiba a soma dos valores
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("exiba a soma dos valores: " + soma);

        //media das notas
        System.out.println("exiba a media das notas: " + (soma/notas.size()));

        //remover
        System.out.println("remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);
        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d,8.5,9.3,5d, 7d, 0d, 3.6));
        System.out.println(notas2);
        //ordem crescente
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);
    }
}
