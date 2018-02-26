package tarena;

//业务类
public class Business {

	// 关联IDevice接口
	private IDevice device;

	//分别为属性提供存取方法。
	public IDevice getDevice() {
		return device;
	}

	//容器会注入实现了IDevice接口的实现类，例UsbDevice。
	public void setDevice(IDevice device) {
		this.device = device;
	}
	
	//业务方法
	public void save(){
		device.saveToDevice();	
	}

}




