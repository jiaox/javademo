package com.jiaox.thread.future;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
/**
 * 结合之前Future模式的实现分析：当3个线程都要创建连接的时候，如果只有一个线程执行createConnection方法创建一个连接，
 * 其它2个线程只需要用这个连接就行了。再延伸，把createConnection方法放到一个Callable的call方法里面，
 * 然后生成FutureTask。我们只需要让一个线程执行FutureTask的run方法，其它的线程只执行get方法就好了。
 * @author Administrator
 *
 */
public class ConnectionPoolTest2 {
	private ConcurrentHashMap<String, FutureTask<Connection>> pool = new ConcurrentHashMap<String, FutureTask<Connection>>();
	public Connection getConnection(String key) throws InterruptedException, ExecutionException {
        FutureTask<Connection> connectionTask = pool.get(key);
        if (connectionTask != null) {
            return connectionTask.get();
        } else {
            Callable<Connection> callable = new Callable<Connection>() {
                @Override
                public Connection call() throws Exception {
                    return createConnection();
                }
            };
            FutureTask<Connection> newTask = new FutureTask<Connection>(callable);
            connectionTask = pool.putIfAbsent(key, newTask);
            if (connectionTask == null) {
                connectionTask = newTask;
                connectionTask.run();//执行run方法，创建connection
            }
            return connectionTask.get();
        }
    }
    public Connection createConnection() {
        return new Connection();
    }
    class Connection {
    }
}
