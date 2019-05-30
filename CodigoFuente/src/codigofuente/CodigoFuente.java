package codigofuente;
import java.util.Random;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class CodigoFuente 
{
    ImageIcon negro = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/Cuadrado Negro.png")).getImage());
    ImageIcon Foto1 = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/Foto1.png")).getImage());
    ImageIcon Foto2 = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/Foto2.png")).getImage());
    ImageIcon Fondo1 = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/FondoAmarillo.jpg")).getImage());
    Random Numero = new Random();
    
    public void random(int Inicial[])
    {   
        for (int i=0; i<Inicial.length; i++)
            Inicial[i]=Numero.nextInt(2);
    }
    
    public void FondoPanel(Graphics g)
    {
        for(int i=0; i<500; i=i+500)
            for(int j=0; j<500; j=j+500)
                g.drawImage(Fondo1.getImage(), i, j, 500, 500, null);
    }
    
    private int num(int i, int Inicial[])
    {
        int aux=0;
        if (i==(Inicial.length-2))
        {
            aux=(aux*10)+Inicial[i];
            i++;
            aux=(aux*10)+Inicial[i];
            aux=(aux*10)+Inicial[0];
        }
        else if (i==(Inicial.length-1))
        {
            aux=(aux*10)+Inicial[i];
            aux=(aux*10)+Inicial[0];
            aux=(aux*10)+Inicial[1];
        }
        else
        {
            aux=(aux*10)+Inicial[i];
            i++;
            aux=(aux*10)+Inicial[i];
            i++;
            aux=(aux*10)+Inicial[i];
        }
        return aux;
    }

    private void copiar(int Inicial[], int Siguiente[])
    {
        System.arraycopy(Siguiente, 0, Inicial, 0, Inicial.length);
    }
    
    public void regla76(int Inicial[], int Siguiente[], Graphics g)
    {
        int aux, posx=0, posy=0;
        for (int i=0; i<Inicial.length; i++)
        {
            for (int j=0; j<Inicial.length; j++)
            {
                aux=num(j, Inicial);
                switch (aux) 
                {
                    case 0:
                        Siguiente[j]=0;
                        break;
                    case 1:
                        Siguiente[j]=0;
                        break;
                    case 10:
                        Siguiente[j]=1;
                        g.drawImage(negro.getImage(), posy, posx, 2, 2,null);
                        break;
                    case 11:
                        Siguiente[j]=1;
                        g.drawImage(negro.getImage(), posy, posx, 2, 2,null);
                        break;
                    case 100:
                        Siguiente[j]=0;
                        break;
                    case 101:
                        Siguiente[j]=0;
                        break;
                    case 110:
                        Siguiente[j]=1;
                        g.drawImage(negro.getImage(), posy, posx, 2, 2,null);
                        break;
                    case 111:
                        Siguiente[j]=0;
                        break;
                    default:
                        break;
                }
                posy=posy+2;
            }
            posy=0;
            posx=posx+2;
            copiar(Inicial, Siguiente);
        }
    }
      
    
    public void regla110B(int Inicial[], int Siguiente[], Graphics g)
    {
        int aux, posx=0, posy=0;
        for (int i=0; i<Inicial.length; i++)
        {
            for (int j=0; j<Inicial.length; j++)
            {
                aux=num(j, Inicial);
                switch (aux) 
                {
                    case 0:
                        Siguiente[j]=0;
                        break;
                    case 1:
                        Siguiente[j]=1;
                        g.drawImage(negro.getImage(), posy, posx, 1,1,null);
                        break;
                    case 10:
                        Siguiente[j]=1;
                        g.drawImage(negro.getImage(), posy, posx, 1, 1,null);
                        break;
                    case 11:
                        Siguiente[j]=0;
                        break;
                    case 100:
                        Siguiente[j]=1;
                        g.drawImage(negro.getImage(), posy, posx, 1, 1,null);
                        break;
                    case 101:
                        Siguiente[j]=0;
                        break;
                    case 110:
                        Siguiente[j]=0;
                        break;
                    case 111:
                        Siguiente[j]=0;
                        break;
                    default:
                        break;
                }
                posy=posy+1;
            }
            posy=0;
            posx=posx+1;
            copiar(Inicial, Siguiente);
        }
    }
    
    public void regla110(int Inicial[], int Siguiente[], Graphics g)
    {
        int aux, posx=0, posy=0;
        for (int i=0; i<Inicial.length; i++)
        {
            for (int j=0; j<Inicial.length; j++)
            {
                aux=num(j, Inicial);
                switch (aux) {
                    case 0:
                        Siguiente[j]=0;
                        break;
                    case 1:
                        Siguiente[j]=1;
                        g.drawImage(negro.getImage(), posy, posx, 2,2,null);
                        break;
                    case 10:
                        Siguiente[j]=1;
                        g.drawImage(negro.getImage(), posy, posx, 2, 2,null);
                        break;
                    case 11:
                        Siguiente[j]=0;
                        break;
                    case 100:
                        Siguiente[j]=1;
                        g.drawImage(negro.getImage(), posy, posx, 2, 2,null);
                        break;
                    case 101:
                        Siguiente[j]=0;
                        break;
                    case 110:
                        Siguiente[j]=0;
                        break;
                    case 111:
                        Siguiente[j]=0;
                        break;
                    default:
                        break;
                }
                posy=posy+2;
            }
            posy=0;
            posx=posx+2;
            copiar(Inicial, Siguiente);
        }
    }
    
    public void regla150(int Inicial[], int Siguiente[], Graphics g)
    {
        int aux, posx=0, posy=0;
        for (int i=0; i<Inicial.length; i++)
        {
            for (int j=0; j<Inicial.length; j++)
            {
                aux=num(j, Inicial);
                switch (aux) {
                    case 0:
                        Siguiente[j]=0;
                        break;
                    case 1:
                        Siguiente[j]=1;
                        g.drawImage(negro.getImage(), posy, posx, 2,2,null);
                        break;
                    case 10:
                        Siguiente[j]=1;
                        g.drawImage(negro.getImage(), posy, posx, 2, 2,null);
                        break;
                    case 11:
                        Siguiente[j]=0;
                        break;
                    case 100:
                        Siguiente[j]=1;
                        g.drawImage(negro.getImage(), posy, posx, 2, 2,null);
                        break;
                    case 101:
                        Siguiente[j]=0;
                        break;
                    case 110:
                        Siguiente[j]=0;
                        break;
                    case 111:
                        Siguiente[j]=1;
                        g.drawImage(negro.getImage(), posy, posx, 2, 2,null);
                        break;
                    default:
                        break;
                }
                posy=posy+2;
            }
            posy=0;
            posx=posx+2;
            copiar(Inicial, Siguiente);
        }
    }
    
    public void regla150B(int Inicial[], int Siguiente[], Graphics g)
    {
        int aux, posx=0, posy=0;
        for (int i=0; i<Inicial.length; i++)
        {
            for (int j=0; j<Inicial.length; j++)
            {
                aux=num(j, Inicial);
                switch (aux) {
                    case 0:
                        Siguiente[j]=0;
                        break;
                    case 1:
                        Siguiente[j]=1;
                        g.drawImage(negro.getImage(), posy, posx, 1,1,null);
                        break;
                    case 10:
                        Siguiente[j]=1;
                        g.drawImage(negro.getImage(), posy, posx, 1, 1,null);
                        break;
                    case 11:
                        Siguiente[j]=0;
                        break;
                    case 100:
                        Siguiente[j]=1;
                        g.drawImage(negro.getImage(), posy, posx, 1, 1,null);
                        break;
                    case 101:
                        Siguiente[j]=0;
                        break;
                    case 110:
                        Siguiente[j]=0;
                        break;
                    case 111:
                        Siguiente[j]=1;
                        g.drawImage(negro.getImage(), posy, posx, 1, 1,null);
                        break;
                    default:
                        break;
                }
                posy=posy+1;
            }
            posy=0;
            posx=posx+1;
            copiar(Inicial, Siguiente);
        }
    }
    
    public void reglaMayoria(int Inicial[], int Siguiente[], Graphics g)
    {
        int aux, posx = 0, posy = 0;
        for(int i=0; i<Inicial.length; i++)
        {
            for (int j=0; j<Inicial.length; j++)
            {
                aux = num(j, Inicial);
                switch(aux)
                {
                    case 0:
                        Siguiente[j]=0;
                        break;
                    case 1:
                        Siguiente[j]=0;
                        break;
                    case 10:
                        Siguiente[j]=0;
                        break;
                    case 11:
                        Siguiente[j]=1;
                        g.drawImage(negro.getImage(), posy, posx, 2, 2,null);
                        break;
                    case 100:
                        Siguiente[j]=0;
                        break;
                    case 101:
                        Siguiente[j]=1;
                        g.drawImage(negro.getImage(), posy, posx, 2, 2,null);
                        break;
                    case 110:
                        Siguiente[j]=1;
                        g.drawImage(negro.getImage(), posy, posx, 2, 2,null);
                        break;
                    case 111:
                        Siguiente[j]=1;
                        g.drawImage(negro.getImage(), posy, posx, 2, 2,null);
                        break;
                    default:
                        break;

                }
                posy=posy+2;
            }
            posy=0;
            posx=posx+2;
            copiar(Inicial, Siguiente);
        }
    }
    
    public void regla30(int Inicial[], int Siguiente[], Graphics g)
    {
        int aux, posx=0, posy=0;
        for (int i=0; i<Inicial.length; i++)
        {
            for (int j=0; j<Inicial.length; j++)
            {
                aux=num(j, Inicial);
                switch (aux) 
                {
                    case 0:
                        Siguiente[j]=0;
                        break;
                    case 1:
                        Siguiente[j]=1;
                        g.drawImage(negro.getImage(), posy, posx, 2, 2,null);
                        break;
                    case 10:
                        Siguiente[j]=1;
                        g.drawImage(negro.getImage(), posy, posx, 2, 2,null);
                        break;
                    case 11:
                        Siguiente[j]=1;
                        g.drawImage(negro.getImage(),  posy, posx, 2, 2,null);
                        break;
                    case 100:
                        Siguiente[j]=1;
                        g.drawImage(negro.getImage(),  posy, posx, 2, 2,null);
                        break;
                    case 101:
                        Siguiente[j]=0;
                    case 110:
                        Siguiente[j]=0;
                        break;
                    case 111:
                        Siguiente[j]=0;
                        break;
                    default:
                        break;
                }
                posy=posy+2;
            }
            posy=0;
            posx=posx+2;
            copiar(Inicial, Siguiente);
        }
    }
      
    public static void main(String[] args) 
    {
        PantallaPrincipal Pantalla = new PantallaPrincipal();
        Pantalla.setVisible(true);  
    }
}
