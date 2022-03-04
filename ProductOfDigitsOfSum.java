public class ProductOfDigitsOfSum {
    public static void main(String args[]) {
      
        System.out.println(sumDigProd(16, 28));
        System.out.println(sumDigProd(1, 2, 3, 4, 5, 6));
      
    }
    
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