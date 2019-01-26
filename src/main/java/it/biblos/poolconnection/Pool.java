package it.biblos.poolconnection;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariPoolMXBean;
import com.zaxxer.hikari.pool.HikariPool;

public class Pool implements HikariPoolMXBean {

	private HikariPool pool;
	
	public Pool(HikariConfig hc)
	{
		pool = new HikariPool(hc);
	}

	@Override
	public int getIdleConnections()
	{
		return pool.getIdleConnections();
	}

	@Override
	public int getActiveConnections()
	{
		return pool.getActiveConnections();
	}

	@Override
	public int getTotalConnections()
	{
		return pool.getTotalConnections();
	}

	@Override
	public int getThreadsAwaitingConnection()
	{
		return pool.getThreadsAwaitingConnection();
	}

	@Override
	public void softEvictConnections()
	{
		pool.softEvictConnections();
	}

	@Override
	public void suspendPool()
	{
		pool.suspendPool();
	}

	@Override
	public void resumePool()
	{
		pool.resumePool();
	}

}