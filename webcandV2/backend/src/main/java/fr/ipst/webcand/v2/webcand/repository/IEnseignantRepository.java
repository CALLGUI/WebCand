package fr.ipst.webcand.v2.webcand.repository;

import fr.ipst.webcand.v2.webcand.entities.EnseignantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEnseignantRepository extends JpaRepository<EnseignantEntity, Long> {
}
