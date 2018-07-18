package router;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class RouteParserTest {

	private String filename;

	@Before
	public void setUp() throws Exception {
		this.filename = "config/routes.xml";
	}

	@Test
	public void testLoadReturnsANewRouteParser() throws ParserConfigurationException, SAXException, IOException {
		assertThat(RouteParser.load(this.filename).getClass().getName(), is("router.RouteParser"));
	}

	@Test(expected = IOException.class)
	public void testLoadThrowsIOExceptionOnBadFilePath() throws ParserConfigurationException, SAXException, IOException {
		RouteParser.load("broken/file/path.xml");
	}

	@Test
	public void testGetRouteReturnsNewRoute() throws Exception {
		Route r = RouteParser.load(this.filename).getRoute("/");
		assertThat(r.getClass().getName(), is("router.Route"));
		assertThat(r.getRouteNode().getNodeName(), is("route"));
	}

	@Test(expected = Exception.class)
	public void testGetRouteErrorsIfNoRouteFound() throws Exception {
		RouteParser.load(this.filename).getRoute("this-will-break");
	}
	
	@Test
	public void testGetRouteReturnsFirstMatchingNode() throws Exception {
		Route r = RouteParser.load(this.filename).getRoute("/");
		Element el = (Element) r.getRouteNode();
		assertThat(el.getAttribute("path"), is("/"));
	}
}
