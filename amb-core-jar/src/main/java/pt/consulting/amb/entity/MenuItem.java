package pt.consulting.amb.entity;

import java.io.Serializable;

public class MenuItem implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private String description;

    private Double price;

    public MenuItem(Long id, String name, String description, Double price) {
	this.id = id;
	this.name = name;
	this.description = description;
	this.price = price;
    }

    /**
     * @return the id
     */
    public Long getId() {
	return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(Long id) {
	this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
	return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
	this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
	return description;
    }

    /**
     * @param description
     *            the description to set
     */
    public void setDescription(String description) {
	this.description = description;
    }

    /**
     * @return the price
     */
    public Double getPrice() {
	return price;
    }

    /**
     * @param price
     *            the price to set
     */
    public void setPrice(Double price) {
	this.price = price;
    }

}
