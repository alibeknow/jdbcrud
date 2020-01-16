package me.namila.RESTSpringTest.Model.Dictionary;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import me.namila.RESTSpringTest.Model.AbstractEntity;
import me.namila.RESTSpringTest.Model.Client;
import me.namila.RESTSpringTest.Model.Contract;
import me.namila.RESTSpringTest.Model.Trn;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;



@Entity
@Table(name = "DICT_STATE", schema = "BILL", catalog = "")
@Setter
@Getter
public class State  extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_dict")
    @SequenceGenerator(name = "seq_dict", sequenceName = "seq_dict", allocationSize = 1)
    @Column(name = "ID", updatable = false, nullable = false)
    private long id;

    @NotNull
    @Column(name = "CODE")
    private String code;

    @NotNull
    @Column(name = "LABEL")
    private String label;

    @Column(name = "DESCRIPTION")
    private String description;

    @JsonIgnore
    @OneToMany(mappedBy ="state", cascade = {CascadeType.PERSIST, CascadeType.MERGE},targetEntity = Contract.class)
    private List<Contract> contractList;

    @JsonIgnore
    @OneToMany(mappedBy = "state", cascade = {CascadeType.PERSIST, CascadeType.MERGE},targetEntity = Client.class)
    private List<Client> clientList ;

    @JsonIgnore
    @OneToMany(mappedBy = "state", cascade = {CascadeType.PERSIST, CascadeType.MERGE},targetEntity = Trn.class)
    private List<Trn> trnsList;
}
