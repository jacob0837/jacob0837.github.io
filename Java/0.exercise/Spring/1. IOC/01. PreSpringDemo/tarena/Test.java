package tarena;

//程序员的业务类
public class Test {

	public static void main(String[] args) {
		
		//产生BusinessFactoryIOC，且通过其取得Business
		Business business = BusinessFactoryIOC.getInstance().getBusiness();

		//调用存储方法
		business.save();
		
		
	}

}


/* 打印结果：
 * 存储至U盘...
 */
