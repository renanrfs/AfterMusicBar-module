package pt.consulting.amb.bean;

import javax.faces.bean.ManagedBean;

import pt.consulting.amb.entity.Schedule;

@ManagedBean(name = "schedule", eager = true)
public class ScheduleBean {

    public ScheduleBean() {
	System.out.println("ScheduleController started!");
    }

    public String getMessage() {
	System.out.println("Hello World");
	return "Hello World!";
    }

    public void setMessage(String message) {

    }

    public void add(Schedule schedule) {
	System.out.println("name: " + schedule.getName());
	System.out.println("description: " + schedule.getDescription());
    }
}
