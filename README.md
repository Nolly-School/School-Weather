

---

# Réponses:

## Comment sont positionnés les deux objets TextView ?
Les deux objets TextView sont positionnés côte à côte horizontalement dans le LinearLayout car l'attribut android:orientation du LinearLayout a été défini sur "horizontal".

## Modifiez les valeurs des attributs layout_width et layout_height de la façon suivante :
* android:layout_height="match_parent"
* android:layout_width="wrap_content"  
  ╰> La hauteur de la vue est étirée pour qu'elle prenne toute la hauteur de son parent, tandis que la largeur est ajustée pour qu'elle corresponde à la largeur du contenu.
* android:layout_height="wrap_content"
* android:layout_width="match_parent"  
  ╰> La hauteur de la vue est ajustée pour qu'elle corresponde à la hauteur de son contenu, tandis que la largeur est étirée pour qu'elle prenne toute la largeur de son parent.
* android:layout_height="wrap_content"
* android:layout_width="wrap_content"  
  ╰> La hauteur et la largeur de la vue sont ajustées pour qu'elles correspondent à la hauteur et à la largeur de son contenu.
* android:layout_height="match_parent"
* android:layout_width="60dp"  
  ╰> La hauteur de la vue est étirée pour qu'elle prenne toute la hauteur de son parent, tandis que la largeur est fixée à 60dp.

## Modifiez l’attribut layout_height du premier TextView avec la valeur “match_parent”. Observer ce qu’il se passe.
Lorsque l'on change l'attribut layout_height du premier TextView de "wrap_content" à "match_parent", le texte "Tout le monde !!" disparaît complètement de l'écran
car le premier TextView prend maintenant toute la hauteur de l'écran. Cela signifie que le deuxième TextView n'a plus assez d'espace pour s'afficher.

## Revenir à la disposition initiale et faire la même chose avec le second TextView. Observer ce qu’il se passe.
Lorsque l'on change l'attribut layout_height du deuxième TextView de "wrap_content" à "match_parent", le texte "Bonjour, " disparaît complètement de l'écran
car le deuxième TextView prend maintenant toute la hauteur de l'écran. Cela signifie que le premier TextView n'a plus assez d'espace pour s'afficher.

## Comprendre le fonctionnement de l’objet LinearLayout. L’aspect séquentiel lors de la création des vues.
LinearLayout est un conteneur qui organise les vues dans une direction donnée (horizontal ou vertical) et les affiche de manière séquentielle,
c'est-à-dire que les vues sont placées les unes après les autres dans l'ordre où elles ont été ajoutées dans le code.
Les attributs layout_width et layout_height définissent la largeur et la hauteur des vues dans le LinearLayout, en fonction de la taille de leur parent ou de leur contenu.
