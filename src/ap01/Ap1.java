package ap01;

import java.util.ArrayList;
import java.util.List;

public class Ap1 {
    /**
     * Given an array of scores, return true if each score is equal or greater than the one before.
     * The array will be length 2 or more.
     * <p>
     * scoresIncreasing([1, 3, 4]) → true
     * scoresIncreasing([1, 3, 2]) → false
     * scoresIncreasing([1, 1, 4]) → true
     *
     * @param scores
     * @return
     */
    public boolean scoresIncreasing(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (!(scores[i] <= scores[i + 1])) return false;
        }
        return true;
    }

    public boolean scores100(int[] scores) {
        /**
         * Given an array of scores, return true if there are scores of 100 next to each other in the array.
         * The array length will be at least 2.

         scores100([1, 100, 100]) → true
         scores100([1, 100, 99, 100]) → false
         scores100([100, 1, 100, 100]) → true
         */
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] == 100 && scores[i + 1] == 100) return true;
        }
        return false;
    }

    public boolean scoresClump(int[] scores) {
        /**
         * Given an array of scores sorted in increasing order, return true if the array contains 3 adjacent
         * scores that differ from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.

         scoresClump([3, 4, 5]) → true
         scoresClump([3, 4, 6]) → false
         scoresClump([1, 3, 5, 5]) → true
         */
        int count = 0;
        for (int i = 0; i < scores.length - 2; i++) {
            if (scores[i + 1] - scores[i] <= 2 &&
                    scores[i + 2] - scores[i + 1] <= 2 &&
                    scores[i + 2] - scores[i] <= 2) return true;
        }
        return false;
    }

    public int scoresAverage(int[] scores) {
        /**
         * Given an array of scores, compute the int average of the first half and the second half,
         * and return whichever is larger. We'll say that the second half begins at index length/2.
         * The array length will be at least 2. To practice decomposition, write a separate helper
         * method int average(int[] scores, int start, int end) { which computes the average of the
         * elements between indexes start..end. Call your helper method twice to implement scoresAverage().
         * Write your helper method after your scoresAverage() method in the JavaBat text area. Normally you
         * would compute averages with doubles, but here we use ints so the expected results are exact.

         scoresAverage([2, 2, 4, 4]) → 4
         scoresAverage([4, 4, 4, 2, 2, 2]) → 4
         scoresAverage([3, 4, 5, 1, 2, 3]) → 4
         */
        return Math.max(average(scores, 0, scores.length / 2 - 1),
                average(scores, scores.length / 2, scores.length - 1));
    }

    public int average(int[] scores, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += scores[i];
        }
        return sum / (end - start + 1);
    }

    public int wordsCount(String[] words, int len) {

        /**
         * Given an array of strings, return the count of the number of strings with the given length.

         wordsCount(["a", "bb", "b", "ccc"], 1) → 2
         wordsCount(["a", "bb", "b", "ccc"], 3) → 1
         wordsCount(["a", "bb", "b", "ccc"], 4) → 0
         */
        int count = 0;
        for (String w : words) {
            if (w.length() == len) count++;
        }
        return count;
    }

    public String[] wordsFront(String[] words, int n) {
        /**
         * Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length.

         wordsFront(["a", "b", "c", "d"], 1) → ["a"]
         wordsFront(["a", "b", "c", "d"], 2) → ["a", "b"]
         wordsFront(["a", "b", "c", "d"], 3) → ["a", "b", "c"]
         */
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = words[i];
        }
        return arr;
    }

    public List wordsWithoutList(String[] words, int len) {
        /**
         * Given an array of strings, return a new List (e.g. an ArrayList) where all the strings
         * of the given length are omitted. See wordsWithout() below which is more difficult because
         * it uses arrays.

         wordsWithoutList(["a", "bb", "b", "ccc"], 1) → ["bb", "ccc"]
         wordsWithoutList(["a", "bb", "b", "ccc"], 3) → ["a", "bb", "b"]
         wordsWithoutList(["a", "bb", "b", "ccc"], 4) → ["a", "bb", "b", "ccc"]
         */
        List<String> res = new ArrayList<>();
        for (String w : words) {
            if (w.length() != len) res.add(w);
        }
        return res;
    }

    public boolean hasOne(int n) {
        /**
         *
         Given a positive int n, return true if it contains a 1 digit. Note: use % to get the rightmost digit,
         and / to discard the rightmost digit.

         hasOne(10) → true
         hasOne(22) → false
         hasOne(220) → false
         */
        return String.valueOf(n).indexOf("1") != -1;
    }

    public boolean dividesSelf(int n) {
        /**
         * We'll say that a positive int divides itself if every digit in the number divides into the number evenly.
         * So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly. We'll say that 0 does not
         * divide into anything evenly, so no number with a 0 digit divides itself. Note: use % to get the rightmost
         * digit, and / to discard the rightmost digit.

         dividesSelf(128) → true
         dividesSelf(12) → true
         dividesSelf(120) → false
         */
        String nstr = String.valueOf(n);
        if (nstr.indexOf("0") != -1) return false;
        for (int i = 0; i < nstr.length(); i++) {
            if (n % Integer.parseInt(nstr.substring(i, i + 1)) != 0) return false;
        }
        return true;
    }

    public int[] copyEvens(int[] nums, int count) {
        /**
         * Given an array of positive ints, return a new array of length "count" containing the first even numbers
         * from the original array. The original array will contain at least "count" even numbers.

         copyEvens([3, 2, 4, 5, 8], 2) → [2, 4]
         copyEvens([3, 2, 4, 5, 8], 3) → [2, 4, 8]
         copyEvens([6, 1, 2, 4, 5, 8], 3) → [6, 2, 4]
         */
        int[] arr = new int[count];
        for (int i = 0, j = 0; i < nums.length && j < count; i++) {
            if (nums[i] % 2 == 0) {
                arr[j] = nums[i];
                j++;
            }
        }
        return arr;
    }

    public int[] copyEndy(int[] nums, int count) {
        /**
         * We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive).
         * Given an array of positive ints, return a new array of length "count" containing the first endy
         * numbers from the original array. Decompose out a separate isEndy(int n) method to test if a number
         * is endy. The original array will contain at least "count" endy numbers.

         copyEndy([9, 11, 90, 22, 6], 2) → [9, 90]
         copyEndy([9, 11, 90, 22, 6], 3) → [9, 90, 6]
         copyEndy([12, 1, 1, 13, 0, 20], 2) → [1, 1]
         */
        int[] arr = new int[count];
        for (int i = 0, j = 0; i < nums.length && j < count; i++) {
            if (isEndy(nums[i])) {
                arr[j] = nums[i];
                j++;
            }
        }
        return arr;
    }

    boolean isEndy(int n) {
        if (0 <= n && n <= 10 ||
                90 <= n && n <= 100) return true;
        return false;
    }

    public int matchUp(String[] a, String[] b) {
        /**
         *
         Given 2 arrays that are the same length containing strings, compare the 1st string in one array
         to the 1st string in the other array, the 2nd to the 2nd and so on. Count the number of times
         that the 2 strings are non-empty and start with the same char. The strings may be any length,
         including 0.

         matchUp(["aa", "bb", "cc"], ["aaa", "xx", "bb"]) → 1
         matchUp(["aa", "bb", "cc"], ["aaa", "b", "bb"]) → 2
         matchUp(["aa", "bb", "cc"], ["", "", "ccc"]) → 1
         */
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() != 0 && b[i].length() != 0 && a[i].charAt(0) == b[i].charAt(0)) count++;
        }
        return count;
    }

    public int scoreUp(String[] key, String[] answers) {
        /**
         * The "key" array is an array containing the correct answers to an exam, like {"a", "a", "b", "b"}.
         * the "answers" array contains a student's answers, with "?" representing a question left blank.
         * The two arrays are not empty and are the same length. Return the score for this array of answers,
         * giving +4 for each correct answer, -1 for each incorrect answer, and +0 for each blank answer.

         scoreUp(["a", "a", "b", "b"], ["a", "c", "b", "c"]) → 6
         scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "c"]) → 11
         scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "b"]) → 16
         */
        int count = 0;
        for (int i = 0; i < key.length; i++) {
            if (answers[i].equals("?")) continue;
            if (key[i].equals(answers[i])) {
                count += 4;
            } else {
                count -= 1;
            }
        }
        return count;
    }

    public String[] wordsWithout(String[] words, String target) {
        /**
         * Given an array of strings, return a new array without the strings that are equal to the target string.
         * One approach is to count the occurrences of the target string, make a new array of the correct length,
         * and then copy over the correct strings.

         wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
         wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
         wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
         */
        int arrL = 0;
        for (String word : words) {
            if (!word.equals(target)) arrL++;
        }
        String[] res = new String[arrL];
        for (int i = 0, j = 0; i < words.length; i++) {
            if (words[i].equals(target)) continue;
            res[j] = words[i];
            j++;
        }
        return res;
    }

    public int scoresSpecial(int[] a, int[] b) {
        /**
         * Given two arrays, A and B, of non-negative int scores. A "special" score is one which is a multiple of 10,
         * such as 40 or 90. Return the sum of largest special score in A and the largest special score in B.
         * To practice decomposition, write a separate helper method which finds the largest special score in an array.
         * Write your helper method after your scoresSpecial() method in the JavaBat text area.

         scoresSpecial([12, 10, 4], [2, 20, 30]) → 40
         scoresSpecial([20, 10, 4], [2, 20, 10]) → 40
         scoresSpecial([12, 11, 4], [2, 20, 31]) → 20
         */
        return findLargestFor10(a) + findLargestFor10(b);
    }

    int findLargestFor10(int[] arr) {
        int max = 0;
        for (int i : arr) {
            if (i % 10 == 0) max = Math.max(i, max);
        }
        return max;
    }

    public int sumHeights(int[] heights, int start, int end) {
        /**
         *
         We have an array of heights, representing the altitude along a walking trail. Given start/end indexes into
         the array, return the sum of the changes for a walk beginning at the start index and ending at the end index.
         For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1 + 5 = 6. The start end
         end index will both be valid indexes into the array with start <= end.

         sumHeights([5, 3, 6, 7, 2], 2, 4) → 6
         sumHeights([5, 3, 6, 7, 2], 0, 1) → 2
         sumHeights([5, 3, 6, 7, 2], 0, 4) → 11
         */
        int count = 0;
        for (int i = start; i < end; i++) {
            count += Math.abs(heights[i] - heights[i + 1]);
        }
        return count;
    }

    public int sumHeights2(int[] heights, int start, int end) {
        /**
         *
         (A variation on the sumHeights problem.) We have an array of heights, representing the altitude along a
         walking trail. Given start/end indexes into the array, return the sum of the changes for a walk beginning
         at the start index and ending at the end index, however increases in height count double. For example,
         with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1*2 + 5 = 7. The start end end index
         will both be valid indexes into the array with start <= end.

         sumHeights2([5, 3, 6, 7, 2], 2, 4) → 7
         sumHeights2([5, 3, 6, 7, 2], 0, 1) → 2
         sumHeights2([5, 3, 6, 7, 2], 0, 4) → 15
         */
        int count = 0;
        int toAdd = 0;
        for (int i = start; i < end; i++) {
            toAdd = Math.abs(heights[i] - heights[i + 1]);
            if (heights[i + 1] > heights[i]) toAdd *= 2;
            count += toAdd;
        }
        return count;
    }

    public int bigHeights(int[] heights, int start, int end) {
        /**
         *
         (A variation on the sumHeights problem.) We have an array of heights, representing the altitude along a
         walking trail. Given start/end indexes into the array, return the number of "big" steps for a walk starting
         at the start index and ending at the end index. We'll say that step is big if it is 5 or more up or down.
         The start end end index will both be valid indexes into the array with start <= end.

         bigHeights([5, 3, 6, 7, 2], 2, 4) → 1
         bigHeights([5, 3, 6, 7, 2], 0, 1) → 0
         bigHeights([5, 3, 6, 7, 2], 0, 4) → 1
         */
        int count = 0;
        for (int i = start; i < end; i++) {
            if (Math.abs(heights[i] - heights[i + 1]) >= 5) {
                count++;
            }
            ;
        }
        return count;
    }

    public int userCompare(String aName, int aId, String bName, int bId) {
        /**
         *
         We have data for two users, A and B, each with a String name and an int id. The goal is to order the users
         such as for sorting. Return -1 if A comes before B, 1 if A comes after B, and 0 if they are the same.
         Order first by the string names, and then by the id numbers if the names are the same.
         Note: with Strings str1.compareTo(str2) returns an int value which is negative/0/positive to indicate how
         str1 is ordered to str2 (the value is not limited to -1/0/1). (On the AP, there would be two User objects,
         but here the code simply takes the two strings and two ints directly. The code logic is the same.)

         userCompare("bb", 1, "zz", 2) → -1
         userCompare("bb", 1, "aa", 2) → 1
         userCompare("bb", 1, "bb", 1) → 0
         */
        int nameComp = aName.compareTo(bName);
        int idComp = aId - bId;

        if (nameComp == 0 && idComp == 0) return 0;
        if ((nameComp < 0 || nameComp == 0) && idComp < 0) return -1;
        return 1;

    }

    public String[] mergeTwo(String[] a, String[] b, int n) {
        /**
         * Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates. Return a new array containing the first N elements from the two arrays. The result array should be in alphabetical order and without duplicates. A and B will both have a length which is N or more. The best "linear" solution makes a single pass over A and B, taking advantage of the fact that they are in alphabetical order, copying elements directly to the new array.


         mergeTwo(["a", "c", "z"], ["b", "f", "z"], 3) → ["a", "b", "c"]
         mergeTwo(["a", "c", "z"], ["c", "f", "z"], 3) → ["a", "c", "f"]
         mergeTwo(["f", "g", "z"], ["c", "f", "g"], 3) → ["c", "f", "g"]
         */
        String[] res = new String[n];
        String q = "";
        String w = "";

        for (int i = 0, j = 0, k = 0; i < a.length || j < b.length; i++, j++) {
            if (k == n) break;

            if (i < a.length) q = a[i];
            if (i < b.length) w = b[j];

            if (q.compareTo(w) == 0) {
                res[k] = a[i];
                k++;
                continue;
            }

            if (q.compareTo(w) < 0) {
                res[k] = a[i];
                k++;
                j--;
                continue;
            }

            if (q.compareTo(w) > 0) {
                res[k] = b[j];
                k++;
                i--;
                continue;
            }
        }
        return res;
    }

    public int commonTwo(String[] a, String[] b) {
        /**
         * Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates.
         * Return the count of the number of strings which appear in both arrays. The best "linear" solution
         * makes a single pass over both arrays, taking advantage of the fact that they are in alphabetical order.

         commonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) → 2
         commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) → 3
         commonTwo(["a", "b", "c"], ["a", "b", "c"]) → 3
         */
        int count = 0;
        String oldA = "";
        String oldB = "";

        outer:
        for (int i = 0; i < a.length; i++) {

            if (a[i].equals(oldA) && count != 0) continue outer;
            oldA = a[i];

            inner:
            for (int j = 0; j < b.length; j++) {

                if (b[j].equals(oldB) && count != 0) continue inner;
                oldB = b[j];
                if (a[i].compareTo(b[j]) == 0) count++;

            }
        }
        return count;
    }


}
