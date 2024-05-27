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

        Graphe graphe = new GrapheListe(noeuds) ;

        graphe.ajouterArc() ;
    }
}
