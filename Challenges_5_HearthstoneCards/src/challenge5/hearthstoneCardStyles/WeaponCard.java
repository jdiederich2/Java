package challenge5.hearthstoneCardStyles;

public interface WeaponCard extends Card {

	public enum Ability {
		TRIGGERED_EFFECT, DEATHRATTLE, POISON, SPELL_DAMAGE, ONGOING_EFFECT,
		LIFESTEAL, WINDFURY, FREEZE, IMMUNE
	}
	
	public int getAttack();
	public int getCurrentAttack();
	public int getDurrability();
	public int getCurrentDurability();
	public Ability[] getAbilities();
}
