package com.collections.lambdaExpressions;

public class LambdaExpression {

	public static void main(String[] args) {


		Time refVar = (min,sec) -> System.out.println(min +":"+ sec);
		refVar.click(45, 10);
	}

}

@FunctionalInterface
interface Time{
	void click(int min,int sec);
}
