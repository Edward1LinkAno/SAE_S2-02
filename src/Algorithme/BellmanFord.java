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
        int indDep = noeud.indexOf(depart) ;
        double val = 0 ;
        valeur.setParent(depart,null);
        valeur.setValeur(depart,val) ;
        List<Arc> arcs = g.suivants(depart) ;


        for (int i = 0; i < noeud.size() ; i++) {
            for (int j = 0; j < arcs.size(); j++) {

            }
            
        }



        return valeur ;
    }
}
