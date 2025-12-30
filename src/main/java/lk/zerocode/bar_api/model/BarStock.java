package lk.zerocode.bar_api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data

public class BarStock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long barStockId;

    private Long quantity;

    @OneToOne(mappedBy = "barStock")
    private Branch branch;

    @OneToMany (mappedBy ="barStock")
    private List<Restock> restockList;

    @OneToMany (mappedBy ="barStock")
    private List<Sell> sellList;

}
