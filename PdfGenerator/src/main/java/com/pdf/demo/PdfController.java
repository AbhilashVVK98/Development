package com.pdf.demo;

import java.io.ByteArrayInputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/")
public class PdfController {

	@Autowired
	private PdfService pdfService;
	
	@PostMapping("createPdf")
	public ResponseEntity<InputStreamResource> createPdf() {
		
		ByteArrayInputStream createPdf = pdfService.createPdf();
		
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("Content-Disposition", "inline;filename=first.pdf");
		return ResponseEntity.ok().headers(httpHeaders).contentType(MediaType.APPLICATION_PDF).body(new InputStreamResource(createPdf));
		
	}
}
