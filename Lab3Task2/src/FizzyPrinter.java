public class FizzyPrinter {

    public String printFizzy(int n, boolean toUpperCase) {
        String result = "";

        if (n % 3 == 0 && n % 5 == 0 && n % 7 == 0)
        {
            result = "Fizzbuzzbang";
        }
        else if (n % 3 == 0 && n % 5 == 0)
        {
            result = "Fizzbuzz";
        }
        else if (n % 3 == 0)
        {
            result = "Fizz";
        }
        else if (n % 5 == 0)
        {
            result = "Buzz";
        }
        else if (n % 7 == 0)
        {
            result = "Bang";
        }
        else
        {
            result = "Boom";
        }


        return toUpperCase ? result.toUpperCase() : result;
    }
}