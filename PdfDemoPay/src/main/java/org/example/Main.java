package org.example;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.*;
import static com.itextpdf.io.image.ImageDataFactory.create;


public class Main {
    public static void main(String[] args) {

        System.out.println("PDF GENERATION STARTED.........");

        String path = "D://pay1.pdf";
        try{

            //main
            PdfWriter pdfWriter = new PdfWriter(path);
            PdfDocument pdfDocument = new PdfDocument(pdfWriter);
            pdfDocument.addNewPage();
            Document document = new Document(pdfDocument);

            //Image
            String phonepe = "Images//phonepe.png";
            ImageData phonepeimg = create(phonepe);
            Image ppimg = new Image(phonepeimg).setHeight(40f).setWidth(150f).setFixedPosition(200,730);
            float cw1[] = {500f};
            Table t1 = new Table(cw1);
            t1.addCell(ppimg).setHeight(80f);

            //booking
            float cw2[]={500f};
            Table t2 = new Table(cw2);
           t2.addCell(new Cell().add("Booking Date : March 22 2023").setBold());

           //Qrcode
            String qrc = "Images//qrcode.png";
            ImageData qrimg = create(qrc);
            Image qrcode = new Image(qrimg).setHeight(100f).setWidth(100f).setFixedPosition(430,580);

            float cw3[] = {500f};
            Table t3 = new Table(cw3);
            t3.addCell(qrcode).setHeight(130f);

            //3table text
            //text 2table
            float cw4[] ={500f};
            Table t4 = new Table(cw4);
            t4.addCell(new Cell().add("OrderID").setBorder(Border.NO_BORDER).setFixedPosition(40,680,50).setBold());
            t4.addCell(new Cell().add("3051997").setBorder(Border.NO_BORDER).setFixedPosition(40,665,50).setItalic());

            t4.addCell(new Cell().add("TicketId").setBorder(Border.NO_BORDER).setFixedPosition(40,640,50).setBold());
            t4.addCell(new Cell().add("121966").setBorder(Border.NO_BORDER).setFixedPosition(40,625,50).setItalic());

            t4.addCell(new Cell().add("TicketStatus").setBorder(Border.NO_BORDER).setFixedPosition(40,600,50).setBold());
            t4.addCell(new Cell().add("Active").setBorder(Border.NO_BORDER).setFixedPosition(40,585,50).setItalic());

            //secimage
            String secimg = "Images//PM.png";
            ImageData modiji = create(secimg);
            Image secimgsrc = new Image(modiji).setHeight(100f).setWidth(120f).setFixedPosition(410,690);

            float cw5[] ={500f};
            Table t5 = new Table(cw5);
           // t5.addCell(new Cell().add("")).setHeight(100f)
            t5.addCell(secimgsrc).setHeight(130).setFixedPosition(36,443,500);

            //3rdtabletext
            float cw6[] ={500f};
            Table t6 = new Table(cw6);
            t6.addCell(new Cell().add("EventDetails").setBorder(Border.NO_BORDER).setFixedPosition(40,550,50).setFontColor(Color.RED).setBold());
            t6.addCell(new Cell().add("MODI JI ROAD SHOW LIVE").setBorder(Border.NO_BORDER).setFixedPosition(40,535,50).setFontColor(Color.ORANGE));

            t6.addCell(new Cell().add("March 22 2023").setBorder(Border.NO_BORDER).setFixedPosition(40,520,50).setItalic());

            t6.addCell(new Cell().add("5:00 PM").setBorder(Border.NO_BORDER).setFixedPosition(40,490,50).setItalic());
            t6.addCell(new Cell().add("GOVT OF INDIA").setBorder(Border.NO_BORDER).setFixedPosition(40,460,50).setItalic());




            //4thtable
            float cw7[] = {500f};
            Table t7 = new Table(cw7);
            t7.addCell(new Cell().add("").setFixedPosition(36,341,490).setHeight(100f));

            //onlytextbox
          float cw8[] = {500f};
          Table t8 = new Table(cw8);
            t8.addCell(new Cell().add("Payment Summary").setBorder(Border.NO_BORDER).setFixedPosition(40,420,50).setBold());
            t8.addCell(new Cell().add("Ticket Subtotal").setBorder(Border.NO_BORDER).setFixedPosition(40,395,50).setItalic());
            t8.addCell(new Cell().add("First-Class Ticket").setBorder(Border.NO_BORDER).setFixedPosition(40,365,50).setItalic());
            t8.addCell(new Cell().add("Second-Class Ticket").setBorder(Border.NO_BORDER).setFixedPosition(40,338,50).setItalic());

            t8.addCell(new Cell().add("RS.1000").setBorder(Border.NO_BORDER).setFixedPosition(480,362,50));
            t8.addCell(new Cell().add("RS.800").setBorder(Border.NO_BORDER).setFixedPosition(480,336,50));
            //t7.addCell(t8);

            //graybox
            float cw9[] = {500f};
            Table t9 = new Table(cw9);
            t9.addCell(new Cell().add("").setFixedPosition(36,176,490).setHeight(160f).setBackgroundColor(Color.LIGHT_GRAY));

            //socialimage

            String socialimg = "Images//social.png";
            ImageData socialimg1 = create(socialimg);
            Image socialimg11 = new Image(socialimg1).setHeight(100f).setWidth(120f).setFixedPosition(400,230).setHeight(40);

            float cw10[] ={500f};
            Table t10 = new Table(cw10);
            // t5.addCell(new Cell().add("")).setHeight(100f)
            t10.addCell(socialimg11);
            t10.addCell(new Cell().add("Information").setBorder(Border.NO_BORDER).setFixedPosition(40,310,50).setFontColor(Color.RED).setBold());

            //1
            String telimg = "Images//ph.png";
            ImageData telimg1 = create(telimg);
            Image telimg11 = new Image(telimg1).setHeight(100f).setWidth(120f).setFixedPosition(38,280).setHeight(20).setWidth(20);
            t10.addCell(new Cell().add("149").setBorder(Border.NO_BORDER).setFixedPosition(60,280,50));
            t10.addCell(telimg11);

            //2
            String phimg = "Images//wp.png";
            ImageData phimg1 = create(phimg);
            Image phimg11 = new Image(phimg1).setHeight(100f).setWidth(120f).setFixedPosition(38,250).setHeight(20).setWidth(20);
            t10.addCell(new Cell().add("999090909").setBorder(Border.NO_BORDER).setFixedPosition(60,255,50));
            t10.addCell(phimg11);

            //3
            String webimg = "Images//gmail.png";
            ImageData webimg1 = create(webimg);
            Image webimg11 = new Image(webimg1).setHeight(100f).setWidth(120f).setFixedPosition(38,220).setHeight(20).setWidth(20);
            t10.addCell(new Cell().add("human@badworld.com").setBorder(Border.NO_BORDER).setFixedPosition(60,230,50));
            t10.addCell(webimg11);

            //4
            String eimg = "Images//web.png";
            ImageData eimg1 = create(eimg);
            Image eimg11 = new Image(eimg1).setHeight(100f).setWidth(120f).setFixedPosition(38,190).setHeight(20).setWidth(20);
            t10.addCell(new Cell().add("paytm.com").setBorder(Border.NO_BORDER).setFixedPosition(60,205,50));
            t10.addCell(eimg11);

            float cw12 []={500f};
            Table t12 = new Table(cw12);
            //t12.addCell(new Cell().add(""));
            t12.addCell("").setHeight(80).setFixedPosition(36,93,500);

            Text to = new Text("FinalTotal");
            Text amt12 = new Text("RS .1800");
            Paragraph p12 = new Paragraph(to).setFixedPosition(40,125,500).setBold();
            Paragraph amt2=new Paragraph(amt12).setFixedPosition(480,125,500);

            //document.add(ppimg);
            document.add(t1);
            document.add(t2);
            document.add(t3);
            document.add(t4);
            document.add(t5);
            document.add(t6);
            document.add(t7);
            document.add(t8);
            document.add(t9);
            document.add(t10);
            document.add(t12);
            document.add(p12);
            document.add(amt2);
            //document.add(secimgsrc);
           // document.add(qrcode);
           // document.add(p1);
            document.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("PDF GENERATED SUCCESSFULLY.......");
    }
}