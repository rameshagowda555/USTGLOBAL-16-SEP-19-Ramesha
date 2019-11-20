
public class Bus {
	int seats;
	String color;
	public Bus(int seats,String color) {
		this.seats = seats;
		this.color = color;
	}
	public Bus(){
		this(40);//This statements always used to call a constructor with in  another constructor
	}
	public Bus(int seats){
		this(seats,"red");
		
	}
	public void printDetails(){
		System.out.println("Welcome to RedBus, Bus capacity is "+seats);
	}
	
}
