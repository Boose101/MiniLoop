public class Prime {
    public static void main(String[] args) {
        int count = 0;
        int num = 0;
        int[] prime;
        prime = new int[50];
        while(count != 50){

                if(checkPrime(num) != 0){
                    prime[count] = (checkPrime(num));
                    count++;
                    num++;
                }else{
                    num++;
                }

        }
        System.out.println("The first 50 prime numbers are: ");
        for(int y = 0; y<5; y++){
            for(int x = 0; x<10; x++){
                System.out.print(prime[x+(y*10)] + " ");
            }
            System.out.print('\n');
        }
        
    }


    public static int checkPrime(int num){
	int count=0;
	for(int x=1; x<=num; x++){
	   if(num % x ==0)
	   {
	        count++;	        
	   }
	}if(count == 2){
        return num;
    }else{
        return 0;
    }
    }
}
