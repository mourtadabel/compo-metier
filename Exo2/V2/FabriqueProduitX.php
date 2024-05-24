<?php

class FabriqueTerrain extends FabriqueGenerique {
    public function creerPropriete($nom, $prix) {
        return new Terrain($nom, $prix);
    }
}

class FabriqueGare extends FabriqueGenerique {
    public function creerPropriete($nom, $prix) {
        return new Gare($nom, $prix);
    }
}

class FabriqueCompagnieEE extends FabriqueGenerique {
    public function creerPropriete($nom, $prix) {
        return new CompagnieEE($nom, $prix);
    }
}
