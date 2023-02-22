package ch.noser.warenkorb.warenkorb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarenkorbRepository extends JpaRepository<Warenkorb, Integer> {
}
