/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoyoutube;

/**
 *
 * @author andre
 */
public class ProjetoYoutube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Video v[] = new Video[5];//Videos
        v[0] = new Video("Aula de POO");
        v[1] = new Video("Curso de Java");
        v[2] = new Video("A I.A vai substituir os programadores?");
        v[3] = new Video("Megabrain! Ativar!");
        v[4] = new Video("Introdução ao VibeCoding");
        
        Gafanhoto g[] = new Gafanhoto[2];
        
        g[0] = new Gafanhoto("Andrey", 25, "M", "andrey42");//"Gafanhotos" que visualizam os videos
        g[1] = new Gafanhoto("Amanda", 24, "F", "Mandy");
        
        
        Visualizacao vis[] = new Visualizacao[6];
        vis[0] = new Visualizacao(g[0], v[2]);//Andrey visualiza o primeiro video
        System.out.println(vis[0].toString());
        vis[0].avaliar();//andrey avalia o primeiro video
        vis[1] = new Visualizacao(g[0], v[4]);//andrey assiste o segundo video
        System.out.println(vis[1].toString());
        vis[1].avaliar(90f);//andrey avalia o segundo video(Usando a porcentagem assistida[sobreposição])
        System.out.println(v[2].toString());
        
        
          
       /* System.out.println(v[0].toString());
        
        System.out.println(g[1].toString());*/
                } 

}