package me.namila.RESTSpringTest.Model.Dictionary;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import me.namila.RESTSpringTest.Model.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;



@Entity
@Table(name = "DICT_SYSTEM")
@Getter
@Setter
public class System  extends AbstractEntity
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_dict")
	@SequenceGenerator(name = "seq_dict", sequenceName = "seq_dict", allocationSize = 1)
	private long id;

	@NotNull
	@Column(name = "code")
	private String code;

	@NotNull
	@Column(name = "label")
	private String label;

	@Column(name = "description")
	private String description;

	@JsonIgnore
	@OneToMany(mappedBy = "system",  cascade = {CascadeType.PERSIST, CascadeType.MERGE},targetEntity = Contract.class)
	private List<Contract> contractList;

	@JsonIgnore
	@OneToMany(mappedBy = "system", cascade = {CascadeType.PERSIST, CascadeType.MERGE},targetEntity = Client.class)
	private List<Client> clientList;

	@JsonIgnore
	@OneToMany(mappedBy = "system", cascade = {CascadeType.PERSIST, CascadeType.MERGE},targetEntity = Trn.class)
	private List<Trn> trnsList;

	@JsonIgnore
	@OneToMany(mappedBy = "system", cascade = {CascadeType.PERSIST, CascadeType.MERGE},targetEntity = PayType.class)
	private List<PayType> payTypesList;

	@JsonIgnore
	@OneToMany(mappedBy = "system", cascade = {CascadeType.PERSIST, CascadeType.MERGE},targetEntity = Tarif.class)
	private List<Tarif> tarifsList;

	@JsonIgnore
	@OneToMany(mappedBy = "system", cascade = {CascadeType.PERSIST, CascadeType.MERGE},targetEntity = TarifPlan.class)
	private List<TarifPlan> tarifPlansList;
}
