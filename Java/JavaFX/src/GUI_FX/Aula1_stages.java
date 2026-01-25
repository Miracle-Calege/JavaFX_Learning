package GUI_FX;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import java.awt.*;

public class Aula1_stages extends Application {//para usarmos as ferramentas do javafx devemos estender a classe Application

    public static void main(String[] args) {

        launch(args);//responsavel por rodar o programa launch leva como argumento args
    }

    @Override
    public void start(Stage stage) {//metodo obrigatorio, onde customizamos a tela
        //Stage stage=new Stage();-> para criar um novo stage(se o nome do argumento ja for stage nao precisamos de criar um outro)
        Group root=new Group();//um tipo de layout
        //Scene scene =new Scene(root);// o scene leva um parametro que e um layout manager
        Scene scene =new Scene(root, Color.BLACK);//alem do levar o layout como parametro tambem pode levar uma cor
        Image icon=new Image("file:/home/miracle-calege/Downloads/bussiness-man.png");//carrega imagem(quando usamos o caminho absoluto devemos colocar file: antes do path)
        stage.getIcons().add(icon);//adiciona o icon a tela
        stage.setTitle("Aula1_stages");//da titulo a tela
        stage.setWidth(420);//estabelece o comprimento da tela
        stage.setHeight(420);//estabelece a altura da tela
        stage.setResizable(false);//evita que a tela seja reajustada
//        stage.setX(50);//onde a tela vai aparecer no eixo x
//        stage.setY(50);//onde a tela vai aparecer no eixo y por defeito sem essa coordenadas a tela  geralmente aparece no centro
        //stage.setFullScreen(true);//faz com que a tela complete toda a tela do pc
        //stage.setFullScreenExitHint("Pressione q para sair");// exibe uma mensagem assim que a tela fica cheia
        // stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));//faz com que so se saia da tela cheia apos clicar q
        stage.setScene(scene);//coloca o scene na frame
        stage.show();//->como estamos a usar o stage que esta no argumento nao precisamos de criar outro, o metodo show() torna a tela visivel

/*
stage ->onde ficam todos os objectos de uma app javaFx(janela principal do programa)
scene->onde sao organizados/dispostos os componentes (scene e que recebe um layout)
nodes->elementos/componentes graficos(text, label,button,etc)

hierarquia stage->scene->nodes




 */

    }
}
