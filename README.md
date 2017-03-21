# AndroidProjectFinal

##Part 1 Fonctionnement

Cloner à partir de AndroidStudio via l'url du dépot : https://github.com/EsilvGuillaume/AndroidProjectFinal.git
ou télécharger le .zip du dépot : https://github.com/EsilvGuillaume/AndroidProjectFinal/archive/master.zip
Extraire le .zip dans ce cas là, et ouvrir avec AndroidStudio le projet.

Synchroniser les demandes d'android studio, tel que le gradle build / dependencies, etc, mais ne pas toucher au github.
Une fois celà fait, lancer l'application en cliquant sur le bouton run. 
Vous allez devoir créer un émulateur, suivez ces étapes : 

![](http://i.imgur.com/HmleopM.png)

![](http://i.imgur.com/Lc3QTtL.png)

![](http://i.imgur.com/zL1ezwv.png)

![](http://i.imgur.com/tEftlHg.png)

Télécharger la version si vous ne l'avez pas.

![](http://i.imgur.com/Bbi1e4M.png)

Maintenant lors du lancement de l'application sur ce device vous devriez obtenir ceci : 

![](http://i.imgur.com/a/M6cFL.png)

Pour l'exemple je tape eminem dans la barre de recherche, nous obtenons une liste de résultat : 

![](http://i.imgur.com/PV8p5hS.png)

Je clique sur un élément de la liste

![](http://i.imgur.com/HcTSqEe.png)

Puis je reclique dessus pour accèder à la video

![](http://i.imgur.com/ag9RyqY.png)

L'affichage de la vidéo ne marche pas sur un émulateur. 
Cependant j'ai effectué le test sur mon propre mobile en compilant l'application en pka sous api 23 pour qu'elle soit fonctionnelle avec mon téléphone, voici le résultat : 

![](http://i.imgur.com/FJX4sxO.png)

![](http://i.imgur.com/aut5P3v.png)

![](http://i.imgur.com/9g2I5yH.png)

Deux .pka sont présent dans le repertoire, le api25 corresponds à un sdk 25, et une version android de 7.0.1, le 23 correspond à une version android de 6.0.0 voir 6.0.1 
