package Algorithme;

import Graphes.Arc;
import Graphes.Graphe;
import Graphes.GrapheListe;

import java.util.ArrayList;

public class Dijkstra {

        public <Valeur>Valeur resoudre(Graphe g, String depart) {
//    Entrées :
                //GrapheListe G;      //G un graphe orienté avec une pondération positive des arcs (coût ou poids)

                Arc A;    //A un sommet (départ) de G

//    Début
                ArrayList<String> Q = new ArrayList<String>();     // utilisation d’une liste de noeuds `a traiter
                for (String s : G.listeNoeuds()) {
//    Pour chaque sommet v de G faire
//       v.valeur <- Infini
//       v.parent <- Indéfini
//       Q <- Q U {v} // ajouter le sommet v `a la liste Q
//    }
//    A.valeur <- 0
//    Tant que Q est un ensemble non vide faire
//          u <- un sommet de Q telle que u.valeur est minimal
//        enlever le sommet u de la liste Q
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
//      Fin
        }

}
