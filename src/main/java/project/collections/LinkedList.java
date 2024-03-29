package project.collections;
import java.util.logging.Logger;
class LinkedList
{
    public static final Logger Log=Logger.getLogger(("InfoLogging"));
    Node head;
    Node tail;
    int length=0;
    LinkedList()
    {
        head=null;
        tail=null;
    }
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    protected void insert(int val)
    {
        Node node=new Node(val);
        if(this.head==null)
        {
            head=node;
            tail=node;
        }
        else
        {
            tail.next=node;
            tail=node;
        }
        this.length++;
        Log.info("----Your Value is Successfully Inserted----\n");
    }
    protected void display()
    {
        StringBuilder print=new StringBuilder();
        String print1;
        Node temp=this.head;
        if(temp==null)
        {
            Log.info("It is empty");
        }
        else
        {
            while(temp!=null)
            {
                print.append(" "+temp.data+" ");
                temp=temp.next;
            }
            print1=print.toString();
            Log.info(print1);
        }
    }
    protected void insertElement(int value,int position)
    {
        Node temp=this.head;
        Node k=new Node(value);
        Node t=temp;
        if(position==0)
        {
            k.next=this.head;
            this.head=k;
            this.length++;
            Log.info("---Your Value is Successfully Inserted---\n");
        }
        else if(length<position)
        {
            Log.info("Please enter valid range");
        }
        else
        {
            for(int i=0;i<position-1;i++)
            {
                t=temp;
                temp=temp.next;
            }
            t.next=k;
            k.next=temp;
            this.length++;
            Log.info("-----Your Value is Successfully Inserted-----\n");
        }

    }
    protected void remove(int index)
    {
        if(index==0)
        {
            this.head=this.head.next;
            this.length--;
            Log.info("-----Your Value is Successfully Remove Of Index-----\n");
        }
        else if(index>=length)
        {
            Log.info("Please Enter Valid Range\n");
        }
        else
        {
            Node temp=this.head;
            Node t=temp;
            for(int i=0;i<index;i++)
            {
                t=temp;
                temp=temp.next;
            }
            t.next=temp.next;
            this.length--;
            String print="-----Your Value is Successfully Remove from the Index:"+index+"-----\n";
            Log.info(print);
        }

    }
    protected void maxmin()
    {
        Node temp=this.head;
        int max=0;
        int min=this.head.data;
        for(int i=0;i<length;i++)
        {
            if(max<temp.data)
            {
                max=temp.data;
            }
            if(min>temp.data)
            {
                min=temp.data;
            }
            temp=temp.next;
        }
        String minmax="max Value:"+max+"\nmin Value:"+min;
        Log.info(minmax);
    }
    protected void push(int val)
    {
        Node node=new Node(val);
        if(this.head==null)
        {
            this.head=node;
            this.tail=node;
        }
        else
        {
            this.tail.next=node;
            this.tail=node;
        }
        this.length++;
        Log.info("-----Your Value is Successfully Pushed-----\n");

    }
    protected  void pop()
    {
        if(this.length>=0)
        {
            Log.info("Stack is empty");
        }
        else
        {
            Node temp=this.head;
            for(int i=0;i<this.length-2;i++)
            {
                temp=temp.next;
            }
            temp.next=null;
            Log.info("-----Your Value is Successfully Poped-----\n");

        }


    }
}
