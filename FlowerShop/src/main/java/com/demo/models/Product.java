package com.demo.models;
// Generated Apr 1, 2022, 12:33:46 AM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Product generated by hbm2java
 */
@Entity
@Table(name = "product", catalog = "demo_hibernate2")
public class Product implements java.io.Serializable {

	private Integer id;
	private Category category;
	private String name;
	private double price;
	private int quantity;
	private boolean status;
	private Date created;
	private String description;
	private String photo;
	private Set<Ordersdetail> ordersdetails = new HashSet<Ordersdetail>(0);

	public Product() {
	}

	public Product(Category category, String name, double price, int quantity, boolean status, Date created,
			String photo) {
		this.category = category;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.status = status;
		this.created = created;
		this.photo = photo;
	}

	public Product(Category category, String name, double price, int quantity, boolean status, Date created,
			String description, String photo, Set<Ordersdetail> ordersdetails) {
		this.category = category;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.status = status;
		this.created = created;
		this.description = description;
		this.photo = photo;
		this.ordersdetails = ordersdetails;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "categoryid", nullable = false)
	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Column(name = "name", nullable = false, length = 250)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "price", nullable = false, precision = 22, scale = 0)
	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Column(name = "quantity", nullable = false)
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Column(name = "status", nullable = false)
	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "created", nullable = false, length = 10)
	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Column(name = "description", length = 65535)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "photo", nullable = false, length = 250)
	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
	public Set<Ordersdetail> getOrdersdetails() {
		return this.ordersdetails;
	}

	public void setOrdersdetails(Set<Ordersdetail> ordersdetails) {
		this.ordersdetails = ordersdetails;
	}

}