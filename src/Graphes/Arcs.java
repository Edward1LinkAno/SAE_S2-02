package Graphes;

import java.util.ArrayList;
import java.util.List;

/* Classe permettant de gérer une liste d'Graphes.Arc */
public class Arcs {
    private List<Arc> arcs; /* Représente la liste d'Graphes.Arc a gérer */

    /**
     * Constructeur vide qui construit une liste vide d'Graphes.Arc
     */
    public Arcs() {
        this.arcs = new ArrayList<Arc>();
    }

    /**
     * Methode ajouterArc qui ajoute un arc à notre liste
     * @param a l'arc a ajouter
     */
    public void ajouterArc (Arc a) {
        this.arcs.add(a);
    }

    /**
     * Methode GetArcs qui nous retourne notre liste d'Graphes.Arc
     * @return l'attribut arcs
     */
    public List<Arc> getArcs() {
        return arcs;
    }
}
