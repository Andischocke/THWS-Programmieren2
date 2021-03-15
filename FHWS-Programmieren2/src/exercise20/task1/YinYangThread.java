package exercise20.task1;

public class YinYangThread extends Thread {
	public String name;
	public int interval;

	public YinYangThread(String name, int interval) {
		this.name = name;
		this.interval = interval;
	}

	@Override
	public void run() {
		while (true) {
			try {
				System.out.println(name);
				Thread.sleep(interval * 100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Thread yin = new YinYangThread("Yin", 5);
		Thread yang = new YinYangThread("Yang", 5);
		yin.start();
		yang.start();
	}
}