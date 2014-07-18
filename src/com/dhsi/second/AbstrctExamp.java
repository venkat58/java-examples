package com.dhsi.second;

abstract public class AbstrctExamp {
	 void streeing(){
			System.out.println("implementdd method on abstract ");
	 }
	
	abstract void powerstering();

	
}

class maruti extends AbstrctExamp
{

	static class audi extends maruti
	{
		public static void main(String[] args) {
			maruti m= new maruti();
			m.powerstering();
			m.streeing();
		}
	}
	

	@Override
	void powerstering() {
		// TODO Auto-generated method stub
	System.out.println("power sterring");	
	}
	
	
}