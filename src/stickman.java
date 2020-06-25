
public class stickman {
	
	public static void main(String[] args) {
		
				int stickmanHeight = Integer.parseInt(args[0]);
				int stairHeight = Integer.parseInt(args[1]);
				
				
				stickMan(3,0);
		
		
	}
	
	public static void stickMan(int stickmanHeight, int stairHeight ) {
		
		
		//this for loop creates the stickman on different step each turn.
		for (int m=0 ;m<=stairHeight;m++) {
			
			for (int i=1;i<=stairHeight-m;i++) {//println executes to have same height in each frame..
				System.out.println();
			}
			space(m);
			System.out.println(" 0 ");
			space(m);
			System.out.println("/|\\");
			
		for(int w=1; w<=stickmanHeight-stairHeight+m-3; w++) {
			//the part of torso without stair can be printed with that loop
		
		space(m);
		System.out.println(" | ");
		}
		//all for loops above aim to print head,and torso above stair.
		
		// the stair with "|" part of body is printed by the help of stairAndMan method.
		stairAndMan(stairHeight,m);
		
		space(m);
		System.out.print("/ \\___|");//the stair steps with stickman foot are printed.
			
			for (int star=1; star<=stairHeight-m; star++) {
				//stars between two vertical bar are printed.
				System.out.print("***");
			}
			System.out.println("|");
			
			
			belowMan(stairHeight, m);
			
		System.out.println();
		System.out.println();
		System.out.println();
		}
		
	}
	//space method prints the spaces respect to m variable defined in stickMan method
		public static void space(int m) {
		 
		for (int q=0;q<=m-1;q++) {
			System.out.print("   ");	
		}
		
		}
		public static void stairAndMan(int stairHeight,int m) {
			for (int i=1;i<=stairHeight-m;i++) {
				
				space(m);
				System.out.print(" | ");
				
				//spaces after "|" are printed
				for (int s=0; s<=stairHeight-i-m; s++) {
					System.out.print("   ");
				}
				
				System.out.print("___|");
				for (int k=1; k<i; k++) {
					System.out.print("***");
					
				}
				System.out.println("|");}
		}
		public static void belowMan(int stairHeight,int m) {
			for(int below=1; below<=m; below++) {
				//stair below stickman is printed.
				for (int k=0; k<m-below+1; k++) {// spaces before stair print.
				System.out.print("   ");
			}
				System.out.print("___|");
				for(int star=1; star<=below+stairHeight-m; star++) {
					System.out.print("***");
				}
				System.out.println("|");}
		}
	
}


		
	

	
	
			 
			
		
	
