package org.exercice2;

import java.util.HashMap;

public class HashNote {

    public static void main(String[] args) {
        HashMap<String,Double> noteEtudiants=new HashMap<>();
        //ajouter note etudiant
        noteEtudiants.put("balbla", 15.0);
        noteEtudiants.put("balbla2", 20.0);
        noteEtudiants.put("balbla3", 17.0);
        noteEtudiants.put("balbla4", 19.0);
        noteEtudiants.put("balbla5", 18.0);
        //modifier note etudiant
        noteEtudiants.replace("balbla",16.0);
        noteEtudiants.forEach((key, value) -> System.out.println(key + " :: " + value));
        System.out.println("");
        //supprimer note etudiant
        noteEtudiants.remove("balbla5");
        noteEtudiants.forEach((key, value) -> System.out.println(key + " :: " + value));
        System.out.println("");
        //afficher la taille
        System.out.println(noteEtudiants.size());
        noteEtudiants.forEach((key, value) -> System.out.println(key + " :: " + value));

        System.out.println("");
        //afficher note moyen max et min
        double min=20, max=0 , avg=0;

        noteEtudiants.forEach((key, value) -> System.out.println(key + " :: " + value));
        for (Double note:noteEtudiants.values()
             ) {
           if(note <min){
               min=note;
           }
           if(note>max){
               max=note;
           }
           avg+=note;
        }
        avg=avg/noteEtudiants.values().size();

        System.out.println("min :"+min+" max : "+max+" avg : "+avg);








    }
}
