Partie 2: Représentation d'un graphe

Partie 3: Calcul du plus court chemin par point fixe

Partie 4: Calcul du meilleur chemin par Dijkstra

Partie 5: Validation et expérimentation 
[Question 16]
Avec le graphe fourni dans l'énoncé et en partant de A, le résultat obtenu est :
A ->  V:0.0 p:indefini
B ->  V:12.0 p:A
C ->  V:76.0 p:D
D ->  V:66.0 p:E
E ->  V:23.0 p:B
V: représente le coût pour aller de A vers le somment
p: Montre l'antécédant du somment.

[question 17]
Les résultats obtenus sont égaux malgré l'utilisation de deux algorithme différents.
Cela s'explique par la taille du graphe et ses chemins. En effet, celui ci est tès petit et possède peu de chemin.
Il n'y a donc pas beaucoup de possibilité. 
L'algorithme qui fonctionne le mieux est celui de Dijkstra car en bloquant a chaque fois un noeud, il permet une exécution plus rapide avec un résultat égal sur un petit graphe.

[Question 18]
Pour moi l'algorithme le plus efficace est celui de Dijkstra car sa complexité est de (Sommets+arrêtes)*ln(Sommets) tandis que celui de Bellman Ford est de (Arrêtes*Sommets)
Ainsi, plus le graphe est grand, moins l'algorithme de Bellman Ford est efficace tandis que celui de Dijkstra est une addition multiplié par un logarithme ce qui rend un plus petit nombre.
