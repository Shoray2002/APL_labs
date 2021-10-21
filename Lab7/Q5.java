package Lab7;

class base
{
    synchronized void print(int n)
    {
       synchronized(this)
       {
           for(int i=1;i<=12;i++)
	   {
               System.out.print(n*i +" ");

               try
	       {
                   Thread.sleep(400);
               }

               catch(InterruptedException e)
	       {
                   System.out.println("Exception handled "+e); 
               }
           }

           System.out.println();
           System.out.println("thread is running...");   
       }
   }
}

class mt1 extends Thread
{
    base b;

    mt1(base b)
    {
        this.b=b;
    }

    public void run()
    {
       b.print(7);
    }
}

class mt2 extends Thread
{
    base b;

    mt2(base b)
    {
       this.b=b;
    }

    public void run()
    {
       b.print(15);
    }
}

class mt3 extends Thread
{
    base b;

    mt3(base b)
    {
       this.b=b;
    }

    public void run()
    {
       b.print(24);
    }
}

class mt4 extends Thread
{
    base b;

    mt4(base b)
    {
       this.b=b;
    }

    public void run()
    {
       b.print(34);
    }
}

public class Q5
{
    public static void main(String[] args)
    {
        base b=new base();

        mt1 t1=new mt1(b);
        mt2 t2=new mt2(b);
        mt3 t3=new mt3(b);
        mt4 t4=new mt4(b);

        t1.start();
        t2.interrupt();
        mt2.interrupted();
        t3.start();

        System.out.println(t2.isInterrupted());
        
	try
	{
          mt3.sleep(4000);
       	} 
	catch (InterruptedException e)
	{
          e.printStackTrace();
       	}

       	try
	{
          t4.wait();
       	}
	catch (InterruptedException e)
	{
          e.printStackTrace();
       	}
    } 
}
