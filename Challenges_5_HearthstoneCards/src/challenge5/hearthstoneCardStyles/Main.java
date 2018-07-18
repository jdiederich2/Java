package challenge5.hearthstoneCardStyles;


/**
 * INSTRUCTIONS to Challenge 5: Read these first.
 * 
 * Today's challenge is going to be somewhat similar to challenge 4 with 2 major differences: 1) I'm
 * going to teach you about enums and 2) I'm going to teach you about interfaces. Otherwise, the
 * structure will be similar. You'll be working with abstract classes, inheritance, and
 * encapsulation.
 * 
 * Today's subject is Hearthstone (I was going to do MTG, but there are WAYYY to many card types. If
 * you're unfamiliar with Hearthstone, it's a digital card game similar to Magic the Gathering.
 * There are minion cards, weapon cards, hero cards, and spells). What you'll be doing is simple.
 * You'll be creating classes that represent the different types of cards in Hearthstone. (I.e.
 * you'll be creating a generic class for minion cards, spell cards, ect) Then the main class will
 * create some implementations of real cards see if it works. Make sense? If not, it will when you
 * start the project.
 * 
 * Whenever you're ready, open up the instructions pdf file inside the dontOpenThisYet package and
 * lets begin. This project won't be timed for scoring, but let me know when you're starting. If you
 * need help, look back at challenge 4 to help you.
 *
 *
 * P.S. Don't worry about the errors below, they'll go away as you complete more code.
 */

public class Main {
	
	public Card[] deck;
	
	
	public Main() {
		deck = new Card[10];
		
		// Add a couple minions
		deck[0] = new Minion("Argent Squire", "", 1, Card.Rarity.COMMON, Card.GameClass.NEUTRAL, Card.Set.CLASSIC, false, 1, 1, new MinionCard.Ability[] { MinionCard.Ability.DIVINE_SHIELD }, MinionCard.CreatureType.GENERAL);
		deck[1] = new Minion("Wickerflame Burnbristle", "", 3, Card.Rarity.LEGENDARY, Card.GameClass.PALADIN, Card.Set.MEAN_STREETS_OF_GADGETZAN, true, 2, 2, new MinionCard.Ability[] { MinionCard.Ability.DIVINE_SHIELD, MinionCard.Ability.TAUNT, MinionCard.Ability.LIFESTEAL }, MinionCard.CreatureType.GENERAL);
		deck[2] = new Minion("Cobal Scalebane", "At the end of your turn, give another random friendly minion +3 Attack.", 5, Card.Rarity.COMMON, Card.GameClass.NEUTRAL, Card.Set.KNIGHTS_OF_THE_FROZEN_THRONE, false, 5, 5, new MinionCard.Ability[] { MinionCard.Ability.TRIGGERED_EFFECT }, MinionCard.CreatureType.DRAGON);
		deck[3] = new Minion("Wisp", "", 0, Card.Rarity.COMMON, Card.GameClass.NEUTRAL, Card.Set.CLASSIC, true, 1, 1, null, MinionCard.CreatureType.GENERAL);
		
		// Add Some Spells
		deck[4] = new Spell("Fireball", "Deal 6 damage.", 4, Card.Rarity.NONE, Card.GameClass.MAGE, Card.Set.BASIC, false, SpellCard.SpellType.NONE);
		deck[5] = new Spell("Snipe", "Secret: After your opponent plays a minion, deal 4 damage to it.", 2, Card.Rarity.COMMON, Card.GameClass.HUNTER, Card.Set.CLASSIC, false, SpellCard.SpellType.SECRET);
		deck[6] = new Spell("Awaken the Makers", "Quest: Summon 7 Deathrattle minions. Reward: Amara, Warden of Hope.", 4, Card.Rarity.LEGENDARY, Card.GameClass.PREIST, Card.Set.JOURNEY_TO_UNGORO, true, SpellCard.SpellType.QUEST);
		
		
		// Add some weapons
		deck[7] = new Weapon("Truesilver Champion", "Whenever your hero attacks, restore 2 Health to it.", 4, Card.Rarity.NONE, Card.GameClass.PALADIN, Card.Set.BASIC, false, 4, 2, new WeaponCard.Ability[] { WeaponCard.Ability.TRIGGERED_EFFECT });
		deck[8] = new Weapon("Paranha Launcher", "Whenever your hero attacks, summon a 1/1 Piranha.", 5, Card.Rarity.RARE, Card.GameClass.HUNTER, Card.Set.MEAN_STREETS_OF_GADGETZAN, true, 2, 4, new WeaponCard.Ability[] { WeaponCard.Ability.TRIGGERED_EFFECT });
		
		// Add a hero card
		deck[9] = new Hero("Frost Lich Jaina", "Battlecry: Summon a 3/6 Water Elemental. Your Elementals have Lifesteal for the rest of the game.", 9, Card.Rarity.LEGENDARY, Card.GameClass.MAGE, Card.Set.KNIGHTS_OF_THE_FROZEN_THRONE, true, new HeroCard.Ability[] { HeroCard.Ability.BATTLECRY, HeroCard.Ability.ONGOING_EFFECT });
		
		printOutDeck(deck);
	}
	
	
	private void printOutDeck(Card[] deck) {
		int counter = 1;
		for (Card card : deck) {
			
			System.out.println("CARD " + counter + "\n" + card.toString() + "\n");
			counter++;
		}
	}
	
	
	public static void main(String[] args) {
		new Main();
	}
	
	
	
	
}
