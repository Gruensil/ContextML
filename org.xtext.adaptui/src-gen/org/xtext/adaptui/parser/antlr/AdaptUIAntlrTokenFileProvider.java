/*
 * generated by Xtext 2.12.0
 */
package org.xtext.adaptui.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class AdaptUIAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/adaptui/parser/antlr/internal/InternalAdaptUI.tokens");
	}
}