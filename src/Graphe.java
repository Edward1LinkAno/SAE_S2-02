import java.util.List;

/**
 * Interface Graphe
 */
public interface Graphe {

    /**
     * Methode listeNoeuds qui retourne tous les noeuds du graphe
     * @return une liste de String contenant les noeuds
     */
    public List<String> listeNoeuds();

    /**
     * Methode suivants qui retourne la liste des arcs partant du noeud passé en paramètre
     * @param n le noeud de départ
     * @return la liste des arcs partant du noeud de départ.
     */
    public List<Arc> suivants(String n);
}
