package Trabajo;

public class Main
{

	public static void main(String[] args) 
	{
		PersonaEFS tony_stark = new PersonaEFS("Tony Stark", 35);
		
		System.out.println(tony_stark.nombre + ""+tony_stark.edad);
	
		tony_stark.setEdad(35);
		
		System.out.println(tony_stark.nombre + ""+tony_stark.edad);
		
		SuperHeroEFS iron_man = new SuperHeroEFS(tony_stark.nombre, tony_stark.edad);
				
		iron_man.supernombre = "Iron Man";
		iron_man.poderes = new String[] {"Volar", "Pelear"};
	}

}
