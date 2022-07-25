1. Java 
2 . Java Hello WOrld

//installation of java
//installation of eclipse

Open the Eclipse
#Choose the workspace or create new workspace
#workspace--it is working directory for java application
#create a java Application 
             --File--> New--> Other Project
			 
			 --Type Java Application in search bar
			 
			 --Select the Java Project
			 
You have to give the Application Properties	
#Name --After giving the project name click on next
       --Again Click on next screen
	   --Create Modules Info. DO not create this one
	   
	   
	   
	   
		 
			 
>java application
            Folder Structure of Java Application
                 ---Src
				     --Need to Create the Package 
#Java Package--it is like a folder or directory in oS
             --it is used to store the related file of one project
> You are creating and maintaining the project
> blong to some company and there will project also

     Package--> #it start with company name domain 
	         com
			#give the company name
			 --globallogic
			 #give the project and topic name
			 --helloworld
			 #it always have lower care
			 com.globallogic.demo
			 #it will not have any keyword
			 

#keyword --these are reserved word in the java 
         -- cannot use it for your own purpose			 
	
	
#JavaClass --it will be package name

//String 
//Class and Object
		   
		   
#Friends
   >System
        --variable
		--Out(PrintStream)
		--Method
   >PrintStream
          --print
		  --println()
		  
   >Scanner Class 
          //method   
          --nextInt()
          --nextShort()
          --nextBoolean()
          --next()
          --nextLine();

     >Wrapper
     >String
     >StringBuffer
     >StringBuilder	 
	 >Iterator  --it is use to iterate the different value (Array , Collections , other)
     
 
#Keywords 
        --extends : it is use to extends the funcalatiy of one class to another
        --final keyword--
        --Static Keyword
		
		
Jre

Work with JDK
You have to change the jre to JDK

Already taken the project follow these steps:
right click on the project
>go to build path
>Go to Libraries 
>Select the JRE system and click on remove
>Select the Modules Path and add the Libraray
>Select the JRE system Libraray
>Click on Install JRes
>Select the installed JRe Libraray
>Click on remove to delete this Libraray
>Click on Add to add the new Libraray
>Click on next and select the path of installed java 

#JDk installed in system
#JDK config in the eclipse


#Reading the Data and Wrtiing the Data on memory
   >each language has the features to add and remove the data to menory
   >variable in all the language 
   >becuase you have have different value in same memory place

#DataType
#Identifer
#Operator
#Heap Memory
#Stack Memory

OOPS concept---object oritneted programining language 
in most of the language

//object oritneted Application
class and object
inheritance(completed)
encapsulation (completed)
polymorphism(completed)
Abstraction(completed)
        //it is concept that does not have any implementation
		//cell phone(it is idea or concept)
		//implementation class
		//two ways of absraction:
		//interface 
		//abstract class
		
		#callphone--calling
		         #--send sms
         #must have the implemented class
    


#class and Object ,method
#Inheritance -- reuse usabality of code 
         --two class will have parent child relatiosnhip
		 --base class and child
		 --you can use the extends keyword
             -- we have two classes these two class will have class A
			          //varibale
					  //method
			        --printA()
			      Class B
				  //printB();

//Ravinder 
				  
calculator
{
Addition
Subtraction
Multipcation
Divide
}	

//interst also
//Kumar

Class SuperCalculator extends Calcualtor
{
	
	
}
    (super) 
//basic data type : int , float ,double. char
//Wrapper--: becuase it has encapsulated the already existed class like int , float or double
//in java we have requirement to convert basic data type to object or class
create the method of wrapper
Byte --byte
Short --short
Long --long
Integer --int
Character-->char
Boolean ---boolean


//version control github
   //it is maintain the different files version
  //you can update the code and later you can share the code and download the code

#Github :Repositories :it is like new url assign to gihubcode
  #it is directory or folder where you can update the code with help of github commands
  
  //create a new Respoitoty:
    //Repository name
	 //it is public  --anyone on the internet will be able to access your code

//private--you can share the code by adding the person

 https://github.com/ansarpjbd/globallogic
 
 
 //upload the code
 
git init --it is used to intitalize the repo

git add foldername --it is use to add the folder to github

git commit -m "first commit"  #adding ther files to repo

git branch -M main    //explain 

//add the url with token
 
#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

git remote add origin https://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@github.com/ansarpjbd/globallogic_new.git

git push -u origin main


 
 //download the code

  git clone https://github.com/ansarpjbd/globallogic_new


#Exception Handling : there can be situation when you code is running there will be problem in executing the code.

      >Error --it stop the jvm (if error is there)
	  >Exception--it is kind of error but this will not halt the jvm . 
	            >Program will still run 
				
	> Resoruces which you are using	 got failed
   >you should not stop the work
   >search for alternative resources and start working again
   
   Full Flag Freamwork here for Exception
   --> Throwable
    --->  Exception
	    --> Runtime Exception(Checked Exception)    --> IO Exception (Unchecked ) 
  
			
Collection : it is freamwork in java 
           : it is collections of classes:
		   :it will help us to insert ,update , delete and manipluate the in easy ways
		   :
		   

List
Set

Menu Based Program
			
Select your choice
 Press 1 for insert the new employee
 Press 2 for delete the employee
 Press 3 for Update employee



   
            	