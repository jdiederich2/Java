package challenge5.hearthstoneCardStyles;

public class Minion extends PlaceholderCard implements MinionCard {
	
	protected int attack;
	protected int health;
	protected Ability[] abilities;
	protected CreatureType creatureType;
	protected int currentAttack = attack;
	protected int currentHealth = health;

	public Minion(String name, String description, int manaCost, Rarity rarity, GameClass gameClass, Set set,
			boolean golden, int attack, int health, Ability[] abilities, CreatureType creatureType) {
		super(name, description, manaCost, Type.MINION, rarity, gameClass, set, golden);
		this.attack = attack;
		this.health = health;
		this.abilities = abilities;
		this.creatureType = creatureType;
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
	public int getAttack() {
		return attack;
	}

	@Override
	public int getCurrentAttack() {
		return currentAttack;
	}

	@Override
	public int getHealth() {
		return health;
	}

	@Override
	public int getCurrentHealth() {
		return currentHealth;
	}

	@Override
	public Ability[] getAbilities() {
		return abilities;
	}

	@Override
	public CreatureType getCreatureType() {
		return creatureType;
	}

}
