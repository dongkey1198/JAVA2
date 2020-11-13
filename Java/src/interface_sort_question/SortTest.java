package interface_sort_question;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("=======옵션 선택=======");
		System.out.println("Q: Quick Sort");
		System.out.println("H: Heap Sort");
		System.out.println("B: Bubble Sort");
		
		int ch = System.in.read();
		
		Sort sort;
		int array[] = new int[5];
		
		if(ch == 'Q') {
			sort = new QuickSort();
			sort.ascedning(array);
			sort.decending(array);
			sort.description();
		}
		else if(ch == 'H') {
			sort = new HeapSort();
			sort.ascedning(array);
			sort.decending(array);
			sort.description();
		}
		else if(ch == 'B') {
			sort = new BubbleSort();
			sort.ascedning(array);
			sort.decending(array);
			sort.description();
		}
		else {
			System.out.println("잘못된 입력값입니다.");
		}
	}

}
