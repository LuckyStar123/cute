package Java.ZuoYe1.DengJi;

public class Math implements DengJi{
	public String Mname="Ӣ��";
	public int MFullScore=120;
	public double Mscore;
	public String Mdengji;
	public String Mteacher="������";
	public void dengji(){
		if(Mscore<60)
		{
			Mdengji="��";
		}
		else if(Mscore<70 && Mscore>=60)
		{
			Mdengji="����";
		}
		else if(Mscore<80 && Mscore>=70)
		{
			Mdengji="��";
		}
		else if(Mscore<90 && Mscore>=80)
		{
			Mdengji="��";
		}
		else if(Mscore<=100 && Mscore>=90)
		{
			Mdengji="��";
		}
		else 
		{
			Mdengji="����������ݲ���ȷ";	
		}
		
	}
}