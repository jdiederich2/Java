package router;

import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class Route {

	public static final String CONTROLLER_TAG = "controller";
	public static final String ACTION_TAG = "action";

	private Node route;
	private Element el;
	
	public Route(Node route) {
		this.route = route;
		this.el = (Element) route;
	}

	public String getController() {
		return this.el.getElementsByTagName(CONTROLLER_TAG).item(0).getTextContent();
	}

	public String getAction() {
		return this.el.getElementsByTagName(ACTION_TAG).item(0).getTextContent();
	}

	public Element getRouteNode() {
		return null;
	}
}
