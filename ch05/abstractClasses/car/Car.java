package abstractClasses.car;

public abstract class Car {
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnoff();
	
	
	
final public void run() { // 주행
	start();  // 시동 걸었다
	drive();  // 운전한다
	stop();   // 멈춘다
	turnoff();  // 시동을 끈다
	System.out.println("==================");
	}
}
