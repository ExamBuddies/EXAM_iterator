package dummies_example;

public class Division {
	private VP[] VPs = new VP[100];
	private int number = 0;
	private String name;
	
	public Division(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void add(String name){
		VP vp = new VP(name, this.name);
		VPs[number++] = vp;
	}
	
	public DivisionIterator iterator(){
		return new DivisionIterator(VPs);
	}
}
