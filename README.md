# TP Android - Partie 1
## Objectif
Le but de cette partie est de créer une application Android affichant les informations météorologiques de New York.

## Étapes
### Étape 1 : Création de l'application
1. Créer une nouvelle application Android dans Android Studio en utilisant la configuration par défaut.
2. Modifier le fichier "activity_main.xml" pour ajouter les différents éléments de l'interface utilisateur (nom de la ville, description, icône, température et bouton "favori").
3.Modifier le fichier "MainActivity.java" pour récupérer les éléments de l'interface utilisateur et afficher les données météorologiques.

### Étape 2 : Affichage des données météorologiques
1. Créer les ressources "strings.xml" et "dimen.xml" pour stocker les chaînes de caractères et les dimensions utilisées dans l'interface utilisateur.
2. Ajouter les images des icônes météorologiques dans le dossier "drawable".
3. Modifier le fichier "MainActivity.java" pour afficher les données météorologiques (nom de la ville, description, icône, température) récupérées depuis les ressources.
4. Tester l'application et s'assurer que les données météorologiques sont correctement affichées.

### Étape 3 : Gestion de la connectivité
1. Ajouter la permission "ACCESS_NETWORK_STATE" dans le fichier "AndroidManifest.xml".
2. Modifier le fichier "MainActivity.java" pour vérifier si la connexion internet est disponible avant d'afficher les données météorologiques.
3. Afficher un message d'erreur si la connexion internet n'est pas disponible.
4. Tester l'application en désactivant la connexion internet pour vérifier que le message d'erreur est affiché.

## Conclusion
Dans cette première partie du TP Android, nous avons créé une application qui affiche les données météorologiques de New York. Nous avons utilisé différentes ressources pour stocker les chaînes de caractères et les dimensions utilisées dans l'interface utilisateur. Nous avons également ajouté la gestion de la connectivité pour s'assurer que l'application ne plante pas si la connexion internet n'est pas disponible.
