package interface_sort_question;

public interface Sort {
	
	void ascedning(int[] array);
	void decending(int[] array);
	
	default void description() {
		System.out.println("정렬하는 알고리즘입니다.SDFSDFSDFS");
	}
	
}
