public class Main {
	public static void main(String[] args) {
		char [] answerKey={'D', 'B', 'D', 'C', 'C', 'D', 'E', 'A', 'D'};
		char [] [] studentAnswers= {
			{'A', 'B', 'A', 'C', 'C', 'D', 'D', 'E', 'E', 'D'},
			{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
			{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
			{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
			{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
	        {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
		};
		for (int i=0; i <studentAnswers.length; i++){
				int count=0;
				for (int j=0; j<studentAnswers.length; j++){
					if(studentAnswers[i][j]==answerKey[j]){
					count++;
				}
		}
		System.out.println("Students" + i + "score: "+ count);
		}
	}
}