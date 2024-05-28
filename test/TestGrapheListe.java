import Graphes.GrapheListe;
import org.junit.jupiter.api.Test ;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TestGrapheListe {
    /**
     * test de avec un graphe construit correctement
     */
    @Test
    public void testValide() {
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

        System.out.println(Gl);

        try {
            System.out.println(Gl.suivants("B"));
        } catch (NullPointerException e) {
            assertTrue(false);
        }

        assertEquals(5,noeuds.size());
        assertEquals(Gl.getAdjacence().get(1).getArcs().get(0).getDest(),"E");
    }

    /**
     * test de avec un graphe construit correctement
     */
    @Test
    public void testArcInexistant() {
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

        System.out.println(Gl);

        try {
            System.out.println(Gl.suivants("B"));
        } catch (NullPointerException e) {
            assertTrue(false);
        }

        assertEquals(5,noeuds.size());
        Exception IndexOutOfBoundsException = assertThrows(
                java.lang.IndexOutOfBoundsException.class,
                ()-> {
                    Gl.getAdjacence().get(1).getArcs().get(123).getDest();}
        );
    }


}
