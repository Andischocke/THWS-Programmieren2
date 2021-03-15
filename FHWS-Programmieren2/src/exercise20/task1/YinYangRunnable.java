package exercise20.task1;

public class YinYangRunnable implements Runnable {
	public String name;
	public int interval;

	public YinYangRunnable(String name, int interval) {
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
		Runnable yinRunnable = new YinYangRunnable("Yin", 5);
		Runnable yangRunnable = new YinYangRunnable("Yang", 5);
		Thread yin = new Thread(yinRunnable);
		Thread yang = new Thread(yangRunnable);
		yin.start();
		yang.start();
	}
}