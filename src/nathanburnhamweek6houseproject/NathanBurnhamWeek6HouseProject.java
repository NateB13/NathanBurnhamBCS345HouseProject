//Nathan Burnham BCS345 Week 6 Assignment 10/10/21

package nathanburnhamweek6houseproject;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;

/**
 *
 * @author natha
 */
public class NathanBurnhamWeek6HouseProject extends Application
{


    public static void main(String[] args) 
    {

        launch(args);

    }

    @Override
    public void start(Stage stage)
    {

        Rectangle wall = new Rectangle(225, 150, 300, 300);
        wall.setFill(Color.BROWN);
        wall.setStrokeWidth(2);
        wall.setStroke(Color.BLACK);
        
        Rectangle plaque = new Rectangle(358, 200, 40, 30);
        plaque.setFill(Color.LIGHTGRAY);
        plaque.setStrokeWidth(2);
        plaque.setStroke(Color.BLACK);
        
        //Coding for doors.
        
        Rectangle middleDoor = new Rectangle(358, 300, 40, 105);
        middleDoor.setFill(Color.WHITE);
        middleDoor.setStrokeWidth(2);
        middleDoor.setStroke(Color.BLACK);
        
        Rectangle leftDoor = new Rectangle(272, 320, 40, 85);
        leftDoor.setFill(Color.WHITE);
        leftDoor.setStrokeWidth(2);
        leftDoor.setStroke(Color.BLACK);
        
        Rectangle rightDoor = new Rectangle(438, 320, 40, 85);
        rightDoor.setFill(Color.WHITE);
        rightDoor.setStrokeWidth(2);
        rightDoor.setStroke(Color.BLACK);
        
        Rectangle columnSupport = new Rectangle(225, 150, 300, 25);
        columnSupport.setFill(Color.WHITE);
        columnSupport.setStrokeWidth(2);
        columnSupport.setStroke(Color.BLACK);
        
        //Column and column bottom coding.
        
        Rectangle column1 = new Rectangle(235, 175, 25, 220);
        column1.setFill(Color.WHITE);
        column1.setStrokeWidth(2);
        column1.setStroke(Color.BLACK);
        
        Rectangle column1Bottom = new Rectangle (228, 390, 40, 15);
        column1Bottom.setFill(Color.WHITE);
        column1Bottom.setStrokeWidth(2);
        column1Bottom.setStroke(Color.BLACK);
        
        Rectangle column2 = new Rectangle(323, 175, 25, 220);
        column2.setFill(Color.WHITE);
        column2.setStrokeWidth(2);
        column2.setStroke(Color.BLACK);

        Rectangle column2Bottom = new Rectangle (316, 390, 40, 15);
        column2Bottom.setFill(Color.WHITE);
        column2Bottom.setStrokeWidth(2);
        column2Bottom.setStroke(Color.BLACK);
        
        Rectangle column3 = new Rectangle(406, 175, 25, 220);
        column3.setFill(Color.WHITE);
        column3.setStrokeWidth(2);
        column3.setStroke(Color.BLACK);
        
        Rectangle column3Bottom = new Rectangle (396, 390, 40, 15);
        column3Bottom.setFill(Color.WHITE);
        column3Bottom.setStrokeWidth(2);
        column3Bottom.setStroke(Color.BLACK);
        
        Rectangle column4 = new Rectangle(490, 175, 25, 220);
        column4.setFill(Color.WHITE);
        column4.setStrokeWidth(2);
        column4.setStroke(Color.BLACK);
        
        Rectangle column4Bottom = new Rectangle (482, 390, 40, 15);
        column4Bottom.setFill(Color.WHITE);
        column4Bottom.setStrokeWidth(2);
        column4Bottom.setStroke(Color.BLACK);
        
        //Column headings, in form of circles. Hard coded for location and size.
        
        Circle columnCircle1 = new Circle(235, 185, 10);
        columnCircle1.setFill(Color.WHITE);
        columnCircle1.setStrokeWidth(2);
        columnCircle1.setStroke(Color.BLACK);
        
        Circle columnCircle2 = new Circle(260, 185, 10);
        columnCircle2.setFill(Color.WHITE);
        columnCircle2.setStrokeWidth(2);
        columnCircle2.setStroke(Color.BLACK);
        
        Circle columnCircle3 = new Circle(323, 185, 10);
        columnCircle3.setFill(Color.WHITE);
        columnCircle3.setStrokeWidth(2);
        columnCircle3.setStroke(Color.BLACK);
        
        Circle columnCircle4 = new Circle(348, 185, 10);
        columnCircle4.setFill(Color.WHITE);
        columnCircle4.setStrokeWidth(2);
        columnCircle4.setStroke(Color.BLACK);
        
        Circle columnCircle5 = new Circle(406, 185, 10);
        columnCircle5.setFill(Color.WHITE);
        columnCircle5.setStrokeWidth(2);
        columnCircle5.setStroke(Color.BLACK);
        
        Circle columnCircle6 = new Circle(431, 185, 10);
        columnCircle6.setFill(Color.WHITE);
        columnCircle6.setStrokeWidth(2);
        columnCircle6.setStroke(Color.BLACK);
        
        Circle columnCircle7 = new Circle(490, 185, 10);
        columnCircle7.setFill(Color.WHITE);
        columnCircle7.setStrokeWidth(2);
        columnCircle7.setStroke(Color.BLACK);
        
        Circle columnCircle8 = new Circle(515, 185, 10);
        columnCircle8.setFill(Color.WHITE);
        columnCircle8.setStrokeWidth(2);
        columnCircle8.setStroke(Color.BLACK);
        
        //Hard coding of stairs locations because I did not know how to properly implement an array and loop for this.
        
        Rectangle stairs = new Rectangle(165, 475, 400, 10);
        stairs.setFill(Color.LIGHTGRAY);
        stairs.setStrokeWidth(2);
        stairs.setStroke(Color.BLACK);
        
        Rectangle stairs2 = new Rectangle(180, 465, 375, 10);
        stairs2.setFill(Color.LIGHTGRAY);
        stairs2.setStrokeWidth(2);
        stairs2.setStroke(Color.BLACK);
        
        Rectangle stairs3 = new Rectangle(195, 455, 350, 10);
        stairs3.setFill(Color.LIGHTGRAY);
        stairs3.setStrokeWidth(2);
        stairs3.setStroke(Color.BLACK);
        
        Rectangle stairs4 = new Rectangle(210, 445, 325, 10);
        stairs4.setFill(Color.LIGHTGRAY);
        stairs4.setStrokeWidth(2);
        stairs4.setStroke(Color.BLACK);
        
        Rectangle stairs5 = new Rectangle(225, 435, 300, 10);
        stairs5.setFill(Color.LIGHTGRAY);
        stairs5.setStrokeWidth(2);
        stairs5.setStroke(Color.BLACK);
        
        Rectangle stairs6 = new Rectangle(240, 425, 275, 10);
        stairs6.setFill(Color.LIGHTGRAY);
        stairs6.setStrokeWidth(2);
        stairs6.setStroke(Color.BLACK);
        
        Rectangle stairs7 = new Rectangle(255, 415, 250, 10);
        stairs7.setFill(Color.LIGHTGRAY);
        stairs7.setStrokeWidth(2);
        stairs7.setStroke(Color.BLACK);
        
        Rectangle stairs8 = new Rectangle(270, 405, 225, 10);
        stairs8.setFill(Color.LIGHTGRAY);
        stairs8.setStrokeWidth(2);
        stairs8.setStroke(Color.BLACK);
        
        //My thoughts for how to implement, did not pan out.
        
        /*for (int i = 0; i <=10; i++)
        {
            int posX = 175;
            int x = 400;
            int posY = 600;
            int y = 15;
            int x2 = 0;
            int posX2 = 0;
            int posY2 = 0;
            stairs.setWidth(x - (i*15));
            stairs.setX(posX+(i*15));
            stairs.setY(posY+(i*15));
            stairs = new Rectangle(posX2, posY2, x2, y);
            
            
            
        }*/
        
        //Coding of roof using polygon import.
        
        Polygon roof = new Polygon();
        roof.getPoints().addAll(
                175.0, 150.0,
                375.0, 25.0,
                575.0, 150.0
        );
        roof.setFill(Color.WHITE);
        roof.setStrokeWidth(2);
        roof.setStroke(Color.BLACK);

        //Setting stage.
        
        Group group = new Group();
        group.getChildren().addAll(wall, plaque, columnSupport, column1, column1Bottom, column2, stairs, 
                stairs2, stairs3, stairs4, stairs5, stairs6, stairs7, stairs8, column2Bottom, column3, 
                column3Bottom, column4, column4Bottom, columnCircle1, columnCircle2, columnCircle3, 
                columnCircle4, columnCircle5, columnCircle6, columnCircle7, columnCircle8, middleDoor, 
                leftDoor, rightDoor, roof);
        Scene scene = new Scene(group, 700, 700, Color.LIGHTBLUE);
        stage.setTitle("House");
        stage.setScene(scene);
        stage.show();

    }

}