import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Player extends GameObject{

	private String uname;

	public Player(float x,float y,ObjectId id,String uname){
		super(x,y,id,uname);
	}

	public void tick(LinkedList<GameObject> object){
		x += velX;
		y += velY;
	}
	public void render(Graphics g){
		ImageIcon frog = new ImageIcon("../img/red.png");
		Image frogI = frog.getImage();
		g.drawImage(frogI,(int)x,(int)y,null);
	}
	public Rectangle getBounds(){
		return new Rectangle((int)x,(int)y,32,32);
	}



}
