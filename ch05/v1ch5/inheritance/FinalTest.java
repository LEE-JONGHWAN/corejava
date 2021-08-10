package v1ch5.inheritance;

import java.util.Calendar;
import java.util.Date;

public class FinalTest extends Calendar {

	public static void main(String[] args) {
		FinalTest ft  new FinalTest();
//		ft.getT

	}

	  public final Date getTime(int x) {
		  return null;
	}
	
	@Override
	protected void computeTime() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void computeFields() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(int field, int amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void roll(int field, boolean up) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getMinimum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMaximum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getGreatestMinimum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLeastMaximum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}

}
