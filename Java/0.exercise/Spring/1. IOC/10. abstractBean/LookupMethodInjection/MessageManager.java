package LookupMethodInjection;

public abstract class MessageManager {
	
	public void display(){
		Message message = createMessage();
		System.out.println(message.toString());
	}
	
	public abstract Message createMessage();

}

/*
 * Spring容器所做的事：
 * public class SpringIOC extends MessageManager {
 *    public Message createMessage() {
 *      //通过反射
 *       }
 * }
 */