package Assignment;
/*6.	Design and implement a Java program that simulates the undo feature of a text editor using a stack. The program should support adding text to the editor and undoing changes. The stack should store strings, each representing a version of the text. Implement methods for:
 	adding text to the editor : addText(String text)   undoing changes : undo()   getting the current text : getCurrentText()
 */
class StackArr {

    String arr[];
    int top;
    int size;

    StackArr(int size) {
        top = -1;
        this.size = size;
        arr = new String[size];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void addText(String text) {

        if (isFull()) {
            System.out.println("Stack overFlow");
            return;
        }
        System.out.println("Adding " + text);
        arr[++top] = text;
    }

    String undo() {
        if (isEmpty()) {
            System.out.println("Stack Array is Empty");
        }
        return arr[top--];
    }

    String getCurrentText() {
        return arr[top];
    }

}

class TextEditor {
    public static void main(String[] args) {
        StackArr arr1 = new StackArr(3);
        arr1.addText("Binayak");
        arr1.addText("Aryan");
        arr1.addText("Ishan");

        System.out.println("Removing Top element: " + arr1.undo());
        System.out.println("Top element: " + arr1.getCurrentText());

        arr1.addText("Asrim");
        System.out.println("Top element: " + arr1.getCurrentText());

        for (String i : arr1.arr) {
            System.out.println(i);
        }

    }
}