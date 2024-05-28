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
            adjacence.add(new Arcs());
        }
        if(!noeuds.contains(destination)) {
            noeuds.add(destination);
            adjacence.add(new Arcs());
        }
        //ajout d'un nouvel Arc dans la liste.
        int indice=this.getIndice(depart);
        if (this.adjacence.get(indice)==null) {
            this.adjacence.add(new Arcs());
        }
        adjacence.get(indice).ajouterArc(new Arc(destination,cout));
    }

    @Override
    public List<String> listeNoeuds() {
        return noeuds;
    }

    public int getIndice(String n) {
        return noeuds.indexOf(n);
    }

    public String toString() {
        String s = "____________________ FICHIER ____________________" ;
        for (int i = 0; i < noeuds.size(); i++) {
            s += noeuds.get(i) + " -> ";
            for (int j = 0; j < adjacence.get(i).getArcs().size(); j++) {
                s += adjacence.get(i).getArcs().get(i).getDest()+adjacence.get(i).getArcs().get(i).getCout()+" " ;
            }
            s+="\n";
        }
        s+="_______________________________________________" ;
        return s ;
    }
}

