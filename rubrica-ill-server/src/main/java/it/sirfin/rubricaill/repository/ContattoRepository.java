package it.sirfin.rubricaill.repository;

import it.sirfin.rubricaill.model.Contatto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContattoRepository extends JpaRepository<Contatto, Long> {

    List<Contatto> findByNomeLikeOrCognomeLikeOrTelefonoLike(String n, String c, String t);
}
