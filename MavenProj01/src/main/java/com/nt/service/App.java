package com.nt.service;

public class App 
{
	public int sum(int x, int y) {
		return x+y;
	}
	public int sub(int x, int y) {
		return x-y;
	}
	public int mul(int x, int y) {
		return x*y;
	}
<<<<<<< HEAD
	
=======

	public String reverse(String str) {
		StringBuffer sb = new StringBuffer();
		return sb.reverse().toString();
	}
	public int findLength(String name) {
		System.out.println("App.findNameLength() bug 123 fixing is going on...");
		return name.length();

	}
>>>>>>> branch 'master' of https://github.com/shailaja9p/JRTP701Repo-EclipseApps.git
    public static void main( String[] args )
    {
    	App app = new App();
    	System.out.println("sum is "+app.sum(10,20));
    }
}
