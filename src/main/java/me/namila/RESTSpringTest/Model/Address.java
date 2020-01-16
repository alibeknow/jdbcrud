package me.namila.RESTSpringTest.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import me.namila.RESTSpringTest.Model.Dictionary.AddressType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;


@Entity
@Table(name = "ADDRESS")
@Getter
@Setter
public class Address extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_client")
    @SequenceGenerator(name = "seq_client", sequenceName = "seq_client", allocationSize = 1)
    @Column(name = "ID", updatable = false, nullable = false)
    private long id;

    @NotNull
    @Column(name = "ADDRESS")
    private String address;

    @ManyToOne()
    @JoinColumn(name = "CLIENT")
    private Client client;

    @ManyToOne()
    @JoinColumn(name = "ADDRESTYPE")
    private AddressType addressType;





}
