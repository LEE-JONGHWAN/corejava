package compareTo.study;

import java.time.LocalDate;
import java.util.ArrayList;


public class Hobi implements Comparable<Hobi> {
	private static String name;
	private static byte level;
	
	public Hobi(String name, byte level) {
		this.name = name;
		this.level = level;
	}
	
	   public static String getName() {
	      return name;
	   }
		   
		public byte getLevel() {
			return level;
		}
		
	    @Override
	    public String toString() {
	    	return "취미: " + getName() + " 수준: " + getLevel();
	    }
	
	    @Override
	    public boolean equals(Object otherObject) {
	    	
	    	Hobi other = (Hobi)otherObject;
	    	
	    	if(this.name.equals(other.name)
	    			&& this.level == other.level)
	    		return true;
	    	else
	    		return false;
	    }
	    
	@Override
	public int compareTo(Hobi other) {
		int sameName = name.compareTo(Hobi.getName());
		if (sameName ==0) {
			return level - Hobi.level;
		} else {
			return sameName;
		}	
	}
	public static void main(String[] args) {

	}

}
