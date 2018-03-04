package task_6;



public class App {
    public static void main(String[] args) {

        Notes newNote=new Notes();
        newNote.addNote("hi");
        newNote.addNote("i am nika");
        newNote.addNote("sinitsina");
        newNote.addNote("epam course");
        newNote.addNote("test java");
        newNote.addNote("java");
        newNote.addNote("sdf");
        newNote.addNote("sdfc");
        newNote.showNotes();
        newNote.deleteNotes();
        newNote.showNotes();
        newNote.changeNotes();
        newNote.showNotes();
    }
}