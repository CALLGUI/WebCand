package fr.ipst.webcand.v2.webcand.repository;

import fr.ipst.webcand.v2.webcand.entities.ProfilEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface IProfilRepository extends JpaRepository<ProfilEntity, Long> {

    @Query(value = "SELECT * FROM diplomes where id_profil = :id " , nativeQuery = true)
    List<Map<String,Object>> afficherListeDiplomeDuProfil(long id);

    @Query(value = "SELECT * FROM experiences_pro where id_profil = :id " , nativeQuery = true)
    List<Map<String,Object>> afficherListeExpProDuProfil(long id);

}
