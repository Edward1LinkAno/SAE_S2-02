package Algorithme;

import Graphes.Arc;
import Graphes.Graphe;
import Graphes.GrapheListe;
import Graphes.Valeur;

import java.util.ArrayList;

public class Dijkstra {

        public Valeur resoudre(Graphe g, String depart) {
//    Entrées :
                //GrapheListe G;      //G un graphe orienté avec une pondération positive des arcs (coût ou poids)
                Valeur A = new Valeur();
                //Arc A=new Arc(g.listeNoeuds().get(g.listeNoeuds().indexOf(depart)),0);   //A un sommet (départ) de G
                Valeur v = new Valeur();

//    Début
                ArrayList<String> Q = new ArrayList<String>();     // utilisation d’une liste de noeuds à traiter
                for (String s : g.listeNoeuds()) {
                        for (Arc a : g.suivants(s)) {
                                v.setValeur(s,Double.MAX_VALUE);
                                v.setParent("indefini",s);
                                Q.add(s);
                        }
                }
//    Pour chaque sommet v de G faire
//       v.valeur <- Infini
//       v.parent <- Indéfini
//       Q <- Q U {v} // ajouter le sommet v à la liste Q
//    }
                A.setValeur(depart,0);
//    A.valeur <- 0
                while (!Q.isEmpty()) {
//    Tant que Q est un ensemble non vide faire


//          u <- un sommet de Q telle que u.valeur est minimal
        //enlever le sommet u de la liste Q
//          Q <- Q \ {u}
//          Pour chaque sommet v de Q tel que l’arc (u,v) existe faire
//              d <- u.valeur + poids(u,v)
//              Si d < v.valeur
//                  // le chemin est plus interessant
//                  Alors v.valeur <- d
//                  v.parent <- u
//              Fin Si
//          Fin Pour
//      Fin Tant que
                }
//      Fin
        }

}
