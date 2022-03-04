public class ProductOfDigitsOfSum {
    public static void main(String args[]) {
      
        System.out.println(sumDigProd(16, 28));
        System.out.println(sumDigProd(1, 2, 3, 4, 5, 6));
      
    }
    
    /*
    Thi function takes one, two or more numbers as arguments and 
    adds them together to get a new number. The function then repeatedly 
    multiplies the digits of the new number by each other, yielding anew 
    number, until the product is only 1 digit long. Return the final product.
    */
    public static int sumDigProd(int... nums){
        int sum = 0;
        for(int num: nums){
            sum += num;
        }
        
        while(sum>9){
            int temp = sum;
            int multiply = 1;
            while(temp > 0){
                multiply *= temp  % 10;
                temp = temp / 10;
            }
            
            sum = multiply;
        }
        
        return sum;
    }
}