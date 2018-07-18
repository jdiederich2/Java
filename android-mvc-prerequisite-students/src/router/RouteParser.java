package router;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import java.io.File;
import java.io.IOException;

//
// This file is complete and does not need any additional changes
//
public class RouteParser {

	private Document routes;
	private XPathFactory pathFactory;
	
	// CONSTRUCTORS
	
	public RouteParser(Document routes) {
		this.routes = routes;
		this.pathFactory = XPathFactory.newInstance();
	}

	// PUBLIC

	public Route getRoute(String path) throws Exception {
		XPath xpath = this.pathFactory.newXPath();
		XPathExpression expr = xpath.compile("//route[@path=\"" + path + "\"]");
		NodeList nl = (NodeList) expr.evaluate(this.routes, XPathConstants.NODESET);

		if (nl.getLength() == 0) {
			throw new Exception("No route " + path + " found.");
		}

		return new Route(nl.item(0));
	}

	// STATIC

	public static RouteParser load(String filename) throws ParserConfigurationException, SAXException, IOException {
		File routesXML = new File(filename);
		DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document routes = dBuilder.parse(routesXML);

		return new RouteParser(routes);
	}
}
