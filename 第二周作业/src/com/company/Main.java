import java.util.Scanner;
import java.util.Random;
class Main {

    public static void main(String[] args) {
	Random rand = new Random();
	Scanner input=new Scanner(System.in);
	int a=rand.nextInt(101);
	int i=0,b=0;
	String c="n",d="N",e="y",f="Y";
	do {
	    System.out.print("请输入您猜的数：");
	    int gn = input.nextInt();
	    if (gn == a)
        {
            System.out.print("\n恭喜您答对了！！");
            b=0;
        }
        else if (gn >a)
        {
            System.out.print("\n很抱歉，您猜错了呃，猜的数比较大");
            b=1;
        }
        else if (gn<a)
        {
            System.out.print("\n很抱歉，您猜错了呃，猜的数比较小");
            b=1;
        }
        if(b==1)
        {
            System.out.print("\n您是否继续，请输入y/n：");
           String x = input.next();
           if(x==c|x==d)
            {
                b=0;
            }
            else if (x==e| x==f)
            {
                b=1;
            }
        }
        i++;

	}while(b==0);
	System.out.print("\n您一共猜了"+i+"次");
    }
}
