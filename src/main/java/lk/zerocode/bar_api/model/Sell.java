package lk.zerocode.bar_api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data

public class Sell {
    @Id  /*private key*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sellId;
    private String sellQuantity;
    private LocalDate sellDate;
    private LocalTime sellTime;

    @ManyToOne
    @JoinColumn(name = "barStockId",nullable = false)
    private BarStock barStock;

}
