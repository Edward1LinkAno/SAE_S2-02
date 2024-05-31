import Algorithme.Dijkstra;
import Graphes.GrapheListe;

import java.util.ArrayList;

public class MainDijkstra {
    public static void main(String[] args) {
        ArrayList<String> noeuds = new ArrayList<>() ;
        noeuds.add("A") ;
        noeuds.add("B") ;
        noeuds.add("C") ;
        noeuds.add("D") ;
        noeuds.add("E") ;
        GrapheListe Gl = new GrapheListe(noeuds);

        Gl.ajouterArc("A","B",12) ;
        Gl.ajouterArc("A","D",87) ;
        Gl.ajouterArc("B","E",11) ;
        Gl.ajouterArc("C","A",19) ;
        Gl.ajouterArc("D","B",23) ;
        Gl.ajouterArc("D","C",10) ;
        Gl.ajouterArc("E","D",43) ;


        Dijkstra d= new Dijkstra();
        System.out.println("Le chemin le plus cours pour chaque noeuds avec leurs parents est : ");
        System.out.println(d.resoudre(Gl,"A"));
    }
}
