package tarena;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;


//一个自定义的IoC容器
//功能：
//   1.读取spring.properties文件的内容
//   2.通过反射创建相关的实例
//   3.设置实例间的关系
//   4.采用单例模式
public class BusinessFactoryIOC {
	 
	private static BusinessFactoryIOC factoryioc;
	private Properties props = new Properties();
	private IDevice device;
	private Business business;
	
	private BusinessFactoryIOC() {
		try{
			//读取文件
			InputStream is = new FileInputStream("src/tarena/spring.properites");
			props.load(is);
			
			//通过反射取得业务类，和U盘的实例
			String usbClass = props.getProperty("usb.class");
			device = (IDevice)Class.forName(usbClass).newInstance();
			
			String businessClass = props.getProperty("business.class");
			business = (Business)Class.forName(businessClass).newInstance();
			
			//设置业务类和U盘的关系
			business.setDevice(device);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static BusinessFactoryIOC getInstance(){
		if(factoryioc==null){
			factoryioc = new BusinessFactoryIOC();
		}
		return factoryioc;
	}
	
	//提供取得Buinsess实例的方法
	public Business getBusiness(){
		return this.business;
	}
	
}






