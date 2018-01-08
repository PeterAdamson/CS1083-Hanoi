//Authors: Peter Adamson, Tristen Tulkens

public class HanoiDriver{

	public static void main(String[] args){

		try{
			HanoiLoop test = new HanoiLoop();
			int[][] TOH = new int[4][3];
			for(int i = 0; i < TOH.length; i++){
				TOH[i][0] = i + 1;
			}

			System.out.println("Step: 1");
			for(int i = 0; i <= 3; i++){
				for(int j = 0; j <= 2; j++){
					System.out.printf("%d\t", TOH[i][j]);
				}
				System.out.printf("%n");
			
			}
			System.out.printf("%n-----------------%n");
			int[][] test1 = test.solve(TOH);
		}

		catch(Exception exp){
			System.out.println("Something went wrong while reading your arguments. \n\n" + exp);
		}
		
	}
}
