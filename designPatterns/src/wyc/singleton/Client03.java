package wyc.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * 比较5种单例模式的效率 <br>
 * 
 * @author 王以诚
 */
public class Client03 {
	public static void main(String[] args) throws Exception {
		long start = System.currentTimeMillis();
		int threadNum = 10;
		final CountDownLatch countDownLatch = new CountDownLatch(threadNum);

		// 启动10个线程，每个线程调用10万次方法
		for (int i = 0; i < 10; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					for (int i = 0; i < 100000000; i++) {
						Object o = SingletonDemo01.getInstance();
					}
					// 线程运行结束后计数减1
					countDownLatch.countDown();
				}
			}).start();
		}
		countDownLatch.await(); // main线程阻塞，直到计数器变为0才会继续往下执行
		long end = System.currentTimeMillis();
		System.out.println("总耗时：" + (end - start) + "毫秒");
	}
}
