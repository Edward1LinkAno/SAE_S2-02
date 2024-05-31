import Algorithme.BellmanFord;
import Algorithme.Dijkstra;
import Graphes.GrapheListe;
import Graphes.Valeur;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBellmanFord {

        /**
         * test avec un graphe construit correctement et les résultats correct en partant de A.
         */
        @Test
        public void testValidePartantA() {
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

            BellmanFord d= new BellmanFord();
            Valeur v=d.resoudre(Gl,"A");

            //System.out.println(Gl);
            //System.out.println(v);

            //Les valeurs ont été calculé a la main en suivant la méthode vu en cours
            assertEquals(0.0,v.getValeur("A"));
            assertEquals(12.0,v.getValeur("B"));
            assertEquals(23.0,v.getValeur("E"));
            assertEquals(66.0,v.getValeur("D"));
            assertEquals(76.0,v.getValeur("C"));

            assertEquals("A",v.getParent("B"));
            assertEquals("B",v.getParent("E"));
            assertEquals("E",v.getParent("D"));
            assertEquals("D",v.getParent("C"));
        }

        /**
         * test avec un graphe construit correctement et les résultats correct en partant de E.
         */
        @Test
        public void testValidePartantE() {
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

            BellmanFord d= new BellmanFord();
            Valeur v=d.resoudre(Gl,"E");

            //System.out.println(Gl);
            //System.out.println(v);

            //Les valeurs ont été calculé a la main en suivant la méthode vu en cours
            assertEquals(72.0,v.getValeur("A"));
            assertEquals(66.0,v.getValeur("B"));
            assertEquals(0.0,v.getValeur("E"));
            assertEquals(43.0,v.getValeur("D"));
            assertEquals(53.0,v.getValeur("C"));

            assertEquals("D",v.getParent("B"));
            assertEquals("C",v.getParent("A"));
            assertEquals("E",v.getParent("D"));
            assertEquals("D",v.getParent("C"));
        }

        /**
         * test avec un sommet de départ inexistant.
         */
        @Test
        public void testAvecDébutInexistant() {
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

            BellmanFord d= new BellmanFord();
            Valeur v=d.resoudre(Gl,"SomInexis");

            //System.out.println(Gl);
            //System.out.println(v);

            //Le programme doit renvoyer null
            assertEquals(null,v);

        }

}
