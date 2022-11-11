package Tarea07;

import java.util.ArrayList;

public class Main
{
    public static void main(String args[])
    {

        ArrayList<Integrantes> grupo =new ArrayList<Integrantes>();

        grupo.add(new Integrantes ("Jose",965321475,"IV"));
        grupo.add(new Integrantes ("Camilo",515195154,"IV"));
        grupo.add(new Integrantes ("Luis",784512281,"IV"));
        grupo.add(new Integrantes ("Carlos",624478935,"IV"));
        //grupo.clear();

        System.out.println("Cantidad de Integrantes: " + grupo.size());
        for (int i = 0; i< grupo.size(); i++){
            System.out.println(grupo.get(i));
        }
        boolean v = grupo.isEmpty();
        System.out.println(v);

        System.out.println("---------------------------");

        grupo.remove(2);
        System.out.println("Cantidad de Integrantes: " + grupo.size());
        for (int i = 0; i< grupo.size(); i++){
            System.out.println(grupo.get(i));
        }


        




    }
}
