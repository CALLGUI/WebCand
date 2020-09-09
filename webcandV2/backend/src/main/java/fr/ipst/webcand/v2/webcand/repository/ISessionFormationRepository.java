package fr.ipst.webcand.v2.webcand.repository;

import fr.ipst.webcand.v2.webcand.entities.SessionFormationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISessionFormationRepository extends JpaRepository<SessionFormationEntity, Long> {

    List<SessionFormationEntity> findByDateDebutSession(String dateDebut);
    List<SessionFormationEntity> findByDateFinSession(String dateFin);
}
