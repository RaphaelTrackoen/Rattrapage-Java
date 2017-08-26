@SuppressWarnings("unused")
public class Simulation {
	
	private int age;
	
	private int nbTours=0;
	
	Motion m = new Motion();
	Shark s = new Shark();
	
	public void LaunchSim() {
			do {
			s.createShark();
			m.setAge(m.getAge()+1);
			nbTours++;
		}while  (nbTours < 5);
		
	}
	
	
	

}
