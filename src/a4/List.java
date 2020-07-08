package a4;

public interface List<T> {
  /**
   * Returns the number of elements in this a4.list.
   *
   * @return the number of elements in the a4.list
   */
  int size();

  /**
   * Returns true if this a4.list contains no elements.
   *
   * @return true if this a4.list contains no elements
   */
  boolean isEmpty();

  /**
   * Removes all of the elements from this a4.list.
   */
  void clear();

  /**
   * Returns true if this a4.list contains the specified element.
   *
   * @param element whose presence in this a4.list is to be tested
   * @return true if this a4.list contains the specified element
   */
  boolean contains(T element);

  /**
   * Returns an array containing all of the elements of the a4.list
   * in sequence. The size and contents of the array created
   * are the size and contents of the a4.list at the time
   * that the method is called.
   *
   * @return an array containing all of the elements in this
   * a4.list in proper sequence
   */
  T[] toArray();

  /**
   * Appends the specified element to the end of this a4.list.
   *
   * @param element to be appended to this a4.list
   */
  void add(T element);

  /**
   * Removes the first occurrence of the specified element
   * from this a4.list, if it is present
   *
   * @param element to be removed from this a4.list, if present
   * @return true if this a4.list contained the specified element and false otherwise
   */
  boolean remove(T element);

  /**
   * Returns the element at the specified position in this a4.list.
   *
   * @param index of the element to return
   * @return the element at the specified position in this a4.list
   */
  T get(int index);

  /**
   * Replaces the element at the specified position in this a4.list
   * with the specified element.
   *
   * @param index   of the element to replace
   * @param element to be stored at the specified position
   * @return the element previously at the specified position
   */
  T set(int index, T element);

  /**
   * Inserts the specified element at the specified position in
   * this a4.list (optional operation). Shifts the element currently
   * at that position (if any) and any subsequent elements to the
   * right (adds one to their indices).
   *
   * The value of index must be in the range of 0 to the size of the
   * a4.list. Adding an element at index size will add the element to
   * the end of the a4.list.
   *
   * @param index   at which the specified element is to be inserted
   * @param element to be inserted
   */
  void add(int index, T element);



  /**
   * Removes the first occurrence of the specified element from
   * this a4.list, if it is present.
   *
   * @param element to search for
   * @return the index of the first occurrence of the specified
   * element in this a4.list, or -1 if this a4.list does not contain
   * the element.
   */
  int indexOf(T element);

  /**
   * Returns the index of the first occurrence of the specified
   * element in this a4.list, or -1 if this a4.list does not contain
   * the element.
   *
   * @param element to search for
   * @return the index of the last occurrence of the specified
   * element in this a4.list, or -1 if this a4.list does not contain
   * the element
   */
  int lastIndexOf(T element);

  Node getHead();

  void setHead(Node<T> newHead);
}