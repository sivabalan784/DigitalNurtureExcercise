interface Document {
    void open();
}
class WordDocument implements Document {

    public void open() {
        System.out.println("Word Document Opened");
    }
}
class PdfDocument implements Document {

    public void open() {
        System.out.println("PDF Document Opened");
    }
}

class ExcelDocument implements Document {

    public void open() {
        System.out.println("Excel Document Opened");
    }
}
abstract class DocumentFactory {

    public abstract Document createDocument();
}

class WordDocumentFactory extends DocumentFactory {

    public Document createDocument() {
        return new WordDocument();
    }
}

class PdfDocumentFactory extends DocumentFactory {

    public Document createDocument() {
        return new PdfDocument();
    }
}

class ExcelDocumentFactory extends DocumentFactory {

    public Document createDocument() {
        return new ExcelDocument();
    }
}

public class Main {

    public static void main(String[] args) {

        DocumentFactory wordFactory = new WordDocumentFactory();
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        DocumentFactory excelFactory = new ExcelDocumentFactory();

        Document d1 = wordFactory.createDocument();
        Document d2 = pdfFactory.createDocument();
        Document d3 = excelFactory.createDocument();

        d1.open();
        d2.open();
        d3.open();
    }
}