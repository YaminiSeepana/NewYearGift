package yamini.trial;
public class Student {
int candies;
int sweets;
String name;
int c_cost;
int s_cost;
int t_cost;
public int getTotalCost (){
	Sweets s=new Sweets();
	Candies c=new Candies();
	t_cost=s.calculateTotalCost(sweets)+c.calculateTotalCost(candies);
	return t_cost;
	
}
public void setCandies(int candies) {
	this.candies = candies;
}

public void setSweets(int sweets) {
	this.sweets = sweets;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getT_cost() {
	return t_cost;
}



}
