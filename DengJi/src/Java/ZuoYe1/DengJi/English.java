package Java.ZuoYe1.DengJi;

public class English implements DengJi{
	public String Ename="Ӣ��";
	public int EFullScore=120;
	public double Escore;
	public String Edengji;
	public String Eteacher="��ʺ�";
	public void dengji(){
		if(Escore<120*0.6)
		{
			Edengji="��";
		}
		else if(Escore<120*0.7&&Escore>=120*0.6)
		{
			Edengji="����";
		}
		else if(Escore<120*0.8&&Escore>=120*0.7)
		{
			Edengji="��";
		}
		else if(Escore<120*0.9&&Escore>=120*0.8)
		{
			Edengji="��";
		}
		else if(Escore<=120&&Escore>=120*0.9)
		{
			Edengji="��";
		}
		else 
		{
			Edengji="����������ݲ���ȷ";	
		}
		
	}
}
