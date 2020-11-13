package interface_sort_question;

public class QuickSort implements Sort{

	@Override
	public void ascedning(int[] array) {
		System.out.println("QuickSort ascending");
		
	}

	@Override
	public void decending(int[] array) {
		System.out.println("QuickSort descending");
		
	}

	@Override
	public void description() {
		System.out.println("QuickSort를 이용하여 정렬 하였습니다.");
		
	}

}
