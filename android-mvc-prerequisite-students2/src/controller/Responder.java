package controller;

public class Responder<T> {

	private T response;

	public Responder(T responseValue) {
		this.response = responseValue;
	}

	public T getResponse() {
		return this.response;
	}
}
