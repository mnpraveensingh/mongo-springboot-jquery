package mind;

public class RemoveDuplicateNum1 {
	public static int removeDuplicateElements(int arr[], int n, String str) {
		int x = 0;
		int cnt = 0, num = 0;
		int[] arr_new = new int[n];
		for (int i = 0; i < n; i++) {
			num = arr[i];
			if (num != 0) {
				for (int j = i + 1; j < n; j++) {
					if (arr[i] == arr[j]) {
						arr[j] = 0;
						cnt++;
					}
				}
				if (cnt > 0) {
					arr[i] = 0;
				} else {
					arr_new[x] = num;
					x++;
				}
				cnt = 0;
			}
		}
		System.out.println();
		int a = n - 1;
		for (int k = x - 1; k >= 0; k--) {
			num = arr_new[n - 1];
			arr_new[a] = arr_new[k];
			arr_new[k] = num;
			a--;
			if (k == 0) {
				for (int l = a; l >= 0; l--) {
					arr_new[l] = 1;
				}
			}
		}
		System.out.println(Color.PURPLE_BOLD +str +" array length = "+ arr_new.length);
		cnt = 0;
		for (int b : arr_new) {
			if (b != 0) {
				System.out.print(Color.GREEN +b + " ");
			} else
				cnt++;
		}
		if (cnt != 0) {
			System.out.print(Color.RED_BOLD_BRIGHT +"Unique Data or Non Zero Numbers Not Present in these array");
		}
			System.out.println(Color.RED_BOLD_BRIGHT +"\n-----------------------------------\n");
		
		return 0;

	}

	public static void main(String[] args) {
		int[] arr = { 5, 3, 4, 2, 4, 2, 3, 1, 9, 5 };
		int[] arr1 = { 22, 1, 22, 2, 4, 16, 3, 1, 9, 5 };
		int[] arr2 = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		
		System.out.println(Color.RED_BOLD_BRIGHT +"Array elements should be non-zero only");
		removeDuplicateElements(arr, arr.length, "first call ==>");
		removeDuplicateElements(arr1, arr1.length, "second call ==>");
		removeDuplicateElements(arr2, arr2.length, "third call ==>");
	}// main method close
}// class close
