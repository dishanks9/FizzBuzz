public class FizzBuzz {

    public String returnFizzBuzzBynumber(int number) {

        if(number == 0)
            return convertIntToString(number);

        return checkFizzBuzz(number);
    }

    private String convertIntToString(int number){
        return String.valueOf(number);
    }

    private String checkFizzBuzz(int number){
        String output = "";
        if(number % 3 == 0)
            output += "Fizz";

        return output != "" ? output : convertIntToString(number);
    }

}
