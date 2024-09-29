CREATE TABLE etudiant (
    cne VARCHAR(12) UNIQUE,
    nom VARCHAR(20),
    prenom VARCHAR(20),
    date_nais DATE,
    sexe VARCHAR(1),
    pass_hash VARCHAR(255)
);