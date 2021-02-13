package it.sirfin.rubricaill.repository;

import it.sirfin.rubricaill.model.ContattoReq;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContattoRepository extends JpaRepository<ContattoReq, Long> {
}
