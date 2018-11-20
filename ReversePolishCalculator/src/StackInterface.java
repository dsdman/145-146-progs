/*
 * interface for any stack implementation
 * Written by Dylan Desai with the help of J.J. Shepherd
 */

public interface StackInterface<T> {
	public void push(T data);
	public T pop();
	public T peek();
	public void print();
}
