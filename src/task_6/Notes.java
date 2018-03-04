package task_6;

import java.util.Arrays;
import java.util.Scanner;

import static task_6.Notebook.arraySize;
import static task_6.Notebook.notes;

public class Notes{

        Scanner sc=new Scanner(System.in);

        public void addNote(String str) {
            int i = 0;

                    for (; i < notes.length; i++) {
                        if (notes[i] == null) {
                            notes[i] = str;
                            break;
                        } else if (notes[arraySize - 1] != null) {//как изменить цикл???
                            notes = Arrays.copyOf(notes, notes.length * 2);
                            notes[arraySize+i]=str;
                            break;
                        }
                    }
                }



        public void showNotes() {
            for (int i = 0; i < notes.length; i++) {
                System.out.println("№" + i + "\t" + notes[i]);
            }
        }

        public void deleteNotes() {
            System.out.println("Please, enter the number of the note you want to delete:");
            for (int i = sc.nextInt(); i < notes.length; ) {
                notes[i] = null;
                break;
            }
        }

        public void changeNotes(){
            System.out.println("Please, enter the number of the note you want to change:");
            for(int i=sc.nextInt(); i<notes.length;){
                System.out.println("Enter changes:");
                String input=sc.nextLine();
                notes[i]=input;
                break;
            }
        }





    }

