package a4;
import a4.list.*;



public class Main {

    public static void main(String[] args) {
        List list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(ListAlgorithms.size(list));
    }
}
