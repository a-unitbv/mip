import java.awt.*;
public class Main {
    public static void main(String[] args) {
       Person p = new Profesor("Bogdan", "Cojocaru", "secret", 2021);
        System.out.println((p.getInfo()));
        Frame f = new Frame("Student");
        GridLayout gridLayout = new GridLayout(4, 3);
        f.setLayout(gridLayout);

        Label lbl_firstName = new Label("Prenume");
        TextField text_firstName = new TextField();
        Label lbl_lastName = new Label("Nume");
        TextField text_lastName = new TextField();
        Label lbl_cnp = new Label("CNP");
        TextField text_cnp = new TextField();
        Button button_ok = new Button("ok");
        Button button_cancel = new Button("Cancel");
        f.add(lbl_firstName);
        f.add(text_firstName);
        f.add(lbl_lastName);
        f.add(text_lastName);
        f.add(lbl_cnp);
        f.add(text_cnp);
        f.add(button_ok);
        f.add(button_cancel);
        f.setVisible(true);

    }
}