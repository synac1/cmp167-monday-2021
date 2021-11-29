# The four pillars of OOP are: Polymorphism, Inheritance, Abstraction, Encapsulation

# Class: Written description of the attributes and behaviors of  an object - Analogy: blueprint of an object 

# Object: Instance of a class.
- Attributes or Instance Variables: Non static variables, created outside of any method, but inside the class
- Constructor: Special method that has the same name as the class, it does not have a return type, task: To initialize the instance variables, To instantiate the object
- setters: aka mutators: modify the values of the instance variables
- getters: aka accessors : return the values of the instance variables
- equals : returns true if the values of the values of ther other object instance variables are the same
- toString : returns a String representation of the object 

ClassName variable = new Constructor();
Scanner input = new Scanner(System.in) <--- Object

--------------------------
	Human 
--------------------------
- name : String 
- age  : int
- hairColor : String
-------------------------
+ Human ()
+ Human (name : String, age : int, hairColor: String)
+ setName (name : String ) : void
+ setAge ( age: int ) : void
+ setHairColor( hairColor: String ): void
+ getName(): String
+ getAge(): int 
+ getHairColor(): String 
+ equals( obj: Object) : boolean
+ toString () : toString
--------------------------

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
		@Override
		public boolean equals( Object obj){
			if ( obj == null ) return false;
			if ( this == obj ) return true;
			if ( obj instanceof Human){
				Human otherHuman = (Human) obj;
				return this.name.equals(otherHuman.name) && this.age == otherHuman.age && this.hairColor.equals(otherHuman.hairColor);
			}
			return false;
		}
		@Override
		public String toString(){
			return "Human: name = "+ getName() +", age= "+ getAge()+", hairColor = "+getHairColor();  
		}
		}