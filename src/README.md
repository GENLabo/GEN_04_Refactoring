# Labo 04 Refactoring

## Points importants

### Size et Color
Dans un product, la gestion de la "size" et de la "color" était initialisement faite avec des switch 
/ case. Nous avons trouvé deux manières différentes d'implémenter un refactor et avons donc
utilisé les deux manières (une pour gérer la size, une pour la color) :

- Size : Nous utilisons une classe Enum qui a été étendue avec un attribut "text" et une méthode "toString()".
Ainsi, elle est très simple d'utilisation et nécessite aucune création multiple d'objet.

- Color: Nous utilisons une classe Color abstraite ainsi qu'une sous-classe par couleurs. C'est un 
principe élégant et simple utilisant le polymorphisme et la liaison dynamique pour afficher une couleur.

Les deux méthodes fonctionnent correctement et nous ne trouvons pas qu'une des deux est bien meilleure que
l'autre, c'est pourquoi nous avons décider de vous les montrer les deux. 

### Ajout d'un nouveau type de sérialisation
Actuellement le programme utilise une sérialisation des objets sous format JSON. Nous avons mis en place
un systeme de sérialisation qui permet de facilement étendre notre solution à d'autre format.
Prenons l'exemple du XML, il suffirait de créer les fichiers : OrdersXMLSerializer, OrderXMLSerializer et
ProductXMLSerializer. Ces 3 fichiers étenderont leurs classe mère respectives : OrdersSerializer et 
ProductSerializer.

Chacun de nos ...XMLSerializer vont devoir redéfinir la méthode toParse() et c'est dans son corps qu'il 
faudra écrire le code XML spécifique à l'affichage de l'objet courant.

Le choix du format de sérialisation se fera lors de l'instanciation du Writer, par exemple : 
new OrdersWriter(new Orders(), new OrdersJsonSerializer()) si nous voulons un OrdersWriter qui va 
écrire du JSON ou new OrdersWriter(new Orders(), new OrdersXMLSerializer()) si nous voulons du XML en sortie.

Nous avons donc un système modulaire et facile à utiliser, il suffit simplement d'ajouter des classes 
si l'on veut ajouter un nouveau format de sérialisation. Par conséquent, aucun code déjà présent n'est 
à modifier, ce qui est une bonne chose.
