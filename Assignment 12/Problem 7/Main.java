import java.util.*;
class Main{
	Patient ip1 = new InPatient(4322, "Vedansh Gautam", 23);
	
	Patient op1 = new OutPatient(3232, "Nikhil Agrawal", 21);

	List<Patient> l1 = new ArrayList<>();
	
	l1.add(ip1);
	l1.add(op1);
	
	for(int i=0;i<l1.size();i++){
		if(l1.get(i) instanceof InPatient){
			((InPatient)l1.get(i)).calculateBill();
			((InPatient)l1.get(i)).viewBill();
			((InPatient)l1.get(i)).addRecord("Alzhiemer");
			((InPatient)l1.get(i)).viewRecors();
		
		}
		if(l1.get(i) instanceof OutPatient){
			((OutPatient)l1.get(i)).calculateBill();
			((OutPatient)l1.get(i)).viewBill();
			((OutPatient)l1.get(i)).addRecord("Alzhiemer");
			((OutPatient)l1.get(i)).viewRecors();
		
		}
	
	}
}