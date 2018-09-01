package models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="drugs")
public class Drug {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="formula")
	private String formula;
	
	@Column(name="expiry")
	private Date expiry;
	
	@Column(name="supplier")
	private String supplier;
	
	@Column(name="units")
	private Integer units;

	public Drug() {
		super();
	}

	public Drug(String name, String formula, Date expiry, String supplier, Integer units) {
		super();
		this.name = name;
		this.formula = formula;
		this.expiry = expiry;
		this.supplier = supplier;
		this.units = units;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFormula() {
		return formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public Date getExpiry() {
		return expiry;
	}

	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public Integer getUnits() {
		return units;
	}

	public void setUnits(Integer units) {
		this.units = units;
	}

	@Override
	public String toString() {
		return "Drug [id=" + id + ", name=" + name + ", formula=" + formula + ", expiry=" + expiry + ", supplier="
				+ supplier + ", units=" + units + "]";
	}
	
}
