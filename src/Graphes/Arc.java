package Graphes;

/* Un objet de la classe Graphes.Arc représente un arc partant d’un noeud. */
public class Arc {
    private String dest; /* représente le nom du nœud destination de l’arc */
    private double cout; /* correspondant au coût (ou poids) de l’arc */

    public Arc(String dest, double cout) {
        this.dest = dest;
        this.cout = cout;
    }
}
