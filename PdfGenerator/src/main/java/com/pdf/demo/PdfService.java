package com.pdf.demo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import javax.swing.GroupLayout.Alignment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

@Service
public class PdfService {

	private Logger logger = LoggerFactory.getLogger(PdfService.class);

	public ByteArrayInputStream createPdf() {

		logger.info("create pdf started");

		String title = "WELCOM TO MY WORLD";
		String content = "WE ARE HERE TO LOVE THE WORLD AND WIN THE WORLD ";

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

		Document document = new Document();

		PdfWriter instance = PdfWriter.getInstance(document, outputStream);

		document.open();

		Font titlefont = FontFactory.getFont(FontFactory.COURIER, 10);
		Paragraph titlepara = new Paragraph(title, titlefont);
		titlepara.setAlignment(Element.ALIGN_CENTER);
		document.add(titlepara);

		Font paraFont = FontFactory.getFont(FontFactory.COURIER_BOLD, 12);
		Paragraph paragraph = new Paragraph(content);
		document.add(paragraph);
		paragraph.add(new Chunk("WOW ADDED NICE"));

		document.close();

		return new ByteArrayInputStream(outputStream.toByteArray());

	}
}
