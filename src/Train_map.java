import java.util.*;
class Train_map{
	Hashtable<String, Integer> h= new Hashtable<String, Integer>();
	//insert values and keys into hashtable
	void table() {
		train_Map2 t=new train_Map2();
		arrays a=t.trainMapWeight();
		Vertex[] array=a.getArray1();
		
		for(int i=0;i<array.length;i++) {
			h.put(array[i].getVLogicalName(), i);
			}
		//System.out.println(h.keySet());
		
		System.out.println(h.get("Grand Central–42nd Street"));
		//return h;
	}
	
	public int getValue(String s) {
		
		return h.get(s); 
	}
	
	
	/*public static void main(String args[]) {
		Train_map t=new Train_map();
		t.table();
	}
*/}