package Algorithm.sort;

public class InsertionSortEx {
    
    public static void insertion_sort(int[] a) {
        insertionSort(a, a.length);
    }

	public static void insertionSort(int[] a, int size) {
		for (int i = 1; i < size; i++) {
			int target = a[i];
			int j = i-1;
			
			// 타겟이 이전 원소보다 크기 전까지 반복하기
			while(j >= 0 && target < a[j]) {
			    // 이전 원소를 한 칸씩 뒤로 미룬다
				a[j+1] = a[j];
				j--;
			}
			
			// 반복문에서 탈출시 앞의 원소들이 타겟보다 작다
			a[j+1] = target;
		}
	}
}
