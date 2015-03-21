package Java.ZuoYe1.DengJi;
import java.util.Scanner;
public class Main {
	static int n=0;
	static Student stu[]=new Student[100];
    static English Eng[]=new English[100];
    static Math math[]=new Math[100];
	/**
	 * @param args
	 */
    //输入函数
	public static void  Input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入学生数量");
        n=sc.nextInt();
        for(int i=0;i<n;i++)
          {
        	 stu[i]=new Student();
 		     Eng[i]=new English();
 		     math[i]=new Math();
	         System.out.print("请输入第"+(i+1)+"个学生的学号");
	         stu[i].Sno=sc.nextInt();
	         System.out.print("请输入第"+(i+1)+"个学生的姓名");
	         stu[i].Sname=sc.next();
	         System.out.print("请输入第"+(i+1)+"个学生的班级");
	         stu[i].Sclass=sc.next();
	         System.out.print("请输入第"+(i+1)+"个学生的英语成绩");
	         stu[i].SEnglish=sc.nextDouble();
	         System.out.print("请输入第"+(i+1)+"学生的数学成绩");
	         stu[i].SMath=sc.nextDouble();
	         Eng[i].Escore=stu[i].SEnglish;
	         Eng[i].dengji();
	         math[i].Mscore=stu[i].SMath;
	         math[i].dengji();
	         stu[i].getsum();
          }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=true;
		while(flag)
		{ 
			System.out.println("请选择");
			System.out.println("1.输入学生成绩");
			System.out.println("2.输出英语成绩");
			System.out.println("3.输出数学成绩");
			System.out.println("4.输出总成绩");
			System.out.println("5.退出程序");
		    Scanner sc=new Scanner(System.in);
		    int m=sc.nextInt();
		    switch(m)
		    {
		    case 1:
		    	Input();
		    	break;
		    	
		    case 2:
		    	System.out.print("*****");
		    	System.out.print("学号");
		    	System.out.print("*****");
		    	System.out.print("姓名");
		    	System.out.print("*****");
		    	System.out.print("班级");
		    	System.out.print("*****");
		    	System.out.print("英语");
		    	System.out.print("*****");
		    	System.out.print("任课教师");
		    	System.out.print("*****");
		    	System.out.println();
		    	for(int i=0;i<n;i++)
		    	{
		    		System.out.print("*****");
		    	    System.out.print(stu[i].Sno);
		    	    System.out.print("*****");
		    	    System.out.print(stu[i].Sname);
		    	    System.out.print("*****");
		    	    System.out.print(stu[i].Sclass);
		    	    System.out.print("******");
		    	    System.out.print(Eng[i].Edengji);
		    	    System.out.print("*******");
		    	    System.out.print(Eng[i].Eteacher);
		    	    System.out.print("*****");
		    	    System.out.println();
		    	}
		    	break;
		    case 3:
		    	System.out.print("*****");
		    	System.out.print("学号");
		    	System.out.print("*****");
		    	System.out.print("姓名");
		    	System.out.print("******");
		    	System.out.print("班级");
		    	System.out.print("******");
		    	System.out.print("数学");
		    	System.out.print("******");
		    	System.out.print("任课教师");
		    	System.out.print("*****");
		    	System.out.println();
		    	for(int i=0;i<n;i++)
		    	{
		    		System.out.print("*****");
		    	    System.out.print(stu[i].Sno);
		    	    System.out.print("*****");
		    	    System.out.print(stu[i].Sname);
		    	    System.out.print("*****");
		    	    System.out.print(stu[i].Sclass);
		    	    System.out.print("*******");
		    	    System.out.print(math[i].Mdengji);
		    	    System.out.print("******");
		    	    System.out.print(math[i].Mteacher);
		    	    System.out.print("*****");
		    	    System.out.println();
		    	}
		    	break;
		    case 4:
		    	   System.out.print("*****");
		    	   System.out.print("学号");
		    	   System.out.print("*****");
		    	   System.out.print("姓名");
		    	   System.out.print("*****");
		    	   System.out.print("班级");
		    	   System.out.print("*****");
		    	   System.out.print("数学");
		    	   System.out.print("*****");
		    	   System.out.print("英语");
		    	   System.out.print("*****");
		    	   System.out.print("总成绩");
		    	   System.out.print("*****");
		    	   System.out.println();
		    	for(int i=0;i<n;i++)
		    	{
		    		System.out.print("*****");
		    	    System.out.print(stu[i].Sno);
		    	    System.out.print("*****");
		    	    System.out.print(stu[i].Sname);
		    	    System.out.print("*****");
		    	    System.out.print(stu[i].Sclass);
		    	    System.out.print("******");
		    	    System.out.print(Eng[i].Edengji);
		    	    System.out.print("*****");
		    	    System.out.print(math[i].Mdengji);
		    	    System.out.print("*****");
		    	    System.out.print(stu[i].Ssum);
		    	    System.out.print("*****");
		    	    System.out.println();
		    	}
		    	break;
		    case 5:
		    	flag=false;
		    	break;
		    }
		}

	}

}
