package lk.zerocode.bar_api.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long branchId;

    private String branchName;
    private String location;

    @ManyToOne
    @JoinColumn(name = "barId",nullable = false)
    private Bar bar;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "barStockId", nullable = false)
    private BarStock barStock;


}
