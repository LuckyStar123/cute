package Java.ZuoYe1.DengJi;

public class English implements DengJi{
	public String Ename="英语";
	public int EFullScore=120;
	public double Escore;
	public String Edengji;
	public String Eteacher="李彩虹";
	public void dengji(){
		if(Escore<120*0.6)
		{
			Edengji="差";
		}
		else if(Escore<120*0.7&&Escore>=120*0.6)
		{
			Edengji="及格";
		}
		else if(Escore<120*0.8&&Escore>=120*0.7)
		{
			Edengji="中";
		}
		else if(Escore<120*0.9&&Escore>=120*0.8)
		{
			Edengji="良";
		}
		else if(Escore<=120&&Escore>=120*0.9)
		{
			Edengji="优";
		}
		else 
		{
			Edengji="您输入的数据不正确";	
		}
		
	}
}
