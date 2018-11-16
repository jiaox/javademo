package com.jiaox.thread.future;
import java.util.concurrent.ConcurrentHashMap;
/**
 * 我们自己写一个简单的数据库连接池，能够复用数据库连接，并且能在高并发情况下正常工作
 * 我们用了ConcurrentHashMap，这样就不必把getConnection方法置为synchronized(当然也可以用Lock)，
 * 当多个线程同时调用getConnection方法时，性能大幅提升。
 * 貌似很完美了，但是有可能导致多余连接的创建，推演一遍：
 * 某一时刻，同时有3个线程进入getConnection方法，调用pool.containsKey(key)都返回false，然后3个线程各自都创建了连接。
 * 虽然ConcurrentHashMap的put方法只会加入其中一个，但还是生成了2个多余的连接。如果是真正的数据库连接，那会造成极大的资源浪费。
 * @author Administrator
 *
 */
public class ConnectionPoolTest {
	private ConcurrentHashMap<String, Connection> pool = new ConcurrentHashMap<String, Connection>();
	public Connection getConnection(String key) {
		Connection conn = null;
		if (pool.containsKey(key)) {
			conn = pool.get(key);
		} else {
			conn = createConnection();
			pool.putIfAbsent(key, conn);//
		}
		return conn;
	}
	public Connection createConnection() {
		return new Connection();
	}
	class Connection {
	}
}
