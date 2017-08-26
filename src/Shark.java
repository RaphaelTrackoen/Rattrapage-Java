@SuppressWarnings("unused")
public class Shark extends Motion{

	private int enemiesID;
	private int preyID;
	private int preyID2;

	
////////////////////////////////  Constructor  ////////////////////////////////////////////////
	
	
	
	public Shark() {
		super();
		enemiesID= 0;
		preyID = 0;
		preyID2 = 0 ;
	}
	

	public Shark(int pSatiety, int pSpeciesID, final String pName, int pBirthDelay, 
			boolean  pCanReproduce, final int pLifeExpectancy, int pSpeed, int pAge, final int pEID, 
			final int pP1, final int pP2)
	{
		super(pSatiety, pSpeciesID, pName, pBirthDelay, pCanReproduce, pLifeExpectancy, pSpeed, pAge);
		this.enemiesID = pEID;
		this.preyID = pP1;
		this.preyID2 = pP2;
		
		
	}
	
//////////////////////////////// Methods ////////////////////////////////////////////////
	
	public String decrisToi(){
		 
		String str = super.decrisToi() + "\n Ses proies ont pour ID : " + this.getPreyID() + " et " + this.getPreyID2() ;
		
		return str;
	}
	
	
	public void createShark() {
		Shark shark1 = new Shark(15, 1, "Shark", 5, true, 35, 10, 1, 3, 2, 4);
		
		//System.out.println(shark1.decrisToi());
	}
	
	public void cycleShark() {
		
	}
	
	public void ageShark() {
		super.setAge(super.getAge() + 1);
	}
	
	
////////////////////////////////Getters and Setters ////////////////////////////////////////////////

	
	public int getEnemiesID() {
		return enemiesID;
	}

	public void setEnemiesID(int enemiesID) {
		this.enemiesID = enemiesID;
	}

	public int getPreyID() {
		return preyID;
	}

	public void setPreyID(int preyID) {
		this.preyID = preyID;
	}

	public int getPreyID2() {
		return preyID2;
	}

	public void setPreyID2(int preyID2) {
		this.preyID2 = preyID2;
	}
	
}
