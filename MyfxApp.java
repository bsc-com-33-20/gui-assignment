import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MyfxApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();

        // Top Bar with Menu
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        Menu createAccountMenu = new Menu("Create Account");
        MenuItem createAccountMenuItem = new MenuItem("Create Account");
        fileMenu.getItems().add(createAccountMenuItem);
        menuBar.getMenus().add(fileMenu);
        menuBar.getMenus().add(createAccountMenu);

        Button createAccountButton = new Button("Create Account");
        createAccountButton.setOnAction(event -> {
            // Action to perform when the "Create Account" button is clicked
        });

        HBox topBar = new HBox(10);
        topBar.setPadding(new Insets(10));
        topBar.setAlignment(Pos.CENTER_LEFT);
        topBar.getChildren().addAll(createAccountButton);

        root.setTop(topBar);
        root.setTop(menuBar);

        // Center section with Names and Border
        GridPane centerGrid = new GridPane();
        centerGrid.setAlignment(Pos.TOP_LEFT);
        centerGrid.setHgap(10);
        centerGrid.setVgap(10);
        centerGrid.setPadding(new Insets(10));

        Label[] nameLabels = new Label[5];
        nameLabels[0] = createLabel("pippo");
        nameLabels[1] = createLabel("isabella");
        nameLabels[2] = createLabel("smith");
        nameLabels[3] = createLabel("emma");
        nameLabels[4] = createLabel("ethan");

        for (int i = 0; i < nameLabels.length; i++) {
            centerGrid.add(nameLabels[i], 0, i);
        }

        root.setCenter(centerGrid);

        // Right section with Labels and TextFields
        VBox rightBox = new VBox(10);
        rightBox.setPadding(new Insets(10));
        rightBox.setAlignment(Pos.CENTER);

        Label idLabel = createLabel("ID");
        TextField idTextField = createTextField();

        Label dataLabel = createLabel("Data");
        TextField dataTextField = createTextField();

        Label minetteLabel = createLabel("Minette");
        TextField minetteTextField = createTextField();

        Label destinatarioLabel = createLabel("Destinatario");
        TextField destinatarioTextField = createTextField();

        Label oggtoLabel = createLabel("Oggto");
        TextField oggtoTextField = createTextField();

        Button scriviButton = new Button("Scrivi");
        Button replyButton = new Button("Reply");
        Button replyAllButton = new Button("Reply All");
        Button forwardButton = new Button("Forward");

        HBox buttonBox = new HBox(10);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.getChildren().addAll(scriviButton, replyButton, replyAllButton, forwardButton);

        rightBox.getChildren().addAll(
                idLabel, idTextField,
                dataLabel, dataTextField,
                minetteLabel, minetteTextField,
                destinatarioLabel, destinatarioTextField,
                oggtoLabel, oggtoTextField,
                buttonBox
        );

        root.setRight(rightBox);

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setTitle("BSC-COM-33-20");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Label createLabel(String labelText) {
        Label label = new Label(labelText);
        return label;
    }

    private TextField createTextField() {
        TextField textField = new TextField();
        return textField;
    }

    public static void main(String[] args) {
        launch(args);
    }
}