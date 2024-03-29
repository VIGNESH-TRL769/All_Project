package project.collections;
import java.util.logging.Logger;
public class ArrayOperation
{
    public static final Logger Log=Logger.getLogger(("InfoLogging"));
    int size;
    int[] array;
    protected void arraySizeIncress()
    {
        int[] temp =new int[size+1];
        for(int i=0;i<size;i++)
        {
            temp[i]=array[i];
        }
        array=temp;
        size++;
    }
    protected void arraySizeDecress()
    {
        int[] temp =new int[size-1];
        for(int i=0;i<size-1;i++)
        {
            temp[i]=array[i];
        }
        array=temp;
        size--;
    }
    protected void insert(int value)
    {
        arraySizeIncress();
        array[size-1]=value;
        Log.info("---Your Value is Successfully Inserted---\n");
    }
    protected void addElement(int value,int index)
    {
        if(index<size) {
            arraySizeIncress();
            for (int i = size - 1; i >= index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = value;
            Log.info("----Your Value is Successfully Inserted----\n");
        }
        else
        {
            Log.info("Please Enter Valid Range");
        }
    }
    protected void remove(int index)
    {
        if(index<size) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            arraySizeDecress();
            Log.info("-----Your Value is Successfully Remove Of Index-----\n");
        }
        else
        {
            Log.info("Please Enter Valid Range");
        }
    }
    protected void push(int value)
    {
        insert(value);
        Log.info("-----Your Value is Successfully Pushed-----\n");
    }
    protected void pop()
    {
        if(size>0)
        {
            arraySizeDecress();
            Log.info("-----Your Value is Successfully Pushed-----\n");
        }
        else
        {
            Log.info("Array is Empty");
        }

    }
    protected void max()
    {
        int max=array[0];
        for(int i=1;i<size;i++)
        {
            if(max<array[i])
            {
                max=array[i];
            }
        }
        String maximum="Minimum value:"+max;
        Log.info(maximum);

    }
    protected void min()
    {
        int min=array[0];
        for(int i=1;i<size;i++)
        {
            if(min>array[i])
            {
                min=array[i];
            }
        }
        String minimum="Minimum value:"+min;
        Log.info(minimum);

    }
    protected void display()
    {
        StringBuilder print=new StringBuilder();
        String print1;
        for(int i=0;i<size;i++)
        {
            print.append(" "+array[i]+" ");
        }
        print1=print.toString();
        Log.info(print1);
    }
    protected void sort()
    {
        for (int i = 0; i < size; i++)
        {
            for (int j = i + 1; j < size; j++)
            {
                if (array[i] > array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        Log.info("-----Array is Successfully Sorted-----\n");
    }

}