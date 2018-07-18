public class Responder<RESPONDER_TYPE> {

	private RESPONDER_TYPE value;
	
	public Responder(RESPONDER_TYPE value) {
		this.value = value;
	}

	public RESPONDER_TYPE getValue() {
		return this.value;
	}
}
