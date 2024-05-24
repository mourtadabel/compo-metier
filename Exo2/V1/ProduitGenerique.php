<?php

class Propriete {
    protected $prix;
    protected $nom;

    public function __construct($nom, $prix) {
        $this->nom = $nom;
        $this->prix = $prix;
    }

    public function getPrix() {
        return $this->prix;
    }

    public function getNom() {
        return $this->nom;
    }

    public function setPrix($prix) {
        $this->prix = $prix;
    }

    public function setNom($nom) {
        $this->nom = $nom;
    }

    public function afficher() {
        echo "Propriété: " . $this->nom . ", Prix: " . $this->prix . "€\n";
    }
}
