/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main {
    public static void main(String[] args) {
        Food f = new Milk();
        f.eat();
    }
}

interface Food {
    void eat();
}
 class Bread implements Food {
    public void eat() { // Make this method public
        System.out.println("Bread");
    }
}

 class Milk implements Food {
    public void eat() { // Make this method public
        System.out.println("Milk");
    }
}
