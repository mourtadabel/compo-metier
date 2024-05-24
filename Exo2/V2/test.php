<?php
require_once 'FabriqueProduit.php';
require_once 'FabriqueProduitX.php';
require_once 'ProduitGenerique.php';
require_once 'ProduitX.php';
// Création des factories
$terrainFactory = new FabriqueTerrain();
$gareFactory = new FabriqueGare();

// Création des terrains Rue de la Paix - 800€, Rue de Courcelles – 200€, et affichage
$rueDeLaPaix = $terrainFactory->creerPropriete('Rue de la Paix', 800);
$rueDeCourcelles = $terrainFactory->creerPropriete('Rue de Courcelles', 200);

$rueDeLaPaix->afficher();
$rueDeCourcelles->afficher();

// Création de la gare Montparnasse – 400€, et affichage
$gareMontparnasse = $gareFactory->creerPropriete('Gare Montparnasse', 400);
$gareMontparnasse->afficher();
