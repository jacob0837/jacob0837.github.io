package publishEvent;

import org.springframework.context.ApplicationEvent;

public class SomeEvent extends ApplicationEvent {
	
  //需要知道事件源。 任何事件均为 ApplicationEvent 的子事件
	public SomeEvent(Object source){
		 super(source); //必须
	}
}
