package pt.consulting.amb.entity;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "band")
public class Band implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String description;

    private String musicalStyle;

    private List<Player> members;

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
     * @return the members
     */
    public List<Player> getMembers() {
	return members;
    }

    /**
     * @param members
     *            the members to set
     */
    public void setMembers(List<Player> members) {
	this.members = members;
    }

    /**
     * @return the musicalStyle
     */
    public String getMusicalStyle() {
	return musicalStyle;
    }

    /**
     * @param musicalStyle
     *            the musicalStyle to set
     */
    public void setMusicalStyle(String musicalStyle) {
	this.musicalStyle = musicalStyle;
    }
}
