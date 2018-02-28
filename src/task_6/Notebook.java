package task_6;

import java.util.Arrays;
import java.util.Scanner;

class Notes{
    static int arraySize=10;
    static String [] notes=new String[arraySize];
    static Scanner sc=new Scanner(System.in);

   public static void addNote() {
       System.out.println("How many notes do you want to add?");
       int quantityNotes = sc.nextInt();
       System.out.println("Please, enter your note:");

       int i = 0;

       for (int j = 0; j < notes.length-1; j++) { //сортировка, все null элементы в конце
           for (int k = 0; k < notes.length-1; k++) {
               if (notes[k] == null) {
                   notes[k] = notes[k + 1];
                   notes[k + 1] = null;
               }
           }
       }
       if (quantityNotes < arraySize && notes[quantityNotes - 1] == null) {
           while (i < quantityNotes && quantityNotes < notes.length && notes[i] == null) {
               String input = sc.nextLine();
               notes[i] = input;
               i++;
           }
       } else  {
           notes = Arrays.copyOf(notes, notes.length + quantityNotes);
           while (i < quantityNotes && quantityNotes < notes.length && notes[i] == null) {
               String input = sc.nextLine();
               notes[i] = input;
               i++;
           }
       }


   }

    public static void deleteNote(){
        System.out.println("Please, enter the number of the note you want to delete:");
        Scanner in=new Scanner(System.in);

        for(int i=in.nextInt(); i<notes.length;){
            notes[i]=null;
            break;
        }
    }

    public static void changeNote(){
        System.out.println("Please, enter the number of the note you want to change:");
        Scanner in=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);

        for(int i=in.nextInt(); i<notes.length;){
            System.out.println("Enter changes:");
            String input=sc.nextLine();
            notes[i]=input;
            break;
        }
    }

    public static void showNotes() {

        for (int i = 0; i < notes.length; i++) {
                System.out.println("№"+i+"\t"+notes[i]);
        }
   }

}


public class Notebook {
    public static void main(String [] args){

        Notes.addNote();
        Notes.showNotes();
        Notes.addNote();
        Notes.showNotes();
        Notes.deleteNote();
        Notes.showNotes();
        Notes.changeNote();
        Notes.showNotes();
    }

}