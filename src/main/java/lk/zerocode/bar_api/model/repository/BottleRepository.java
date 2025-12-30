package lk.zerocode.bar_api.model.repository;

import lk.zerocode.bar_api.model.Bottle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BottleRepository extends JpaRepository<Bottle,Long> {
}
