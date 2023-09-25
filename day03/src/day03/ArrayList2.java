package day03;

import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;

//public class ArrayList2 implements Iterable<Integer>{
//	
//	class ArrayListIter implements Iterator<Integer> {
//		ArrayList2 list;
//		int index;
//		
////		public ArrayListIter(ArrayList2 list) {
////			this.list = list;
////			// TODO Auto-generated constructor stub
////		}
//		
//        public boolean hasNext(){
//            return index < list.length;
//        }
//        
//        public Integer next(){
//        	return list.get(index++);
//        }
//	}
//	
//	@Override
//	public Iterator<Integer> iterator() {
//		return new ArrayListIter(this);    
//	}
//
//	int length = 0;
//	int[] a = new int[1];
//
//	void insert(int index, int value) {
//		if (index > length)
//			throw new ArrayIndexOutOfBoundsException(index);
//		var t = a;
//		if (a.length <= index || a.length <= length + 1) {
//			a = new int[a.length * 2];
//		}
//		int check = 0;
//		for (int i = length; i >= 0; i--) {
//			if (i == index) {
//				check = 1;
//				a[i] = value;
//				continue;
//			}
//			if (check == 0) {
//				a[i] = t[i - 1];
//			} else
//				a[i] = t[i];
//		}
//		length++;
//	}
//
//	void delete(int index) {
//		if (index > length)
//			throw new ArrayIndexOutOfBoundsException(index);
//		var t = a;
//		a = new int[a.length];
//		int check = 0;
//		for (int i = 0; i < length; i++) {
//			if (i == index) {
//				check = 1;
//				continue;
//			}
//			if (check == 1) {
//				a[i - 1] = t[i];
//			} else
//				a[i] = t[i];
//		}
//		length--;
//	}
//
//	int get(int index) {
//		return a[index];
//	}
//
//	void set(int index, int value) {
//		if (index > length)
//			throw new ArrayIndexOutOfBoundsException(index);
//		a[index] = value;
//	}
//
//	int find(int value) {
//		int f = 0;
//		for (int i = 0; i < length; i++) {
//			if (a[i] == value) {
//				f = i;
//				break;
//			}
//		}
//		return f;
//	}
//
//	int front() {
//		return a[0];
//	}
//
//	int back() {
//		return a[length - 1];
//	}
//
//	void push_front(int value) {
//		var t = a;
//		if (a.length <= length) {
//			a = new int[a.length * 2];
//		}
//		for (int i = 0; i < length; i++) {
//			a[length - i] = t[length - 1 - i];
//		}
//		a[0] = value;
//		length++;
//	}
//
//	
//	int pop_front() {
//		int f = a[0];
//		for (int i = 0; i < length - 1; i++) {
//			a[i] = a[i + 1];
//		}
//		length--;
//		return f;
//	}
//
//	int pop_back() {
//		int f = a[length - 1];
//		a[length - 1] = 0;
//		length--;
//		return f;
//	}
//
//	boolean empty() {
//		return length == 0;
//	}
//
//	int length() {
//		return length;
//	}
//
//	void clear() {
//		length = 0;
//		a = new int[1];
//	}
//
//	void sort() {
//		for (int i = length - 1; i > 0; i--) {
//			for (int j = 0; j < i; j++) {
//				if (a[j] > a[j + 1]) {
//					int c = a[j];
//					a[j] = a[j + 1];
//					a[j + 1] = c;
//				}
//			}
//		}
//	}
//
//	void reverse() {
//		var t = a;
//		a = new int[length];
//		for (int i = 0; i < length; i++) {
//			a[i] = t[length - 1 - i];
//		}
//	}
//
//	void print() {
//		for (int i = 0; i < length; i++) {
//			System.out.printf("%3d", a[i]);
//		}
//		System.out.println();
//	}
//	
//	ArrayList2 map(Function<Integer, Integer> aaa) {
//		var sd = new ArrayList2();
//		for (int i = 0; i < length; i++) {
//			sd.push_back(aaa.apply(a[i]));
//		}
//		return sd;
//	}
//	
//	ArrayList2 filter(Function<Integer, Boolean> aaa) {
//		var sd = new ArrayList2();
//		for (int i = 0; i < length; i++) {
//			if (aaa.apply(a[i])) {
//				sd.push_back(a[i]);
//			}
//		}
//		return sd;
//	}
//	
//	void forEach2(Consumer<Integer> f) {
//		for (int i = 0; i < length; i++) {
//			f.accept(a[i]);
//		}
//	}
//	
//	void push_back(int value) {
//		if (a.length == length) {
//			var t = a;
//			a = new int[a.length * 2];
//			for (int i = 0; i < length; i++) {
//				a[i] = t[i];
//			}
//		}
//		a[length] = value;
//		length++;
//	}
//	
//	static void sssd(int x) {
//		System.out.println(x);
//	}
//
//	public static void main(String[] args) {
//		var al = new ArrayList2();
//		al.push_back(1);
//		al.push_back(2);
//		al.push_back(3);
//		var a2 = al.map(u -> u * 2);
//		var a3 = a2.filter(x -> x > 3);
//		a3.forEach2(System.out::println);
//		al.print(); // 1, 2, 3
//		a2.print(); // 2, 4, 6
//		al.print();
//		a2.print();
//		al.forEach2(ArrayList2::sssd);
//		
//		for (var a : a2) {
//			System.out.println(a);
//		}
////		for (int i = 0; i < 10; i++) {
////			al.insert(i, i + 1);
////		}
////		al.print();
////		al.delete(2);
////		al.print();
////		System.out.println(al.get(2));
////		al.set(2, 42);
////		al.print();
////		System.out.println(al.get(2));
////		System.out.println(al.find(7));
////		System.out.println(al.front());
////		System.out.println(al.back());
////		System.out.println("길이 = " + al.length);
////		al.push_front(4);
////		al.print();
////		al.push_front(2);
////		al.print();
////		al.push_front(3);
////		al.print();
////		al.push_back(91);
////		al.print();
////		al.pop_front();
////		al.print();
////		al.pop_back();
////		al.print();
////		al.insert(2, 77);
////		al.print();
////		System.out.println(al.empty());
////		System.out.println(al.length);
////		al.reverse();
////		al.print();
////		al.sort();
////		al.print();
////		al.clear();
////		System.out.println(al.empty());
////		System.out.println(al.length);
//	}
//}