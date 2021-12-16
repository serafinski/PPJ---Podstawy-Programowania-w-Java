package com.company;

public
	class Program3{
		public static void main (String[] args){
			byte val = 15;

			System.out.println(
				switch (val){
					case 0,1,2,3,4,5,6,7,8,9 -> ""+val;
					// case 10 -> "A";
					// case 11 -> "B";
					case 10,11,12,13,14,15 -> (char)('A' + (val-10));
					default -> "Error";
				}
				);
			
		}
	}