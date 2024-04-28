# Détermination du nombre d'îles sur une carte de lac

[RU](/README.md) | [EN](README_EN.md) | [FR](README_FR.md) |  [JP](README_JP.md) | [DE](README_DE.md) | [CH](README_CH.md) | [KR](README_KR.md)

## Description

Étant donné une carte de lac représentée sous forme de tableau à deux dimensions, où chaque cellule est soit de l'eau ('W') soit de la terre ('L'), la tâche est de déterminer le nombre d'îles individuelles sur cette carte. Une île est définie comme un groupe de cellules de terre adjacentes (connectées verticalement ou horizontalement) entourées d'eau.

## Exemple

Exemple de carte de lac :

[
['W', 'L', 'W', 'W'],
['W', 'L', 'L', 'W'],
['W', 'W', 'L', 'W'],
['L', 'W', 'W', 'L']
]

Résultat attendu : Il y a 3 îles distinctes sur la carte. Une île se compose de deux cellules 'L' adjacentes dans la deuxième colonne, la deuxième se compose d'une cellule dans la troisième ligne, troisième colonne, et la troisième se compose de deux cellules non adjacentes en diagonale dans la dernière ligne.

## Tâches

1. Développer un algorithme utilisant la recherche en largeur (BFS) pour déterminer le nombre d'îles sur la carte.
2. Visualiser le processus de recherche en marquant les cellules visitées et vérifiées.
3. Compter le nombre d'étapes (mouvements) effectuées pendant le processus de recherche.

## Algorithme

1. Initialiser un compteur d'îles et une file d'attente vide pour BFS.
2. Parcourir chaque cellule de la carte.
3. Si la cellule actuelle est de la terre et n'a pas encore été visitée, initier BFS pour rechercher une île.
4. Pendant BFS, marquer les cellules visitées et incrémenter le compteur d'étapes.
5. BFS se termine lorsque nous parcourons toutes les cellules adjacentes de l'île actuelle.
6. Répéter les étapes 3-5 pour toutes les cellules de la carte.

## Visualisation

Pendant l'exécution de l'algorithme, nous visualiserons les cellules visitées et vérifiées. Cela aidera à représenter visuellement le processus de recherche d'îles sur la carte.

## Résultat

Après avoir terminé l'algorithme, nous obtiendrons le nombre d'îles individuelles sur la carte du lac et le nombre d'étapes (mouvements) effectuées pendant le processus de recherche.

# Licence

Ce projet est sous licence MIT - voir le fichier [LICENSE](/LICENSE) pour plus de détails.