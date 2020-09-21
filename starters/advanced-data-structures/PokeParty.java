import java.util.Scanner;

public class PokeParty {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int trainers = scanner.nextInt();
		for (int t = 0; t < trainers; t++) {
			int encounters = scanner.nextInt();
			String firstPokemonName = scanner.next();
			int firstPokemonLevel = scanner.nextInt();
			
			Pokemon firstPokemon = new Pokemon(firstPokemonName, firstPokemonLevel);
			// Initialize a heap, and start by including `firstPokemon`
			
			for (int e = 0; e < encounters; e++) {
				String encounterType = scanner.next();
				Pokemon encounterPokemon = new Pokemon(scanner.next(), scanner.nextInt());
				if (encounterType.equals("CATCH")) {
					// Add `encounterPokemon` to your party
					// But you can only keep 6!
				} else {
					// BATTLE
					Pokemon battlePokemon /* Retrieve lowest pokemon from party */;
					while (battlePokemon.level < encounterPokemon.level) {
						System.out.printf("%s fights %s and loses!%n", battlePokemon.name, encounterPokemon.name);
						battlePokemon = /* Retrieve lowest pokemon from party */;
					}
					
					System.out.printf("%s fights %s and wins!%n", battlePokemon.name, encounterPokemon.name);
					/* Winning pokemon go back into the party */
				}
			}
			
			System.out.println("Final party:");
			while (/* The party is not empty */) {
				Pokemon partyPokemon = /* Retrieve lowest pokemon from party */;
				System.out.printf("%s (%d)%n", partyPokemon.name, partyPokemon.level);
			}
		}
	}
	
	public static class Pokemon implements Comparable<Pokemon> {
		public final String name;
		public final int level;
		
		public Pokemon(String name, int level) {
			this.name = name;
			this.level = level;
		}
		
		public int compareTo(Pokemon other) {
			/*
			 Implement this such that lower level pokemon come first
			 Ties are broken by the pokemon name that comes sooner in the alphabet
			 */
			return 0;
		}
	}
}
