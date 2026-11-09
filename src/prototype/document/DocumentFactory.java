package prototype.document;

public class DocumentFactory {

    private Document prototype;

    public DocumentFactory(Document prototype) {
        this.prototype = prototype;
    }

    public void setDocument(Document prototype) {
        this.prototype = prototype;
    }

    public Document cloneDocument() {
        return prototype.clone();
    }
}