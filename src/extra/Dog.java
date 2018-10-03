package extra;

public class Dog { 
int numberOfOwners; 
String favoriteFood; 
void bark() { 
System.out.println("bark"); 		
}
void chaseIntruder() 
{ 
System.out.println("chaseIntruder "); 
}
Dog(String favoriteFood, int numberOfOwners) {
  	this.favoriteFood = favoriteFood;
  	this.numberOfOwners = numberOfOwners;


}
}
