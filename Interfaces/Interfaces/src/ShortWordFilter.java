public class ShortWordFilter implements Filter {
    @Override
    public boolean accept(Object x)
    {
//checking if x is a String
        if(x instanceof String)
        {
//safe type casting
            String str=(String) x;
//returning true if str length is less than 5, else false
            return str.length()<5;
        }
        return false; //x is not a String
    }
}