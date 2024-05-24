<?php
require_once 'ProduitX.php';
require_once 'ProduitGenerique.php';
require_once 'FabriqueProduit.php';

// Création des terrains Rue de la Paix - 400€, Rue de Courcelles – 100€, et affichage
$rueDeLaPaix = ProprieteFactory::creer('Terrain', 'Rue de la Paix', 400);
$rueDeCourcelles = ProprieteFactory::creer('Terrain', 'Rue de Courcelles', 100);

$rueDeLaPaix->afficher();
$rueDeCourcelles->afficher();

// Création de la gare Montparnasse – 200€, et affichage
$gareMontparnasse = ProprieteFactory::creer('Gare', 'Gare Montparnasse', 200);
$gareMontparnasse->afficher();
