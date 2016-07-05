//Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
//
//        For example:
//
//        Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
public class AddDigits {

    public int addDigits(int num) {
        int sum =0;

        /**        do{

         sum += num%10;
         num = num/10;

         if(num == 0 && sum/10 !=0){
         num = sum;
         sum=0;
         }

         }while(num != 0 );

         return sum;
         }**/

        return num - 9 * (int)Math.floor((num-1)/9);

    }
}
