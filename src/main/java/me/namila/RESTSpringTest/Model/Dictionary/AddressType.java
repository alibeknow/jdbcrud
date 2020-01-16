package me.namila.RESTSpringTest.Model.Dictionary;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import me.namila.RESTSpringTest.Model.AbstractEntity;
import me.namila.RESTSpringTest.Model.Address;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;


@Entity
@Table(name = "DICT_ADDRESSTYPE")
@Getter
@Setter
public class AddressType extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_dict")
    @SequenceGenerator(name = "seq_dict", sequenceName = "seq_dict", allocationSize = 1)
    @Column(name = "ID", updatable = false, nullable = false)
    private long id;

    @NotNull
    @Column(name = "CODE")
    private String code;

    @JoinColumn(name = "DESCRIPTION")
    private String description;

    @JsonIgnore
    @OneToMany(mappedBy = "addressType", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Address> addressesList;

}
