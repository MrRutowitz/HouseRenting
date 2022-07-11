package pl.houserenting.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.houserenting.model.Flat;

public interface FlatRepository extends JpaRepository<Flat,Long> {


}
