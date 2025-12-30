package lk.zerocode.bar_api.model.repository;

import lk.zerocode.bar_api.model.Restock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestockRepository extends JpaRepository<Restock,Long> {
}
