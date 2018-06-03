public class Usbdemo {
	public static void main(String[] args) {
		// 将设备插入母板
		MouthBoard.pluginIn(new UMouse());
		MouthBoard.pluginIn(new UMouse());
		MouthBoard.pluginIn(new UMouse());
		MouthBoard.pluginIn(new keyboard());
		MouthBoard.pluginIn(new keyboard());
		MouthBoard.pluginIn(new keyboard());
		MouthBoard.pluginIn(new keyboard());
		// 取出usb设备，使其工作
		MouthBoard.doWork();
	}
}
// Usb规范
interface IUse{
	void swapData();
}
// 鼠标
class UMouse implements IUsb{
	public void swapData(){
		System.out.println("Usb鼠标接入，开始工作");
	}
}
// 键盘
class keyboard implements IUsb{
	public void swapData(){
		System.out.println("Usb键盘接入，开始工作");
	}
}
// 母板
class MouthBoard{
	private static IUsb[] usbs = new IUsb[6];
	private static int index = 0;    // 表示插入第几个位置
	// 插入卧槽
	public static void pluginIn(IUsb usb){
		if(index == usbs.length){
			System.out.println("卧槽，已经插满！！！");
			return;
		}
		usbs[index] = usb;
		index++;
	}
	// 使usb设备工作
	public static void doWork(){
		for(IUsb u : usbs){
			if(u != null){
				u.swapData();
			}
		}
	}
	
}