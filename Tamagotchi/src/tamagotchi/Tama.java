package tamagotchi;


/**
 *  Valeurs max: humeur = 10, faim=10, besoin=10, hygiene=10, sante=10, poids=10
 * 
 *  Valeurs par défaut: humeur = 5, faim=5, besoin=0, hygiene=5, sante=10, poids=5
 *  
 *  Valeurs d'alerte:  humeur = 1, faim=1, besoin=1, hygiene=1, sante=1, poids=1;
 *  
 *  Valeurs de décès: santé =0
 * @author Pablo
 *
 */


public class Tama {
	
	
		
	
	
	private String sexe = "";
	private int humeur;
	private int faim;
	private int hygiene;
	private String nom;
	private int sante;
	private int poids;
	private int sport; 
	private int laver;
	private int jouer;
	private int dormir;
	
	private boolean mort= false;

	public Tama(String pNom, String pSexe) {
		nom=pNom;
		sexe= pSexe;

	}

	public String statueDormir() {
		String user="";
		sante++;
		humeur++;
		dormir++;
		faim--;
		hygiene--;
		switch(dormir) {

		case -5:case-4: 
			user= nom +" est vraiment fatigué et doit allez dormir ! ";

			break;

		case -3: case -2:
			user= nom+" a besoin de dormir";
			break;
		case -1: case 0:
			user= nom+" a bien dormit ";
			break;
		case +1: case +2:
			user= nom+" a bien dormit  ";
		break;	
		case +3: case +4:
			user= nom+" a fait un gros dodo ";
		break;

		case +5:
			user= nom +" est un gros dormeur !";
		break;
		}
		return user;
	}

	public String statueSport() {
		String user="";
		sante++;
		faim--;
		sport++;
		poids--;
		dormir--;
		hygiene--;
		humeur--;
		switch (sport) {
		case -5:case-4: 
			user= nom +" devient gros a besoin de faire du sport, il va mourrir";
			setMort(true);

			break;

		case -3: case -2:
			user= nom+" commence a grossir il doit faire du sport";
			break;
		case -1: case 0:
			user= nom+" est en bonne santé ";
			break;
		case +1: case +2:
			user= nom+" est en bonne santé ";
		break;	
		case +3: case +4:
			user= nom+" fait beaucoup de sport attention ";
		break;

		case +5:
			user= nom+" il meurt, fait trop de sport il a besoin de manger  ";
		setMort(true);

		break;
		
		}
		System.out.println(user);

		return user;
	}

	public String manger() {
		System.out.println(this.nom+" est en train de manger "+'\n');
		String user="";
		faim ++;
		sante++;
		sport--;
		poids++;

		switch (faim) {

		case -5:case-4: 
			user= nom +" meurt de faim";
			setMort(true);
			break;

		case -3: case -2:
			user= nom+" commence vraiment a avoir faim";
			break;
		case -1: case 0: case +1:
			user= nom+" n'a pas besoin de manger";
		break;
		case +2:
			user= nom+" n'a plus faim ";
		break;	
		case +3: 
			user= nom+" a trop mangé !";
		break;
		case +4:
			user= "Attention "+ nom + "va bientot vomir";
		break;
		case +5:
			user= "Tu as tué "+nom+" bravo, son estomac a explosé...!";
		setMort(true);
		break;
	
		}
		System.out.println(user);
		return user;

	}

	public String statueGaming() {
		String user="";
		humeur++;
		faim--;
		poids--;
		dormir--;
		jouer++;
		hygiene--;
		switch (jouer) {

		case -5:case-4: 
			user= nom +" est malheureux il a besoin de jouer.... ";
			break;

		case -3: case -2:
			user= nom +" est triste il veut jouer.";
			break;
		case -1: case 0:
			user= nom +" est heureux ! Bravo ! ";
			break;
		case +1: case +2:
			user= nom +" est heureux ! Bravo !  ";
		break;	
		case +3: case +4:
			user= nom +" joue depuis trop longtemps attention.";
		break;

		case +5:
			user= nom +" devient un zombie...!! ";
		setMort(true);

		break;
		
		}
		System.out.println(user);
		return user;
	}

	public String statueLaver() {
		String user="";
		humeur ++;
		hygiene ++;
		
		switch (laver) {
		case -5: case -4:  
			user= nom+ " est tout propre ! ";
			break;

		case-3: case-2:
			user= nom + " est bientot propre ";
			break;

		case-1: case 0: 
			user= nom + " ne sent pas mauvais ";
			break;

		case+1: case +2: 
			user= nom + " ne sent pas mauvais ";
		break;

		case+3: case+4:
			user= nom +" commence a etre sale";
		break;

		case+5:
			user= nom +" est trop sale faut le laver !! ";
		break;

		}
		System.out.println(user);
		return user;
	}


	int manger = 1;
	int StatueSport = 2;
	int statueGaming = 3;
	int statueLaver =4; 
	int statueDormir =5;



	public void action (int num) {
		switch (num) {
		case 1:
			this.manger();

			break;
		case 2:
			this.statueSport();
			break;

		case 3:
			this.statueGaming();
			break;
		case 4:
			this.statueLaver();
			break;
		case 5:
			this.statueDormir();
			break;

		default:
			break;
		}
	}


	@Override
	public String toString() {
		return "Tama [sexe=" + sexe + ", humeur=" + humeur + ", faim=" + faim + ", hygiene=" + hygiene + ", nom=" + nom
				+ ", sante=" + sante + ", poids=" + poids + "]";
	}
	public  void goSport() {
		System.out.println(nom+ " va faire du sport");
		this.statueSport();
	}
	public void goToilettes() {
		System.out.println(nom+ " va aux toilettes");
	}
	public void goMiam() {
		System.out.println(nom+ " va manger comme un gros porc");	
	}
	public  void goLaver() {
		System.out.println(nom+ " va ce laver");
		this.statueLaver();
	}
	public void goDormir() {
		System.out.println(nom+ " va faire dodo");
		this.statueDormir();
	}
	public void goGaming() {
		System.out.println(nom+ " va jouer ");
		this.statueGaming();
	}
	

	
		
	
	public String getSexe() {
		return sexe;
	}
	
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public int getHumeur() {
		return humeur;
	}
	public void setHumeur(int humeur) {
		this.humeur = humeur;
	}
	public int getFaim() {
		return faim;
	}
	public void setFaim(int faim) {
		this.faim = faim;
	}
	public int getHygiene() {
		return hygiene;
	}
	public void setHygiene(int hygiene) {
		this.hygiene = hygiene;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getSante() {
		return sante;
	}
	public void setSante(int sante) {
		this.sante = sante;
	}
	public int getPoids() {
		return poids;
	}
	public void setPoids(int poids) {
		this.poids = poids;
	}
	
	public int getSport() {
		return sport;
	}

	public void setSport(int sport) {
		this.sport = sport;
	}

	public boolean isMort() {
		return mort;
	}

	public void setMort(boolean mort) {
		this.mort = mort;
	}

	public int getDormir() {
		return dormir;
	}

	public void setDormir(int dormir) {
		this.dormir = dormir;
	}
	
	public int getLaver() {
		return laver;
	}
	public void setLaver(int laver) {
		this.laver = laver;
	}
	public int getGaming() {
		return jouer;
	}
	public void setGaming(int jouer) {
		this.jouer= jouer;
	}
	

}

