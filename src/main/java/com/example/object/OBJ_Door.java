package com.example.object;

import java.io.IOException;

import javax.imageio.ImageIO;

import com.example.main.GamePanel;

public class OBJ_Door extends SuperObject{
    
    GamePanel gp;

    public OBJ_Door(GamePanel gp){
        this.gp = gp;
        name = "Door";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/door.png"));
            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
        } catch (IOException e){
            e.printStackTrace();
        }

        collision = true; //doors are solid objects
    }
}
