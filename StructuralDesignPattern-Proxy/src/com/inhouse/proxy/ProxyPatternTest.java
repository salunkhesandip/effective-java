package com.inhouse.proxy;

public class ProxyPatternTest {

	public static void main(String[] args) {
		CommandExecutor executor = new CommandExecutorProxy("admin","password");
		try {
			executor.runCommand("rm");
		} catch(Exception e) {
			System.out.println("Exception " + e.getMessage());
		}

	}

}
