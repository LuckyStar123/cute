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
    //���뺯��
	public static void  Input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("������ѧ������");
        n=sc.nextInt();
        for(int i=0;i<n;i++)
          {
        	 stu[i]=new Student();
 		     Eng[i]=new English();
 		     math[i]=new Math();
	         System.out.print("�������"+(i+1)+"��ѧ����ѧ��");
	         stu[i].Sno=sc.nextInt();
	         System.out.print("�������"+(i+1)+"��ѧ��������");
	         stu[i].Sname=sc.next();
	         System.out.print("�������"+(i+1)+"��ѧ���İ༶");
	         stu[i].Sclass=sc.next();
	         System.out.print("�������"+(i+1)+"��ѧ����Ӣ��ɼ�");
	         stu[i].SEnglish=sc.nextDouble();
	         System.out.print("�������"+(i+1)+"ѧ������ѧ�ɼ�");
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
			System.out.println("��ѡ��");
			System.out.println("1.����ѧ���ɼ�");
			System.out.println("2.���Ӣ��ɼ�");
			System.out.println("3.�����ѧ�ɼ�");
			System.out.println("4.����ܳɼ�");
			System.out.println("5.�˳�����");
		    Scanner sc=new Scanner(System.in);
		    int m=sc.nextInt();
		    switch(m)
		    {
		    case 1:
		    	Input();
		    	break;
		    	
		    case 2:
		    	System.out.print("*****");
		    	System.out.print("ѧ��");
		    	System.out.print("*****");
		    	System.out.print("����");
		    	System.out.print("*****");
		    	System.out.print("�༶");
		    	System.out.print("*****");
		    	System.out.print("Ӣ��");
		    	System.out.print("*****");
		    	System.out.print("�ον�ʦ");
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
		    	System.out.print("ѧ��");
		    	System.out.print("*****");
		    	System.out.print("����");
		    	System.out.print("******");
		    	System.out.print("�༶");
		    	System.out.print("******");
		    	System.out.print("��ѧ");
		    	System.out.print("******");
		    	System.out.print("�ον�ʦ");
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
		    	   System.out.print("ѧ��");
		    	   System.out.print("*****");
		    	   System.out.print("����");
		    	   System.out.print("*****");
		    	   System.out.print("�༶");
		    	   System.out.print("*****");
		    	   System.out.print("��ѧ");
		    	   System.out.print("*****");
		    	   System.out.print("Ӣ��");
		    	   System.out.print("*****");
		    	   System.out.print("�ܳɼ�");
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
