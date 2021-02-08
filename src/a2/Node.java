package a2;

public interface Node {

	int getValue();

	void setValue(int value);

	Node getNext();

	void setNext(Node next);

	default boolean hasNext() {
		return (getNext() != null);
	}
}
