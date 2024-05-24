<?php

class ProprieteFactory {
    public static function creer($type, $nom, $prix) {
        switch($type) {
            case 'Terrain':
                return new Terrain($nom, $prix);
            case 'Gare':
                return new Gare($nom, $prix);
            case 'CompagnieEE':
                return new CompagnieEE($nom, $prix);
            default:
                throw new Exception("Type de propriété inconnu");
        }
    }
}
