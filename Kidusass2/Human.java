package Kidusass2;

public class Human {
	
	// class variables
		static int TEENAGER_AGE = 13;
		static int ADULT_AGE = 19;
		static int SENIOR_AGE = 65;
		
		// instance variable
		privaet int age;
		
		
		public int getage () {
			return age;
		}
		
		public String getStageOfLife () {
			if (age < TEENAGER_AGE) {
				return "Child";
			} else if (age < ADULT_AGE) {
				return "Teenager";
			} else if (age < SENIOR_AGE) {
				return "Adult";
			} else {
				return "Senior";
			}
			
		}

		public String getStageOfLife1() {
			// TODO Auto-generated method stub
			return null;
		}
	}