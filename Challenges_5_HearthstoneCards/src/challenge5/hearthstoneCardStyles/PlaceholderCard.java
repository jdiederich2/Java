package challenge5.hearthstoneCardStyles;

public abstract class PlaceholderCard implements Card {
	
	protected String name;
	protected String description;
	protected int manaCost;
	protected Type type;
	protected Rarity rarity;
	protected GameClass gameClass;
	protected Set set;
	protected boolean golden;
	protected int currentManaCost = manaCost;
	
	public PlaceholderCard(String name, String description, int manaCost, Type type, 
			Rarity rarity, GameClass gameClass, Set set, boolean golden) {
		this.name = name;
		this.description = description;
		this.manaCost = manaCost;
		this.type = type;
		this.rarity = rarity;
		this.gameClass = gameClass;
		this.set = set;
		this.golden = golden;
	}

	@Override
	public boolean isGolden() {
		return golden;
	}

	@Override
	public int getManaCost() {
		return manaCost;
	}

	@Override
	public int getCurrentManaCost() {
		return currentManaCost;
	}

	@Override
	public Type getType() {
		return type;
	}

	@Override
	public Rarity getRarity() {
		return rarity;
	}

	@Override
	public GameClass getGameClass() {
		return gameClass;
	}

	@Override
	public Set getSet() {
		return set;
	}

	@Override
	public boolean isStandard() {
		return false;
	}

	@Override
	public boolean isWild() {
		return false;
	}
	
	@Override
	public String toString() {
		String s = "‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾\n";
		s += "|" + name + "\n|\n|" + description + "\n|\n|Cost " + manaCost + "\n|";
		
		if (this.type == Type.WEAPON) {
			Weapon weapon = (Weapon) this;
			s += "Attack: " + weapon.attack + "\n|Durability: " + weapon.durability + "\n|\n|Abilities:";
			
			if (weapon.abilities != null) {
				for (WeaponCard.Ability ability : weapon.abilities) {
					s += "\n|" + ability.name();
				}
			} else {
				s += "NONE";
			}
			
			s += "\n|\n|";
		} else if (this.type == Type.MINION) {
			Minion minion = (Minion) this;
			s += "Attack: " + minion.attack + "\n|Health: " + minion.health + "\n|\n|Abilities:";
			
			if (minion.abilities != null) {
				for (MinionCard.Ability ability : minion.abilities) {
					s += "\n|" + ability.name();
				}
			} else {
				s += "NONE";
			}
			
			s += "\n|\n|Creature Type: " + minion.creatureType.name() + "\n|\n|";
			
		} else if (this.type == Type.SPELL) {
			Spell spell = (Spell) this;
			s += "Spell Type: " + spell.spellType.name() + "\n|\n|";
		} else {
			Hero hero = (Hero) this;
			s += "\n|\n|Abilities:";
			
			if (hero.abilities != null) {
				for (HeroCard.Ability ability : hero.abilities) {
					s += "\n|" + ability.name();
				}
			} else {
				s += "NONE";
			}
			
			s += "\n|\n|";
		}
		
		s += "Type: " + type.name() + "\n|Rarity: " + rarity.name() + "\n|Class: " + gameClass.name() + "\n|Set: " + set.name();
		s += "\n_________________________";
		return s;
	}

}
