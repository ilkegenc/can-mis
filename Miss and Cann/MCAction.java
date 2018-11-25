import aima.core.agent.impl.DynamicAction;

import java.util.ArrayList;

import aima.core.agent.Action;

public class MCAction implements Action {
	 	private int mis;
	    private int can;
	    
	    public MCAction(int mis, int can) {
	        this.mis = mis;
	        this.can = can;
	    }
	    
	   
	    public boolean isNoOp() {
	        return mis == 0 && can == 0;
	    }

	    public int getMis() {
	        return mis;
	    }

	    public void setMis(int mis) {
	        this.mis = mis;
	    }

	    public int getCan() {
	        return can;
	    }

	    public void setCan(int can) {
	        this.can = can;
	    }

	    @Override
	    public String toString() {	    	 
		    
	        return "<" + mis + ", " + can + ">";
	    }

	    @Override
	    public boolean equals(Object obj) {
	    	MCAction other = (MCAction) obj;
	        return other.mis == mis && other.can == can;
	    }
}
