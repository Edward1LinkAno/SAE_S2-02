package Algorithme;

import Graphes.Arc;
import Graphes.Graphe;
import Graphes.GrapheListe;
import Graphes.Valeur;

import java.util.ArrayList;

public class Dijkstra {

//        public Valeur resoudre(Graphe g, String depart) {
//    Entrées :
                //GrapheListe G;      //G un graphe orienté avec une pondération positive des arcs (coût ou poids)
 //               Valeur A = new Valeur();
                //Arc A=new Arc(g.listeNoeuds().get(g.listeNoeuds().indexOf(depart)),0);   //A un sommet (départ) de G//               Valeur v = new Valeur();

//    Début
//                ArrayList<String> Q = new ArrayList<String>();     // utilisation d’une liste de noeuds à traiter
//                for (String s : g.listeNoeuds()) {
//                        for (Arc a : g.suivants(s)) {
//                                v.setValeur(s,Double.MAX_VALUE);
//                                v.setParent(s,"indefini");
//                                Q.add(s);
//                        }
//                }
//    Pour chaque sommet v de G faire
//       v.valeur <- Infini
//       v.parent <- Indéfini
//       Q <- Q U {v} // ajouter le sommet v à la liste Q
//    }
//                A.setValeur(depart,0);
//    A.valeur <- 0
//                while (!Q.isEmpty()) {
//    Tant que Q est un ensemble non vide faire
//                        Valeur u = A;
//                        int index=0;
//                        for(int j=0;j<Q.size();j++) {
//                                if(v.getValeur(Q.get(j))>g.suivants(Q.get(j)).get(j).getCout()) {
//                                        v.setValeur(Q.get(j),g.suivants(Q.get(j)).get(j).getCout());
//                                        index=j;
//                                }
//                        }
//                        Q.remove(Q.get(index));


//          u <- un sommet de Q telle que u.valeur est minimal
        //enlever le sommet u de la liste Q
//          Q <- Q \ {u}
//                        for (int k=0; k<Q.size();k++) {
//                                if (g.suivants(Q.get(k)).get(k).getDest().equals(Q.get(k))) {
//                                        double d=u.getValeur(Q.get(k))+g.suivants(Q.get(k)).get(k).getCout();
//                                        if (d<v.getValeur(Q.get(k))) {
//                                                v.setValeur(Q.get(k),d);
//                                                v.setParent(Q.get(k),u.getParent(Q.get(k)));
//                                        }
//                                }
//                        }
//          Pour chaque sommet v de Q tel que l’arc (u,v) existe faire
//              d <- u.valeur + poids(u,v)
//              Si d < v.valeur
//                  // le chemin est plus interessant
//                  Alors v.valeur <- d
//                  v.parent <- u
//              Fin Si
//          Fin Pour
//      Fin Tant que
//                }
//                return v;
//      Fin
//        }

        public Valeur resoudre(GrapheListe g, String depart) {
                //Valeur A = new Valeur();  //A un sommet (départ) de G
                Valeur v = new Valeur();

                ArrayList<String> Q = new ArrayList<String>();     // utilisation d’une liste de noeuds à traiter
                //Q.add(depart);
                for (String s : g.listeNoeuds()) {
                        for (Arc a : g.suivants(s)) {
                                v.setValeur(s,Double.MAX_VALUE);
                                v.setParent(s,"indefini");
                                Q.add(s);
                        }
                }
                v.setValeur(depart,0);
                while (!Q.isEmpty()) {
                        String u=depart;
                        int index=0;
                        for(int j=0;j<Q.size();j++) {
                                if(v.getParent(u)!=null) {
                                        u=Q.get(j);
                                        index=j;
                                }
                        }
                        Q.remove(Q.get(index));
                        for (int k=0; k<Q.size();k++) {
                                if (v.getParent(u)!=null) {
                                        int ind=g.getIndice(u);
                                        double d=v.getValeur(u)+g.suivants(u).get(g.getIndice(u)).getCout();
                                        if (d<v.getValeur(Q.get(k))) {
                                                v.setValeur(Q.get(k),d);
                                                v.setParent(Q.get(k),u);
                                        }
                                }
                        }
                }
                return v;
        }

}
