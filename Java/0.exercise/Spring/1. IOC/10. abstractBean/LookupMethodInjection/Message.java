package LookupMethodInjection;

import java.util.Date;

public class Message {
    private String sysTime;
    
    public Message() {
    	  sysTime = "当前时间为：" + new Date();
    }
    
    @Override
    public String toString() {
       return sysTime.toString();
    }


}
