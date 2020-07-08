package a4;

public class ListAlgorithms {

    // Novice

    /**
     * Return the number of nodes in a4.list. If the a4.list is empty return 0.
     *
     * ex: a4.list: A -> B -> C -> D
     *     return: 4
     *
     * @param list
     * @return the number of nodes in the a4.list
     */
    public static int size(List list) {
        return -1;
    }

    /**
     * Given a linked a4.list, return the a4.list with the node at index i removed.
     * Note that the first element is at index 0
     * If i is larger than the size of the a4.list, throw an IndexOutOfBounds Exception
     *
     * ex: a4.list: A -> B -> C -> D
     *     i: 1
     *     return: A -> C -> D
     *
     * @param list
     * @param i    - index of node to remove
     * @return the a4.list with the node removed
     */
    public static List removeAtIndex(List list, int i) {
        return null;
    }

    /**
     * Return true if both linked lists are equal, false otherwise.
     * Two lists are equal if they have the same size, and the same
     * elements in the same order.
     * ex:  list1: 1 -> 4 -> 2
     *      list2: 1 -> 4 -> 2
     *      return: true
     *
     *      list1: 1 -> 5
     *      list2: 2 -> 5
     *      return false;
     *
     * @param list1
     * @param list2
     * @return
     */
    public static boolean areEqual(List list1, List list2) {
        return false;
    }

    // Adept

    /**
     * Return true if the a4.list is symmetrical, false otherwise
     * ex: a4.list: 1 -> 2 ->3 -> 2 -> 1
     *     return: true
     *
     *     a4.list: a -> b -> c -> b -> f
     *     return: false
     *
     * @param list
     * @return true if the a4.list is symmetrical, false otherwise
     */

    public static boolean isSymmetrical(List list) {
        return false;
    }


    /**
     * Stretch the a4.list so that each element in the a4.list is represented factor times
     * If the factor is 0, return an empty a4.list;
     * ex: a4.list: 1 -> 2 ->3
     *     factor: 3
     *     return: 1 -> 1 -> 1 -> 2 -> 2 -> 2 -> 3 -> 3 -> 3
     *
     * @param list
     * @param factor the amount to multiply the number of occurrences of each element by
     * @return the modified a4.list
     */
    public static List multiply(List list, int factor) {
        return null;
    }

    /**
     * Given a sorted linked a4.list, remove the duplicate values from the a4.list
     * and return the modified a4.list sorted.
     * ex: a4.list: 5 -> 6 -> 7 -> 7 -> 7 -> 8 -> 8 -> 9
     *     return: 5 -> 6 -> 7 -> 8 -> 9
     *
     * @param list - a sorted linked
     * @return a sorted linked a4.list with repeated values removed
     */
    public static List removeRepeats(List list) {
        return null;
    }

    // Jedi


    /**
     * Given a a4.list, return that a4.list reversed.
     *
     * ex a4.list:  10 -> 9 -> 8 -> 7
     *    return: 7 -> 8 -> 9 -> 10
     * @param list
     * @return the reversed a4.list
     */
    public static List reverse(List list) { return null; }
    /**
     * Return true if the a4.list contains a cycle, false otherwise
     * ex: a4.list: 1 -> 2 -> 3 - > 4 --       (4 points to 2)
     *                ^              |
     *                |              |
     *                ---------------
     *      return: true
     *
     *      a4.list: 1 -> 2 -> 3 -> 4
     *      return: false
     *
     * @param list
     * @return true if the a4.list contains a cycle, false otherwise
     */
    public static boolean containsCycle(List list) {
        return false;
    }

    /**
     * Merge two linked lists. The 2 lists will always be either the same size, or
     * list1 will be longer than list2. The examples below show how to handle
     * each case.
     *
     * Note: Do NOT create and return a new a4.list, merge the second a4.list into the first one.
     *
     * ex: list1: 1 -> 2 -> 3
     *     list2: 4 -> 5 -> 6
     *     return: 1 -> 4 -> 2 -> 5 -> 3 -> 6
     *
     *     list1: 1 -> 2 -> 3 -> 4
     *     list2: 5 -> 6
     *     return 1 -> 5 -> 2 -> 6 -> 3 -> 4
     *
     * @param list1
     * @param list2
     * @return the merged a4.list
     */
    public static List merge(List list1, List list2) {
        return null;
    }





}
