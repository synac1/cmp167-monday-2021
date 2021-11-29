public class Human{
	private String name;
	private int age;
	private String hairColor;

	public Human(){
		this.name = "";
		this.age  = 20;
		this.hairColor = "brown";
	}
	public Human( String name , int age, String hairColor ){
		this.name = name;
		this.age = age;
		this.hairColor = hairColor;
	}

	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setHairColor(String hairColor){
		this.hairColor = hairColor;
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public String getHairColor(){
		return this.hairColor;
	}
	public boolean equals( Object obj){
		if ( obj == null ) return false;
		if ( this == obj ) return true;
		if ( obj instanceof Human){
			Human otherHuman = (Human) obj;
			return this.name.equals(otherHuman.name) && this.age == otherHuman.age && this.hairColor.equals(otherHuman.hairColor);
		}
		return false;
	}
	public String toString(){
		return "Human: name = "+ getName() +", age= "+ getAge()+", hairColor = "+getHairColor();  
	}
}