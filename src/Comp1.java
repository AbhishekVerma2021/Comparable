import java.nio.charset.IllegalCharsetNameException;
import java.util.Comparator;
import java.util.TreeSet;
public class Comp1
{
    public static void main(String[] args)
    {
        TreeSet<Integer> obj = new TreeSet(new abc());
        obj.add(10);
        obj.add(4);
        obj.add(12);
        obj.add(4);
        System.out.println(obj);
    }
}
class abc implements Comparator<Integer>
{

    @Override
    public int compare(Integer o2 , Integer o1)
    {
        return 0;
    }
}
