package calculator;

class StringCalculator {

    public int add(String input) {
    	if(input.length()==0)
        return 0;
    	String [] arr = input.split(",|\n");
    	int sum =0 ;
    	for(String i :arr) {
    		sum += Integer.valueOf(i) ;
    	}
    	return sum ;
    }

}