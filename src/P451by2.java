import java.util.*;

/**
 * Created by rakesh.singh on 04/08/14.
 */
public class P451by2 {
}

class CondorcetVoting {
    public int winner(String[] votes) {
        int[][] scores = new int[50][50];
        for (int i = 0; i < votes.length; i++) {
            String min = votes[i];
            Map<Character, Integer> map = new HashMap<Character, Integer>();
            char[] chars = min.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            for (int j = 0; j < sorted.length(); j++) {
                if (j > 0 && sorted.charAt(j - 1) == sorted.charAt(j)) {
                    continue;
                }
                map.put(sorted.charAt(j), j + 1);
            }

            for (int j = 0; j < votes[i].length(); j++) {
                   scores[j][map.get(votes[i].charAt(j))] += map.get(votes[i].charAt(j));
            }
        }
        return 0;

    }


    public static void main(String[] args) {
        long time;
        int answer;
        boolean errors = false;
        int desiredAnswer;

        time = System.currentTimeMillis();
        answer = new CondorcetVoting().winner(new String[]{"acbd", "bacd", "bdca"});
        System.out.println("Time: " + (System.currentTimeMillis() - time) / 1000.0 + " seconds");
        desiredAnswer = 0;
        System.out.println("Your answer:");
        System.out.println("\t" + answer);
        System.out.println("Desired answer:");
        System.out.println("\t" + desiredAnswer);
        if (answer != desiredAnswer) {
            errors = true;
            System.out.println("DOESN'T MATCH!!!!");
        } else
            System.out.println("Match :-)");
        System.out.println();
        time = System.currentTimeMillis();
        answer = new CondorcetVoting().winner(new String[]{"abc", "bca", "cab"});
        System.out.println("Time: " + (System.currentTimeMillis() - time) / 1000.0 + " seconds");
        desiredAnswer = -1;
        System.out.println("Your answer:");
        System.out.println("\t" + answer);
        System.out.println("Desired answer:");
        System.out.println("\t" + desiredAnswer);
        if (answer != desiredAnswer) {
            errors = true;
            System.out.println("DOESN'T MATCH!!!!");
        } else
            System.out.println("Match :-)");
        System.out.println();
        time = System.currentTimeMillis();
        answer = new CondorcetVoting().winner(new String[]{"jffpu", "jfkwa", "jfklp", "afkcz", "jfkcw", "jfkcm"});//"cezdqcw"});
        System.out.println("Time: " + (System.currentTimeMillis() - time) / 1000.0 + " seconds");
        desiredAnswer = -1;
        System.out.println("Your answer:");
        System.out.println("\t" + answer);
        System.out.println("Desired answer:");
        System.out.println("\t" + desiredAnswer);
        if (answer != desiredAnswer) {
            errors = true;
            System.out.println("DOESN'T MATCH!!!!");
        } else
            System.out.println("Match :-)");
        System.out.println();
        time = System.currentTimeMillis();
        answer = new CondorcetVoting().winner(new String[]{"abcd", "abcd", "abcd", "abcd", "abcd", "abcd", "cbad", "cbad", "cbad", "cbad", "cbad", "dbca", "cbda", "cbda"});
        System.out.println("Time: " + (System.currentTimeMillis() - time) / 1000.0 + " seconds");
        desiredAnswer = 1;
        System.out.println("Your answer:");
        System.out.println("\t" + answer);
        System.out.println("Desired answer:");
        System.out.println("\t" + desiredAnswer);
        if (answer != desiredAnswer) {
            errors = true;
            System.out.println("DOESN'T MATCH!!!!");
        } else
            System.out.println("Match :-)");
        System.out.println();
        time = System.currentTimeMillis();
        answer = new CondorcetVoting().winner(new String[]{"abbcbbbaaccaaccbbacbbbaacbccbccacaaacaacaaacbccaac", "accbabcaacacbcccbbccbbcaccccccbbcbbcbaccbcbcacbcbc", "acacaaabccaaaccabbaaaacabaaabacacbaacbcccbccbcbacb", "acbcbabaabbcaababaacbabcacbaccabbaaacccbcabbbcacba", "cbbbacbbacccbbabbbcbaabaaaacaacbcbccbaaccbcaaccbcb", "cbacbbcbbcbcaaabccabcabbcbacaaabccabbcbacbbacbbaca", "cacaabccbbbaaacccacbbcacababbcaaabccbbacbbbccacbaa", "bccbbabaaaababcbabbbbcbcacbcbcbacccacacacacacacaab", "bccabcaabcabbccaaccbcabaaabbbcaabaaabbbbabbbaabaac", "accccbabaaaabcbacabbcbbacaacaaaacccbbbcacaccccaaac", "cccbcaababbaacaaabbbaabbccccacaacbacaacbbbaacccbbb", "bccccaccbcbbaaaaaaaaccbababcabaaccacbbabbbcabbaaca", "cbacacaabbccacaabbbbbbccabcbbaccacbcacacacbccbcbcc", "baabcabccaaaaccbaacaaccacccbcbbaaacacaccbcaacbbbba", "bccaaaabcbbcbbbbbcaabaacccbccbbcbabacaaccbccaababb", "cacbbbbcabbcbaabbccbaccbaacbbcbbbbcabababccabbbcab", "bccbcacbccaacacccccaacabacbacbbbcaabacacccbbbccaac", "aaaccbbbacacbaaaacacaabbaacccbcccbcabbccbcacabbacb", "bcabcbbacbacacbbaaccabcabcbbaabacacccbbbcabbbcaacb", "bacbbbbaccbaabbbbbcaccbbcbcabbbccbcacccbabbbcaaacc", "bababcacbacacacccccbbcacccbbcbccaccaacbbcacabcabba", "aaabaccbbcacaacbabccccabbbcbcccccccbaacbccbaacbbbc", "abacbaaaaaccacbbbaccbbbabaacbcbccacccabaaaacbaabbb", "cbbcacbaccabbbcaacbcbabbcabcbaccabcbbbcabcbcbaacca", "babbacaaacbbcbbbabbaabcbabcbbaacaacbbbaaaabbcabcca", "cbabaacabcccaabbbacccaccbacabbaacaaabcbcccbcbcccaa", "aabbbcbacabbcabcbcccbccaccbcacbaacabbbccaabaabcbba", "caccabcccabbaacbabbaaaccccccccaaccbcaccacaabacccba", "bbbcabcababaabacaccacabcbccacccbbbbcbbbaccabcabaab", "bbbcaababbbbababababcbbbbaaabbacaabcacbbccbcaaaaaa", "bcbacccaaaabbcbcabbbcababbcacaabbbbcbbacbaabcbaccb", "bbcaccaaccacbbaaccaaaabccbbacbcbacaacbacbccaaccbba", "abaaacbccbbabbcaccbaccccbaaacaccccababcbccccbabcca", "acccaccababababacbbaccbcabcaccbabaabacbaacaaacabca", "aaabababccabccbcbabcabcacbbcacbcbbbabcabacbcaacacb", "ccacbaabbcbaccaccbbabbabbabaacccabcaaccacacccbbcab", "bbaabcbabbbaacacabaabcbaaabacbccccaccaaaacbacabbbc", "abaaaccaacbbcacacbcbccbaaacbbcbacabbbccabbbccaaaac", "bbacbabbcacbbacccaccbcbcabbcbaacabbbbabbaaabaacacb", "cacbacbccbcbabacccacabcacacabbcabbccaacacbaaacaacb", "bacbbacbccccabcbabcbbcbacacaaabcbaccccaabaabbacbcb", "abcaaccccabccaaaaccbabccacbcaaaacaccaccccccaaaabaa", "bacabcbccbacccbaaaabcbbaabbabaabcabacccbcabacccbcc", "babaccbbcbcbacccabccbcccbaaaaacccabcbccbbbbcbabcbc", "cccbbaccbabbbbcbcbcbaaacbbcacbcaacacacccbcabccbcaa", "caacbcacbccaaaaacaaababbcccacbabaaabcaacaaababacba", "cccccaccabcaacababbacbcbabbcaacbacbabbbccbabcbabbb", "ccbcababcabcbcccaccccacabcbaaacaabccbbaabaccbaccab", "abbbcacaccabcbccbacabbbccaccaaaacccabbcbacbbccabcb", "bacabccabcbbcaacbcacabcbccacbcccbcbcaaaabbaabccabb"});
        System.out.println("Time: " + (System.currentTimeMillis() - time) / 1000.0 + " seconds");
        desiredAnswer = 12;
        System.out.println("Your answer:");
        System.out.println("\t" + answer);
        System.out.println("Desired answer:");
        System.out.println("\t" + desiredAnswer);
        if (answer != desiredAnswer) {
            errors = true;
            System.out.println("DOESN'T MATCH!!!!");
        } else
            System.out.println("Match :-)");
        System.out.println();
        time = System.currentTimeMillis();
        answer = new CondorcetVoting().winner(new String[]{"h", "e", "l", "l", "o"});
        System.out.println("Time: " + (System.currentTimeMillis() - time) / 1000.0 + " seconds");
        desiredAnswer = 0;
        System.out.println("Your answer:");
        System.out.println("\t" + answer);
        System.out.println("Desired answer:");
        System.out.println("\t" + desiredAnswer);
        if (answer != desiredAnswer) {
            errors = true;
            System.out.println("DOESN'T MATCH!!!!");
        } else
            System.out.println("Match :-)");
        System.out.println();

        if (errors)
            System.out.println("Some of the test cases had errors :-(");
        else
            System.out.println("You're a stud (at least on the test data)! :-D ");
    }

}
