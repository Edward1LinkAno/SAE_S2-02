package Graphes;

import java.util.ArrayList;
import java.util.List;

/**
 * Methode qui implémente Graphe et qui permet de représenter les données associées à un graphe
 */
public class GrapheListe implements Graphe {
    private ArrayList<String> noeuds; /* La liste des noeuds du graphe */
    private ArrayList<Arcs> adjacence;   /* La liste des Arcs partant de chaque noeud du graphe */

    public GrapheListe(ArrayList<String> noeuds) {
        this.noeuds = noeuds;
    }

    @Override
    public List<Arc> suivants(String n) {
        int indice=this.getIndice(n);
        return adjacence.get(indice).getArcs();
    }

    public void ajouterArc(String depart, String destination, double cout) {
        return null;
    }

    @Override
    public List<String> listeNoeuds() {
        return noeuds;
    }

    public int getIndice(String n) {
        return noeuds.indexOf(n);
    }

}

