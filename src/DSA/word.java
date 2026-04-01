package DSA;
import java.util.*;
public class word {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();  // number of dictionary words
            sc.nextLine(); // consume newline

            String[] dictWords = sc.nextLine().split(" ");
            String s = sc.nextLine();

            Set<String> dict = new HashSet<>();
            for (String word : dictWords) {
                dict.add(word);
            }

            System.out.println(wordBreak(s, dict) ? 1 : 0);
        }

        public static boolean wordBreak(String s, Set<String> dict) {
            int n = s.length();
            boolean[] dp = new boolean[n + 1];

            dp[0] = true; // base case

            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < i; j++) {
                    if (dp[j] && dict.contains(s.substring(j, i))) {
                        dp[i] = true;
                        break;
                    }
                }
            }

            return dp[n];
        }
    }
