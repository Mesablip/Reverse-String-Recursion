
/**
 * Write a description of class ReverseRecursion here.
 *
 * @author Dylan Newman
 * @version November 7, 2018
 */
public class ReverseRecursion
{
    public String reverse(String str)
    {
        if (str.length() != 0)
            str = str.substring(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
        return str;
    }
    
    
}
