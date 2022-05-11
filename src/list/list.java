package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static java.util.Collections.min;


public class list {
    public static void main(String[] args) {
        //adicionar items na lista
        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(7.0);
        notas.add(6.0);
        notas.add(5.0);
        notas.add(8.0);
        notas.add(9.0);
        notas.add(10.0);
        System.out.println(notas.toString());
        //exibir a posção da nota
        System.out.println("exiba a posição da nota" + notas.indexOf(5d));
        //substitua a nota
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);
        //exiba se a nota contem na lista
        System.out.println("a nota está na lista" + notas.contains(5d));
        //pegar a nota
        System.out.println("qual a terceira nota" + notas.get(2));

        System.out.println("exiba a nota menor" + min(notas));

        //soma das notas
        System.out.println("exiba a soma das notas");
        Iterator<Double> iterator1 = notas.iterator();
        Double soma = 0d;

        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            soma += next;
        }
        //imprime as somas das notas
        System.out.println("A soma das notas são" + soma);
        ///imprime a media das notas
        System.out.println("A media das notas são" + (soma/notas.size()));
        //remova a nota na posição 0
        System.out.println("Remova a nota:");
        notas.remove(0);
        System.out.println(notas);
        //para remover as notas menores que 7.0
        System.out.println("Remova as notas menores que 7.0");
        notas.removeIf(next -> next < 7);
        System.out.println(notas);
        //apagar notas
        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println("confira se a lista está vazia" + true);
    }
}

