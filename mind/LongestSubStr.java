package com.mind;

public class LongestSubStr {
	static final int NO_OF_CHARS = 256;

	static void longestUniqueSubsttr(String s) {
		if (!s.isEmpty()) {
			String str = s.toUpperCase();
			String sub = "" + str.charAt(0);
			int n = str.length();
			int cur_len = 1;
			int max_len = 1;
			int prev_index = 0;
			int i;
			int visited[] = new int[NO_OF_CHARS];

			for (i = 0; i < NO_OF_CHARS; i++) {
				visited[i] = -1;
			}
			visited[str.charAt(0)] = 0;

			for (i = 1; i < n; i++) {
				prev_index = visited[str.charAt(i)];
				if (prev_index == -1 || i - cur_len > prev_index) {
					cur_len++;
					if (cur_len > max_len)
						sub = sub + str.charAt(i);
				} else {
					if (cur_len > max_len) {
						max_len = cur_len;
					}

					cur_len = i - prev_index;
				}

				visited[str.charAt(i)] = i;
			}
			System.out.println(Color.GREEN + "Given String is 	      :::: " + s);
			System.out.println("Length of unique SubString is :::: " + Color.PURPLE_BOLD + "" + sub.length());
			System.out.println(Color.GREEN + "Max Unique Substring is	      :::: " + sub);
			System.out.println("-----------------------------------------------------------------------");
		} else {
			System.out.println(Color.RED_BOLD_BRIGHT
					+ "\n-----------------------------------------------------------------------");
			System.out.println(Color.RED_BOLD_BRIGHT + "[ String should not be empty ]");
			System.out.println("-----------------------------------------------------------------------");
		}
	}

	public static void main(String[] args) {
		String str = "ABDEFGABEF";
		String str1 = "PrAvInSiNgH";
		String str2 = "";
		longestUniqueSubsttr(str);
		longestUniqueSubsttr(str1);
		longestUniqueSubsttr(str2);

	}
}
