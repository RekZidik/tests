Ce projet contient une classe "Helper" qui est le point d'accès à notre méthode "partition".
 La méthode "partition" est statique avec une porté public, HelperTest contient les différents tests unitaires
 pour les différents scénarios d'utilisation de celle-ci.
 Il existe deux facteurs qui sont pertinents pour nos tests;
 > le paramètre "taillé" peut prendre 3 types de valeurs: 
 
 <li> Valeurs invalides (=0)</li> 
 <li> Valeur positif (>0) et inférieur à la taille de la liste originelle</li>
 <li> Valeur supérieure ou égale à la taille de la liste originelle</li>
 
 >La liste originelle peut être vide ou avoir des éléments en son sein
 
 <p>Pour une liste vide en paramètre le résultat sera une liste contenant une liste vide./Br>
    Si le paramètre "taille" et supérieur ou égale la taille de la liste, 
    le résultat contiendra une liste qui contiendra 
    la liste passer on paramètre sinon il aura la même forme que l'illustration 
    du sujet de ce DM.
    </p>
 
 Remarque:</br>
 Si vous êtes sur Eclipse il faudra inclure dans les dépendances 
 la librairie hamcrest qui se trouve dans le dossier 
 "lib" de ce projet pour éxecuter les tests unitaires.