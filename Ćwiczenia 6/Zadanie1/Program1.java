public
	class Program1 {
		public static void main (String [] args){
			int valMb = 0b0111_1111_1111_1111_1111_1111_1111_1111;
			int valMx = 0x7F_FF_FF_FF;
			int valMo = 017777777777;
			int valMinb = 0b1000_0000_0000_0000_0000_0000_0000_0000;
			int valMinx = 0x80000000;
			char chrMin = '\u0000';
			char chrMax = '\uffff';
			boolean logic1 = true;
			boolean logic2 = false;
			float valFS = 3.4028235e38f;
			float valFSx = 0x1.fffffeP+127f;
			double val = 0x1.fffffeP+1023;
			double valMin = 0x0.0_0000_0000_0001P-1022;
		}
	}