//Authors: Peter Adamson, Tristen Tulkens

public class HanoiLoop{


	public int[][] solve(int[][] TOHToSolve){
	
		for(int tracker = 0; tracker <=14; tracker++){
			if(tracker%2 == 0){
				if(TOHToSolve[0][0] == 1){
					for(int i = TOHToSolve.length - 2; i >= 0; i--){
						TOHToSolve[i+1][1] = TOHToSolve[i][1];
					}
					TOHToSolve[0][1] = 1;

					for(int i = 0; i <= TOHToSolve.length - 2; i++){
						TOHToSolve[i][0] = TOHToSolve[i+1][0];
					}
					TOHToSolve[3][0] = 0;
				}
				else if(TOHToSolve[0][1] == 1){
					for(int i = TOHToSolve.length - 2; i >= 0; i--){
						TOHToSolve[i+1][2] = TOHToSolve[i][2];
					}
					TOHToSolve[0][2] = 1;

					for(int i = 0; i <= TOHToSolve.length - 2; i++){
						TOHToSolve[i][1] = TOHToSolve[i+1][1];
					}
					TOHToSolve[3][1] = 0;
				}
				else if(TOHToSolve[0][2] == 1){
					for(int i = TOHToSolve.length - 2; i >= 0; i--){
						TOHToSolve[i+1][0] = TOHToSolve[i][0];
					}
					TOHToSolve[0][0] = 1;

					for(int i = 0; i <= TOHToSolve.length - 2; i++){
						TOHToSolve[i][2] = TOHToSolve[i+1][2];
					}
					TOHToSolve[3][2] = 0;
				}
			}

			else if(tracker%4 == 1){
				if(TOHToSolve[0][0] == 2){
					for(int i = TOHToSolve.length - 2; i >= 0; i--){
						TOHToSolve[i+1][2] = TOHToSolve[i][2];
					}
					TOHToSolve[0][2] = 2;

					for(int i = 0; i <= TOHToSolve.length - 2; i++){
						TOHToSolve[i][0] = TOHToSolve[i+1][0];
					}
					TOHToSolve[2][0] = 0;
				}
				else if(TOHToSolve[0][1] == 2){
					for(int i = TOHToSolve.length - 2; i >= 0; i--){
						TOHToSolve[i+1][0] = TOHToSolve[i][0];
					}
					TOHToSolve[0][0] = 2;

					for(int i = 0; i <= TOHToSolve.length - 2; i++){
						TOHToSolve[i][1] = TOHToSolve[i+1][1];
					}
					TOHToSolve[2][1] = 0;
				}
				else if(TOHToSolve[0][2] == 2){
					for(int i = TOHToSolve.length - 2; i >= 0; i--){
						TOHToSolve[i+1][1] = TOHToSolve[i][1];
					}
					TOHToSolve[0][1] = 2;

					for(int i = 0; i <= TOHToSolve.length - 2; i++){
						TOHToSolve[i][2] = TOHToSolve[i+1][2];
					}
					TOHToSolve[2][2] = 0;
				}
			}

			else if(tracker%8 == 3){
				if(TOHToSolve[0][0] == 3){
					for(int i = TOHToSolve.length - 2; i >= 0; i--){
						TOHToSolve[i+1][1] = TOHToSolve[i][1];
					}
					TOHToSolve[0][1] = 3;

					for(int i = 0; i <= TOHToSolve.length - 2; i++){
						TOHToSolve[i][0] = TOHToSolve[i+1][0];
					}
					TOHToSolve[1][0] = 0;
				}
				else if(TOHToSolve[0][1] == 3){
					for(int i = TOHToSolve.length - 2; i >= 0; i--){
						TOHToSolve[i+1][2] = TOHToSolve[i][2];
					}
					TOHToSolve[0][2] = 3;

					for(int i = 0; i <= TOHToSolve.length - 2; i++){
						TOHToSolve[i][1] = TOHToSolve[i+1][1];
					}
					TOHToSolve[1][1] = 0;
				}
				else if(TOHToSolve[0][2] == 3){
					for(int i = TOHToSolve.length - 2; i >= 0; i--){
						TOHToSolve[i+1][0] = TOHToSolve[i][0];
					}
					TOHToSolve[0][0] = 3;

					for(int i = 0; i <= TOHToSolve.length - 2; i++){
						TOHToSolve[i][2] = TOHToSolve[i+1][2];
					}
					TOHToSolve[1][2] = 0;
				}
			}

			else if(tracker%8 == 7){
				if(TOHToSolve[0][0] == 4){
					for(int i = TOHToSolve.length - 2; i >= 0; i--){
						TOHToSolve[i+1][2] = TOHToSolve[i][2];
					}
					TOHToSolve[0][2] = 4;

					for(int i = 0; i <= TOHToSolve.length - 2; i++){
						TOHToSolve[i][0] = TOHToSolve[i+1][0];
					}
					TOHToSolve[0][0] = 0;
				}
			}
		System.out.printf("Step: %d%n", tracker+2);
		for(int i = 0; i <= 3; i++){
			for(int j = 0; j <= 2; j++){
				System.out.printf("%d\t", TOHToSolve[i][j]);
			}
		System.out.printf("%n");
						
		}
		System.out.printf("%n-----------------%n");

		}

		return TOHToSolve;

	}

	
	
}
