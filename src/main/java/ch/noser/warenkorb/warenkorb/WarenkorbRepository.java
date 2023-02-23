package ch.noser.warenkorb.warenkorb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface WarenkorbRepository extends JpaRepository<Warenkorb, UUID> {

}
