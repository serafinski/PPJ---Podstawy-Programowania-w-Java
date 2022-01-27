import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public
    class Task2802 {

    public static void main(String[] args) {
    	int val[]=new int[4];
    	
		try {
			FileInputStream  bit= new FileInputStream("D:\\PJATK\\Semestr 1\\Podstawy Programowania w Javie\\PPJ\\Ćwiczenia 27\\src\\liczba.txt");
	
    		int x;
    		
    		int licznik=0;
    		while((x=bit.read())!=-1) {
    			if(licznik<8 ) {
	    			if(x==49) {
	    				val[0]=val[0]*10+1;
	    				
	    			}else if(x==48) {
	    				val[0]=val[0]*10;
	    			}else {
	    				System.out.println("error");
	    			}
	    			licznik++;
	    			
	    			}else if(licznik<16 && licznik>=8 ) {
        			if(x==49) {
        				val[1]=val[1]*10+1;
        			}else if(x==48) {
        				val[1]=val[1]*10;
        			}else {
        				System.out.println("error");
        			}
        			licznik++;
        			
        			}else if(licznik<24 && licznik>=16 ) {
        			if(x==49) {
        				val[2]=val[2]*10+1;
        			}else if(x==48) {
        				val[2]=val[2]*10;
        			}else {
        				System.out.println("error");
        			}
        			licznik++;
        			} else if(licznik<31 && licznik>=24 ) {
            			if(x==49) {
            				val[3]=val[3]*10+1;
            			}else if(x==48) {
            				val[3]=val[3]*10;
            			}else {
            				System.out.println("error");
            			}
            			licznik++;
            			}
    		}    


        } catch (FileNotFoundException e) {
            System.out.println(e);
          
        } catch (IOException e) {
            System.out.println(e);
            
        }
    	
	
		 String str="";
 	for(int w=val.length-1;w>=0;w--) {
    	int kon=val[w];
    	//System.out.println("kon "+kon);
    	int licz=0;
// na system 10
    	
    	for(int k=0;k<8;k++) {
    		if(kon%2==1) {
    			licz=(int)(licz+Math.pow(2, k));
    			kon=kon/10;  			
    		}else {
    			kon=kon/10;	
    		}
    		
    	}
    	
    	
  	
 // na system 2
    	if(w==3) {
        for (int i = 0; i < 7; i += 1){
            int tmp = ((licz >> i) & 1);
            str = ((licz>> i) & 1) + str;
        }
        }else {
        	for (int i = 0; i < 8; i += 1){
                int tmp = ((licz >> i) & 1);
                str = ((licz>> i) & 1) + str;
        	}
        }
      
        //10000000100000001000000001000001
        //1000000010000000100000001000001
        
			try {
				FileOutputStream fos = new FileOutputStream("D:\\PJATK\\Semestr 1\\Podstawy Programowania w Javie\\PPJ\\Ćwiczenia 27\\src\\liczba_zmieniona.txt");
				
					fos.write(str.getBytes(StandardCharsets.UTF_8));
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
 	}
    }
}