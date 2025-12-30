package lk.zerocode.bar_api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data

public class Restock {
    @Id  /*private key*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long restockId;

    private String quantity;
    private Double costPrice;
    private Double sellingPrice;
    private LocalDate date;
    private String supplier;

    @ManyToOne
    @JoinColumn(name = "barStockId",nullable = false)
    private BarStock barStock;
}
