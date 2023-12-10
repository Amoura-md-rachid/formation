package org.amoura;

import org.amoura.model.Personne;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // creation de 10 personne
        List<Personne> personnes = new ArrayList<>();

        personnes.add(new Personne("Alice", "Liddell", 25));
        personnes.add(new Personne("Bob", "Builder", 30));
        personnes.add(new Personne("Charlie", "Brown", 22));
        personnes.add(new Personne("David", "Copperfield", 40));
        personnes.add(new Personne("Eva", "Green", 28));
        personnes.add(new Personne("Frank", "Sinatra", 35));
        personnes.add(new Personne("Grace", "Hopper", 19));
        personnes.add(new Personne("Hank", "Moody", 45));
        personnes.add(new Personne("Ivy", "Queen", 32));
        personnes.add(new Personne("Jack", "Sparrow", 29));
        personnes.add(new Personne("Amoura","moh", 29));



        List<Personne> listeTriee = personnes.stream()
                .sorted((p1, p2) -> p1.getAge() - p2.getAge())
                .sorted(Comparator.comparing(Personne::getNom))
                        .collect(Collectors.toList());
//                .toList(); => j16

        listeTriee.forEach(p -> System.out.println("\r"+p.toString()+"\n"));


        // on peut afficher directement le resltat sans le sauvgarder dans une liste
        personnes.stream()
                .sorted((p1, p2) -> p1.getAge() - p2.getAge())
                .sorted(Comparator.comparing(Personne::getNom))
                .forEach(personne -> System.out.println(personne.toString()));


    }


}
