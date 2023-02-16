## Comment sont positionnés les deux objets TextView ?
Les deux objets TextView sont positionnés côte à côte horizontalement dans le LinearLayout car l'attribut android:orientation du LinearLayout a été défini sur "horizontal".

## Modifiez les valeurs des attributs layout_width et layout_height de la façon suivante :
* android:layout_height="match_parent"
* android:layout_width="wrap_content"
La hauteur de la vue est étirée pour qu'elle prenne toute la hauteur de son parent, tandis que la largeur est ajustée pour qu'elle corresponde à la largeur du contenu.
* android:layout_height="wrap_content"
* android:layout_width="match_parent"
La hauteur de la vue est ajustée pour qu'elle corresponde à la hauteur de son contenu, tandis que la largeur est étirée pour qu'elle prenne toute la largeur de son parent.
* android:layout_height="wrap_content"
* android:layout_width="wrap_content"
La hauteur et la largeur de la vue sont ajustées pour qu'elles correspondent à la hauteur et à la largeur de son contenu.
* android:layout_height="match_parent"
* android:layout_width="60dp"
La hauteur de la vue est étirée pour qu'elle prenne toute la hauteur de son parent, tandis que la largeur est fixée à 60dp.