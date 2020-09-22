package fr.ipst.webcand.v2.webcand.repository;

import fr.ipst.webcand.v2.webcand.entities.SessionFormationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ISessionFormationRepository extends JpaRepository<SessionFormationEntity, Long> {

    @Query(value = "SELECT * FROM sessions_formation where id_formation = :id " , nativeQuery = true)
    List<Map<String,Object>> AfficherLesSessionsDeLaFormation(Long id);

    List<SessionFormationEntity> findByDateDebutSession(String dateDebut);
    List<SessionFormationEntity> findByDateFinSession(String dateFin);
}
