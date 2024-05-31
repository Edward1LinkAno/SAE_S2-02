package Algorithme;

import Graphes.Arc;
import Graphes.Graphe;
import Graphes.Valeur;

import java.util.ArrayList;

public class Dijkstra {


        public Valeur resoudre(Graphe g, String depart) {
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
