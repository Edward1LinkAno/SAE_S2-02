package Algorithme;

import Graphes.Arc;
import Graphes.Graphe ;
import Graphes.Valeur ;
import java.util.List;

public class BellmanFord {

    /**
     * Cette méthode prend un graphe g et un String représentant le nœud de départ
     * en paramètre et retourne un objet valeur correctement construit contenant les
     * distances et les parents de chaque nœud (après convergence de l’algorithme).
     */
    public Valeur resoudre(Graphe g, String depart){
        Valeur valeur = new Valeur() ;
        List<String> noeud = g.listeNoeuds() ;
        double val1 = 0 ;

        for (String s : noeud) {
            for (int i=0; i<g.suivants(s).size(); i++) {
                valeur.setValeur(s,Double.MAX_VALUE);
                valeur.setParent(s,"indefini");
            }
        }

        valeur.setParent(depart,null);
        valeur.setValeur(depart,val1) ;

        for (String s : noeud){
            double val2 = Double.MAX_VALUE ;
            for (Arc a : g.suivants(s)) {
                double val = a.getCout();
                valeur.setParent(a.getDest(),s);
                valeur.setValeur(a.getDest(),val+val1) ;
                if (val+val1<val2){
                    val2 = val+val1 ;
                }
            }
            val1 = val2 ;
        }

        return valeur ;
    }
}
