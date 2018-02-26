package publishEvent;

import java.util.Date;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class CustomListener implements ApplicationListener {
	private String name;
	private Date time;

	public void onApplicationEvent(ApplicationEvent event) {
		if(event instanceof SomeEvent){
			SomeEvent se = (SomeEvent)event;
			System.out.println(name+" "+time.getHours()+"点"+time.getMinutes()+"分"
					+"监听到SomeEvent："+event.getSource());
			System.out.println(se.toString());
		}else if(event instanceof AnotherEvent){
			System.out.println("监听到AnotherEvent："+event.getSource());
		}
	}

	public String getName() {	return name;}
	public void setName(String name) {	this.name = name;}

	public Date getTime() {return time;}
	public void setTime(Date time) {this.time = time;}

}
