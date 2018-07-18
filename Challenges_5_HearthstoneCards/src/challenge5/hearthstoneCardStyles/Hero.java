package challenge5.hearthstoneCardStyles;

public class Hero extends PlaceholderCard implements HeroCard {
	
	protected Ability[] abilities;

	public Hero(String name, String description, int manaCost, Rarity rarity, GameClass gameClass, Set set,
			boolean golden, Ability[] abilities) {
		super(name, description, manaCost, Type.HERO, rarity, gameClass, set, golden);
		this.abilities = abilities;
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
	public Ability[] getAbilities() {
		return abilities;
	}

}
