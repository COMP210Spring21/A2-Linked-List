import list.LinkedList;
import list.List;
import solution.ListAlgorithms;


public class Main {

    public static void main(String[] args) {
        List list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(ListAlgorithms.size(list));
    }
}
