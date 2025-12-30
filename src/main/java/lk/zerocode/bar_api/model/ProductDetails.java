package lk.zerocode.bar_api.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ProductDetails {
    @Id  /*private key*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    private String brandName;
    private String liquorType;
    private String productName;


    @Column(length = 500)  /*Image URL / file path can be long Prevent DB truncation errors*/
    private String productImage;

    @Enumerated(EnumType.STRING)
    private ProductOrigin productOrigin;
}
