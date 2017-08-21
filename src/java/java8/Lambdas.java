
package java8;

/**
 *
 * @author 102163  Lisandro Villas Bôas
 */
public class Lambdas {
    
    public static void main(String[] args) {
       testing();
    }
    
    private static void testing() {
        
        LambdaInterfaceTeste greetService = (message) -> System.out.println("Hello " + message);
        
        greetService.sayMessage("blockhead");
    }
    
    
    
    
}
