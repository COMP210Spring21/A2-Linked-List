import list.List;

public class ListAlgorithms {

    // Novice

    /**
     * Return the number of nodes in list. If the list is empty return 0.
     *
     * ex: list: A -> B -> C -> D
     *     return: 4
     *
     * @param list
     * @return the number of nodes in the list
     */
    public static int size(List list) {
        return -1;
    }

    /**
     * Given a linked list, return the list with the node at index i removed.
     * Note that the first element is at index 0
     * If i is larger than the size of the list, throw an IndexOutOfBounds Exception
     *
     * ex: list: A -> B -> C -> D
     *     i: 1
     *     return: A -> C -> D
     *
     * @param list
     * @param i    - index of node to remove
     * @return the list with the node removed
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
     * Return true if the list is symmetrical, false otherwise
     * ex: list: 1 -> 2 ->3 -> 2 -> 1
     *     return: true
     *
     *     list: a -> b -> c -> b -> f
     *     return: false
     *
     * @param list
     * @return true if the list is symmetrical, false otherwise
     */

    public static boolean isSymmetrical(List list) {
        return false;
    }


    /**
     * Stretch the list so that each element in the list is represented factor times
     * If the factor is 0, return an empty list;
     * ex: list: 1 -> 2 ->3
     *     factor: 3
     *     return: 1 -> 1 -> 1 -> 2 -> 2 -> 2 -> 3 -> 3 -> 3
     *
     * @param list
     * @param factor the amount to multiply the number of occurrences of each element by
     * @return the modified list
     */
    public static List multiply(List list, int factor) {
        return null;
    }

    /**
     * Given a sorted linked list, remove the duplicate values from the list
     * and return the modified list sorted.
     * ex: list: 5 -> 6 -> 7 -> 7 -> 7 -> 8 -> 8 -> 9
     *     return: 5 -> 6 -> 7 -> 8 -> 9
     *
     * @param list - a sorted linked
     * @return a sorted linked list with repeated values removed
     */
    public static List removeRepeats(List list) {
        return null;
    }

    // Jedi


    /**
     * Given a list, return that list reversed.
     *
     * ex list:  10 -> 9 -> 8 -> 7
     *    return: 7 -> 8 -> 9 -> 10
     * @param list
     * @return the reversed list
     */
    public static List reverse(List list) { return null; }
    /**
     * Return true if the list contains a cycle, false otherwise
     * ex: list: 1 -> 2 -> 3 - > 4 --       (4 points to 2)
     *                ^              |
     *                |              |
     *                ---------------
     *      return: true
     *
     *      list: 1 -> 2 -> 3 -> 4
     *      return: false
     *
     * @param list
     * @return true if the list contains a cycle, false otherwise
     */
    public static boolean containsCycle(List list) {
        return false;
    }

    /**
     * Merge two linked lists. The 2 lists will always be either the same size, or
     * list1 will be longer than list2. The examples below show how to handle
     * each case.
     *
     * Note: Do NOT create and return a new list, merge the second list into the first one.
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
     * @return the merged list
     */
    public static List merge(List list1, List list2) {
        return null;
    }





}
