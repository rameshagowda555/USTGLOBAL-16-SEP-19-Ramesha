package com.ustglobal.lamdaexpression;

public class TestSquare {
	public static void main(String[] args) {
		SquareInterface sq = (x)->
		{
			return x*x;
		};
		
		int res = sq.square(5);
		System.out.println("square is "+res);
	}
}
