package hackkerank_control_overriding;

import java.util.*;
import java.io.*;

public class Java_Method {


	class BiCycle{
		String define_me(){
			return "a vehicle with pedals.";
		}
	}

	class MotorCycle extends BiCycle{
		String define_me(){
			return "a cycle with an engine.";
		}
		
		MotorCycle(){
			System.out.println("Hello I am a motorcycle, I am "+ define_me());
	      // Hello I am a motorcycle, I am a cycle with an engine.

			String temp=super.define_me(); //Fix this line
	      // My ancestor is a cycle who is a vehicle with pedals. 
	      
			System.out.println("My ancestor is a cycle who is "+ temp );
		}
		
	}
	class Solution{
		public void main(String []args){
			MotorCycle M=new MotorCycle();
		}
	}
}
