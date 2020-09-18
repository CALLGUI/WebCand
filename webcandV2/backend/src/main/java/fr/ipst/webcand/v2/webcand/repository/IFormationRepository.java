package fr.ipst.webcand.v2.webcand.repository;

import fr.ipst.webcand.v2.webcand.entities.FormationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface IFormationRepository extends JpaRepository<FormationEntity, Long> {

    @Query(value = "SELECT nom_Formation FROM formations " , nativeQuery = true)
    List<Map<String,Object>> AfficherLeNomDesFormations();

    @Query(value = "SELECT * FROM sessions_formation where id_formation = :id " , nativeQuery = true)
    List<Map<String,Object>> AfficherLesSessionsDeLaFormation(long id);

    @Query(value = "SELECT f.nom_formation, f.description_formation, sf.date_debut_session, sf.date_fin_session " +
            "FROM formations f, session_formation sf where f.id_formation = sf.id_formation" +
            " and f.id_formation = :id " , nativeQuery = true)
    List<Map<String,Object>> AfficherInfoSessionEtFormation(long id);
}
