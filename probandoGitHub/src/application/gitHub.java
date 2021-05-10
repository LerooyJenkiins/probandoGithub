package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class gitHub extends Application {

	@Override
	public void start(Stage stage) {

		BorderPane principal = new BorderPane();
		Text tituloApp = new Text("GitHub Project");
		tituloApp.setFont(Font.font("Power Green", FontWeight.BOLD, 48.00));
		tituloApp.setFill(Color.LIGHTGREEN);
		principal.setTop(tituloApp);
		principal.setBackground(new Background(new BackgroundFill(Color.AZURE, CornerRadii.EMPTY, Insets.EMPTY)));
		BorderPane.setMargin(tituloApp, new Insets(50.00, 0.0, 0.00, 200.0));
		GridPane gridCentral = new GridPane();
		BorderPane.setMargin(gridCentral, new Insets(20.00, 0.0, 0.0, 220.0));
		gridCentral.setHgap(10.0);
		gridCentral.setVgap(10.0);
		Text nombreUsuario = new Text("Nombre de usuario: ");
		TextField nombreUsuarioTxt = new TextField("");
		nombreUsuarioTxt.setPromptText("Ej: HolaMundo67...");
		gridCentral.add(nombreUsuario, 0, 0);
		gridCentral.add(nombreUsuarioTxt, 1, 0);
		Text passwordTxt = new Text("Contraseña: ");
		PasswordField password = new PasswordField();
		password.setPromptText("Escriba su Contraseña");
		gridCentral.add(passwordTxt, 0, 1);
		gridCentral.add(password, 1, 1);
		Button enter = new Button("Enter");
		enter.setPrefWidth(280.0);
		gridCentral.add(enter, 0, 2, 2, 1);
		principal.setCenter(gridCentral);
		Scene scene = new Scene(principal, 700, 300);
		stage.setScene(scene);
		stage.setTitle("GitHub");
		stage.show();


		enter.setOnAction(value -> {

			if (nombreUsuarioTxt.getText().equals("") || password.getText().equals("") ){
				Alert alert = new Alert(AlertType.WARNING);
				alert.setTitle("Warning Dialog");
				alert.setHeaderText(null);
				alert.setContentText("Faltan campos por rellenar");
				alert.showAndWait();

			}else{
				Platform.exit();

			}

		});

	}

	public static void main(String[] args) {
		launch(args);
	}
}
