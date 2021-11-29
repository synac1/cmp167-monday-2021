# Method : A set of instructions that are inside a block and it has a header, a body, and it can be called anywhere.
## Method definitions: main()
## Method calls: indexOf(), charAt(), length(), sqrt(), pow(), abs(), next(), nextDouble(), nextInt(), print(), println()
# Method Definition:
## Syntax: 
**access modifier** **static or not** *data type of return value*  * name of method or identifier* *( Parameter list )* **Exception list**  <---- header
{
	**body of the method**
	
}

-  **access modifier** : public, private, protected, package or default
-  ** static or not** :  with static methods, they can be accessed in a static way, however, if they are non static, an object has to be created
-  *data type of return value*: if method is not return anything then the type should be void
-  * name of method or identifier* : by convention it starts with lower case, it can only start with a alphabetic character or _ , $
-  *( Parameter list )* : the parameter list will contain declarations of variables that will be later assigned a value once it is called

- Signature of a method: name or identifier and the data type of parameter list.



# Method Call or Invocation:
## Syntax:
	:::: Method Signature ::::
* name of method or identifier* *(argument list)* ;

## Semantics: 
 - Hold a space in memory and it is going to give that space a name
 - JVM looks for the method declaration  in the code that matches with the method signature of the method call
 - If no match is found then there will be an error
 - If the match is found then the argument values will be set to the parameter variables
 - Execute the inner statements
 - if there is a returning value, the value will replace the method call and the method call will be dissociated(The method execution will end).
 - If there is no returning value the method call will be dissociated(The method execution will end).
 
 
# Return statement:
## Syntax:
	return expression;
## Semantics:
	- evaluate the expression
	- replace method call with returning value
	- end the method call execution
 
