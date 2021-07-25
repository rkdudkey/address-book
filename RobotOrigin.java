package tts.addressbook;

public class RobotOrigin {

	public static boolean judgeCircle(String moves) {
		
		int x = 0;
	    int y = 0;
	    
		 for (int i=0; i < moves.length(); i++){
		        if( moves.charAt(i) == 'U'){
		            x = x+1;
		        } else if( moves.charAt(i) == 'D'){
		            x = x-1;
		        } else if (moves.charAt(i) == 'L'){
		            y = y+1;
		        } else if ( moves.charAt(i)== 'R'){
		            y = y-1;
		        }
		    }

		    return (x==0) && (y == 0);
	}
	public static void main(String[] args) {
		
		System.out.println(judgeCircle("UDLLLLR")); //false
		System.out.println(judgeCircle("UD")); //true
		System.out.println(judgeCircle("RRDD"));//false
		System.out.println(judgeCircle("LDRRLRUULR")); //false

	}

}
