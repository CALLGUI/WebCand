package fr.ipst.webcand.v2.webcand.repository;

import fr.ipst.webcand.v2.webcand.entities.FichierEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFichierRepository extends JpaRepository<FichierEntity, Long> {
    FichierEntity findByNomFichier(String nomFichier);
}
