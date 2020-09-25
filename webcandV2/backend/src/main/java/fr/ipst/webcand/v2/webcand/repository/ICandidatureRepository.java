package fr.ipst.webcand.v2.webcand.repository;

import fr.ipst.webcand.v2.webcand.entities.CandidatureEntity;
import fr.ipst.webcand.v2.webcand.entities.SessionFormationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ICandidatureRepository extends JpaRepository<CandidatureEntity, Long> {

    @Query(value = "SELECT * FROM candidatures where id_candidat = :id " , nativeQuery = true)
    List<Map<String,Object>> AfficherLesCandidaturesDuCandidat(Long id);

    @Query(value ="SELECT COUNT(*) FROM candidatures where id_session = :id", nativeQuery = true)
    long compterNombreDeCandidaturesParIdSession(Long id);

    //long countAllBySesssionFormation(SessionFormationEntity sessionFormation);
    long count();

}
