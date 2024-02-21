package org.exercice1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        List<Produit> Produits=new ArrayList<>();
        Produits.add(new Produit(1,"Pc",10000));
        Produits.add(new Produit(2,"Phone",10000));
        Produits.add(new Produit(3,"casque",600));
        Produits.add(new Produit(4,"VR",35000));
        Produits.add(new Produit(5,"smartWatch",8000));
//        for (Produit produit:Produits
//             ) {
//            System.out.println(produit.toString());
//        }
        Produits.set(4,new Produit(6,"new Product",5000));
//        for (Produit produit:Produits
//        ) {
//            System.out.println(produit.toString());
//        }

        Scanner myObj = new Scanner(System.in);
        System.out.println("que ce que vous chercher");
        String produitinput = myObj.next();
        for (Produit produit:Produits
        ) {
           if(produit.getNom().equals(produitinput))
             System.out.println(produit.toString());
        }
    }
}