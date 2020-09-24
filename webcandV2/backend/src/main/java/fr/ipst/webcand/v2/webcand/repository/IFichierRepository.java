package fr.ipst.webcand.v2.webcand.repository;

import fr.ipst.webcand.v2.webcand.entities.FichierEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface IFichierRepository extends JpaRepository<FichierEntity, Long> {
    void deleteById(Long idDocument);

    @Query(value = "SELECT * FROM fichiers where id_user = :idUser " , nativeQuery = true)
    List<Map<String,Object>> AfficherLesFichiersDuUser(Long idUser);
}
