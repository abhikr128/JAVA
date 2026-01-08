package stream_misc;

interface Printable {
    void print();
}

class Document implements Printable {
    public void print() {
        System.out.println("Printing a document...");
    }
}

class Image implements Printable {
    public void print() {
        System.out.println("Printing an image...");
    }
}

public class PolyAbst {
    public static void main(String[] args) {
        Printable document = new Document();
        Printable image = new Image();
//      print(document);
//      print(image);
        document.print();
        image.print();
    }

    public static void print(Printable printable) {
        printable.print();
    }
}

