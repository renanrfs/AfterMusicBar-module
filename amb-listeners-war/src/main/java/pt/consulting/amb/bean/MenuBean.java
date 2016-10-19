package pt.consulting.amb.bean;

import java.io.Serializable;
import java.util.Iterator;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import pt.consulting.amb.entity.Menu;
import pt.consulting.amb.entity.MenuItem;

@ManagedBean(name = "menuBean", eager = true)
public class MenuBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @ManagedProperty(value = "#{menu}")
    private Menu menu;

    @PostConstruct
    public void init() {
	System.out.println("init");
    }

    public String submit() {
	System.out.println(menu.getName() + ":" + menu.getDescription() + ":"
		+ menu.getItems().size());
	return null;
    }

    public String edit(Long id) {
	System.out.println(id);
	for (Iterator iterator = menu.getItems().iterator(); iterator.hasNext();) {
	    MenuItem type = (MenuItem) iterator.next();
	    type.setDescription("bla bla bla bla");
	    System.out.println("edited...");
	    return null;
	}
	return null;
    }

    public void delete(Long id) {
	System.out.println(id);
	for (Iterator iterator = menu.getItems().iterator(); iterator.hasNext();) {
	    MenuItem item = (MenuItem) iterator.next();
	    menu.getItems().remove(item);
	    System.out.println("removed...");
	    return;
	}
    }

    /**
     * @return the menu
     */
    public Menu getMenu() {
	return menu;
    }

    /**
     * @param menu
     *            the menu to set
     */
    public void setMenu(Menu menu) {
	this.menu = menu;
    }

}
