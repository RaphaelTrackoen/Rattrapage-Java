@SuppressWarnings("unused")
public class Simulation {
	
	private int age;
	
	private int nbTours=0;
	
	Motion m = new Motion(15, 1, "Shark", 5, true, 35, 10, 1);
	Shark s = new Shark(15, 1, "Shark", 5, true, 35, 10, age, 3, 2, 4);
	
	public void LaunchSim() {
			do {
			s.createShark();
			System.out.println("Le requin a " + m.getAge() + " ans");
			
			m.setAge(m.getAge() + 1);
			System.out.println("Satiété : " + m.getSatiety());
			m.setSatiety(m.getSatiety()-1);
			
			nbTours++;
			//System.out.println(nbTours);
		}while  (nbTours < 5);
		
	}
	
	
	
}
