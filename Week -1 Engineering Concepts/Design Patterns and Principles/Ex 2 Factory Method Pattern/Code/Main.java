package factorymethod;

public class Main {
    public static void main(String[] args) {
       
        DocumentFactory wordFactory = new WordDocumentFactory();
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        DocumentFactory excelFactory = new ExcelDocumentFactory();

        
        Document wordDoc = wordFactory.createDocument();
        wordFactory.processDocument(wordDoc);

        System.out.println(); 

        Document pdfDoc = pdfFactory.createDocument();
        pdfFactory.processDocument(pdfDoc);

        System.out.println(); 

        Document excelDoc = excelFactory.createDocument();
        excelFactory.processDocument(excelDoc);
    }
}