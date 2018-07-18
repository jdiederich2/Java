package challenge5.hearthstoneCardStyles;

public interface HeroCard extends Card {

	public enum Ability {
		BATTLECRY, ONGOING_EFFECT, TRIGGERED_EFFECT
	}
	
	public Ability[] getAbilities();
}
