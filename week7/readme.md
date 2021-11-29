#Array: Collection of elements of the same data type, it has a fixed size
# Declaring an array :
##Syntax:
** data type ** [] name/identifier;

# Defining an array 
## Syntax:
** data type ** [] name/identifier = **new** data type [size]; 
** data type ** [] name/identifier  = { element1, element2, element3, ...};
** data type ** [] name/identifier = new data type[] { element1, element2, element3, ...};

##first index of an array
First index : 0
## length of an array 
name/identifier.length
## last index of the array 
last index = name/identifier.length - 1
# Accessing the array 
name/identifier[index]  -> element at the specific index of the array 

if the given index is not within the range, then there will be an indexOutOfBound exception 


# Modify the array 
name/identifier[index]  = elementNew
name/identifier[index]  = name/identifier[index] + elementNew
name/identifier[index]++


++i --> increment first the original variable, then assign
i++ --> assign first, then increment original variable

	int a = 5; 
	int b = a++;
	int c; 
	
	a ==> 6
	b ==> 5
	
	c = ++a;
	
	a ==> 7
	b ==> 5
	c ==> 7

# Iterating Through the array 

	for (int i = 0; i < name/identifier.length ; i++)
	{
		SOP(name/identifier[i]);
	}
	for (int i = 0; i < name/identifier.length ; i++)
	{
		name/identifier[i] = name/identifier[i] + 2;
	}
	SOP(Arrays.toString(name/identifier)) -> [ element1, element2, ...] 