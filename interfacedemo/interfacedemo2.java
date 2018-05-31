public class interfacedemo2 {
	public static void main(String[] args) {
		Mouse mouse = new Mouse();
		Print print = new Print();
		MotherBoard.pluginIn(mouse);
		MotherBoard.pluginIn(print);
	}
}
// usb规范
interface IUsb{
	void swapData();
}
// 主板、模板
class MotherBoard{
	public static void pluginIn(IUsb usb){
		usb.swapData();
	}
}
// Usb鼠标
class Mouse implements IUsb{
	public void swapData(){
		System.out.println("USB鼠标接入");
	}
}
// Usb打印机
class Print implements IUsb{
	public void swapData(){
		System.out.println("USB打印机接入");
	}
}