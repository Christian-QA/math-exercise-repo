package maths.trial.exerc4;

	public class Cal {
						
		public int add(int num_1, int num_2) {
		
			return num_1 + num_2;
		
		}
				
		public int multiply(int num_1, int num_2) {
			
			return num_1 * num_2;
			
		}
		
		public int subtract(int num_1, int num_2) {
			
			return num_1 - num_2;
			
		}
		
		public String division(double num_1, double num_2) {
			if (num_1 < num_2) {
				return Double.toString(num_1 / num_2);
			} else {
				
				return "Task failed. This division is not allowed!";
			}
		}
	}
	
	