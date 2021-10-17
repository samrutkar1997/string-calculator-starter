package calculator;

class StringCalculator {

    public int add(String input) {
    	if(input.length()==0)
        return 0;
        return Integer.valueOf(input);//step 2
    }

}