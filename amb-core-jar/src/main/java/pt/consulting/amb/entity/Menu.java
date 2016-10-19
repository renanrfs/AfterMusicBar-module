package pt.consulting.amb.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "menu")
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String description;

    private List<MenuItem> items;

    private Date creationDate;

    private String creationUser;

    private Date updateDate;

    private String updateUser;

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
     * @return the items
     */
    public List<MenuItem> getItems() {
	if (null == items) {
	    items = new ArrayList<MenuItem>();
	    items.add(new MenuItem(1L, "sumo", "sumos diversos", 2.50));
	    items.add(new MenuItem(2L, "sumo", "sumos diversos", 2.50));
	    items.add(new MenuItem(3L, "sumo", "sumos diversos", 2.50));
	    items.add(new MenuItem(4L, "sumo", "sumos diversos", 2.50));
	}
	return items;
    }

    /**
     * @param items
     *            the items to set
     */
    public void setItems(List<MenuItem> items) {
	this.items = items;
    }

    /**
     * @return the creationDate
     */
    public Date getCreationDate() {
	// return creationDate;
	return new Date();
    }

    /**
     * @param creationDate
     *            the creationDate to set
     */
    public void setCreationDate(Date creationDate) {
	this.creationDate = creationDate;
    }

    /**
     * @return the creationUser
     */
    public String getCreationUser() {
	// return creationUser;
	return "renan.souza";
    }

    /**
     * @param creationUser
     *            the creationUser to set
     */
    public void setCreationUser(String creationUser) {
	this.creationUser = creationUser;
    }

    /**
     * @return the updateDate
     */
    public Date getUpdateDate() {
	// return updateDate;
	return new Date();
    }

    /**
     * @param updateDate
     *            the updateDate to set
     */
    public void setUpdateDate(Date updateDate) {
	this.updateDate = updateDate;
    }

    /**
     * @return the updateUser
     */
    public String getUpdateUser() {
	// return updateUser;
	return "lucas.vasconcellos";
    }

    /**
     * @param updateUser
     *            the updateUser to set
     */
    public void setUpdateUser(String updateUser) {
	this.updateUser = updateUser;
    }
}
