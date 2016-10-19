package pt.consulting.amb.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.model.SelectItem;

import pt.consulting.amb.entity.Band;

@ManagedBean(name = "bandBean", eager = true)
public class BandBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @ManagedProperty(value = "#{band}")
    private Band band;

    private List<SelectItem> musicalStyles;

    public String submit() {
	System.out.println("'" + band.getName() + "':'" + band.getDescription()
		+ "':'" + band.getMusicalStyle() + "'");

	if (band.getMusicalStyle().equals("2")) {
	    System.out.println("success");
	    return "/pages/schedule/home";

	} else if (band.getMusicalStyle().equals("3")) {
	    System.out.println("failure");
	    return null;
	}
	System.out.println("schedule");
	return "/home";
    }

    /**
     * @return the band
     */
    public Band getBand() {
	System.out.println("getBand()");
	return band;
    }

    /**
     * @param band
     *            the band to set
     */
    public void setBand(Band band) {
	System.out.println("init - setBand(Band band)");
	System.out.println("'" + band.getName() + "':'" + band.getDescription()
		+ "':'" + band.getMusicalStyle() + "'");
	System.out.println("end - setBand(Band band)");
	this.band = band;
    }

    /**
     * @return the musicStyles
     */
    public List<SelectItem> getMusicalStyles() {
	musicalStyles = new ArrayList<SelectItem>();
	musicalStyles.add(new SelectItem("1", "Item 1"));
	musicalStyles.add(new SelectItem("2", "Item 2"));
	musicalStyles.add(new SelectItem("3", "Item 3"));
	return musicalStyles;
    }

    /**
     * @param musicStyles
     *            the musicStyles to set
     */
    public void setMusicalStyles(List<SelectItem> musicalStyles) {
	this.musicalStyles = musicalStyles;
    }
}
