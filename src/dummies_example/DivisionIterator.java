package dummies_example;

import java.util.Iterator;

public class DivisionIterator implements Iterator{

	private VP[] VPs;
	private int location = 0;
	
	public DivisionIterator(VP[] v){
		VPs = v;
	}
	
	@Override
	public boolean hasNext() {
		if(location < VPs.length && VPs[location] != null){
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public VP next() {
		return VPs[location++];
	}
	
	public void remove(){
		
	}
	
}
