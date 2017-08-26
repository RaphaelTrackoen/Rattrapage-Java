
public class Motion {
	
//////////////////////////////// Variables ///////////////////////////////////////////////////
	private int satiety;
	private int speciesID;
	private String name;
	private int birthDelay;
	private boolean canReproduce;
	private int lifeExpectancy; 
	private int speed;
	private int age;
	
//////////////////////////////// Constructors ////////////////////////////////////////////////
	
	public Motion(){
		
		System.out.println("Création d'un poisson");
		satiety = 0;
		speciesID = 0;
		name = "unknown";
		birthDelay = 0;
		canReproduce = false;
		lifeExpectancy = 0;
		speed = 0;
		age = 0;
		
	}
	



	public Motion(int pSatiety, int pSpeciesID, final String pName, int pBirthDelay, boolean 
			pCanReproduce, final int pLifeExpectancy,int pSpeed,int pAge ){
		name = pName;
	//	System.out.println("Création d'un " + pName);
		satiety = pSatiety;
	//	System.out.println("Valeur de la satiété : " + pSatiety);
		speciesID = pSpeciesID;
		birthDelay = pBirthDelay;
	//	System.out.println("Délai entre 2 naissances : " + pBirthDelay);
		canReproduce = pCanReproduce;
		//System.out.println("Peut se reproduire : " + pCanReproduce);
		lifeExpectancy = pLifeExpectancy;
	//	System.out.println("Espérance de vie : " + pLifeExpectancy);
		speed = pSpeed;
	//	System.out.println("Vitesse : " + pSpeed);
		age = pAge;
	//	System.out.println("Age : " + pAge);
		
	}

////////////////////////////////Methods/////////////////////////////////////////////////////////////
	
	 public String decrisToi(){
		 
		 return "Le poisson est un " + this.name+", il a " + getAge() + " ans et a une satiété de " + this.satiety + " et une vitesse de " +this.speed;
		 
		  }
	 

////////////////////////////////Getters and Setters ////////////////////////////////////////////////


	public int getSatiety() {
		return satiety;
	}

	public void setSatiety(int satiety) {
		this.satiety = satiety;
	}

	public int getSpeciesID() {
		return speciesID;
	}

	public void setSpeciesID(int speciesID) {
		this.speciesID = speciesID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthDelay() {
		return birthDelay;
	}

	public void setBirthDelay(int birthDelay) {
		this.birthDelay = birthDelay;
	}

	public boolean isCanReproduce() {
		return canReproduce;
	}

	public void setCanReproduce(boolean canReproduce) {
		this.canReproduce = canReproduce;
	}

	
	public int getLifeExpectancy() {
		return lifeExpectancy;
	}

	public void setLifeExpectancy(int lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}





	
	
}
