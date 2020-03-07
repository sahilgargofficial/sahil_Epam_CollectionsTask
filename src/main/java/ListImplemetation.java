import java.util.ArrayList;


public class ListImplemetation {
    ArrayList<Integer> arrlist = new ArrayList<Integer>();

    protected void add(int num)
    {

        arrlist.add(num);
    }
    protected void remove(int num)
    {
        arrlist.remove(Integer.valueOf(num));

    }
    protected int fetch(int num)
    {
        return arrlist.indexOf(num);
    }
    protected void print()
    {
        System.out.println(arrlist);
    }
}
