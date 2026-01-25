package GUI_FX;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import java.awt.*;

public class Aula2_Scenes extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Group root=new Group();
        Scene scene=new Scene(root,600,600, Color.LIGHTSKYBLUE);//(layout,comrpimento,altura,cor)
        Text text=new Text();//pode levar argumento "texto"
        text.setText("SCENES ARE AWESOME ");//coloca o texto na tela
        text.setX(50);//coordenada do  texto no eixo x
        text.setY(50);//coordenada do  texto no eixo y
        text.setFont(Font.font("verdana",50));//coloca o tipo de fonte e tamanho do texto
        text.setFill(Color.LIMEGREEN);//coloca a cor do texto
        Line line=new Line();//cria uma linha
        line.setStartX(200);//inicia onde x=200
        line.setStartY(200);//inicia onde y=200
        line.setEndX(500);//termina onde x=500
        line.setEndY(200);//termina onde y=200
        line.setStrokeWidth(5);//engrossa a linha
        line.setStroke(Color.RED);//da cor a linha
        line.setOpacity(0.5);//torna a linha mais transparente
        line.setRotate(45);//move a linha em relacao ao angulo(grau)
        Rectangle rectangle=new Rectangle();//cria um rectangulo
        rectangle.setX(100);//coloca as coordenadas no eixo x onde  o rectangulo sera colocado
        rectangle.setY(100);//coloca as coordenadas no eixo y onde  o rectangulo sera colocado
        rectangle.setWidth(100);//determina o comprimento
        rectangle.setHeight(100);//determina a altura
        rectangle.setFill(Color.BLUE);//da cor ao rectangulo
        rectangle.setStrokeWidth(10);//engrossa as linhas do rectangulo
        rectangle.setStroke(Color.BLACK);//da cor as bordas do rectangulo
        Polygon triangle=new Polygon();//para criar um triangulo usamos a classe Polygon
        triangle.getPoints().setAll(
                200.0,200.0,//coordenada x e y
                300.0,300.0,
                200.0,300.0
        );// como um triangulo tem 3 lados entao tera 3 pares, este metodo exige doubles como parametros
        triangle.setFill(Color.YELLOW);
        Circle circle=new Circle();//cria um circulo
        circle.setCenterX(350);//coordenada do centro em x
        circle.setCenterY(350);//coordenada do centro em y
        circle.setRadius(50);//raio
        circle.setFill(Color.ORANGE);
        Image image=new Image("file:/home/miracle-calege/Downloads/bussiness-man.png");//carrega a imagem do path
        ImageView imgView=new ImageView(image);//criamos esse objecto com a imagem carregada acima
        imgView.setX(400);
        imgView.setY(400);
        root.getChildren().add(triangle);
        root.getChildren().add(text);//adiciona o componente  a scene(usamos o gestor de layout..getChildren().add());
        root.getChildren().add(line);
        root.getChildren().add(rectangle);
        root.getChildren().add(circle);
        root.getChildren().add(imgView);
        stage.setScene(scene);
        stage.show();
    }
    }
