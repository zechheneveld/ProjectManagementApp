package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import sample.Model.Task;
import sample.Model.Worker;


import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;



public class Controller implements Initializable{


    Task task = new Task();
    Worker manny = new Worker();

    @Override
    public void initialize(URL location, ResourceBundle resources){
        System.out.println(task);
        System.out.println(manny);

        double compare = Math.ceil(task.points / manny.ability);
        System.out.println("Here is ");

    }



    @FXML
    private Button btnNewEmp;

    @FXML
    private Text totalEmployeeNode;

    @FXML
    private Text employeeListView;

    @FXML
    private Text empNmb;


    public int points;

    private int totalHours = 0;
    Random diceRoll = new Random();



    ArrayList<Task> employeeList = new ArrayList<>();

    public void calculateHourTotal() {


        for (Task employee : employeeList) {
            totalHours += employee.hours;
            this.points = diceRoll.nextInt(10) + 10;
            totalHours = points;

        }
    }

    public void onEmpClick(ActionEvent actionEvent){
        String EmployeeName ="80";
        int EmployeeNameInt = Integer.parseInt(EmployeeName);
        int hours = 1;
        EmployeeNameInt++;


        Task newEmployee = new Task(EmployeeName, hours);
        employeeList.add(newEmployee);

        empNmb.setText(EmployeeName);
        updateEmployeeView();

    }
    public  void  updateEmployeeView(){
        //employeeListView.getChildren().clear();
        for (Task employee : employeeList){
            Text newTextNode = new Text();

            String employeeLine = employee.name;

            newTextNode.setText(employeeLine);

            //employeeListView.getChildren().clear();
        }
        calculateHourTotal();
        int totalPoints = 80;
        totalEmployeeNode.setText("Total hours: " + totalHours);
        employeeListView.setText("Total Weeks: " + totalPoints/ totalHours);
    }


    }

