package com.bellman.bible.service.format.osistohtml.taghandler;

import com.bellman.bible.service.common.Logger;
import com.bellman.bible.service.format.osistohtml.HtmlTextWriter;
import com.bellman.bible.service.format.osistohtml.OsisToHtmlParameters;

import org.crosswire.jsword.book.OSISUtil;
import org.xml.sax.Attributes;

/** Paragraph <p>...</p>
 * 
 * @author Martin Denham [mjdenham at gmail dot com]
 * @see gnu.lgpl.License for license details.<br>
 *      The copyright to this program is held by it's author. 
 */
public class PHandler implements OsisTagHandler {

	@SuppressWarnings("unused")
	private static final Logger log = new Logger("LHandler");
	private HtmlTextWriter writer;
	@SuppressWarnings("unused")
	private OsisToHtmlParameters parameters;

	public PHandler(OsisToHtmlParameters parameters, HtmlTextWriter writer) {
		this.parameters = parameters;
		this.writer = writer;
	}
	
	@Override
	public String getTagName() {
        return OSISUtil.OSIS_ELEMENT_P;
    }

	@Override
	public void start(Attributes attrs) {
		writer.write("<p>");
	}

	@Override
	public void end() {
		writer.write("</p>");
	}
}
