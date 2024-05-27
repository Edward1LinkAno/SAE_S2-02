package Graphes;

import java.util.ArrayList;
import java.util.List;

public class GrapheListe implements Graphe {
    private ArrayList<String> noeuds;
    private ArrayList<Arcs> adjacence;
    @Override
    public List<String> listeNoeuds() {
        return null;
    }

    @Override
    public List<Arc> suivants(String n) {
        return null;
    }

    public void ajouterArc(String depart, String destination, double cout) {

    }

    public int getIndice(String n) {
        return 0;
    }
}
