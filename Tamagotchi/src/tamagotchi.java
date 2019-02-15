import java.util.Scanner;

import tamagotchi.Tama;

class tamagotchi {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String Newligne=System.getProperty("line.separator");
		String sexe="?";
		System.out.println(" Hey ! tu veux avoir un garçon ou une fille ? ");
		boolean verif = true;
		while (verif) {
			String usEnt= sc.nextLine();
			 sexe = usEnt;
			if (usEnt.equalsIgnoreCase("garçon")){
				System.out.println("Super c'est un garçon");
				verif=false;
			}
			else if (usEnt.equalsIgnoreCase("fille")) {
				System.out.println("Super c'est une fille ! ");
				verif= false;
			}
			else {
				System.out.println("Votre saisie est incorrect ! Garçon ou Fille ? ");
			}
		}


		String usEnt2= sc.nextLine();
		String nom =usEnt2.substring(0,1).toUpperCase()+usEnt2.substring(1).toLowerCase();
		System.out.println(" Votre  tamagotchi " + nom+ " viens d'éclore de son oeuf ! ");

		Tama monTama = new Tama(nom, sexe);
		System.out.println(monTama);

		while (monTama.isMort()== false) {
			System.out.println("Que voulez vous faire avec votre Tama ? "+Newligne+" 1. Pour manger "+ Newligne+" 2. Pour faire du sport "+Newligne+" 3. Pour le faire jouer aux jeux vidéo"+Newligne+" 4. Pour le laver"+Newligne+" 5. Pour allez dormir");
			int usEnt3=sc.nextInt();
			monTama.action(usEnt3);
			System.out.println(monTama);

		}


	}

}

