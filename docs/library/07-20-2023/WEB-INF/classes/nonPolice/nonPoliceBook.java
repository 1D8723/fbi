package nonPolice;

import java.awt.Color;

import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import com.lowagie.text.Image;
import java.util.ArrayList;
import java.util.Random;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.lowagie.text.Anchor;
import java.io.*;
import java.io.File;

public class nonPoliceBook{

	public ArrayList<?> nonPoliceArray;
	public ArrayList<?> nonPoliceArraySubject;
	public ArrayList<?> nonPoliceArrayObject;
	public ArrayList<?> nonPoliceArrayNoun;
	public ArrayList<?> nonPoliceStart;
	public ArrayList<?> nonPoliceClose;
	//public HashMap<String, String> oid = new HashMap<String, String>();
	//oid.add("roth.ibm.daimler.employe.jason.meiers","Jason N. Meiers");
	
	public String nonPoliceParagraph(ArrayList<String> subject, ArrayList<String> noun, ArrayList<String> object, ArrayList<String> examples) {
		//TAE, TAB
		//https://lehrerfortbildung-bw.de/u_sprachlit/deutsch/bs/6bg/6bg1/4_argumentieren/2ueberzeugen/3_ab_argumentation/
		StringBuffer str = new StringBuffer();
			int min = 0;
			int max = 2;
		    String thesis ="";
			String thesis_subject = (String) subject.get(new Random().nextInt(max - min + 1) + min);
			String thesis_noun = (String) noun.get(new Random().nextInt(max - min + 1) + min);
			String thesis_object = (String) object.get(new Random().nextInt(max - min + 1) + min);
			String thesis_subordinate_clause = ",there are 32 inch "+thesis_object+"'s.";
			thesis = thesis_subject+" like to "+thesis_noun+" "+thesis_object+"," + thesis_subordinate_clause;
			
			String argument="";
			String argument_subject = (String) subject.get(new Random().nextInt(max - min + 1) + min);
			String argument_noun = (String) noun.get(new Random().nextInt(max - min + 1) + min);	
			String argument_object = (String) object.get(new Random().nextInt(max - min + 1) + min);
			String argument_subordinate_clause = ",there are 32 inch "+thesis_object+"'s.";
				   argument = ",there are 32 inch "+argument_object+"'s.";
				    argument = argument_subject+" like to "+argument_noun+" "+argument_object+"," + argument_subordinate_clause;
			
			String example="";
			String example_subject = (String) subject.get(new Random().nextInt(max - min + 1) + min);
			String example_noun = (String) noun.get(new Random().nextInt(max - min + 1) + min);	
			String example_object = (String) object.get(new Random().nextInt(max - min + 1) + min);
			String example_subordinate_clause = ",there are 32 inch "+example_object+"'s.";
			example = example_subject+" like to "+example_noun+" "+example_object+"," + example_subordinate_clause;
			
			str.append(thesis+argument+example);
			str.append("                                                                                                 ");
			str.append("                                                                                                 ");

		return str.toString();
	}

	

	
	public static void main(String[] args){
		new nonPolice().runTransaction();
	}
	public void runTransaction(){
		nonPolice book = new nonPolice();
		for ( int i=0;i<1;++i) {
		String dest = "C:/Users/User_Kiosk_LL_Public/Desktop/nonPoliceBook-"+i+".pdf";

  try {
   Document doc = new Document();
   PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream(dest));
   Font font = new Font(Font.HELVETICA, 16, Font.UNDEFINED, Color.BLACK);
   doc.open();
   Paragraph para = new Paragraph("nonPoliceBook: 		Medical Malpratice 07/14/2023", font);
   doc.add(para);
   
/*
   Image image01 = Image.getInstance("readme_1.jpg");
   doc.add(image01);
*/
   doc.newPage();
   para = new Paragraph("Table of Contents\n\n", font);
   doc.add(para);
   para = new Paragraph(" About the Author...............................Page 1");
   doc.add(para);
   para = new Paragraph("1. Executive Summary...............................Page 3");
   doc.add(para);
   para = new Paragraph("2. Operations......................................Page 4-5");
   doc.add(para);
   para = new Paragraph("  2.1   Operation 1................................Page 4");
   doc.add(para);
              para = new Paragraph("    2.1.1        Web Service?WSDL........................Page 4");
   Paragraph para2 = new Paragraph("    2.1.2        Application........................Page 4");
   doc.add(para);
   doc.add(para2);
   para = new Paragraph("  2.2 Operation 2................................Page 4");
   doc.add(para);
   doc.add(para);
   para = new Paragraph("    2.1.1        Web Service?WSDL........................Page 4");
para2 = new Paragraph("    2.1.2        Application........................Page 4");
doc.add(para);
doc.add(para2);
   para = new Paragraph("  2.3 Operation 3................................Page 4");
   doc.add(para);
   doc.add(para);
   para = new Paragraph("    2.1.1        Web Service?WSDL........................Page 4");
para2 = new Paragraph("    2.1.2        Application........................Page 4");
doc.add(para);
doc.add(para2);
   para = new Paragraph("  2.4 Operation 4................................Page 5");
   doc.add(para);
   doc.add(para);
   para = new Paragraph("    2.1.1        Web Service?WSDL........................Page 4");
para2 = new Paragraph("    2.1.2        Application........................Page 4");
doc.add(para);
doc.add(para2);
   para = new Paragraph("  2.5 Operation 5................................Page 6");
   doc.add(para);
   doc.add(para);
   para = new Paragraph("    2.1.1        Web Service?WSDL........................Page 4");
   para2 = new Paragraph("    2.1.2        Application........................Page 4");
doc.add(para);
doc.add(para2);
   para = new Paragraph("  2.6 Primative Text.............................Page 7");  
   doc.add(para);
   para = new Paragraph(" ");
   doc.add(para);
   para = new Paragraph("  3. Movie.............................Page 8");  
   doc.add(para);
   para = new Paragraph(" ");
   doc.add(para);
   para = new Paragraph("    Appendix............................Page 9");
   doc.add(para);
   doc.newPage();

/*
      image01 = Image.getInstance("1.png");
   doc.add(image01);

      image01 = Image.getInstance("2.png");
   doc.add(image01);
   */

   doc.newPage();
   /*
	
		//subject[2] = oid["roth.ibm.damiler.employe.jason.meiers"];

   Font font3 = new Font(Font.HELVETICA, 13, Font.UNDEFINED, Color.BLACK);
   ArrayList<String> subject = new ArrayList<String>();
   ArrayList<String> noun = new ArrayList<String>();
   ArrayList<String> object = new ArrayList<String>();
   ArrayList<String> example = new ArrayList<String>();
   
   
   for(int j=0;j<1; ++j){
    
   			subject.add(0,"I");
   			subject.add(1,"Employee Mr. Meiers");
   			subject.add(2,"Jason N. Meiers");
   			noun.add(0,"spaghetti");
   			noun.add(1,"noodles");
   			noun.add(2,"italien anti-pasta");
   			object.add(0,"spaghetti");
   			object.add(1,"noodles");
   			object.add(2,"italien pasta and anti-pasta");
   			example.add(0,"There are 32 inch pizza.");
   			example.add(1,"Many restaurnets in Europe have Italien cusian that is simple to get accusomted t.o");
   			example.add(2,"italien retautants that serve  pasta and anti-pasta are on average taste very good.");
	
   para = new Paragraph(book.nonPoliceParagraph(subject, noun, object, example),font);
   doc.add(para);
   
   
   }
   */
   
   doc.newPage();
   
   para = new Paragraph(book.nonPoliceParagraph(),font);
   doc.add(para);
   doc.newPage();


   para = new Paragraph("Operation 1:",font);
   doc.add(para);
   para = new Paragraph("Ammendment 1 US Constitution cosiderations for; This book describes Dr. Dr. Prof. Joachim Fishan who is refred to as 'Joe' the father of Jesus ( One of five or six Joe's of Jesus Petersson) during an engineering occupation of 32 jobs. The proffessor from Federal German Goverment Research Instutute Max-Plank for Quatum Physics, Newton (known formula F=ma), Albert Einstein K E=mc2, for atomic phyics and other mathematics (i.e. High School or Univerity f(x)=x2+2)");
   doc.add(para);
   para = new Paragraph(" ");
   doc.add(para);

   para = new Paragraph("The marketing identification Steve Jobs at a fine levle of 0.0001 and Markteting Identification of Tim Cook including during the iWatch launch Dr. Dre as aside 0.0001, violations in Labor Code, US.  The redcution fo business process management durin ~int32. The Facebook content items collection from ibm.dailer.apple.nonPoliceGarbage; in addtion using the Marketing Identificaton from Mark Zuckerberg.");
   doc.add(para);
   para = new Paragraph(" ");
   doc.add(para);
   para = new Paragraph("DEA violations include (Logical) crack and cocain; The algorithm for steve and tim including in specific remote phycological tests using identification of Tim (lastname) uknown and Steve Meiers. ");
   doc.add(para);
   para = new Paragraph("§Stalking");
   doc.add(para);
   para = new Paragraph("- gay book red, left look; right homless white walker- another black, stinking), <s>significant credit");
   doc.add(para);
   para = new Paragraph(" ");
   doc.add(para);
   Anchor anchor = new Anchor("Web Service.wsdl");
   anchor.setName("Web Service");
   anchor.setReference("https://ics2wsa.ic3.com/commerce/1.x/transactionProcessor/CyberSourceTransaction_1.207.wsdl");
   doc.add(anchor);
/*
   image01 = Image.getInstance("fbi-internet-payments.png");
   doc.add(image01);
*/
   doc.add(para);
   para = new Paragraph(" ");
   doc.add(para);
   para = new Paragraph(" ");
   doc.add(para);
   para = new Paragraph("Operation 2:",font);
   doc.add(para);
   para = new Paragraph("The Military birds-eve view of in 1994 Carl-Benz-Strasse, short:CAR, with American Military Residents for US President George W. Bush Jr Adminstration included Bill Sr and Jr with driving routes to Military Bases K-TOWN for buiness violations of WWI(World War I) and World War II, Price Sr and Jr.");
   doc.add(para);
   anchor.setName("Web Service");
   anchor.setReference("https://ics2wsa.ic3.com/commerce/1.x/transactionProcessor/CyberSourceTransaction_1.207.wsdl");
   doc.add(anchor);
/*
   image01 = Image.getInstance("fbi-internet-payments.png");
   doc.add(image01);
*/   
doc.add(para);
   doc.newPage();

   para = new Paragraph("Operation 3:",font);
   doc.add(para);
   para = new Paragraph("Stakling <s>Black Homeless</s>\nother:\ninterest town sinsheim\nOther:\ngorbacheve(seitz).swazenegger(rolad)\nother:\nrip\nother:\nst frances fracesco close\nbaptist names thomas francsco\nst frances hotel\n other:\nGravi");
   doc.add(para);
   anchor = new Anchor("Web Service.wsdl");
   anchor.setName("Web Service");
   anchor.setReference("https://ics2wsa.ic3.com/commerce/1.x/transactionProcessor/CyberSourceTransaction_1.207.wsdl");
   doc.add(anchor);
/*
   image01 = Image.getInstance("fbi-internet-payments.png");
   doc.add(image01);
*/   
para = new Paragraph(" ");
   doc.add(para);
   para = new Paragraph("Operation 4:",font);
   doc.add(para);
   anchor = new Anchor("Web Service.wsdl");
   anchor.setName("Web Service");
   anchor.setReference("https://ics2wsa.ic3.com/commerce/1.x/transactionProcessor/CyberSourceTransaction_1.207.wsdl");
   doc.add(anchor);
/*
   image01 = Image.getInstance("fbi-internet-payments.png");
   doc.add(image01);
*/  
 StringBuffer str = new StringBuffer();
                str.append("D	4.0 Operations Systems (Dr. Decan Werner) Einstien/Werder/ WWI.MAINSTEREET(hauptstrasse,HOMICIDE:MERKEL(<s>werner</s>,IPX.JFK.(<s>mother</s>))");
                str.append("D	4.0 Newton Physics");
                str.append("          Ingo 1.0 (manuel)");
                str.append("D	4.0 Law  (in advance Pentaogn.Kalrsureh.PensylvaniaAve)");
                str.append("             Ingo 1.0 (manuel)");
                str.append("D 	4.0 Mathethatics (Dr. Roos) WWI Roosevelt");
                str.append("D/F	5.0 History King");
                str.append("D/F	5.0 Deutsch King");
                str.append("A	1.0 <s>Java Al-Kaida Dr Zimmermann Architect Hamburg</s>");
   para = new Paragraph(" ");
                str.append("George Bush: No child left behind");
                str.append("other: Ingo FBI:KIDDNAPPIGN <s>old dire baster wu tang clan</s>     CAR(Carl-Benz)");
                str.append("other: Ingo FBI:0.1investion.Gorbachev((woodstock,nonPolieDEA.lsint(<s>mdma</s>)");
                str.append("FBI:HOMCIDE:7 or8 Driver Licese Calfornia");
                str.append("Operation 5:");   
        para =  new Paragraph(str.toString());
   doc.add(para);
   doc.add(para);
   para = new Paragraph(" ");
   doc.add(para);

   para = new Paragraph("Operation 5:",font);
   doc.add(para);
                str = new StringBuffer();
                str.append(" ibm.damiler.hoover");
                str.append("GREEN vw toruge  (vggg.lisnt( <s>vw Volk German Volk</s>  WWI,WW2)");
                str.append(" roth.ibm.dmielr	RED cherrytree(urban6000,cannodale)");
                str.append("nonPolcieChurc.IPX(<s> golf hoover bag carrier</s>)");
                str.append(" GREEN(hoover)");
                str.append(" <s>audi(grey)	RED(ubrano,tim.kutscher)  ");
                str.append(" <s>bmw (grey)	light blue(bmw,joe)</s>	");
                str.append("  audi(grey)");
                str.append("</nonPoliceOperation>");
                str.append("<nonPoliceOperation>");
                str.append("1984 nonPolcieDEALogical('cocain','tim.cook;steve.job')");
                str.append("2015 nonPolcieDEALogical('cocain','tim.cook;steve.job')");
                str.append("nonPoliceChartLogical");
                str.append("[	str.append(']	-");
                str.append("[x] no");
                para =  new Paragraph(str.toString());
                anchor = new Anchor("Web Service.wsdl");
                anchor.setName("Web Service");
                anchor.setReference("https://ics2wsa.ic3.com/commerce/1.x/transactionProcessor/CyberSourceTransaction_1.207.wsdl");
                doc.add(anchor);
                doc.newPage();
                   anchor = new Anchor("Web Service.wsdl");
   anchor.setName("Web Service");
   anchor.setReference("https://ics2wsa.ic3.com/commerce/1.x/transactionProcessor/CyberSourceTransaction_1.207.wsdl");
   doc.add(anchor);
/*
   image01 = Image.getInstance("fbi-internet-payments.png");
   doc.add(image01);
*/  
 para = new Paragraph("Operation 6:",font);
   doc.add(para);
   str = new StringBuffer();
   str.append(" ibm.damiler.hoover");
   str.append("ibm.daimler.pope.mary");
   str.append("!oli				nikloai		<s>I will steal again</s>");
   str.append("       marco					you can sit here while i evault with pizza what daneil and oli find so interesing");
   str.append("       daniel					you can sleep here while i ejaculate");
   str.append("      thomas					this is physics");
   str.append("?kadett(<s>google</s>)");
   str.append(" ibm.dmiler.*tophat.<s>maxplank.marx</s>");
   str.append("hamiltion PHYSICS(ott-hahn)");
   str.append("   nonPoliceTVLogical");
   str.append(" roth.(<s>harlod wathcing</s>)  MAINSTRERTE (haustrasse)	");
   str.append("            ATOMICEFACTORY(damileralle)");
   str.append("       <s>door right harry pottter (arton/lebene Systeter Stallon I will fuck you wife, fucked harld wofe)</s>");  
   para =  new Paragraph(str.toString());
   doc.add(para);
   anchor = new Anchor("Web Service.wsdl");
   anchor.setName("Web Service");
   anchor.setReference("https://ics2wsa.ic3.com/commerce/1.x/transactionProcessor/CyberSourceTransaction_1.207.wsdl");
   doc.add(anchor);
/*
   image01 = Image.getInstance("fbi-internet-payments.png");
   doc.add(image01);
*/

   doc.newPage();
   para = new Paragraph("4. Movie ",font);
   doc.add(para);
   
   para = new Paragraph("");

/*
   image01 = Image.getInstance("fbi.1d8723.png");
   doc.add(image01);
*/
   anchor = new Anchor("mp4");
   anchor.setName("mp4");
   anchor.setReference("1.mp4");
   doc.add(anchor);
   doc.add(para);

    doc.newPage();
   para = new Paragraph("Appendix ",font);
   doc.add(para);
   para = new Paragraph("");
   doc.add(para);
   para = new Paragraph("");
   doc.add(para);
   str = new StringBuffer();
   str.append("~int32                       32 Job Interviews and Consultantcies\n"); 
   str.append("roth.ibm.daimler.        Short code for business identication and responsiblity\n");   
   para =  new Paragraph(str.toString());
   doc.add(para);
   doc.newPage();
/*
   image01 = Image.getInstance("Slide1.PNG");
   doc.add(image01);
   */
   doc.newPage();

   para = new Paragraph("11:30 AM/ 07/14/2023 Police Sirens",font);
   doc.add(para);
   para = new Paragraph("03:46 AM/ 07/14/2023 Police Sirens",font);
   doc.add(para);
   doc.close();
   writer.close();
  } catch ( Exception e) {

   e.printStackTrace();
  }
 }
	}

	public String nonPoliceParagraph() {
		StringBuffer str = new StringBuffer();
	{  
		File folder = new File("files");
		File[] listOfFiles = folder.listFiles();

		for (File file : listOfFiles) {
			System.out.println(file.getName());
		    if (file.isFile()) {
		    	try {
		    		file=new File("files/tmp.wsdl");//+file.getName());  
		    		File file2 = new File("files/tmp.wsdl");  //+file.getName());  
		    		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();   
		    		DocumentBuilder db = dbf.newDocumentBuilder();  
		    		org.w3c.dom.Document doc = db.parse(file2);  
		    		doc.getDocumentElement().normalize();  
		    		System.out.println("Root element: " + doc.getDocumentElement().getNodeName());  
		    		NodeList nodeList = doc.getElementsByTagName("nonPoliceOperation");  
		    		System.out.println(nodeList.getLength());
		    		for (int itr = 0; itr < nodeList.getLength(); itr++)   
		    		{  
		    			Node node = nodeList.item(itr);  
		    			System.out.println("\n Node Name :" + node.getNodeName());  
		    			if (node.getNodeType() == Node.ELEMENT_NODE)   
		    			{  
		    				   ArrayList<String> subject = new ArrayList<String>();
		    				   ArrayList<String> noun = new ArrayList<String>();
		    				   ArrayList<String> object = new ArrayList<String>();
		    				   ArrayList<String> examples = new ArrayList<String>();	
		    				try {
				   				subject.add(0,node.getChildNodes().item(5).getChildNodes().item(1).getChildNodes().item(5).getTextContent());
				   				subject.add(1,node.getChildNodes().item(5).getChildNodes().item(1).getChildNodes().item(3).getTextContent());
				   				subject.add(2,node.getChildNodes().item(5).getChildNodes().item(1).getChildNodes().item(1).getTextContent());
				   				
				   				noun.add(0,node.getChildNodes().item(5).getChildNodes().item(3).getChildNodes().item(1).getTextContent());
				   				noun.add(1,node.getChildNodes().item(5).getChildNodes().item(3).getChildNodes().item(3).getTextContent());
				   				noun.add(2,node.getChildNodes().item(5).getChildNodes().item(3).getChildNodes().item(3).getTextContent());
				   				
				   				object.add(0,node.getChildNodes().item(5).getChildNodes().item(5).getChildNodes().item(3).getTextContent());
				   				object.add(1,node.getChildNodes().item(5).getChildNodes().item(5).getChildNodes().item(3).getTextContent());
				   				object.add(2,node.getChildNodes().item(5).getChildNodes().item(5).getChildNodes().item(3).getTextContent());
				   				
				   				examples.add(0,node.getChildNodes().item(5).getChildNodes().item(7).getChildNodes().item(3).getTextContent());
				   				examples.add(1,node.getChildNodes().item(5).getChildNodes().item(7).getChildNodes().item(3).getTextContent());
				   				examples.add(2,node.getChildNodes().item(5).getChildNodes().item(7).getChildNodes().item(3).getTextContent());
				   				
				   				str.append(new StringBuffer(new nonPoliceBook().nonPoliceParagraph(subject, noun, object, examples)));
				   				str.append("                                                                                        ");
				   				str.append("                                                                                        ");	    					
		    					
		    										//paragraph[3,5]			//subjects				//subject

		    					
		    					
		    					System.out.println("nonPoliceOperation: "+ node.getChildNodes().item(5).getChildNodes().item(1).getChildNodes().item(5).getTextContent());
		    				
				   				subject.add(0,node.getChildNodes().item(3).getChildNodes().item(1).getChildNodes().item(5).getTextContent());
				   				subject.add(1,node.getChildNodes().item(3).getChildNodes().item(1).getChildNodes().item(3).getTextContent());
				   				subject.add(2,node.getChildNodes().item(3).getChildNodes().item(1).getChildNodes().item(1).getTextContent());
				   				
				   				noun.add(0,node.getChildNodes().item(3).getChildNodes().item(3).getChildNodes().item(1).getTextContent());
				   				noun.add(1,node.getChildNodes().item(3).getChildNodes().item(3).getChildNodes().item(3).getTextContent());
				   				noun.add(2,node.getChildNodes().item(3).getChildNodes().item(3).getChildNodes().item(3).getTextContent());
				   				
				   				object.add(0,node.getChildNodes().item(3).getChildNodes().item(5).getChildNodes().item(3).getTextContent());
				   				object.add(1,node.getChildNodes().item(3).getChildNodes().item(5).getChildNodes().item(3).getTextContent());
				   				object.add(2,node.getChildNodes().item(3).getChildNodes().item(5).getChildNodes().item(3).getTextContent());
				   				
				   				examples.add(0,node.getChildNodes().item(3).getChildNodes().item(7).getChildNodes().item(3).getTextContent());
				   				examples.add(1,node.getChildNodes().item(3).getChildNodes().item(7).getChildNodes().item(3).getTextContent());
				   				examples.add(2,node.getChildNodes().item(3).getChildNodes().item(7).getChildNodes().item(3).getTextContent());
				   			
				   				str.append(new StringBuffer(new nonPoliceBook().nonPoliceParagraph(subject, noun, object, examples)));
				   				str.append("                                                                                        ");
				   				str.append("                                                                                        ");
				   				
		    				}catch(Exception e) {
		    					System.out.println("ERROR: "+e.getMessage());
		    				}
		    			}  
		    		}
		    	}catch (Exception e)  {  
		    		e.printStackTrace();  
		    	}  
		    }
		}
	}  
	return str.toString();
	}
	
}