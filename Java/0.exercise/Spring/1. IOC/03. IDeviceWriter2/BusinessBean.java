package IDeviceWriter2;

//ҵ����
public class BusinessBean {

	// ����IDevice�ӿ�
	private IDevice device;

	//�ֱ�Ϊ�����ṩ��ȡ������
	public IDevice getDevice() {	return device;}
	//������ע��ʵ����IDevice�ӿڵ�ʵ���࣬��UsbDevice��
	public void setDevice(IDevice device) {this.device = device;}
	
	//ҵ�񷽷�
	public void save(){device.saveToDevice();}

}




