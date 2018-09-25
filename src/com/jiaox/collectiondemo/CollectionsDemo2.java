package com.jiaox.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.itextpdf.text.pdf.PdfStructTreeController.returnType;
import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * 众所周知，集合体系中常用的都是线程不同步的，当多线程并发访问该集合时，容易出现安全问题
 * 你可以自己加锁
 * 自己加锁麻烦
 * Collections 就解决了这个问题
 * List synchronizedList(List list):将传入的非同步的list集合进行同步，并返回一个同步的list
 * @author Administrator
 *
 */
public class CollectionsDemo2 {
	public static void main(String[] args) {
		//调用原理
		ArrayList al=new ArrayList();
		myList my =new myList(al);
		my.add("haha");
		my.remove("haha");
	}
}

/**
 * 同步的list的底层原理
 * @author Administrator
 *
 */
class myList implements List{
	private List list;
	public myList(List list) {
		this.list=list;
	}
	
	private Object lock=new Object();
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Object e) {
		boolean result=false;
		synchronized (lock) {
			result=list.add(e);
		}
		return result;
	}

	@Override
	public boolean remove(Object o) {
		boolean result=false;
		synchronized (lock) {
			list.remove(o);
		}
		return result;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*public void add(Object obj){
		synchronized (lock) {
			list.add(obj);
		}
	}
	
	public void remove(Object obj){
		synchronized (lock) {
			list.remove(obj);
		}
	}*/
	
}
