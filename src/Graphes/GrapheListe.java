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
        //On vérifie que le départ et la destination existent bien dans notre liste et on est ajoutent sinon.
        if(!noeuds.contains(depart)) {
            noeuds.add(depart);
        }
        if(!noeuds.contains(destination)) {
            noeuds.add(destination);
        }
        //ajout d'un nouvel Arc dans la liste.
        int indice=this.getIndice(depart);
        adjacence.get(indice).ajouterArc(new Arc(destination,cout));
    }

    @Override
    public List<String> listeNoeuds() {
        return noeuds;
    }

    public int getIndice(String n) {
        return noeuds.indexOf(n);
    }

}

