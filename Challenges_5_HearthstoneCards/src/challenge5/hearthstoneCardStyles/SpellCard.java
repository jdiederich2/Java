package challenge5.hearthstoneCardStyles;

public interface SpellCard extends Card {

	public enum SpellType {
		NONE, SECRET, QUEST
	}
	
	public SpellType getSpellType();
}
