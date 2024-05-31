package Algorithme;

import Graphes.Arc;
import Graphes.Graphe ;
import Graphes.Valeur ;

public class BellmanFord {

//        Algorithme :
//        Entrées :
//        G un graphe orienté avec une pondération des arcs (coût ou poids)
//        depart le sommet de départ G

//        Début
//        Si le noeud de départ n'est pas dans le graphe
//              return null
//        fin si

//        Pour s de G faire
//                v.valeur <- Infini
//                v.parent <- Indéfini
//        Fin Pour
//        depart.valeur <- 0

//        arret <- faux;
//        Tant que non arret faire
//            arret <- vrai
//              Pour s de ln faire
//                  Pour a dans les successeurs
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

//    Lexique:
//    s: String, un sommet de G
//    v: objet de classe Valeur qui contient l'arbre des réponses.
//    arret: Boolean, vaut false si nous avons effectué des modifications dans cette itération.
//    ln: listeNoeud, la liste des noeuds du graphe (G.listeNoeuds())
//    a: Arc, un arc de G
//    successeur: String : un voisin de a
//    minimum: double, la valeur du chemin minimum

    /**
     * Méthode résoudre prenant en paramètre un graphe construit et un sommet de départ.
     * @param g Le graphe correctement construit
     * @param depart Le noeud de départ du graphe
     * @return Un objet de classe Valeur qui contient le coût du chemin le plus cours vers chaque points ainsi que son noeud parent.
     */
    public Valeur resoudre(Graphe g, String depart) {
        //vérification que le sommet départ existe bien
        if (!g.listeNoeuds().contains(depart)) {
            System.out.println("Le noeud de départ est inexistant");
            return null;
        }

        Valeur v = new Valeur();

        // Initialisation des distances et des parents
        for (String s : g.listeNoeuds()) {
            v.setValeur(s, Double.MAX_VALUE);
            v.setParent(s, "indefini");
        }
        v.setValeur(depart, 0);

        //boolean pour permettre l'arrêt de la boucle while
        boolean arret = false;
        // Boucle principale de l'algorithme
        while (!arret) {
            arret=true;
            //Parcous des noeuds du graphe
            for (String s : g.listeNoeuds()) {
                //parcours des successeurs du graphe
                for (Arc a : g.suivants(s)) {

                    String voisin = a.getDest();
                        double minimum = v.getValeur(s) + a.getCout();
                        //si la nouvelle valeur est inférieur a l'ancienne
                        if (minimum < v.getValeur(voisin)) {
                            //on remplace les valeurs
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
