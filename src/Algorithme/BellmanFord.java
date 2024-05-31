package Algorithme;

import Graphes.Arc;
import Graphes.Graphe ;
import Graphes.Valeur ;


public class BellmanFord {

//        Algorithme :
//        Entrées :
//        G un graphe orienté avec une pondération des arcs (coût ou poids)
//        A un sommet (départ) de G

//        Début
//        Si le noeud de départ n'est pas dans le graphe
//              return null
//        fin si

//        Pour chaque sommet v de G faire
//                v.valeur <- Infini
//                v.parent <- Indéfini
//        Fin Pour
//        a.valeur <- 0

//        boolean arret <- faux;
//        Tant que non arret faire
//            arret <- vrai
//              Pour chaque sommet s de liste de noeud faire
//                  Pour chaque arc a dans les successeurs
//                      successeur <- la destination de a
//                      minimum <- v.valeur(s) + le cout de a

//                      Si minimum < successeur.valeur alors
//                          v.valeur <- minimum
//                          v.parent <- s
//                          arret <- faux
//                      fin si
//                  fin pour
//              fin pour
//        fin tant


//        retourne v
//        fin

    public Valeur resoudre(Graphe g, String depart) {
        if (!g.listeNoeuds().contains(depart)) {
            System.out.println("Le noeud de départ est inexistant");
            return null;
        }

        Valeur v = new Valeur();

        for (String s : g.listeNoeuds()) {
            v.setValeur(s, Double.MAX_VALUE);
            v.setParent(s, "indefini");
        }
        v.setValeur(depart, 0);

        boolean arret = false;
        while (!arret) {
            arret=true;
            for (String s : g.listeNoeuds()) {
                for (Arc a : g.suivants(s)) {

                    String voisin = a.getDest();
                        double minimum = v.getValeur(s) + a.getCout();

                        if (minimum < v.getValeur(voisin)) {
                            v.setValeur(voisin, minimum);
                            v.setParent(voisin, s);
                            arret=false;
                        }
                    }
                }
            }
        return v;
    }
}
