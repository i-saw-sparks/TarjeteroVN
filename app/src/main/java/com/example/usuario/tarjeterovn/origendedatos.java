package com.example.usuario.tarjeterovn;

import android.widget.TextView;

import com.example.usuario.tarjeterovn.tarjeta;

import java.util.ArrayList;

/**
 * Created by Andrés on 23/04/2018.
 */

public class origendedatos {
    public ArrayList<tarjeta> showAll()
    {
        ArrayList<tarjeta> resultado=new ArrayList<tarjeta>();

        tarjeta uno=new tarjeta();
        uno.imagen=("https://i.stack.imgur.com/jZhAM.png");
        uno.nombre=("Kevin Medina");
        uno.edad=("18 años");
        uno.descripcion=("Joven elegante");
        uno.id=1;
        resultado.add(uno);

        tarjeta dos=new tarjeta();
        dos.imagen=("https://ae01.alicdn.com/kf/HTB1jOTkKFXXXXaKXpXXq6xXFXXXp/100x100-Bohemia-paisley-bandana-Square-100-Twill-silk-scarf-large-square-women-scarves-for-women-flower.jpg");
        dos.nombre=("Luis Felipe García Avila");
        dos.edad=("18 años");
        dos.descripcion=("Joven inteligente");
        dos.id=2;
        resultado.add(dos);

        tarjeta tres=new tarjeta();
        tres.imagen=("https://scontent.fgdl1-2.fna.fbcdn.net/v/t1.0-1/11751424_872462019504929_4958539427705370864_n.jpg?_nc_cat=0&oh=a8705d63db28d534384b1ff60ebec2c7&oe=5B854D99");
        tres.nombre=("Claudia Manuela Perez Cortés");
        tres.edad=("18 años");
        tres.descripcion=("Jovena d.va");
        tres.id=3;
        resultado.add(tres);

        tarjeta cuatro=new tarjeta();
        cuatro.imagen=("https://scontent.fgdl1-2.fna.fbcdn.net/v/t1.0-9/1454553_269042973247701_1860352887_n.jpg?_nc_cat=0&oh=f71d528ddcad987527ea8abcf612e7f3&oe=5B90242A");
        cuatro.nombre=("Oscar Antonio García Avila ");
        cuatro.edad=("18 años");
        cuatro.descripcion=("DFP");
        cuatro.id=4;
        resultado.add(cuatro);

        tarjeta cinco=new tarjeta();
        cinco.imagen=("https://scontent.fgdl1-2.fna.fbcdn.net/v/t1.0-9/26167032_1116239705178897_137415038228548652_n.jpg?_nc_cat=0&oh=8654fc31f3808b7fff294e92f1d1e305&oe=5B99F7BE");
        cinco.nombre=("Isai Galvan Alaniz");
        cinco.edad=("17 años");
        cinco.descripcion=("Joven geozac furro");
        cinco.id=5;
        resultado.add(cinco);

        tarjeta seis=new tarjeta();
        seis.imagen=("https://scontent.fgdl1-2.fna.fbcdn.net/v/t1.0-9/26165255_1820596307982693_3544073455328861304_n.jpg?_nc_cat=0&oh=a00eda83c402bce7529b23977f613696&oe=5B570419");
        seis.nombre=("Jesús Martínez Cortés");
        seis.edad=("17 años");
        seis.descripcion=("Le chuy");
        seis.id=6;
        resultado.add(seis);

        tarjeta siete=new tarjeta();
        siete.imagen=("https://scontent.fgdl1-2.fna.fbcdn.net/v/t1.0-9/30698779_1831841920214122_3916395246304362496_n.jpg?_nc_cat=0&oh=eecccdd622705c490066bfed8b2190a6&oe=5B97FA47");
        siete.nombre=("Jose Eliseo Hernandez Villaseñor");
        siete.edad=("18 años");
        siete.descripcion=("Joven color leche");
        siete.id=7;
        resultado.add(siete);

        tarjeta ocho=new tarjeta();
        ocho.imagen=("https://scontent.fgdl1-2.fna.fbcdn.net/v/t1.0-9/30727774_1754950767858390_407052213120740288_n.jpg?_nc_cat=0&oh=8212c3eeebeecba98bc7f8bda4172a19&oe=5B893836");
        ocho.nombre=("Rodrigo Santoyo Velasco");
        ocho.edad=("18 años");
        ocho.descripcion=("Joven fiestero");
        ocho.id=8;
        resultado.add(ocho);

        tarjeta nueve=new tarjeta();
        nueve.imagen=("https://scontent.fgdl1-2.fna.fbcdn.net/v/t1.0-9/12651039_1111700882188169_6170852743104126036_n.jpg?_nc_cat=0&oh=fc7fe4106f72b1bd2556af334eaff298&oe=5B54682A");
        nueve.nombre=("Luis Humberto Sánchez Vaca");
        nueve.edad=("18 años");
        nueve.descripcion=("Joven que superó la friendzone");
        nueve.id=9;
        resultado.add(nueve);

        tarjeta diez=new tarjeta();
        diez.imagen=("https://scontent.fgdl1-2.fna.fbcdn.net/v/t1.0-9/10982611_744336282355568_5087595334643613991_n.jpg?_nc_cat=0&oh=73d7204af60dd0af35d366cdab929c68&oe=5B952331");
        diez.nombre=("Omar Vazques Toriz");
        diez.edad=("17 años");
        diez.descripcion=("Joven fan de mago de oz");
        diez.id=10;
        resultado.add(diez);

        return resultado;
    }
}
