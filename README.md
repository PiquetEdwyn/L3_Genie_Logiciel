# L3_Genie_Logiciel
Dépôt Git pour le TD de Génie Logiciel sur les convoyeurs
## Norme pour le projet

- Chacun sa branche (`git checkout -b <nom_de_branche>`), puis on fait un `git push origin <nom_de_branche>` pour pousser la branche sur le dépôt distant. Format de la branche : `<nom_prénom>_<implémentation>`. Exemple : `john_doe_interface`.

- Commit claire et concise, exemple : `git commit -m "Ajout de la classe Conveyor"`.

- `var_une` pour les variables, `méthodeUne` pour les méthodes, `ClasseUne` pour les classes 
  
- const `NOM_CONSTANTE` pour les constantes

## Avancée du projet

- [x] Créer le dossier du projet et les fichiers pour les différentes classes. Inclure un dossier de tests, il y aura au minimum un fichier de test par classes. (Groupe)
- [ ] Écrire le scénario de test n°1 : un convoyeur vide possède une forme dans le stockage et ajouterforme() est appelée. Réussite : l’attribut forme contient la Forme et l’attribut stockage est vide. sivement (selon les règles établies), le premier contient un Forme dans l’attribut forme et le
- [ ] Écrire le scénario de test n°1bis : la méthode `stockerforme()` est appelée sur un convoyeur vide avec un paramètre Forme. Réussite : l’attribut stockage contient la Forme.
- [ ] Écrire le scénario de test n°2 : un convoyeur possède une forme1 dans le stockage et `stockerforme()` est appelée. Réussite : l’attribut stockage contient la forme1.
- [ ] Écrire le scénario de test n°2bis : un convoyeur possède une forme1 dans l’attribut forme et une forme2 dans l’attribut stockage. `ajouterforme()` est appelée. Réussite : l’attribut forme contient la forme1 et l’attribut stockage contient la forme2.
- [ ] Écrire le scénario de test n°3 : deux convoyeurs sont placés successivement, le premier contient une Forme et le second est vide. Appel de `déplacerforme()` sur le convoyeur 1. Réussite : le premier convoyeur est vide et le second contient une forme.
- [ ] Écrire le scénario de test n°4 : deux convoyeurs sont placés successivement, chacun contenant une forme. Appel de `déplacerforme()` sur le convoyeur 1. Réussite : les deux convoyeurs conservent leur forme.
- [ ] Écrire le scénario de test n°5 : deux convoyeurs sont placés successivement et contiennent chacun une forme. Après suppression de la forme du convoyeur 2, appeler `déplacerforme()` sur le convoyeur 1. Réussite : le premier convoyeur est vide et le second contient sa forme.
- [ ] Écrire le scénario de test n°6.
- [ ] Écrire le scénario de test n°7 : vérifier les destinations de quatre convoyeurs placés sur les cases indiquées et orientés selon les règles établies.
- [ ] Écrire le scénario de test n°7bis : modifier la sortie de C1 vers l’est et vérifier que C1.destination = C2.
- [ ] Écrire le scénario de test n°8 : un convoyeur sans destination contenant une forme appelle `déplacerforme()`. Réussite : il conserve sa forme.
- [ ] Écrire le scénario de test n°9 : vérifier les destinations de trois convoyeurs placés successivement.
- [ ] Écrire le scénario de test n°9bis : appeler `update()` avec des formes sur C1 et C3. Réussite : C2 contient f1 et C3 contient f3.
- [ ] Écrire le scénario de test n°10 : créer un schéma de plusieurs convoyeurs, lister les formes présentes, appeler `update()` plusieurs fois et vérifier que la liste des formes reste identique.
- [ ] Écrire la classe Forme.
- [ ] Écrire les tests unitaires de la classe Forme.
- [ ] Écrire la classe CelluleOriente et son enum.
- [ ] Écrire les tests unitaires de la classe CelluleOriente.
- [ ] Écrire la classe Cellule.
- [x] Écrire les tests unitaires de la classe Cellule, notamment la vérification de `estlibre()`. (Louis Cambier)
- [ ] Écrire la classe Tapis, avec un constructeur prenant une cellule vide, une direction d’entrée et une direction de sortie.
- [ ] Écrire les tests unitaires de la classe Tapis.
- [ ] Écrire la méthode `update()` de la classe Grille.
- [ ] Écrire le reste de la classe Grille.
- [ ] Écrire les tests unitaires de la classe Grille.
- [ ] Écrire la méthode `estdisponible()` de la classe Convoyeur.
- [ ] Écrire la méthode `destination()` de la classe Convoyeur.
- [ ] Écrire la méthode `déplacerforme()` de la classe Convoyeur.
- [ ] Écrire la méthode `extraireforme()` de la classe Convoyeur.
- [ ] Écrire la méthode `stockerforme()` de la classe Convoyeur.
- [ ] Écrire la méthode `ajouterforme()` de la classe Convoyeur.
- [ ] Écrire la méthode `emplacement()` de la classe Convoyeur.
- [ ] Écrire le test de la méthode `emplacement()` de la classe Convoyeur.
- [ ] Écrire le test de la méthode `estdisponible()` de la classe Convoyeur.