package com.atguigu.aop.bean;

import org.springframework.stereotype.Component;

@Component
public class EasyImpl implements MathCalculator{

	@Override
	public int add(int i, int j) {
		
		int result = i + j;
		
		System.out.println("-->方法内部打印：result="+result);
		
		return result;
	}

	@Override
	public int sub(int i, int j) {
		
		int result = i - j;
		
		System.out.println("-->方法内部打印：result="+result);
		
		return result;
	}

	@Override
	public int mul(int i, int j) {
		
		int result = i * j;
		
		System.out.println("-->方法内部打印：result="+result);
		
		return result;
	}

	@Override
	public int div(int i, int j) {
		
		int result = i / j;
		
		System.out.println("-->方法内部打印：result="+result);
		
		return result;
	}

	@Override
	public double add(double i, double j, double k) {
		
		double result = i + j + k;
		
		System.out.println("-->方法内部打印：result="+result);
		
		return result;
	}

	@Override
	public void sub(double i, double j, double k) {
		
		double result = i - j - k;
		
		System.out.println("-->方法内部打印：result="+result);
		
	}

}
