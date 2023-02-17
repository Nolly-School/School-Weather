# TP Android - Partie 2

## Objectif
Le but de ce TP est de comprendre et de mettre en pratique les notions suivantes :
* Création d'une nouvelle activité.
* Navigation entre les activités.
* Cycle de vie d'une activité.
* Échange de données entre les activités.

## Prérequis
* Android Studio est installé sur notre ordinateur.
* Nous avons suivi la partie 1 du TP Android.

## Étapes
### 1. Création d'une nouvelle activité
* Créer une nouvelle activité de type ScrollingActivity.
* Nommer l'activité FavoriteActivity.

### 2. Navigation entre les activités
* Ajouter un bouton à la MainActivity.
* Gérer le clic sur ce bouton pour lancer l'activité FavoriteActivity.
```java
Intent intent = new Intent(this, FavoriteActivity.class);
startActivity(intent);
```

### 3. Cycle de vie d'une activité
Les activités ont un cycle de vie qui leur est propre.  
De leur création à leur destruction, elles passent par plusieurs états.  
Le système nous informe du passage à ces états via les appels aux méthodes onXXX().  
Ce qui nous permet d'y ajouter une action.  

Les méthodes les plus courantes sont :
* `onCreate()`
* `onRestart()`
* `onStart()`
* `onResume()`
* `onPause()`
* `onStop()`
* `onDestroy()`  
Ajouter ces méthodes aux deux activités pour observer leur appel dans le LogCat.

### 4. Échange de données entre les activités
* Ajouter un champ EditText à la MainActivity.
* Ajouter un TextView à la FavoriteActivity.
* Passer un message de la MainActivity à la FavoriteActivity contenant le texte saisi dans le champ EditText.

### 5. Clé unique
* Ajouter une clé unique à notre activité ou dans une classe util. Cette clé pourra être utilisée dans n'importe quelle classe (activité) de notre projet.

## Conclusion
Nous avons appris à créer une nouvelle activité, à naviguer entre les activités, à comprendre le cycle de vie d'une activité et à échanger des données entre les activités.  
Nous avons également vu comment ajouter une clé unique à notre projet pour une utilisation globale.
