package composite.filesystem;

public class Main {

    public static void main(String[] args) {

        // Main folder
        Folder computer = new Folder("Computer");

        // Subfolders
        Folder documents = new Folder("Documents");
        Folder photos = new Folder("Photos");

        // Documents files
        File resume = new File("resume.pdf");
        File homework = new File("homework.docx");

        // Photos files
        File photo1 = new File("photo1.jpg");
        File photo2 = new File("photo2.jpg");

        // Other file
        File music = new File("music.mp3");

        // University folder
        Folder university = new Folder("University");

        File java = new File("Java.java");
        File python = new File("Python.py");

        // Add files to University
        university.add(java);
        university.add(python);

        // Add files and folder to Documents
        documents.add(resume);
        documents.add(homework);
        documents.add(university);

        // Add photos
        photos.add(photo1);
        photos.add(photo2);

        // Build Computer structure
        computer.add(documents);
        computer.add(photos);
        computer.add(music);

        // Show everything
        computer.show();
    }
}