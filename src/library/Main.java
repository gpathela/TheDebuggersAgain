
/** Import some Java libraries in which the classes are organized */

import java.text.DecimalFormat;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author Gourav Pathela
 * @course Master of Information Technology
 * @subject Java 2 - ITC521
 * @lecturer Dr Recep Ulusoy
 *
 *
 *           This is a program to take input the details of the Student.
 *           Calculate the result and grade of the student and display the
 *           details in an tabular form. I am  using Fx in it to for GUI . 
 * 
 *           /** Start of the class Main
 */
public class Main extends Application {

	private TableView<Student> table = new TableView<Student>();
	private final ObservableList<Student> data = FXCollections.observableArrayList();
	final HBox hb = new HBox();	//Making a Horizontal box to put in Table. 
	final VBox formBox = new VBox();	//Making a Vertical Box to put in Form

	@SuppressWarnings("unchecked")
	@Override
	public void start(Stage primaryStage) {
		try {	//Try - Setup a Grid to put form and table in it. 
			primaryStage.setTitle("Grade Processing - Programming in Java 2");
			// Declaring a Grid
			GridPane grid = new GridPane();
			grid.setAlignment(Pos.CENTER);	//Setting Alignment of grid
			grid.setHgap(10);	
			grid.setVgap(10);
			grid.setPadding(new Insets(25, 25, 25, 25));
			// Declaring a scene
			Scene scene = new Scene(grid, 700, 575);	//Adding a scene to grid
			primaryStage.setScene(scene);

			/** Declaring text fields */

			// Student ID Field
			final HBox studentIDBox = new HBox();
			Label studentIdLabel = new Label("Student ID(Must 8 Digits)");
			TextField studentIDField = new TextField();
			studentIDBox.setPrefWidth(700);
			studentIDBox.setSpacing(142);
			studentIDBox.setAlignment(Pos.CENTER_LEFT);
			studentIDBox.getChildren().addAll(studentIdLabel, studentIDField);

			// Student Name Field
			final HBox studentNameBox = new HBox();
			Label studentNameLabel = new Label("Student Name");
			TextField studentNameField = new TextField();
			studentNameBox.setPrefWidth(700);
			studentNameBox.setSpacing(200);
			studentNameBox.setAlignment(Pos.CENTER_LEFT);
			studentNameBox.getChildren().addAll(studentNameLabel, studentNameField);

			// Quiz Marks Field
			final HBox quizMarksBox = new HBox();
			Label quizMarksLabel = new Label("Quiz Marks(enter 0-100)");
			TextField quizMarksField = new TextField();
			quizMarksBox.setPrefWidth(700);
			quizMarksBox.setSpacing(148);
			quizMarksBox.setAlignment(Pos.CENTER_LEFT);
			quizMarksBox.getChildren().addAll(quizMarksLabel, quizMarksField);

			// Assignment 1 Marks Field
			final HBox asg1MarksBox = new HBox();
			Label asg1MarksLabel = new Label("Assignment 1 Marks(enter 0-100)");
			TextField asg1MarksField = new TextField();
			asg1MarksBox.setPrefWidth(700);
			asg1MarksBox.setSpacing(100);
			asg1MarksBox.setAlignment(Pos.CENTER_LEFT);
			asg1MarksBox.getChildren().addAll(asg1MarksLabel, asg1MarksField);

			// Assignment 2 Marks Field
			final HBox asg2MarksBox = new HBox();
			Label asg2MarksLabel = new Label("Assignment 2 Marks(enter 0-100)");
			TextField asg2MarksField = new TextField();
			asg2MarksBox.setPrefWidth(700);
			asg2MarksBox.setSpacing(100);
			asg2MarksBox.setAlignment(Pos.CENTER_LEFT);
			asg2MarksBox.getChildren().addAll(asg2MarksLabel, asg2MarksField);

			// Exam Marks Field
			final HBox examMarksBox = new HBox();
			Label examMarksLabel = new Label("Exam Marks(enter 0-100)");
			TextField examMarksField = new TextField();
			examMarksBox.setPrefWidth(700);
			examMarksBox.setSpacing(145);
			examMarksBox.setAlignment(Pos.CENTER_LEFT);
			examMarksBox.getChildren().addAll(examMarksLabel, examMarksField);

			//Putting all form field in vertical Box. 
			formBox.getChildren().addAll(studentIDBox, studentNameBox, quizMarksBox, asg1MarksBox, asg2MarksBox,
					examMarksBox);

			/** Adding Table */

			table.setEditable(true);

			//Student Name Column
			TableColumn<Student, String> studentNameCol = new TableColumn<Student, String>("Name");
			studentNameCol.setMinWidth(100);
			studentNameCol.setCellValueFactory(new PropertyValueFactory<Student, String>("studentName_"));

			//Student ID Column
			TableColumn<Student, Integer> studentIDCol = new TableColumn<Student, Integer>("ID");
			studentIDCol.setMinWidth(50);
			studentIDCol.setCellValueFactory(new PropertyValueFactory<Student, Integer>("studentID_"));

			//Quiz Marks Column
			TableColumn<Student, Integer> quizMarksCol = new TableColumn<Student, Integer>("Quiz Marks");
			quizMarksCol.setMinWidth(50);
			quizMarksCol.setCellValueFactory(new PropertyValueFactory<Student, Integer>("quizMarks_"));

			//Assignment 1 Marks Column
			TableColumn<Student, Integer> asg1MarksCol = new TableColumn<Student, Integer>("A1");
			asg1MarksCol.setMinWidth(50);
			asg1MarksCol.setCellValueFactory(new PropertyValueFactory<Student, Integer>("asg1Marks_"));

			//Assignment 2 Marks Column
			TableColumn<Student, Integer> asg2MarksCol = new TableColumn<Student, Integer>("A2");
			asg2MarksCol.setMinWidth(50);
			asg2MarksCol.setCellValueFactory(new PropertyValueFactory<Student, Integer>("asg2Marks_"));

			//Exam MArks Column
			TableColumn<Student, Integer> examMarksCol = new TableColumn<Student, Integer>("Exam");
			examMarksCol.setMinWidth(50);
			examMarksCol.setCellValueFactory(new PropertyValueFactory<Student, Integer>("examMarks_"));

			//Results Column
			TableColumn<Student, Integer> resultsCol = new TableColumn<Student, Integer>("Result");
			resultsCol.setMinWidth(50);
			resultsCol.setCellValueFactory(new PropertyValueFactory<Student, Integer>("result_"));

			//Grade Column
			TableColumn<Student, String> gradeCol = new TableColumn<Student, String>("Grade");
			gradeCol.setMinWidth(50);
			gradeCol.setCellValueFactory(new PropertyValueFactory<Student, String>("grade_"));

			//Putting Every column in Horizontal Box
			table.setItems(data);
			table.getColumns().addAll(studentNameCol, studentIDCol, quizMarksCol, asg1MarksCol, asg2MarksCol,
					examMarksCol, resultsCol, gradeCol);

			hb.setAlignment(Pos.CENTER);
			hb.setPrefWidth(700);
			hb.getChildren().addAll(table);

			//Making a Horizontal Box to put Buttons
			final HBox buttons = new HBox();
			Label avgMarksLabel = new Label("Average Marks");	//Making a average mark label and column
			TextField avgMarksField = new TextField();
			avgMarksField.setEditable(false);

			final Button avgButton = new Button("Average Marks");	//Button to calculate average Marks
			final Button addStudentButton = new Button("Add New Student");
			addStudentButton.setDisable(true);

			final Button resultButton = new Button("Student Marks");	//Button to add Student Marks
			resultButton.setOnAction(new EventHandler<ActionEvent>() {	//It calls an event to calculate result and grade. 
				@Override
				public void handle(ActionEvent e) {

					try {	//Event handler to create new object of student class
						data.add(new Student(Integer.valueOf(studentIDField.getText()), studentNameField.getText(),
								Integer.valueOf(quizMarksField.getText()), Integer.valueOf(asg1MarksField.getText()),
								Integer.valueOf(asg2MarksField.getText()), Integer.valueOf(examMarksField.getText())));
					} catch (IllegalArgumentException exception) {	// Catch to raise exceptions for illegal arguments
						System.out.println(exception);
					} catch (Exception misTypeException) {
						System.out.println("Wrong input type. All values should be int except Student name");
					}
					studentIDField.clear();
					studentNameField.clear();
					quizMarksField.clear();
					asg1MarksField.clear();
					asg2MarksField.clear();
					examMarksField.clear();

				}
			});

			avgButton.setOnAction(new EventHandler<ActionEvent>() {	//Average mark button handler to display average marks

				@Override
				public void handle(ActionEvent arg0) {
					avgMarksField.setText(String.valueOf(Student.getAverage()));

				}

			});

			buttons.setSpacing(20);
			buttons.getChildren().addAll(avgMarksLabel, avgMarksField, avgButton, addStudentButton, resultButton);
			grid.add(formBox, 0, 0);
			grid.add(hb, 0, 2);
			grid.add(buttons, 0, 3);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

	/** Student Class. The form have objects of this class.  */

	public static class Student {
		private int studentID_;
		private String studentName_;
		private int quizMarks_;
		private int asg1Marks_;
		private int asg2Marks_;
		private int examMarks_;
		private double result_;
		private String grade_;
		private static int noOfStudents = 0;
		private static double grandTotal = 0;

		//Private constructor of the student class
		private Student(int studentID, String studentName, int quizMarks, int asg1Marks, int asg2Marks, int examMarks) {
			setStudentID_(studentID);
			setStudentName_(studentName);
			setQuizMarks_(quizMarks);
			setAsg1Marks_(asg1Marks);
			setAsg2Marks_(asg2Marks);
			setExamMarks_(examMarks);
			noOfStudents++;
			setResult_(quizMarks_, asg1Marks_, asg2Marks_, examMarks_);
			setGrade_(result_);

		}

		public int getStudentID_() {	//Get Student Id Method
			return studentID_;
		}

		public void setStudentID_(int studentID_) {	//Set method for student Id
			if (String.valueOf(studentID_).length() == 8) {
				this.studentID_ = Integer.valueOf(studentID_);
			} else {
				throw new IllegalArgumentException("StudentID must be 8 digit");

			}
		}

		public String getStudentName_() {	//Get method for Student Name
			return studentName_;
		}

		public void setStudentName_(String studentName_) {	//Set method for Student Name
			this.studentName_ = studentName_;
		}

		public int getQuizMarks_() {	//Get method for Quiz Marks
			return quizMarks_;
		}

		public void setQuizMarks_(int quizMarks_) {	//Set Method for Quiz Marks
			if (quizMarks_ >= 0 && quizMarks_ <= 100) {
				this.quizMarks_ = quizMarks_;
			} else {
				throw new IllegalArgumentException(e){
					System.out.println("Quiz Marks should be between 0 to 100");
				}
			}
		}

		public int getAsg1Marks_() {	//Get method for Assignment 1 Marks
			return asg1Marks_;
		}

		public void setAsg1Marks_(int asg1Marks_) {	//Set Method for assignment 1 Marks
			if (asg1Marks_ >= 0 && asg1Marks_ <= 100) {
				this.asg1Marks_ = asg1Marks_;
			} else {
				throw new IllegalArgumentException("Assignment 1 Marks shoule be between 0 to 100");
			}
		}

		public int getAsg2Marks_() {	//Get Method for Assignment 2 Marks
			return asg2Marks_;
		}

		public void setAsg2Marks_(int asg2Marks_) {	//Set Method for Assignment 2 Marks
			if (asg2Marks_ >= 0 && asg2Marks_ <= 100) {
				this.asg2Marks_ = asg2Marks_;
			} else {
				throw new IllegalArgumentException("Assignment 2 Marks shoule be between 0 to 100");
			}
		}

		public int getExamMarks_() {	//Get Method for Exam Marks
			return examMarks_;
		}

		public void setExamMarks_(int examMarks_) {	//Set Method for Exam Marks
			if (examMarks_ >= 0 && examMarks_ <= 100) {
				this.examMarks_ = examMarks_;
			} else {
				throw new IllegalArgumentException("Exam Marks shoule be between 0 to 100");
			}
		}

		public double getResult_() {	//Get Method Results
			return result_;
		}

		public void setResult_(int quizMarks, int asg1Marks, int asg2Marks, int examMarks) {
			this.result_ = (quizMarks * 0.05 + asg1Marks * 0.2 + asg2Marks * 0.25 + examMarks * 0.5);
			DecimalFormat df = new DecimalFormat("#.##");
			result_ = Double.parseDouble(df.format(result_));
			grandTotal = grandTotal + result_;
		}

		public void setGrade_(double result_) {	//Set Method for Grade

			if (result_ >= 85) {
				this.grade_ = "HD";
			} else if (result_ >= 75 && result_ < 85) {
				this.grade_ = "DI";
			} else if (result_ >= 65 && result_ < 75) {
				this.grade_ = "CR";
			} else if (result_ >= 50 && result_ < 65) {
				this.grade_ = "PS";
			} else {
				this.grade_ = "FL";
			}

		}

		public String getGrade_() {	//Get Method for Grade
			return this.grade_;
		}

		public static double getAverage() {	//Get Method for Average Marks
			DecimalFormat df = new DecimalFormat("#.##");
			return Double.parseDouble(df.format(grandTotal / noOfStudents));

		}

	}

}
