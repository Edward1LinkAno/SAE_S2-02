package Algorithme;

import Graphes.Arc;
import Graphes.Graphe;
import Graphes.Valeur;

import java.util.ArrayList;

public class Dijkstra {

//        Algorithme :
//        Entrées :
//        G un graphe orienté avec une pondération positive des arcs (coût ou poids)
//        A un sommet (départ) de G
//
//        Début
//        Q <- {}
//        Pour chaque sommet v de G faire
//                v.valeur <- Infini
//                v.parent <- Indéfini
//                Q <- Q U {v}
//        Fin Pour
//        A.valeur <- 0
//        Tant que Q est un ensemble non vide faire
//                u <- un sommet de Q telle que u.valeur est minimal
//                Q <- Q \ {u}
//                Pour chaque sommet v de Q tel que l’arc (u,v) existe faire
//                      d <- u.valeur + poids(u,v)
//                      Si d < v.valeur
//                              Alors v.valeur <- d
//                              v.parent <- u
//                        Fin Si
//                Fin Pour
//        Fin Tant que


        public Valeur resoudre(Graphe g, String depart) {
                if (!g.listeNoeuds().contains(depart)) {
                        System.out.println("Le noeud de départ est inexistant");
                        return null;
                }

                Valeur v = new Valeur();
                ArrayList<String> Q = new ArrayList<String>(); // Liste de noeuds à traiter

                // Initialisation des distances et des parents
                for (String s : g.listeNoeuds()) {
                        v.setValeur(s, Double.MAX_VALUE);
                        v.setParent(s, "indefini");
                        Q.add(s);
                }
                v.setValeur(depart, 0);

                // Boucle principale de l'algorithme
                while (!Q.isEmpty()) {
                        // Trouver le noeud avec la plus petite distance
                        String u = Q.get(0);
                        for (String s : Q) {
                                if (v.getValeur(s) < v.getValeur(u)) {
                                        u = s;
                                }
                        }
                        Q.remove(u);

                        // Mise à jour des distances des voisins
                        for (Arc a : g.suivants(u)) {
                                String voisin = a.getDest();
                                if (Q.contains(voisin)) { // Vérifier si le voisin est dans Q
                                        double d = v.getValeur(u) + a.getCout();
                                        if (d < v.getValeur(voisin)) {
                                                v.setValeur(voisin, d);
                                                v.setParent(voisin, u);
                                        }
                                }
                        }
                }
                return v;
        }
}
