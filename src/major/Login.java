package major;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Login extends Application {

	// public static Login loginTran =new Login();

	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub

		FXMLLoader root = new FXMLLoader(getClass().getResource("/ui/Page_login.fxml"));
		// if(root==null) {
		// System.out.println("cant load file");
		// Platform.exit();
		// }

		// LoginController logincontroller = root.getController();

		Scene scene = new Scene(((Parent) root.load()), 1320, 700);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.setMaximized(false);
		primaryStage.setTitle("POS System");
		primaryStage.getIcons().add(new Image("graphic/poslogorect.png"));
		primaryStage.show();

	}

	public static void main(String args[]) {
		Application.launch(args);
	}
}
