package challenge5.hearthstoneCardStyles;

public class Spell extends PlaceholderCard implements SpellCard {
	
	protected SpellType spellType;

	public Spell(String name, String description, int manaCost, Rarity rarity, GameClass gameClass, Set set,
			boolean golden, SpellType spellType) {
		super(name, description, manaCost, Type.SPELL, rarity, gameClass, set, golden);
		this.spellType = spellType;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public SpellType getSpellType() {
		return spellType;
	}

}
