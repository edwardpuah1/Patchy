import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class mainFile {
	
	public static void main (String[] args) throws IOException
	{
		
		/*---------------------*/
		/*Change File Name Here*/
		/*---------------------*/
		
		String pathName1 = "DT_SCRIPTS_", pathName2 = ".sql", strStore1;
		char[] strStore2 = new char[9999];
		
		/*---------------------------*/
		/*Change Number of Files Here*/
		/*---------------------------*/
		
	    int fileNum = 20, 
	    		
	    fileCount = 1, n = 0, sec1 = 0, sec2 = 0, lineCount = 2;
	    
	    String pathName3 = pathName1.concat(Integer.toString(fileCount)).concat(pathName2);
	    
	    /*-----------------------*/
	    /*Change Folder Path Here*/
	    /*-----------------------*/
	    
		final Path path = Paths.get("C:\\Users\\mysepu\\Desktop\\3.97-DB\\Release_3.97_Scripts");
		
	    Path sql = path.resolve(pathName3);
	    final Path csv = path.resolve("Test.csv");
	    final Charset utf8 = Charset.forName("UTF-8");
	    
	    try (
	            final Scanner scanner = new Scanner(Files.newBufferedReader(sql, utf8));
	            final PrintWriter pw = new PrintWriter(Files.newBufferedWriter(csv, utf8, StandardOpenOption.CREATE_NEW))) {
	    	while (scanner.hasNextLine()) {
	    		if(n == 0)
	        	{
	        		scanner.nextLine();
	        		scanner.next();
	        		n++;
	        	}
	    		strStore1 = scanner.nextLine().replaceAll("NULL", ",").replaceAll("INSERT", "").replaceAll(" INTO \"definitiontable\"","").replaceAll("\"DEFINITIONTABLESEQ\", \"TABLETYPEMAPPINGSEQ\", \"ENTRYAGEFROM\", \"ENTRYAGETO\", \"ENTRYAGE\", \"TERMFROM\", \"TERMTO\", \"TERM\", \"PREMIUMFROM\", \"PREMIUMTO\", \"PREMIUM\", \"SAFROM\", \"SATO\", \"SA\", \"GENDERCD\", \"PAYMENTFREQUENCYCD\", \"PAYMENTMETHODCD\", \"PAYMENTINSTRUCTIONTYPECD\", \"PAYMENTTYPECD\", \"VERSIONID\", \"GUID\", \"PLANOPTIONCD\", \"ISSUBSTANDARDFL\", \"PPTERMFROM\", \"PPTERMTO\", \"PPTERM\", \"VESTINGAGEFROM\", \"VESTINGAGETO\", \"VESTINGAGE\", \"DOCUMENTCATEGORYCD\", \"SARFROM\", \"SARTO\", \"PREMIUMINDEXATIONCD\", \"PLANPRODUCTCD\", \"RULENAME\", \"PLANCD\", \"ANNUALPREMIUMFROM\", \"ANNUALPREMIUMTO\", \"ANNUALPREMIUM\", \"BASEPRODUCTFAMILYCD\", \"POLICYYEARFROM\", \"POLICYYEARTO\", \"POLICYYEAR\", \"ATTAINEDAGE\", \"ATTAINEDAGEFROM\", \"ATTAINEDAGETO\", \"ILLUSTRATIONRATE\", \"ILLUSTRATIONRATEFROM\", \"ILLUSTRATIONRATETO\", \"OCCUPATIONCLASS\", \"ROOMTYPE\", \"SMOKER\", \"TERMSCONDITIONS\", \"SORTORDER\", \"ALLOWEDOCCUPATIONS\", \"BASISCD\", \"BENEFITAMOUNT\", \"BENEFITTYPECD\", \"BENEFITLABELCD\", \"MESSAGECD\", \"FIELDCD\", \"PARTYROLECD\", \"COLLATERALCD\", \"DATASTYLE\", \"DATAVARIABLE\", \"SYSTEMCREATEDDT\", \"SYSTEMUPDATEDDT\", \"ASSOCIATIONRELATIONCD\", \"COVERTYPECD\", \"ALLOWEDRELATIONS\", \"FIXEDTERMVALUES\", \"FIXEDPPTERMVALUES\", \"CURRENCYCD\", \"FUNDCD\", \"FIXEDMULTIPLIER\", \"LIMITEDPPTFL\", \"JOINTLIFEAGE\", \"JOINTLIFEAGEFROM\", \"JOINTLIFEAGETO\", \"LOADINGTYPECD\", \"MINVALUE\", \"MAXVALUE\", \"COMPUTEDFIELD\", \"COMPUTEDFIELDFROM\", \"COMPUTEDFIELDTO\", \"OUTPUTACTION\", \"RATE\", \"ROLECD\", \"RELATIONCD\", \"CHANNELID\", \"SUBCHANNELID\", \"INTIMATIONSOURCECD\", \"QUESTIONSETCD\", \"RIDERPRODUCTID\", \"PARENTAGENCYID\", \"INDUSTRYCD\", \"NATUREOFDUTYID\", \"FINANCIALSAR\", \"FINANCIALSARFROM\", \"FINANCIALSARTO\", \"TOTMODALEXTRAPREMIUM\", \"TOTMODALEXTRAPREMIUMFROM\", \"TOTMODALEXTRAPREMIUMTO\", \"TOPUPTYPECD\", \"CITIZENSHIPCD\", \"MINVALUEUNITS\", \"MAXVALUEUNITS\", \"PARTYTYPECD\", \"COUNTRYCD\", \"CITYCD\", \"LOADINGDECISIONCD\", \"FLATLOADINGAMT\", \"LOADINGPERCENT\", \"MULTIPLEFACTOR\", \"FIXEDVALUE\", \"COMPANYCD\", \"ADDTNFIELD1\", \"ADDTNFIELD2\", \"ADDTNFIELD3\", \"PROCESSINGTYPECD\", \"EXTRATYPECD\", \"PORTFOLIOMODELCD\", \"MINVALUEEXPRESSION\", \"MAXVALUEEXPRESSION\", \"MINVALUEEXPRESDISPLAY\", \"MAXVALUEEXPRESDISPLAY\", \"PROPOSERAGEFROM\", \"PROPOSERAGETO\", \"PROPOSERAGE\", \"QUOTADDTNLFIELD1\", \"QUOTADDTNLFIELD2\", \"QUOTADDTNLFIELD3\", \"QUOTADDTNLFIELD4\", \"INDEXKEY\", \"MONTHLYINCOME\", \"MONTHLYINCOMEFROM\", \"MONTHLYINCOMETO\", \"ANNUALINCOME\", \"ANNUALINCOMEFROM\", \"ANNUALINCOMETO\", \"QUOTATIONPARTYADDTNFIELD1\", \"QUOTATIONPARTYADDTNFIELD2\", \"QUOTATIONPARTYADDTNFIELD3\", \"QUOTATIONPARTYADDTNFIELD4\", \"PRIMARYAGEFROM\", \"PRIMARYAGETO\", \"PRIMARYAGE\", \"MARITALSTATUSCD\", \"RIDERPLANOPTIONS\", \"RIDERPRODUCTIDNOTIN\", \"DEPENDENTRIDERROLECD\", \"INSURANCETYPECD\", \"DTCONDITION1D\", \"DTCONDITION11D\", \"DTCONDITION2D\", \"DTCONDITION22D\", \"DTCONDITION3D\", \"DTCONDITION33D\", \"DTCONDITION4STR\", \"DTCONDITION5STR\", \"DTCONDITION6STR\", \"DTCONDITION7STR\", \"DTCONDITION8D\", \"DTCONDITION9D\", \"DTCONDITION13DT\", \"DTCONDITION14DT\"", "").replaceAll("VALUES", "").replaceAll(",,",",").replaceAll("[\\[\\](){}]","").replaceAll(";","").replaceAll("'","").replaceAll("IDENTITY_ definitiontable OFF","").replaceAll("SET", "").replaceAll(", ", ",");
	            for(int i = 0; i < strStore1.length(); i++) { 
	            	strStore2[i] = strStore1.charAt(i);
	            	if(strStore2[i] == ',')
	            	{
	            		sec1++;
	            	}
	            	}
	            lineCount++;

	            if(sec1 != sec2 && sec2 != 0 && sec1 > 0)
		           {
		           	System.out.println("Columns doesn't match up in file " + fileCount + " line " + lineCount);
		           }
	            
	            sec2 = sec1;
	         
	            sec1 = 0;
	            
	            if(strStore1.length() > 1)
	            {
	            	pw.println(strStore1.trim());
	            }
	            
	    	}
	    }
	    
	    while (fileCount < fileNum)
	    {
	    	n = 0;
	    	pathName3 = pathName1.concat(Integer.toString(++fileCount)).concat(pathName2);
	    	sql = path.resolve(pathName3);
	    	try (
		            final Scanner scanner = new Scanner(Files.newBufferedReader(sql, utf8));
		            final PrintWriter pw = new PrintWriter(Files.newBufferedWriter(csv, utf8, StandardOpenOption.APPEND))) {
		    	while (scanner.hasNextLine()) {
		    		if(n == 0)
		        	{
		        		scanner.nextLine();
		        		scanner.next();
		        		n++; 
		        	}
		    		strStore1 = scanner.nextLine().replaceAll("NULL", ",").replaceAll("INSERT", "").replaceAll(" INTO \"definitiontable\"","").replaceAll("\"DEFINITIONTABLESEQ\", \"TABLETYPEMAPPINGSEQ\", \"ENTRYAGEFROM\", \"ENTRYAGETO\", \"ENTRYAGE\", \"TERMFROM\", \"TERMTO\", \"TERM\", \"PREMIUMFROM\", \"PREMIUMTO\", \"PREMIUM\", \"SAFROM\", \"SATO\", \"SA\", \"GENDERCD\", \"PAYMENTFREQUENCYCD\", \"PAYMENTMETHODCD\", \"PAYMENTINSTRUCTIONTYPECD\", \"PAYMENTTYPECD\", \"VERSIONID\", \"GUID\", \"PLANOPTIONCD\", \"ISSUBSTANDARDFL\", \"PPTERMFROM\", \"PPTERMTO\", \"PPTERM\", \"VESTINGAGEFROM\", \"VESTINGAGETO\", \"VESTINGAGE\", \"DOCUMENTCATEGORYCD\", \"SARFROM\", \"SARTO\", \"PREMIUMINDEXATIONCD\", \"PLANPRODUCTCD\", \"RULENAME\", \"PLANCD\", \"ANNUALPREMIUMFROM\", \"ANNUALPREMIUMTO\", \"ANNUALPREMIUM\", \"BASEPRODUCTFAMILYCD\", \"POLICYYEARFROM\", \"POLICYYEARTO\", \"POLICYYEAR\", \"ATTAINEDAGE\", \"ATTAINEDAGEFROM\", \"ATTAINEDAGETO\", \"ILLUSTRATIONRATE\", \"ILLUSTRATIONRATEFROM\", \"ILLUSTRATIONRATETO\", \"OCCUPATIONCLASS\", \"ROOMTYPE\", \"SMOKER\", \"TERMSCONDITIONS\", \"SORTORDER\", \"ALLOWEDOCCUPATIONS\", \"BASISCD\", \"BENEFITAMOUNT\", \"BENEFITTYPECD\", \"BENEFITLABELCD\", \"MESSAGECD\", \"FIELDCD\", \"PARTYROLECD\", \"COLLATERALCD\", \"DATASTYLE\", \"DATAVARIABLE\", \"SYSTEMCREATEDDT\", \"SYSTEMUPDATEDDT\", \"ASSOCIATIONRELATIONCD\", \"COVERTYPECD\", \"ALLOWEDRELATIONS\", \"FIXEDTERMVALUES\", \"FIXEDPPTERMVALUES\", \"CURRENCYCD\", \"FUNDCD\", \"FIXEDMULTIPLIER\", \"LIMITEDPPTFL\", \"JOINTLIFEAGE\", \"JOINTLIFEAGEFROM\", \"JOINTLIFEAGETO\", \"LOADINGTYPECD\", \"MINVALUE\", \"MAXVALUE\", \"COMPUTEDFIELD\", \"COMPUTEDFIELDFROM\", \"COMPUTEDFIELDTO\", \"OUTPUTACTION\", \"RATE\", \"ROLECD\", \"RELATIONCD\", \"CHANNELID\", \"SUBCHANNELID\", \"INTIMATIONSOURCECD\", \"QUESTIONSETCD\", \"RIDERPRODUCTID\", \"PARENTAGENCYID\", \"INDUSTRYCD\", \"NATUREOFDUTYID\", \"FINANCIALSAR\", \"FINANCIALSARFROM\", \"FINANCIALSARTO\", \"TOTMODALEXTRAPREMIUM\", \"TOTMODALEXTRAPREMIUMFROM\", \"TOTMODALEXTRAPREMIUMTO\", \"TOPUPTYPECD\", \"CITIZENSHIPCD\", \"MINVALUEUNITS\", \"MAXVALUEUNITS\", \"PARTYTYPECD\", \"COUNTRYCD\", \"CITYCD\", \"LOADINGDECISIONCD\", \"FLATLOADINGAMT\", \"LOADINGPERCENT\", \"MULTIPLEFACTOR\", \"FIXEDVALUE\", \"COMPANYCD\", \"ADDTNFIELD1\", \"ADDTNFIELD2\", \"ADDTNFIELD3\", \"PROCESSINGTYPECD\", \"EXTRATYPECD\", \"PORTFOLIOMODELCD\", \"MINVALUEEXPRESSION\", \"MAXVALUEEXPRESSION\", \"MINVALUEEXPRESDISPLAY\", \"MAXVALUEEXPRESDISPLAY\", \"PROPOSERAGEFROM\", \"PROPOSERAGETO\", \"PROPOSERAGE\", \"QUOTADDTNLFIELD1\", \"QUOTADDTNLFIELD2\", \"QUOTADDTNLFIELD3\", \"QUOTADDTNLFIELD4\", \"INDEXKEY\", \"MONTHLYINCOME\", \"MONTHLYINCOMEFROM\", \"MONTHLYINCOMETO\", \"ANNUALINCOME\", \"ANNUALINCOMEFROM\", \"ANNUALINCOMETO\", \"QUOTATIONPARTYADDTNFIELD1\", \"QUOTATIONPARTYADDTNFIELD2\", \"QUOTATIONPARTYADDTNFIELD3\", \"QUOTATIONPARTYADDTNFIELD4\", \"PRIMARYAGEFROM\", \"PRIMARYAGETO\", \"PRIMARYAGE\", \"MARITALSTATUSCD\", \"RIDERPLANOPTIONS\", \"RIDERPRODUCTIDNOTIN\", \"DEPENDENTRIDERROLECD\", \"INSURANCETYPECD\", \"DTCONDITION1D\", \"DTCONDITION11D\", \"DTCONDITION2D\", \"DTCONDITION22D\", \"DTCONDITION3D\", \"DTCONDITION33D\", \"DTCONDITION4STR\", \"DTCONDITION5STR\", \"DTCONDITION6STR\", \"DTCONDITION7STR\", \"DTCONDITION8D\", \"DTCONDITION9D\", \"DTCONDITION13DT\", \"DTCONDITION14DT\"", "").replaceAll("VALUES", "").replaceAll(",,",",").replaceAll("[\\[\\](){}]","").replaceAll(";","").replaceAll("'","").replaceAll("IDENTITY_ definitiontable OFF","").replaceAll("SET", "").replaceAll(", ", ",");
		    		for(int i = 0; i < strStore1.length(); i++) { 
		            	strStore2[i] = strStore1.charAt(i);
		            	if(strStore2[i] == ',')
		            	{
		            		sec1++;
		            	}
		            	}
		    		lineCount++;

		            if(sec1 != sec2 && sec2 != 0 && sec1 > 0)
			           {
			           	System.out.println("Columns doesn't match up in file " + fileCount + " line " + lineCount);
			           }
		            
		            sec2 = sec1;
		         
		            sec1 = 0;
		    		
		            if(strStore1.length() > 1)
		            {
		            	pw.println(strStore1.trim());
		            }
		    	}
		    }
	    }
	    
	    
	}

}
