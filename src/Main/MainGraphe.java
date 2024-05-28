package Main;

import Graphes.* ;

import java.util.ArrayList;

public class MainGraphe {

    public static void main(String[] args) {
        ArrayList<String> noeuds = new ArrayList<>() ;
        noeuds.add("A") ;
        noeuds.add("B") ;
        noeuds.add("C") ;
        noeuds.add("D") ;
        noeuds.add("E") ;

        GrapheListe graphe = new GrapheListe(noeuds) ;

        graphe.ajouterArc("A","B",12) ;
        graphe.ajouterArc("A","D",87) ;
        graphe.ajouterArc("B","E",11) ;
        graphe.ajouterArc("C","A",19) ;
        graphe.ajouterArc("D","B",23) ;
        graphe.ajouterArc("D","C",10) ;
        graphe.ajouterArc("E","D",43) ;

        System.out.println(graphe);
    }
}
