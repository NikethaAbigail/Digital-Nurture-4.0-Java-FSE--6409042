package factorymethod;

public abstract class DocumentFactory {
    public abstract Document createDocument();

    
    public void processDocument(Document document) {
        document.open();
        document.save();
    }
}