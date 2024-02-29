package testnglist;


class Parent {   
    String name;   
    
    // A method which prints the data of the parent class   
    void showMessage()   
    {   
        System.out.println("Parent method is called");   
    }   
}   
    
// Child class   
class Child extends Parent {   
    int age;   
    
    // Performing overriding  
    
    void showMessage2()   
    {   
        System.out.println("Child method is called");   
    }   
}   
    
public class Abstaraction{  
    
    public static void main(String[] args)   
    {   
        Parent p = new Child();  
        p.name = "Shubham";  
        System.out.println(p.name);
        Child c=(Child)p;
        c.showMessage2();
        c.showMessage();
        c.
       
        
    }   
}  