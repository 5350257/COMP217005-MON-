package javaPrograming.weekA.object;

public class LampExample {

	public static void main(String[] args) {
		Lamp lamp = new Lamp();
		System.out.println("���� ���� : " + (lamp.power == true ? "On" : "Off"));
//		System.out.println(lamp.bright);
//		lamp.lightUp();
//		lamp.lightDown();
		lamp.turnOn();
//		lamp.lightDown();
		lamp.lightUp();
		lamp.lightUp();
	}

}
