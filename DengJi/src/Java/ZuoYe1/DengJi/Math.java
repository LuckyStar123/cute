package Java.ZuoYe1.DengJi;

public class Math implements DengJi{
	public String Mname="英语";
	public int MFullScore=120;
	public double Mscore;
	public String Mdengji;
	public String Mteacher="王再玉";
	public void dengji(){
		if(Mscore<60)
		{
			Mdengji="差";
		}
		else if(Mscore<70 && Mscore>=60)
		{
			Mdengji="及格";
		}
		else if(Mscore<80 && Mscore>=70)
		{
			Mdengji="中";
		}
		else if(Mscore<90 && Mscore>=80)
		{
			Mdengji="良";
		}
		else if(Mscore<=100 && Mscore>=90)
		{
			Mdengji="优";
		}
		else 
		{
			Mdengji="您输入的数据不正确";	
		}
		
	}
}