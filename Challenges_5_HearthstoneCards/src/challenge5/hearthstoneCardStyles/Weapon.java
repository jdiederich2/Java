package challenge5.hearthstoneCardStyles;

public class Weapon extends PlaceholderCard implements WeaponCard {
	
	protected int attack;
	protected int durability;
	protected Ability[] abilities;
	protected int currentAttack = attack;
	protected int currentDurability = durability;

	public Weapon(String name, String description, int manaCost, Rarity rarity, GameClass gameClass, Set set,
			boolean golden, int attack, int durability, Ability[] abilities) {
		super(name, description, manaCost, Type.WEAPON, rarity, gameClass, set, golden);
		this.attack = attack;
		this.durability = durability;
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
	public int getAttack() {
		return attack;
	}

	@Override
	public int getCurrentAttack() {
		return currentAttack;
	}

	@Override
	public int getDurrability() {
		return durability;
	}

	@Override
	public int getCurrentDurability() {
		return currentDurability;
	}

	@Override
	public Ability[] getAbilities() {
		return abilities;
	}

}
