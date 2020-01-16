package me.namila.RESTSpringTest.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import me.namila.RESTSpringTest.Model.Dictionary.PayType;
import me.namila.RESTSpringTest.Model.Dictionary.System;
import me.namila.RESTSpringTest.Model.Dictionary.TarifType;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "TARIFF")
@Getter
@Setter

public class Tarif  extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_tarif")
    @SequenceGenerator(name = "seq_tarif", sequenceName = "seq_tarif", allocationSize = 1)
    @Column(name = "ID", updatable = false, nullable = false)
    private long id;

    @NotNull
    @Column(name = "CODE")
    private String code;

    @NotNull
    @Column(name = "LABEL")
    private String label;

    @NotNull
    @Column(name = "SUM")
    private Integer sum;

    @ManyToOne()
    @JoinColumn(name = "CLIENT")
    private Client client;

    @ManyToOne()
    @JoinColumn(name = "SYSTEM")
    private System system;

    @ManyToOne()
    @JoinColumn(name = "TARIFF_PLAN_ID")
    private TarifPlan tarifPlan;

    @ManyToOne()
    @JoinColumn(name = "PAYTYPE")
    private PayType payType;

    @ManyToOne()
    @JoinColumn(name = "TARIF_TYPE")
    private TarifType tarifType;

    @JsonIgnore
    @OneToMany(mappedBy = "tarif", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<TarifScale> tarifScalesList;
}
