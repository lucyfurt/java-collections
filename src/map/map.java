package map;

import com.sun.source.doctree.SeeTree;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class map {
    public static void main(String[] args) {
        Map<String,Double> carrosPopulares = new HashMap(){{
            put("gol", 14.3);
            put("uno", 14.4);
            put("mobi", 14.5);
        }};
        System.out.println(carrosPopulares);
        //substituir o consumo
        System.out.println("substitua o consumo do gol: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        //ver se tem o objeto add
        System.out.println("contem objeto: " + carrosPopulares.containsKey("tuscon"));
        System.out.println("exiba o consumo" + carrosPopulares.get("mobi"));
        System.out.println("exiba os modelos:");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);
        System.out.println("exiba os consumos:");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);
    }
}
