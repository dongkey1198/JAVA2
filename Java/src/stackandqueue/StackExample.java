package stackandqueue;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<Integer>();
		
		st.push(4);
		st.push(3);
		st.push(2);
		st.push(1);
		
		System.out.println(st.peek()); //스택에서 제일 마지막에 저장된 값 출력
		System.out.println(st);	
		
		System.out.println(st.pop()); //스택에서 제일 마지막에 저장된 값 빼오기
		System.out.println(st);
		
		//스택에서 인덱스 넘버는 1부터 시작한다!!!
		System.out.println(st.search(4));
		System.out.println(st.search(3));
	}

}
