package challenge5.hearthstoneCardStyles;

public interface Card {
	
	public enum Rarity {
		NONE, COMMON, UNCOMMON, RARE, LEGENDARY
	}
	
	public enum GameClass {
		DRUID, HUNTER, MAGE, PALADIN, PREIST, ROGUE, SHAMAN, WARLOCK, WARRIOR, NEUTRAL
	}
	
	public enum Set {
		BASIC(true), CLASSIC(true), WHISPERS_OF_THE_OLD_OLD_GODS(true), ONE_NIGHT_IN_KARAZHAN(true),
		MEAN_STREETS_OF_GADGETZAN(true), JOURNEY_TO_UNGORO(true), KNIGHTS_OF_THE_FROZEN_THRONE(true), 
		KOBOLDS_AND_CATACOMBS(true), NAXXRAMAS(false), GOBLINS_VS_GNOMES(false), BLACKROCK_MOUNTAIN(false), 
		THE_GRAND_TOURNAMENT(false), LEAGUE_OF_EXPLORERS(false), HALL_OF_FAME(false);
		
		private final boolean standard;
		
		Set(boolean isStandard) {
			this.standard = isStandard;
		}
		
		public boolean isStandard() {
			return standard;
		}
		
		public boolean isWild() {
			return !standard;
		}
	}
	
	public enum Type {
		MINION, SPELL, WEAPON, HERO
	}
	
	public boolean isGolden();
	public String getName();
	public String getDescription();
	public int getManaCost();
	public int getCurrentManaCost();
	public Type getType();
	public Rarity getRarity();
	public GameClass getGameClass();
	public Set getSet();
	public boolean isStandard();
	public boolean isWild();

}
