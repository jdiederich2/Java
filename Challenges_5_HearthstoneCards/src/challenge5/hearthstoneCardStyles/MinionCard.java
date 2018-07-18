package challenge5.hearthstoneCardStyles;

public interface MinionCard extends Card {
	
	public enum CreatureType {
		GENERAL, BEAST, DEMON, DRAGON, ELEMENTAL, MECH, MURLOC, PIRATE, TOTEM
	}
	
	public enum Ability {
		CHARGE, TAUNT, TRIGGERED_EFFECT, DEATHRATTLE, INSPIRE, POISON, SPELL_DAMAGE, ONGOING_EFFECT,
		STEALTH, LIFESTEAL, WINDFURY, SILENCE, ENRAGE, FREEZE, DIVINE_SHIELD, IMMUNE
	}
	
	public int getAttack();
	public int getCurrentAttack();
	public int getHealth();
	public int getCurrentHealth();
	public Ability[] getAbilities();
	public CreatureType getCreatureType();

}
