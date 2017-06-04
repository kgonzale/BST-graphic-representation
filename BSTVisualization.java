/**	File: BSTVisualization.java

	The class BSTVisualization is responsible for displaying the
	Binary Search Tree Visualization GUI. The GUI itself holds
	various ways of customizing the GUI.

	@authors Kevin Gonzalez, Philip Hoyt
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.text.*;
import javafx.scene.paint.*;
import javafx.scene.control.Label;
import javafx.geometry.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.animation.Transition;
import javafx.animation.TranslateTransition;
import javafx.animation.Animation;
import javafx.scene.Group;
import java.time.*;
import javafx.util.Duration;
import javafx.scene.shape.Line;

public class BSTVisualization extends Application {

	public static int x;

  public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage levelSelectStage) {
	    
        levelSelectStage.setTitle("BST Visualization");
	levelSelectStage.getIcons().add(new Image("pics/logo.png"));
		
	/** First button of the stage. Introduction
		to BST will be assigned to this button.
	*/
        Button lv0btn0 = new Button();
        lv0btn0.setText("Intro to BST");
        lv0btn0.setFont(new Font(15));
        lv0btn0.setPrefWidth(300);
        lv0btn0.setPrefHeight(125);
        lv0btn0.setTranslateX(15);
        lv0btn0.setTranslateY(-125);
	lv0btn0.setStyle("-fx-background-color: #498bf4;");

	/** Second layer of the levels where Deleting/Inserting
		will be assigned to the first button.
	*/
        Button lv1btn0 = new Button();
        lv1btn0.setText("Deleting/Inserting");
        lv1btn0.setFont(new Font(15));
        lv1btn0.setPrefWidth(300);
        lv1btn0.setPrefHeight(125);
        lv1btn0.setTranslateX(-250);
        lv1btn0.setTranslateY(50);
	lv1btn0.setStyle("-fx-background-color: #498bf4;");

	/** Second layer of the levels where Traversals will
		be assigned to the second button on this level.
	*/
        Button lv1btn1 = new Button();
        lv1btn1.setText("Traversals");
        lv1btn1.setFont(new Font(15));
        lv1btn1.setPrefWidth(300);
        lv1btn1.setPrefHeight(125);
        lv1btn1.setTranslateX(280);
        lv1btn1.setTranslateY(50);
	lv1btn1.setStyle("-fx-background-color: #498bf4;");

	/** Third layer of the levels where Tree Rotations
		will be assigned to the first button on this level.
	*/
        Button lv2btn0 = new Button();
        lv2btn0.setText("Tree Rotations");
        lv2btn0.setFont(new Font(15));
        lv2btn0.setPrefWidth(300);
        lv2btn0.setPrefHeight(125);
        lv2btn0.setTranslateX(-250);
        lv2btn0.setTranslateY(230);
	lv2btn0.setStyle("-fx-background-color: #498bf4;");

	/** Third layer of the level where Tree Balancing
		will be assigned to the second button on this
		level.
	*/
        Button lv2btn1 = new Button();
        lv2btn1.setText("Tree Balancing");
        lv2btn1.setFont(new Font(15));
        lv2btn1.setPrefWidth(300);
        lv2btn1.setPrefHeight(125);
        lv2btn1.setTranslateX(280);
        lv2btn1.setTranslateY(230);
	lv2btn1.setStyle("-fx-background-color: #498bf4;");
	    
        Label text = new Label();
        text.setText("BST Visualization");
        text.setTextFill(Color.BLACK);
        text.setFont(Font.font("Serif", 55));
        text.setTranslateX(15);
        text.setTranslateY(-290);

        Label text1 = new Label();
        text1.setText("level 0");
        text1.setTextFill(Color.BLACK);
        text1.setFont(Font.font("Serif", 25));
        text1.setTranslateX(15);
        text1.setTranslateY(999);
	TranslateTransition ttswap1 = new TranslateTransition(Duration.millis(800), text1);
	ttswap1.setToY(-215);
	ttswap1.play();

        Label text2 = new Label();
        text2.setText("level 1");
        text2.setTextFill(Color.BLACK);
        text2.setFont(Font.font("Serif", 25));
        text2.setTranslateX(15);
        text2.setTranslateY(999);
	TranslateTransition ttswap2 = new TranslateTransition(Duration.millis(800), text2);
	ttswap2.setToY(-40);
	ttswap2.play();

        Label text3 = new Label();
        text3.setText("level 2");
        text3.setTextFill(Color.BLACK);
        text3.setFont(Font.font("Serif", 25));
        text3.setTranslateX(15);
        text3.setTranslateY(999);
	TranslateTransition ttswap3 = new TranslateTransition(Duration.millis(800), text3);
	ttswap3.setToY(155);
	ttswap3.play();

	Label text4 = new Label();
	text4.setText("_________________________________            _________________________________");
	text4.setTextFill(Color.BLACK);
	text4.setFont(Font.font("Serif", 25));
	text4.setTranslateX(15);
	text4.setTranslateY(999);
	TranslateTransition ttswap4 = new TranslateTransition(Duration.millis(900), text4);
	ttswap4.setToY(-225);
	ttswap4.play();

	Label text5 = new Label();
	text5.setText("_________________________________            _________________________________");
	text5.setTextFill(Color.BLACK);
	text5.setFont(Font.font("Serif", 25));
	text5.setTranslateX(15);
	text5.setTranslateY(999);
	TranslateTransition ttswap5 = new TranslateTransition(Duration.millis(900), text5);
	ttswap5.setToY(-50);
	ttswap5.play();

	Label text6 = new Label();
	text6.setText("_________________________________            _________________________________");
	text6.setTextFill(Color.BLACK);
	text6.setFont(Font.font("Serif", 25));
	text6.setTranslateX(15);
	text6.setTranslateY(999);
	TranslateTransition ttswap6 = new TranslateTransition(Duration.millis(900), text6);
	ttswap6.setToY(145);
	ttswap6.play();

        StackPane root = new StackPane();
	    
        root.getChildren().add(lv0btn0);
        root.getChildren().add(lv1btn0);
        root.getChildren().add(lv1btn1);
        root.getChildren().add(lv2btn0);
        root.getChildren().add(lv2btn1);
        root.getChildren().add(text);
        root.getChildren().add(text1);
        root.getChildren().add(text2);
        root.getChildren().add(text3);
	root.getChildren().add(text4);
	root.getChildren().add(text5);
	root.getChildren().add(text6);

	root.setStyle("-fx-background: #6098f2;");
		
        levelSelectStage.setScene(new Scene(root, 950, 700));
        levelSelectStage.show();

		
	/** Button for Introduction to BST.	Images in order
		to help better aid in the visualization aspect of
		the Introduction to Binary Search Trees.

		Contains TranslateTransition to assist with the
		animation of the Binary Search Trees themselves.

		Next and exit buttons are implemented in order
		for the client to proceed or exit out of the
		stages. The swap button allows for user interaction
		with BST.
	*/	
        lv0btn0.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			
			levelSelectStage.close();

			StackPane root = new StackPane();
			Stage introStage = new Stage();
			introStage.setTitle("Intro To BST Lesson");
			introStage.getIcons().add(new Image("pics/logo.png"));

			Image intro1 = new Image("pics/intro1.png");
			ImageView introimg = new ImageView(intro1);
			introimg.setTranslateX(15);
			introimg.setTranslateY(15);
			root.getChildren().add(introimg);

			Image bst1 = new Image("pics/emptyTree.png");
          		ImageView bstimg1 = new ImageView(bst1);
            		bstimg1.setTranslateX(-300);
            		bstimg1.setTranslateY(-150);
            		root.getChildren().add(bstimg1);

            		Image bst2 = new Image("pics/smallNode.png");
            		ImageView smallnode = new ImageView(bst2);
            		smallnode.setTranslateX(-225);
            		smallnode.setTranslateY(-52);
            		root.getChildren().add(smallnode);

           		Image bst3 = new Image("pics/bigNode.png");
            		ImageView bignode = new ImageView(bst3);
            		bignode.setTranslateX(-350);
            		bignode.setTranslateY(-52);
            		root.getChildren().add(bignode);

            		Image wrongimg = new Image("pics/wrong.png");
            		ImageView wrong = new ImageView(wrongimg);
            		wrong.setTranslateX(-300);
            		wrong.setTranslateY(-290);
            		root.getChildren().add(wrong);

			Image rightimg = new Image("pics/right.png");
            		ImageView right = new ImageView(rightimg);
            		right.setTranslateX(-300);
            		right.setTranslateY(-1050);
            		root.getChildren().add(right);

            		Button swap = new Button();
            		swap.setText("swap");
            		swap.setFont(new Font(20));
            		swap.setPrefWidth(100);
            		swap.setPrefHeight(100);
            		swap.setTranslateX(-290);
            		swap.setTranslateY(40);
			swap.setStyle("-fx-background-color: #498bf4;");
            		root.getChildren().add(swap);

			root.setStyle("-fx-background-color: #498bf4;");

            		swap.setOnAction(new EventHandler<ActionEvent>() {
				
				int x = 0;
				
               			@Override
                		public void handle(ActionEvent event) {
					
					if(x == 0) {
						
						TranslateTransition ttswap1 = new TranslateTransition(Duration.millis(200), bignode);
                        			ttswap1.setToX(-225);
                        			ttswap1.play();

						TranslateTransition ttswap2 = new TranslateTransition(Duration.millis(200), smallnode);
                        			ttswap2.setToX(-350);
                        			ttswap2.play();

						TranslateTransition ttswap3 = new TranslateTransition(Duration.millis(200), wrong);
                        			ttswap3.setToY(-500);
                        			ttswap3.play();

                        			TranslateTransition ttswap4 = new TranslateTransition(Duration.millis(200), right);
                        			ttswap4.setToY(-290);
                        			ttswap4.play();
                        			x++;
						
						}
						else
						{
														
							TranslateTransition ttswap1 = new TranslateTransition(Duration.millis(200), bignode);
                            				ttswap1.setToX(-350);
                           				ttswap1.play();

                            				TranslateTransition ttswap2 = new TranslateTransition(Duration.millis(200), smallnode);
                            				ttswap2.setToX(-225);
                            				ttswap2.play();

                            				TranslateTransition ttswap3 = new TranslateTransition(Duration.millis(200), wrong);
                            				ttswap3.setToY(-290);
							ttswap3.play();

                            				TranslateTransition ttswap4 = new TranslateTransition(Duration.millis(200), right);
                           				ttswap4.setToY(-500);
                            				ttswap4.play();
                            				x--;
						}
					}
				});
				
				Button next = new Button();
                		next.setText("Next");
                		next.setFont(new Font(10));
                		next.setPrefWidth(50);
                		next.setPrefHeight(50);
                		next.setTranslateX(410);
                		next.setTranslateY(-300);

               			Button exit = new Button();
                		exit.setText("Level Select");
                		exit.setFont(new Font(10));
                		exit.setPrefWidth(70);
                		exit.setPrefHeight(50);
                		exit.setTranslateX(410);
                		exit.setTranslateY(300);

                		root.getChildren().add(next);
                		root.getChildren().add(exit);
                		introStage.setScene(new Scene(root, 950, 700));
                		introStage.show();

                		exit.setOnAction(new EventHandler<ActionEvent>() {
										
					@Override
                    			public void handle(ActionEvent event) {
												
						introStage.close();
						levelSelectStage.show();
				}
			});
			
			
			/** Handles the next button on page one. This
				method allows for another stage to be created.

				Buttons are created to allow the user to proceed,
				go back a stage, and even exit to the main screen.

				Images are used to emphasize Binary Search Trees.
			*/
            		next.setOnAction(new EventHandler<ActionEvent>() {
								
				@Override
				public void handle(ActionEvent event) {
					
					introStage.close();
					
                    			StackPane root = new StackPane();
                    			Stage introStagepage2 = new Stage();
                    			introStagepage2.setTitle("Intro To BST Lesson");
					introStagepage2.getIcons().add(new Image("pics/logo.png"));

					Image intro2 = new Image("pics/intro2.png");
					ImageView introimg1 = new ImageView(intro2);
					introimg1.setTranslateX(15);
					introimg1.setTranslateY(15);
					root.getChildren().add(introimg1);

					Button previous = new Button();
					previous.setText("Previous");
					previous.setFont(new Font(10));
                    			previous.setPrefWidth(75);
                   			previous.setPrefHeight(50);
                    			previous.setTranslateX(-410);
                    			previous.setTranslateY(300);
                    			root.getChildren().add(previous);

                    			Button exit1 = new Button();
                    			exit1.setText("Level Select");
                   			exit1.setFont(new Font(10));
                    			exit1.setPrefWidth(70);
                    			exit1.setPrefHeight(50);
                    			exit1.setTranslateX(410);
                    			exit1.setTranslateY(300);
                   			root.getChildren().add(exit1);

					root.setStyle("-fx-background: #6098f2;");

					introStagepage2.setScene(new Scene(root, 950, 700));
                    			introStagepage2.show();

					exit1.setOnAction(new EventHandler<ActionEvent>() {
												
						@Override
                        			public void handle(ActionEvent event) {
														
							introStagepage2.close();
                            				levelSelectStage.show();
						}
					});

					previous.setOnAction(new EventHandler<ActionEvent>() {
						
						@Override
                        			public void handle(ActionEvent event) {
							
                            				introStagepage2.close();
                            				introStage.show();
						}
					});
				}
			});
		}
	});

	/** Stage for deleting/inserting. This stage
		has multiple images allowing for better
		visuals of an actual deletion/insertion.

		Various deleting/inserting operations
		(buttons) provide the user a better
		understanding of BSTs.

		Buttons swap, swap1, swap2, swap3
		allow for user interaction.
	*/
	lv1btn0.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
       		public void handle(ActionEvent event) {
			
			levelSelectStage.close();

           		StackPane root = new StackPane();
            		Stage insertdeleteStage = new Stage();
            		insertdeleteStage.setTitle("Deleting/Inserting"); //title
			insertdeleteStage.getIcons().add(new Image("pics/logo.png"));

            		Button exit = new Button();
            		exit.setText("Level Select");
            		exit.setFont(new Font(10));
            		exit.setPrefWidth(70);
            		exit.setPrefHeight(50);
            		exit.setTranslateX(410);
            		exit.setTranslateY(300);
            		root.getChildren().add(exit);

            		exit.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
                		public void handle(ActionEvent event) {
					
					levelSelectStage.show();
                    			insertdeleteStage.close();
				}
			});

			Image tree = new Image("pics/tree2part1.png");
           		ImageView tree1 = new ImageView(tree);
            		tree1.setTranslateX(-280);
            		tree1.setTranslateY(-150);
           		root.getChildren().add(tree1);

            		Image tree2 = new Image("pics/tree2part2.png");
            		ImageView tree3 = new ImageView(tree2);
            		tree3.setTranslateX(-180);
            		tree3.setTranslateY(-90);
            		root.getChildren().add(tree3);

            		Image insertNode = new Image("pics/insertedNode.png");
            		ImageView insertedNode = new ImageView(insertNode);
            		insertedNode.setTranslateX(-999);
            		insertedNode.setTranslateY(-999);
            		root.getChildren().add(insertedNode);

            		Image leaffNode = new Image("pics/leafNode.png");
            		ImageView leafNode = new ImageView(leaffNode);
            		leafNode.setTranslateX(-999);
            		leafNode.setTranslateY(-999);
            		root.getChildren().add(leafNode);

			Image del1 = new Image("pics/del1.png");
			ImageView delimg = new ImageView(del1);
			delimg.setTranslateX(15);
			delimg.setTranslateY(15);
			root.getChildren().add(delimg);

			Button swap = new Button();
            		swap.setText("inserting");
            		swap.setFont(new Font(18));
            		swap.setPrefWidth(100);
            		swap.setPrefHeight(5);
            		swap.setTranslateX(210);
           		swap.setTranslateY(-240);
            		root.getChildren().add(swap);

            		swap.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
                		public void handle(ActionEvent event) {
										
					TranslateTransition swap1 = new TranslateTransition(Duration.millis(200), tree3);
                   			swap1.setToX(-100);
                    			swap1.setToY(30);
                    			swap1.play();
                    			TranslateTransition swap2 = new TranslateTransition(Duration.millis(200), insertedNode);
                    			swap2.setToX(-160);
                    			swap2.setToY(-170);
                    			swap2.play();
				}
			});

			Button swap1 = new Button();
            		swap1.setText("deletion");
            		swap1.setFont(new Font(18));
            		swap1.setPrefWidth(100);
            		swap1.setPrefHeight(5);
            		swap1.setTranslateX(290);
           		swap1.setTranslateY(125);
            		root.getChildren().add(swap1);

            		swap1.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
                		public void handle(ActionEvent event) {
					
					TranslateTransition swap1 = new TranslateTransition(Duration.millis(200), tree3);
                    			swap1.setToX(-180);
                    			swap1.setToY(-90);
                    			swap1.play();

                    			TranslateTransition swap2 = new TranslateTransition(Duration.millis(1), insertedNode);
                    			swap2.setToX(-999);
                    			swap2.setToY(-999);
                    			swap2.play();
				}
			});

			Button swap2 = new Button();
            		swap2.setText("node");
            		swap2.setFont(new Font(18));
            		swap2.setPrefWidth(100);
            		swap2.setPrefHeight(5);
           		swap2.setTranslateX(335);
            		swap2.setTranslateY(185);
            		root.getChildren().add(swap2);

           		swap2.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
                		public void handle(ActionEvent event) {
					
					TranslateTransition swap1 = new TranslateTransition(Duration.millis(1), leafNode);
                    			swap1.setToX(-999);
                    			swap1.play();
				}
			});

            		Button swap3 = new Button();
            		swap3.setText("insertion");
            		swap3.setFont(new Font(18));
            		swap3.setPrefWidth(100);
            		swap3.setPrefHeight(5);
           		swap3.setTranslateX(140);
            		swap3.setTranslateY(-122);
           		root.getChildren().add(swap3);

         		swap3.setOnAction(new EventHandler<ActionEvent>() {

				@Override
                		public void handle(ActionEvent event) {
					
					TranslateTransition swap1 = new TranslateTransition(Duration.millis(1), leafNode);
                    			swap1.setToX(-365);
                    			swap1.setToY(-39);
                   			swap1.play();
				}
			});

            		insertdeleteStage.setScene(new Scene(root, 950, 700));
            		insertdeleteStage.show();
		}
	});

	/** Sets the stage button for Tree Rotations.
		Images are also included in this stage to
		allow for a better visual on Tree Rotations.
		The picture is also animated, allowing the
		user to ultimately interact with the BST.

		Left and Right buttons will show the user the
		BST animation where it displays a rotating tree.

	*/
	lv2btn0.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
       		public void handle(ActionEvent event) {
			
			levelSelectStage.close();

            		StackPane root = new StackPane();
            		Stage rotateStage = new Stage();
            		rotateStage.setTitle("Tree Rotations");
			rotateStage.getIcons().add(new Image("pics/logo.png"));

            		Button exit = new Button();
            		exit.setText("Level Select");
            		exit.setFont(new Font(10));
            		exit.setPrefWidth(70);
            		exit.setPrefHeight(50);
            		exit.setTranslateX(410);
            		exit.setTranslateY(300);
            		root.getChildren().add(exit);

			Image rotation = new Image("pics/ro1.png");
			ImageView roimg = new ImageView(rotation);
			roimg.setTranslateX(15);
			roimg.setTranslateY(15);
			root.getChildren().add(roimg);

            		exit.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
               			public void handle(ActionEvent event) {
					
                    			levelSelectStage.show();
                   			rotateStage.close();
				}
			});

            		Image middleeNode = new Image("pics/middleNode.png");
            		ImageView middleNode = new ImageView(middleeNode);
            		middleNode.setTranslateX(250);
            		middleNode.setTranslateY(-250);
            		root.getChildren().add(middleNode);

            		Image lefttNode = new Image("pics/leftNode.png");
            		ImageView leftNode = new ImageView(lefttNode);
            		leftNode.setTranslateX(150);
            		leftNode.setTranslateY(-111);
            		root.getChildren().add(leftNode);

            		Image righttNode = new Image("pics/rightNode.png");
            		ImageView rightNode = new ImageView(righttNode);
            		rightNode.setTranslateX(360);
            		rightNode.setTranslateY(-111);
            		root.getChildren().add(rightNode);

            		Image righttArrow = new Image("pics/rightArrow.png");
            		ImageView rightArrow = new ImageView(righttArrow);
            		rightArrow.setTranslateX(315);
            		rightArrow.setTranslateY(-190);
            		root.getChildren().add(rightArrow);

            		Image lefttArrow = new Image("pics/leftArrow.png");
            		ImageView leftArrow = new ImageView(lefttArrow);
            		leftArrow.setTranslateX(185);
            		leftArrow.setTranslateY(-190);
            		root.getChildren().add(leftArrow);

            		Image rightterArrow = new Image("pics/righterArrow.png");
            		ImageView righterArrow = new ImageView(rightterArrow);
            		righterArrow.setTranslateX(400);
            		righterArrow.setTranslateY(-45);

            		Image leftterArrow = new Image("pics/lefterArrow.png");
            		ImageView lefterArrow = new ImageView(leftterArrow);
           		lefterArrow.setTranslateX(95);
            		lefterArrow.setTranslateY(-45);

			x = 0;

            		Button right = new Button();
            		right.setText("right");
            		right.setFont(new Font(18));
            		right.setPrefWidth(75);
            		right.setPrefHeight(5);
            		right.setTranslateX(-345);
            		right.setTranslateY(-60);
            		root.getChildren().add(right);

            		right.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
                		public void handle(ActionEvent event) {
					
					if(x == 0) {
						
						TranslateTransition swap1 = new TranslateTransition(Duration.millis(390), leftNode);
                        			swap1.setToX(250);
                       				swap1.setToY(-250);
                        			swap1.play();
                        			TranslateTransition swap2 = new TranslateTransition(Duration.millis(350), middleNode);
                        			swap2.setToX(360);
                        			swap2.setToY(-111);
                        			swap2.play();
                        			TranslateTransition swap3 = new TranslateTransition(Duration.millis(350), rightNode);
                        			swap3.setToX(415);
                        			swap3.setToY(40);
                        			swap3.play();
                        			TranslateTransition swap4 = new TranslateTransition(Duration.millis(1), leftArrow);
                        			swap4.setToX(-999);
                        			swap4.setToY(-999);
                        			swap4.play();
                        			root.getChildren().add(righterArrow);
                        			x++;
						
					}
					else if(x == -1)
					{
												
						TranslateTransition swap1 = new TranslateTransition(Duration.millis(390), leftNode);
                        			swap1.setToX(150);
                        			swap1.setToY(-111);
                        			swap1.play();
                        			TranslateTransition swap2 = new TranslateTransition(Duration.millis(350), middleNode);
                        			swap2.setToX(250);
                        			swap2.setToY(-250);
                        			swap2.play();
                        			TranslateTransition swap3 = new TranslateTransition(Duration.millis(350), rightNode);
                        			swap3.setToX(360);
                        			swap3.setToY(-111);
                        			swap3.play();
                        			TranslateTransition swap4 = new TranslateTransition(Duration.millis(1), leftArrow);
                        			swap4.setToX(185);
                        			swap4.setToY(-190);
                        			swap4.play();
                        			TranslateTransition swap5 = new TranslateTransition(Duration.millis(1), rightArrow);
                        			swap5.setToX(315);
                        			swap5.setToY(-190);
                        			swap5.play();
                        			root.getChildren().remove(righterArrow);
                        			root.getChildren().add(rightArrow);
                        			root.getChildren().remove(lefterArrow);
                        			x++;
					}
				}
			});

			Button left = new Button();
            		left.setText("left");
            		left.setFont(new Font(18));
            		left.setPrefWidth(60);
            		left.setPrefHeight(5);
            		left.setTranslateX(-150);
            		left.setTranslateY(-90);
            		root.getChildren().add(left);

            		left.setOnAction(new EventHandler<ActionEvent>() {
								
				@Override
                		public void handle(ActionEvent event) {
					
					if(x == 0) {
												
                       				TranslateTransition swap1 = new TranslateTransition(Duration.millis(390), leftNode);
                        			swap1.setToX(95);
                        			swap1.setToY(40);
                        			swap1.play();
                        			TranslateTransition swap2 = new TranslateTransition(Duration.millis(350), middleNode);
                        			swap2.setToX(150);
                        			swap2.setToY(-111);
                        			swap2.play();
                        			TranslateTransition swap3 = new TranslateTransition(Duration.millis(350), rightNode);
                        			swap3.setToX(250);
                        			swap3.setToY(-250);
                        			swap3.play();
                        			root.getChildren().remove(rightArrow);
                        			root.getChildren().add(lefterArrow);
                        			x--;
					 }
					 else if(x == 1)
					 {
						 
						TranslateTransition swap1 = new TranslateTransition(Duration.millis(390), leftNode);
                        			swap1.setToX(150);
                        			swap1.setToY(-111);
                        			swap1.play();
                        			TranslateTransition swap2 = new TranslateTransition(Duration.millis(350), middleNode);
                        			swap2.setToX(250);
                        			swap2.setToY(-250);
                        			swap2.play();
                        			TranslateTransition swap3 = new TranslateTransition(Duration.millis(350), rightNode);
                        			swap3.setToX(360);
                        			swap3.setToY(-111);
                        			swap3.play();
                        			TranslateTransition swap4 = new TranslateTransition(Duration.millis(1), leftArrow);
                        			swap4.setToX(185);
                        			swap4.setToY(-190);
                       				swap4.play();
                        			TranslateTransition swap5 = new TranslateTransition(Duration.millis(1), rightArrow);
                        			swap5.setToX(315);
                        			swap5.setToY(-190);
                        			swap5.play();
                        			root.getChildren().remove(righterArrow);
                        			root.getChildren().remove(lefterArrow);
                        			x--;
					 }
				}
			});
			
			root.setStyle("-fx-background: #6098f2;");
			rotateStage.setScene(new Scene(root, 950, 700));
			rotateStage.show();
		}
	});

	/** Sets the stage for the Tree Balancing button.
		Tree Balancing has two buttons: UnBalanced and
		Balanced, which allow the user to click on the button
		and display what an unbalanced/balanced BST would appear
		to look like.

		This stage allow provides the user with the button level
		select to go back to the main screen.
	*/
	lv2btn1.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			
			levelSelectStage.close();

            		StackPane root = new StackPane();
            		Stage balanceStage = new Stage();
            		balanceStage.setTitle("Tree Balancing");
			balanceStage.getIcons().add(new Image("pics/logo.png"));

			Image done = new Image("pics/kill1.png");
            		ImageView done1 = new ImageView(done);
            		done1.setTranslateX(15);
            		done1.setTranslateY(15);
           		root.getChildren().add(done1);

            		Button exit = new Button();
            		exit.setText("Level Select");
            		exit.setFont(new Font(10));
            		exit.setPrefWidth(70);
            		exit.setPrefHeight(50);
            		exit.setTranslateX(410);
            		exit.setTranslateY(300);
            		root.getChildren().add(exit);

            		exit.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
               			public void handle(ActionEvent event) {
					
					levelSelectStage.show();
                    			balanceStage.close();
				}
			});

            		Image middleeNode = new Image("pics/middleNode.png");
            		ImageView middleNode = new ImageView(middleeNode);
            		middleNode.setTranslateX(250);
            		middleNode.setTranslateY(-250);
            		root.getChildren().add(middleNode);

            		Image lefttNode = new Image("pics/leftNode.png");
            		ImageView leftNode = new ImageView(lefttNode);
            		leftNode.setTranslateX(150);
            		leftNode.setTranslateY(-111);
            		root.getChildren().add(leftNode);

            		Image righttNode = new Image("pics/rightNode.png");
            		ImageView rightNode = new ImageView(righttNode);
            		rightNode.setTranslateX(360);
            		rightNode.setTranslateY(-111);
            		root.getChildren().add(rightNode);

            		Image righttArrow = new Image("pics/rightArrow.png");
            		ImageView rightArrow = new ImageView(righttArrow);
            		rightArrow.setTranslateX(315);
            		rightArrow.setTranslateY(-190);
            		root.getChildren().add(rightArrow);

            		Image lefttArrow = new Image("pics/leftArrow.png");
            		ImageView leftArrow = new ImageView(lefttArrow);
            		leftArrow.setTranslateX(185);
            		leftArrow.setTranslateY(-190);
            		root.getChildren().add(leftArrow);

            		Image rightterArrow = new Image("pics/righterArrow.png");
            		ImageView righterArrow = new ImageView(rightterArrow);
            		righterArrow.setTranslateX(400);
            		righterArrow.setTranslateY(-45);

            		Image leftterArrow = new Image("pics/lefterArrow.png");
            		ImageView lefterArrow = new ImageView(leftterArrow);
            		lefterArrow.setTranslateX(95);
            		lefterArrow.setTranslateY(-45);

            		x = 0;

            		Button right = new Button();
            		right.setText("UnBalanced");
            		right.setFont(new Font(18));
            		right.setPrefWidth(125);
            		right.setPrefHeight(50);
           		right.setTranslateX(260);
           		right.setTranslateY(50);
            		root.getChildren().add(right);

           		right.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
                		public void handle(ActionEvent event) {
					
					if(x == 0) {
                        		TranslateTransition swap1 = new TranslateTransition(Duration.millis(390), leftNode);
                        		swap1.setToX(250);
                        		swap1.setToY(-250);
                        		swap1.play();
                        		TranslateTransition swap2 = new TranslateTransition(Duration.millis(350), middleNode);
                        		swap2.setToX(360);
					swap2.setToY(-111);
					swap2.play();
					TranslateTransition swap3 = new TranslateTransition(Duration.millis(350), rightNode);
					swap3.setToX(415);
					swap3.setToY(40);
					swap3.play();
					TranslateTransition swap4 = new TranslateTransition(Duration.millis(1), leftArrow);
					swap4.setToX(-999);
					swap4.setToY(-999);
					swap4.play();
					root.getChildren().add(righterArrow);
					x++;
					}
				}
			});
			
		    	Button left = new Button();
		    	left.setText("Balanced");
		    	left.setFont(new Font(18));
		    	left.setPrefWidth(100);
		    	left.setPrefHeight(50);
			left.setTranslateX(125);
		    	left.setTranslateY(50);
		    	root.getChildren().add(left);

           		left.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
                		public void handle(ActionEvent event) {
					
					if(x == 1) {
						
						TranslateTransition swap1 = new TranslateTransition(Duration.millis(390), leftNode);
						swap1.setToX(150);
						swap1.setToY(-111);
						swap1.play();
						TranslateTransition swap2 = new TranslateTransition(Duration.millis(350), middleNode);
						swap2.setToX(250);
						swap2.setToY(-250);
						swap2.play();
						TranslateTransition swap3 = new TranslateTransition(Duration.millis(350), rightNode);
						swap3.setToX(360);
						swap3.setToY(-111);
						swap3.play();
						TranslateTransition swap4 = new TranslateTransition(Duration.millis(1), leftArrow);
						swap4.setToX(185);
						swap4.setToY(-190);
						swap4.play();
						TranslateTransition swap5 = new TranslateTransition(Duration.millis(1), rightArrow);
						swap5.setToX(315);
						swap5.setToY(-190);
						swap5.play();
						root.getChildren().remove(righterArrow);
						root.getChildren().remove(lefterArrow);
                        			x--;
					}
				}
			});
			root.setStyle("-fx-background: #6098f2;");
            		balanceStage.setScene(new Scene(root, 950, 700));
            		balanceStage.show();
		}
	});

	/** Sets the stage button for Traversals.
		This stage is special because it includes gifs.
		Gifs themselves are animated pictures that do not
		have to be interacted with.

		Buttons provided in Traversals are: Next, Previous, and
		Level Select.
	*/
    	lv1btn1.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
        	public void handle(ActionEvent event) {
						
			levelSelectStage.close();

			StackPane root = new StackPane();
			Stage traverseStage = new Stage();
			traverseStage.setTitle("Traversals");
			traverseStage.getIcons().add(new Image("pics/logo.png")); // Changes the icon of the title bar and the task bar

			Image middleeNode = new Image("pics/preorder.gif");
			ImageView middleNode = new ImageView(middleeNode);
			middleNode.setTranslateX(-280);
			root.getChildren().add(middleNode);

			Image wallOfText1 = new Image("pics/wallOfText1.png");
			ImageView textWall = new ImageView(wallOfText1);
			textWall.setTranslateX(185);
			textWall.setTranslateY(100);
			root.getChildren().add(textWall);

			Button exit = new Button();
			exit.setText("Level Select");
			exit.setFont(new Font(10));
			exit.setPrefWidth(70);
			exit.setPrefHeight(50);
			exit.setTranslateX(410);
			exit.setTranslateY(300);
			root.getChildren().add(exit);

			exit.setOnAction(new EventHandler<ActionEvent>() {
								
				@Override
				public void handle(ActionEvent event) {
										
					levelSelectStage.show();
					traverseStage.close();
			}
		});

		Button next = new Button();
		next.setText("Next");
		next.setFont(new Font(10));
		next.setPrefWidth(50);
		next.setPrefHeight(50);
		next.setTranslateX(410);
		next.setTranslateY(-300);
		root.getChildren().add(next);

		next.setOnAction(new EventHandler<ActionEvent>() {

            	@Override
           	public void handle(ActionEvent event) {
			
			traverseStage.close();

			StackPane root = new StackPane();
			Stage traverseStagePage2 = new Stage();
			traverseStagePage2.setTitle("Traversals");
			traverseStagePage2.getIcons().add(new Image("pics/logo.png"));

			Image middleeNode = new Image("pics/inorder.gif");
			ImageView middleNode = new ImageView(middleeNode);
			middleNode.setTranslateX(-225);
			root.getChildren().add(middleNode);

			Image wallOfText1 = new Image("pics/wallOfText2.png");
			ImageView textWall = new ImageView(wallOfText1);
			textWall.setTranslateX(185);
			textWall.setTranslateY(80);
			root.getChildren().add(textWall);

			Button previous = new Button();
			previous.setText("Previous");
			previous.setFont(new Font(10));
			previous.setPrefWidth(75);
			previous.setPrefHeight(50);
			previous.setTranslateX(-410);
			previous.setTranslateY(300);
			root.getChildren().add(previous);

			Button exit = new Button();
			exit.setText("Level Select");
			exit.setFont(new Font(10));
			exit.setPrefWidth(70);
			exit.setPrefHeight(50);
			exit.setTranslateX(410);
			exit.setTranslateY(300);
			root.getChildren().add(exit);

			root.setStyle("-fx-background: #6098f2;");

                	exit.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
                    		public void handle(ActionEvent event) {				
						
					levelSelectStage.show();
					traverseStagePage2.close();
					}
				});

				previous.setOnAction(new EventHandler<ActionEvent>() {
					
					@Override
                    			public void handle(ActionEvent event) {
												
						traverseStage.show();
						traverseStagePage2.close();
					}
				});


				Button next = new Button();
				next.setText("Next");
				next.setFont(new Font(10));
				next.setPrefWidth(50);
				next.setPrefHeight(50);
				next.setTranslateX(410);
				next.setTranslateY(-300);
				root.getChildren().add(next);

				next.setOnAction(new EventHandler<ActionEvent>() {
					
					@Override
                    			public void handle(ActionEvent event) {
						
						traverseStagePage2.close();

						StackPane root = new StackPane();
						Stage traverseStagePage3 = new Stage();
						traverseStagePage3.setTitle("Traversals");
						traverseStagePage3.getIcons().add(new Image("pics/logo.png"));


						Image middleeNode = new Image("pics/postorder.gif");
						ImageView middleNode = new ImageView(middleeNode);
						middleNode.setTranslateX(-225);
						root.getChildren().add(middleNode);

						Image wallOfText1 = new Image("pics/wallOfText3.png");
						ImageView textWall = new ImageView(wallOfText1);
						textWall.setTranslateX(185);
						textWall.setTranslateY(100);
						root.getChildren().add(textWall);

						Button previous = new Button();
						previous.setText("Previous");
						previous.setFont(new Font(10));
						previous.setPrefWidth(75);
						previous.setPrefHeight(50);
						previous.setTranslateX(-410);
						previous.setTranslateY(300);
						root.getChildren().add(previous);

						Button exit = new Button();
						exit.setText("Level Select");
						exit.setFont(new Font(10));
						exit.setPrefWidth(70);
						exit.setPrefHeight(50);
						exit.setTranslateX(410);
						exit.setTranslateY(300);
						root.getChildren().add(exit);
						root.setStyle("-fx-background: #6098f2;");

                        			exit.setOnAction(new EventHandler<ActionEvent>() {
							
							@Override
                            				public void handle(ActionEvent event) {
								
								levelSelectStage.show();
								traverseStagePage3.close();
							}
						});

						previous.setOnAction(new EventHandler<ActionEvent>() {
							
							@Override
							public void handle(ActionEvent event) {
																
								traverseStagePage2.show();
								traverseStagePage3.close();
							}
						});
						traverseStagePage3.setScene(new Scene(root, 950, 700));
						traverseStagePage3.show();
					}
				});
				traverseStagePage2.setScene(new Scene(root, 950, 700));
				traverseStagePage2.show();
			}
		});

		root.setStyle("-fx-background: #6098f2;");
        	traverseStage.setScene(new Scene(root, 950, 700));
       		traverseStage.show();
		}
	});
}
}
