import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;
    private Scanner scanner;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser(){
        scanner = new Scanner(System.in);
        while (true){
            view.printMessage(View.INPUT_HELLO);
            if (scanner.next().equalsIgnoreCase(Words.HELLO)){
                model.setHello(Words.HELLO);
                break;
            } else {
                view.printMessage(View.ERROR_MESSAGE);
            }
        }

        while (true){
            view.printMessage(View.INPUT_WORLD);
            if (scanner.next().equalsIgnoreCase(Words.WORLD)){
                model.setWorld(Words.WORLD);
                break;
            } else {
                view.printMessage(View.ERROR_MESSAGE);
            }
        }
        view.printMessage(View.END_MESSAGE);
        view.printMessage(model.getPhrase());
    }
}
