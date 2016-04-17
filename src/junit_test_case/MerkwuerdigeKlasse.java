package junit_test_case;

public class MerkwuerdigeKlasse {

	private int list[] = { 5, 3, 7, 9, 1, 2, 4 };

	public int[] sort(int l, int r) {

		if (l < r) {
			int q = (l + r) / 2;

			sort(l, q);
			sort(q + 1, r);
			merge(l, q, r);
		}
		return list;
	}

	private void merge(int l, int q, int r) {
		int[] arr = new int[list.length];
		int i, j;
		for (i = l; i <= q; i++) {
			arr[i] = list[i];
		}
		for (j = q + 1; j <= r; j++) {
			arr[r + q + 1 - j] = list[j];
		}
		i = l;
		j = r;
		for (int k = l; k <= r; k++) {
			if (arr[i] <= arr[j]) {
				list[k] = arr[i];
				i++;
			} else {
				list[k] = arr[j];
				j--;
			}
		}
	}
	
	public String returnNull(){
		return null;
	}
	
	public String returnHello(){
		return "Hello";
	}
}
