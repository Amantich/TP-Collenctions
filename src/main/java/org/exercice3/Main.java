package org.exercice3;

import java.util.HashSet;
import java.util.Set;

import static javax.management.ImmutableDescriptor.union;

public class Main {
    public static void main(String[] args) {
        Set<String> groupeA=new HashSet();
        Set<String> groupeB=new HashSet();



        groupeA.add("etudiant 1");
        groupeA.add("etudiant 2");
        groupeA.add("etudiant 3");
        groupeA.add("etudiant 4");
        groupeA.add("etudiant 5");
        groupeA.add("etudiant 12");
        groupeA.add("etudiant 51");


        groupeB.add("etudiant 1");
        groupeB.add("etudiant 2");
        groupeB.add("etudiant 3");
        groupeB.add("etudiant 4");
        groupeB.add("etudiant 5");
        groupeB.add("etudiant 6");
        groupeB.add("etudiant 7");


        groupeA.retainAll(groupeB);

        System.out.println("Intersection = " + groupeA);

        groupeA.addAll(groupeB);
        System.out.println("Union = " + groupeA);

    }
}
