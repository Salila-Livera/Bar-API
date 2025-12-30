package lk.zerocode.bar_api.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Bottle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bottleId;

    private String bottleName;

    @Column(nullable = false, unique = true)  // Barcode must be unique
    private String barcode;

    @Enumerated(EnumType.STRING)
    private BottleSize bottleSize;

    @ManyToOne
    @JoinColumn(name = "barStockId",nullable = false)
    private BarStock barStock;

    @ManyToOne
    @JoinColumn(name = "productId",nullable = false)
    private ProductDetails productDetails;
}
