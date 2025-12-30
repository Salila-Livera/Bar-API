package lk.zerocode.bar_api.model.repository;

import lk.zerocode.bar_api.model.BarStock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarStockRepository extends JpaRepository<BarStock,Long> {
}
